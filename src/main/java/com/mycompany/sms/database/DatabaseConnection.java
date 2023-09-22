package com.mycompany.sms.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {
    private Connection con; // connection for stored the database connection
    private Statement stmt; // create the variable for stored the statement from db connection
    private ResultSet result; // create the variable for stored the results which are filter from db
    private String host = "localhost";
    private String port = "3306";
    private String db = "sms";
    private String userName= "root";
    private String password = "";
    
    public DatabaseConnection(){
        try{
               Class.forName("com.mysql.cj.jdbc.Driver"); // use the driver class
               con = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/"+db,userName,password); // create the connection using a url
               stmt = con.createStatement(); // get the statement from created connection in previous statement
           }
           catch(Exception e){
               System.out.println(e);
           }
    }
    
    public boolean dataProcess(String sql){
        boolean status;
        try {
            stmt.executeUpdate(sql);
            status = true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            status = false;
        }
        return status;
    }
    
    public ResultSet getData(String sql){
        try {
            result = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return result;
    }
    
//    public boolean getDataStatus(String sql){
//        boolean status;
//        try {
//            result = stmt.executeQuery(sql);
//            status = true;
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//            status = false;
//        }
//        return status;
//    }
//    
//    public ResultSet getDataa(){
//        return result;
//    }
}
