/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import db.DBConnection;
import static db.DBConnection.closeConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.User;

/**
 *
 * @author Asus ROG STRIX
 */
public class UserDAO extends DBConnection{
    
    public UserDAO(Connection conn, Statement st) throws ClassNotFoundException, SQLException {
        super(conn, st);
    }
    
    public static List<User> getAll() {
        List<User> ls;
        try {
            rs = st.executeQuery("SELECT * FROM user");
            ls = new ArrayList();
            while(rs.next()){
                ls.add(new User(
                        Integer.parseInt(rs.getString("UserID")),
                        rs.getString("UserName"),
                        rs.getString("Password"),
                        rs.getString("AnhDaiDien")
                ));
            }
            return ls;
        } catch (SQLException ex) {
            Logger.getLogger(ChuongDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            closeConnection();
        }
        return null;
    }
    
    public static User getUser(String id){
        User c;
        try {
            pst = conn.prepareStatement("SELECT FROM truyen WHERE UserID=?");
            pst.setString(1, id);
            rs.next();
            {
                c= new User(
                        Integer.parseInt(rs.getString("UserID")),
                        rs.getString("UserName"),
                        rs.getString("Password"),
                        rs.getString("AnhDaiDien")
                );
            }
            return c;
        } catch (SQLException ex) {
            Logger.getLogger(ChuongDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            closeConnection();
        }
        return null;
    }
    
}
