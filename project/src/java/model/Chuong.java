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
public class Chuong {
    private int ChuongID;
    private int LuotDoc;
    private String DuongLinkNoiDung;
    
    public Chuong(int id, String linkNoiDung){
        this.ChuongID = id;
        this.LuotDoc = 0;
        this.DuongLinkNoiDung = linkNoiDung;
    }
    public Chuong(int id, int luotDoc, String linkNoiDung) {
        this.ChuongID = id;
        this.LuotDoc = luotDoc;
        this.DuongLinkNoiDung = linkNoiDung;
    }

    public int getId() {
        return ChuongID;
    }

    public void setId(int id) {
        this.ChuongID = id;
    }

    public int getLuotDoc() {
        return LuotDoc;
    }

    public void setLuotDoc(int luotDoc) {
        this.LuotDoc = luotDoc;
    }

    public String getLinkNoiDung() {
        return DuongLinkNoiDung;
    }

    public void setLinkNoiDung(String linkNoiDung) {
        this.DuongLinkNoiDung = linkNoiDung;
    }
    
}
