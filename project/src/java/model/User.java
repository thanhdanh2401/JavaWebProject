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
public class User {
    private int UserID;
    private String UserName; 
    private String Password;
    private String AnhDaiDien;

    public User(int UserID, String UserName, String Password, String AnhDaiDien) {
        this.UserID = UserID;
        this.UserName = UserName;
        this.Password = Password;
        this.AnhDaiDien = AnhDaiDien;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int UserID) {
        this.UserID = UserID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getAnhDaiDien() {
        return AnhDaiDien;
    }

    public void setAnhDaiDien(String AnhDaiDien) {
        this.AnhDaiDien = AnhDaiDien;
    }

    
    
    
}
