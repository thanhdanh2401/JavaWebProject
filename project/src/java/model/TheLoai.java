/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Asus ROG STRIX
 */
public class TheLoai {
    private int TheLoaiID;
    private String TheLoaiName;

    public TheLoai(int TheLoaiID, String TheLoaiName) {
        this.TheLoaiID = TheLoaiID;
        this.TheLoaiName = TheLoaiName;
    }

    public int getTheLoaiID() {
        return TheLoaiID;
    }

    public void setTheLoaiID(int TheLoaiID) {
        this.TheLoaiID = TheLoaiID;
    }

    public String getTheLoaiName() {
        return TheLoaiName;
    }

    public void setTheLoaiName(String TheLoaiName) {
        this.TheLoaiName = TheLoaiName;
    }
    
    
    
}
