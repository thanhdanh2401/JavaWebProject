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
import model.TacGia;

/**
 *
 * @author Asus ROG STRIX
 */
public class TacGiaDAO extends DBConnection {
    
    public TacGiaDAO(Connection conn, Statement st) throws ClassNotFoundException, SQLException {
        super(conn, st);
    }
    
    public static List<TacGia> getAll() {
        List<TacGia> ls;
        try {
            rs = st.executeQuery("SELECT * FROM tacgia");
            ls = new ArrayList();
            while(rs.next()){
                ls.add(new TacGia(
                        Integer.parseInt(rs.getString("TacGiaID")),
                        rs.getString("TacGiaName")));
            }
            return ls;
        } catch (SQLException ex) {
            Logger.getLogger(ChuongDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            closeConnection();
        }
        return null;
    }
    
    public static TacGia getChuong(String id){
        TacGia c;
        try {
            pst = conn.prepareStatement("SELECT FROM tacgia WHERE TacGiaID=?");
            pst.setString(1, id);
            rs.next();
            {
                c = new TacGia(
                        Integer.parseInt(rs.getString("TacGiaID")),
                        rs.getString("TacGiaName"));
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
