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
import model.Truyen;

/**
 *
 * @author Asus ROG STRIX
 */
public class TruyenDAO extends DBConnection {
    
    public TruyenDAO(Connection conn, Statement st) throws ClassNotFoundException, SQLException {
        super(conn, st);
    }
    
    public static List<Truyen> getAll() {
        List<Truyen> ls;
        try {
            rs = st.executeQuery("SELECT * FROM truyen");
            ls = new ArrayList();
            while(rs.next()){
                ls.add(new Truyen(
                        Integer.parseInt(rs.getString("TruyenID")),
                        Integer.parseInt(rs.getString("LuotDoc")),
                        rs.getString("TenTruyen"),
                        rs.getString("MoTa"),
                        rs.getString("TinhTrang"),
                        rs.getString("NgayDang")
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
    
    public static Truyen getTruyen(String id){
        Truyen c;
        try {
            pst = conn.prepareStatement("SELECT FROM truyen WHERE TruyenID=?");
            pst.setString(1, id);
            rs.next();
            {
                c= new Truyen(
                        Integer.parseInt(rs.getString("TruyenID")),
                        Integer.parseInt(rs.getString("LuotDoc")),
                        rs.getString("TenTruyen"),
                        rs.getString("MoTa"),
                        rs.getString("TinhTrang"),
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
