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
public class TacGia {
    private int TacGiaID;
    private String TacGiaName;

    public TacGia(int TacGiaID, String TacGiaName) {
        this.TacGiaID = TacGiaID;
        this.TacGiaName = TacGiaName;
    }

    public int getTacGiaID() {
        return TacGiaID;
    }

    public void setTacGiaID(int TacGiaID) {
        this.TacGiaID = TacGiaID;
    }

    public String getTacGiaName() {
        return TacGiaName;
    }

    public void setTacGiaName(String TacGiaName) {
        this.TacGiaName = TacGiaName;
    }

 
}
