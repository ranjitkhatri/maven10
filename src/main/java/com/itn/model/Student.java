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
@Table(name="student")
public class Student implements Serializable{
    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="sid")
    private int studentid;
    
    @Column(name="fname")
    private String fname;
    
    @Column(name="lname")
    private String lname;
    
    @Column(name="gender")
    private String gender;
    
    @Column (name="hobby")
    private String hobby;
    
    @Column(name="country")
    private String country;
    
    @Column(name="remarks")
    private String remarks;

    public Student() {
    }

    public Student(int studentid) {
        this.studentid = studentid;
    }

    public Student(int studentid, String fname, String lname, String gender, String hobby, String country, String remarks) {
        this.studentid = studentid;
        this.fname = fname;
        this.lname = lname;
        this.gender = gender;
        this.hobby = hobby;
        this.country = country;
        this.remarks = remarks;
    }

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

}
