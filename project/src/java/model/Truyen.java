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
public class Truyen {
    private int TruyenID;
    private int LuotDoc;
    private String TenTruyen;
    private String MoTa;
    private String TinhTrang;
    private String NgayDang;

    public Truyen(int TruyenID, int LuotDoc, String TenTruyen, String MoTa, String TinhTrang, String NgayDang) {
        this.TruyenID = TruyenID;
        this.LuotDoc = LuotDoc;
        this.TenTruyen = TenTruyen;
        this.MoTa = MoTa;
        this.TinhTrang = TinhTrang;
        this.NgayDang = NgayDang;
    }

    public int getTruyenID() {
        return TruyenID;
    }

    public void setTruyenID(int TruyenID) {
        this.TruyenID = TruyenID;
    }

    public int getLuotDoc() {
        return LuotDoc;
    }

    public void setLuotDoc(int LuotDoc) {
        this.LuotDoc = LuotDoc;
    }

    public String getTenTruyen() {
        return TenTruyen;
    }

    public void setTenTruyen(String TenTruyen) {
        this.TenTruyen = TenTruyen;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }

    public String getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(String TinhTrang) {
        this.TinhTrang = TinhTrang;
    }

    public String getNgayDang() {
        return NgayDang;
    }

    public void setNgayDang(String NgayDang) {
        this.NgayDang = NgayDang;
    }

    

    
}
