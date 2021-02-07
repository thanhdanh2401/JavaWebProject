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
public class Comment {
    private int CommentID;
    private String NoiDung;
    private String NgayDang;

    public Comment(int CommentID, String NoiDung, String NgayDang) {
        this.CommentID = CommentID;
        this.NoiDung = NoiDung;
        this.NgayDang = NgayDang;
    }

    public int getCommentID() {
        return CommentID;
    }

    public void setCommentID(int CommentID) {
        this.CommentID = CommentID;
    }

    public String getNoiDung() {
        return NoiDung;
    }

    public void setNoiDung(String NoiDung) {
        this.NoiDung = NoiDung;
    }

    public String getNgayDang() {
        return NgayDang;
    }

    public void setNgayDang(String NgayDang) {
        this.NgayDang = NgayDang;
    }

    
    
}
