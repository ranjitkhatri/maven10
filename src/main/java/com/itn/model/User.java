/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author RANJIT
 */
@Entity
@Table (name="user")
public class User implements Serializable {
    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="uid")
    private int userid;
    
    @Column(name="usernaem")
    private String username;
    
    @Column(name="pass")
    private int password;
    
    @Column (name="type")
    private String type;

    public User() {
    }

    public User(int userid, String username, int password, String type) {
        this.userid = userid;
        this.username = username;
        this.password = password;
        this.type = type;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
    
    
}
