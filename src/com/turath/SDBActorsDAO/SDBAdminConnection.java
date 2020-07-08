package com.turath.SDBActorsDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.turath.SDBActorsBean.Admin;
import com.turath.SDBActorsBean.Architecte;
import com.turath.sdb.SDBManipulation;

public class SDBAdminConnection {

	private final String url = "jdbc:postgresql://localhost:5432/NewSDB";
    private final String user = "TurathAdmin";
    private final String password = "Turath";

    /**
     * Connect to the PostgreSQL database
     *
     * @return a Connection object
     */
    public Connection connect() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }
    
   
public boolean verifyAdmin(Admin login) throws ClassNotFoundException {
        boolean status = false;
        String SQL= "select * from public.\"admin_table\" where email = ? and password = ? ";
        try (	
           
        	Connection conx = connect();
            PreparedStatement preparedStatement = conx
            .prepareStatement(SQL)) {
            preparedStatement.setString(1, login.getMail());
            preparedStatement.setString(2, login.getPassword());
       
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            status = rs.next();
            login.setNom(rs.getString(4));
            login.setPrenom(rs.getString(5));


        } catch (SQLException e) {
            // process sql exception
        	System.out.println(e.getMessage());
        }
        return status;
    }

    public void insertAdmin(Admin actor) throws SQLException {
    	//SDBManipulation conn= new SDBManipulation();
    	Connection conn = connect();
    	System.out.println("connecté inside insert admin");
    	try {
    		//conn.connexionASDB();
		} catch (Exception e) {
			// TODO: handle exception
		}
    	
        String SQL = "INSERT INTO public.\"admin_table\"(\r\n" + 
        		"	id, email, password, nom, prenom)\r\n" + 
        		"	VALUES (?, ?, ?, ?, ?)";

    

        try (
        		
        		
                PreparedStatement pstmt = conn.prepareStatement(SQL,
                Statement.RETURN_GENERATED_KEYS)) {
        	pstmt.setInt(1, actor.getId());
            pstmt.setString(2, actor.getMail());
            pstmt.setString(3, actor.getPassword());
            pstmt.setString(4, actor.getNom());
            pstmt.setString(5, actor.getPrenom());
            pstmt.execute();
            System.out.println("done");
          //  int affectedRows = pstmt.executeUpdate();
            // check the affected rows 
            /*if (affectedRows > 0) {
                // get the ID back
                try (ResultSet rs = pstmt.getGeneratedKeys()) {
                    if (rs.next()) {
                        id = rs.getLong(1);
                    }
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
            }*/
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
     
    }
    
    public boolean VerifExistEmail(Admin acteur, String email) throws ClassNotFoundException {
        boolean status = false;
        String SQL= "select * from public.\"admin_table\" where email = ? ";
        try (	
           
        	Connection conx = connect();
            PreparedStatement preparedStatement = conx
            .prepareStatement(SQL)) {
            preparedStatement.setString(1, acteur.getMail());
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            status = rs.next();

        } catch (SQLException e) {
            // process sql exception
        	System.out.println(e.getMessage());
        }
        return status;
    }
    
    public int GeneratorId(Admin acteur )throws ClassNotFoundException {
    	int count =0;
    	String SQL = "SELECT * from public.\"admin_table\" ";
    	try(
    		
    		Connection conx = connect();
            PreparedStatement preparedStatement = conx
            .prepareStatement(SQL)) {
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {count++;}

        } catch (SQLException e) {
            // process sql exception
        	System.out.println(e.getMessage());
        }

    return count+1;
    }
    
    public List<Architecte> AfficherArchitectesNonValides(){
    	//afficher la liste des architectes créés dans la sdb
    	String SQL = "SELECT * from public.\"architecte_table\" where valide = ?";
    	List<Architecte> listArchi = new ArrayList<Architecte> ();
    	
    	try (
    		
    		Connection conx = connect();
    		
            PreparedStatement preparedStatement = conx
            .prepareStatement(SQL)) {
    		preparedStatement.setBoolean(1, false);
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()) {
            	
            int id = rs.getInt(1);
            String email= rs.getString(2);
            String password= rs.getString(3);
            String nom = rs.getString(4);
            String prenom = rs.getString(5);
            String etablissement = rs.getString(6);
           
            Architecte architecte = new Architecte(id,email,password,nom,prenom,etablissement);

            listArchi.add(architecte);
            }
           
            
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
    	if(listArchi.isEmpty()) return null;
  		else return listArchi;
    	
    }
    public void ValidateArchitecte(Architecte architecte, String mail) {
    	//valider un compte d'architecte
    	
    	System.out.println("connecté inside insert admin");
    	
        String SQL = "UPDATE public.architecte_table \r\n" + 
        		"	SET valide = ?\r\n" + 
        		"	WHERE email = ?";

    

        try (
        		
        		Connection conn = connect();
               
        		PreparedStatement pstmt = conn.prepareStatement(SQL,
                Statement.RETURN_GENERATED_KEYS)) {
        	 System.out.println("khra");
        	pstmt.setBoolean(1, true);
            pstmt.setString(2, mail);
            pstmt.execute(); 
            System.out.println("apres execution");}
        catch (SQLException e) {e.getMessage();}
    	
    }
        
    public void RefuseArchitecte(Architecte architecte, String mail) {
    	//refuser un compte d'architecte
  	
        String SQL = "DELETE FROM public.architecte_table\r\n" + 
        		"	WHERE email= '?';";

    

        try (
        		
        		Connection conn = connect();
               
        		PreparedStatement pstmt = conn.prepareStatement(SQL,
                Statement.RETURN_GENERATED_KEYS)) {
            pstmt.setString(1, mail);
            pstmt.execute(); 
            System.out.println("apres execution");}
        catch (SQLException e) {e.getMessage();}
    }
    
}