/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Chuong;

/**
 *
 * @author Asus ROG STRIX
 */
public class ChuongDAO extends db.DBConnection {

    public ChuongDAO(Connection conn, Statement st) throws ClassNotFoundException, SQLException {

        super(conn, st);

    }
    
    public static List<Chuong> getAll() {
        List<Chuong> ls;
        try {
            rs = st.executeQuery("SELECT * FROM chuong");
            ls = new ArrayList();
            while(rs.next()){
                ls.add(new Chuong(
                        Integer.parseInt(rs.getString("ChuongID")),
                        Integer.parseInt(rs.getString("LuotDoc")),
                        rs.getString("DuongLinkNoiDung")));
            }
            return ls;
        } catch (SQLException ex) {
            Logger.getLogger(ChuongDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            closeConnection();
        }
        return null;
    }
    
    public static Chuong getChuong(String id){
        Chuong c;
        try {
            pst = conn.prepareStatement("SELECT FROM chuong WHERE ChuongID=?");
            pst.setString(1, id);
            rs.next();
            {
                c = new Chuong(
                        Integer.parseInt(rs.getString("ChuongID")),
                        Integer.parseInt(rs.getString("LuotDoc")),
                        rs.getString("DuongLinkNoiDung"));
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
