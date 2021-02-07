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
import model.Comment;
import model.TacGia;

/**
 *
 * @author Asus ROG STRIX
 */
public class CommentDAO extends DBConnection{
    
    public CommentDAO(Connection conn, Statement st) throws ClassNotFoundException, SQLException {
        super(conn, st);
    }
    
    public static List<Comment> getAll() {
        List<Comment> ls;
        try {
            rs = st.executeQuery("SELECT * FROM comment");
            ls = new ArrayList();
            while(rs.next()){
                ls.add(new Comment(
                        Integer.parseInt(rs.getString("CommentID")),
                        rs.getString("NoiDung"),
                        rs.getString("NgayDang")));
            }
            return ls;
        } catch (SQLException ex) {
            Logger.getLogger(ChuongDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            closeConnection();
        }
        return null;
    }
    
    public static Comment getComment(String id){
        Comment c;
        try {
            pst = conn.prepareStatement("SELECT FROM comment WHERE CommentID=?");
            pst.setString(1, id);
            rs.next();
            {
                c = new Comment(
                        Integer.parseInt(rs.getString("CommentID")),
                        rs.getString("NoiDung"),
                        rs.getString("NgayDang"));
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
