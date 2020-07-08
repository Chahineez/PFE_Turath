package com.turath.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.turath.SDBActorsBean.Admin;
import com.turath.SDBActorsBean.Architecte;
import com.turath.SDBActorsDAO.SDBActorsConnection;
import com.turath.SDBActorsDAO.SDBAdminConnection;

/**
 * Servlet implementation class AdminLogin
 */
@WebServlet("/AdminLogin")
public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String VUE ="/WEB-INF/AdminLogin.jsp";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher(VUE).forward( request, response );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		Admin acteur= new Admin(email, password);
		SDBAdminConnection SDBAdminConn = new SDBAdminConnection();
		acteur.setMail(email);
		acteur.setPassword(password);
		//SDBManipulation conx= new SDBManipulation();
		//conx.connexionASDB();
		try {
				Connection conx= SDBAdminConn.connect();
			} 
		catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		HttpSession session;
		String IdSession;
		String prenomNom;
		session = request.getSession();
		IdSession = session.getId();
		String prenom;
		
		try {
			System.out.println("try");
			if (SDBAdminConn.verifyAdmin(acteur))  {
			 
				session.setAttribute(IdSession, acteur); 
				prenomNom = acteur.getPrenom()+" "+acteur.getNom();
				prenom= acteur.getPrenom();
				session.setAttribute("prenomNom", prenomNom);
				session.setAttribute("prenom",prenom);
				System.out.println("valide");
				response.sendRedirect( request.getContextPath() +
						"/Dashboard" );}
				else  {
					System.out.println("nop !valide");
					response.sendRedirect( request.getContextPath() +
							"/AdminLogin" );
				}

			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//SDBActConn.verifLogin(email,password);
		System.out.println("after verification login");
		
	}

	}

