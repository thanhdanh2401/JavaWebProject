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
import model.TheLoai;

/**
 *
 * @author Asus ROG STRIX
 */
public class TheLoaiDAO extends DBConnection{
    
    public TheLoaiDAO(Connection conn, Statement st) throws ClassNotFoundException, SQLException {
        super(conn, st);
    }
    
    public static List<TheLoai> getAll() {
        List<TheLoai> ls;
        try {
            rs = st.executeQuery("SELECT * FROM theloai");
            ls = new ArrayList();
            while(rs.next()){
                ls.add(new TheLoai(
                        Integer.parseInt(rs.getString("TheLoaiID")),
                        rs.getString("TheLoaiName")));
            }
            return ls;
        } catch (SQLException ex) {
            Logger.getLogger(ChuongDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            closeConnection();
        }
        return null;
    }
    
    public static TheLoai getTheLoai(String id){
        TheLoai c;
        try {
            pst = conn.prepareStatement("SELECT FROM theloai WHERE TheLoaiID=?");
            pst.setString(1, id);
            rs.next();
            {
                c = new TheLoai(Integer.parseInt(rs.getString("TheLoaiID")),
                        rs.getString("TheLoaiName"));
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
