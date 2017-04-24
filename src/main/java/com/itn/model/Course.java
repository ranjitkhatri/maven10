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
@Table(name="course") //  if not present hibernet text class name= table
public class Course implements Serializable {
    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="cid")
    private int courseid;
    
    @Column(name="title")
    private String coursetitle;
    
    @Column (name="price")
    private String price;
    
    @Column (name="duration")
    private String duration;

    public Course() {
    }

    public Course(int courseid, String coursetitle, String price, String duration) {
        this.courseid = courseid;
        this.coursetitle = coursetitle;
        this.price = price;
        this.duration = duration;
    }

    public int getCourseid() {
        return courseid;
    }

    public void setCourseid(int courseid) {
        this.courseid = courseid;
    }

    public String getCoursetitle() {
        return coursetitle;
    }

    public void setCoursetitle(String coursetitle) {
        this.coursetitle = coursetitle;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
    
    
    
    
}
