package Persistence;

import static java.lang.Class.forName;
import java.sql.DriverManager;

public class connection {

    public static connection getConnection(String url, String user, String password) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }   
    
    private String url;
    private String user;
    private String password;
    private connection conn;
    
    connection() {
        url = "jdbc:postgresql://localhost:5432/postgres";
        user = "postgres";
        password = "postgres";
        
        try {            
            Class.forName("org.postgresql.Driver");
            conn = connection.getConnection(url, user, password);
            System.out.println("Connection OK!");            
        } catch (Exception e) {
            e.printStackTrace();
        }        
    }     
}
