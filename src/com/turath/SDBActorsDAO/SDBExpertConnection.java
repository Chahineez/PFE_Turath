package com.turath.SDBActorsDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SDBExpertConnection {
	
	private final String url = "jdbc:postgresql://localhost:5432/NewSDB";
    private final String user = "Turath";
    private final String password = "Turath";
    
    
    /**
     * Connect to the PostgreSQL database
     *
     * @return a Connection object
     */
    public Connection connect() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }
    
    
	
	
	

}
