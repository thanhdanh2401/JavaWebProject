/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Asus ROG STRIX
 */
public class DBConnection {

    protected static Connection conn;
    protected static Statement st;
    protected static PreparedStatement pst;
    protected static ResultSet rs;

    public DBConnection(Connection conn, Statement st) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        this.conn = DriverManager.getConnection("jdbc:mysql://localhost/project", "root", "");
        this.st = conn.createStatement();;
        this.st = st;
    }

    public static void closeConnection()  {
        try {
            conn.close();
            st.close();
            pst.close();
            rs.close();
        }catch(SQLException ex){/* inorge*/}
    }
}
