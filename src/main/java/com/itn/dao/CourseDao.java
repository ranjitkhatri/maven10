/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.dao;

import com.itn.model.Course;
import java.util.List;

/**
 *
 * @author RANJIT
 */
public interface CourseDao {
    void insert(Course course);
    List<Course> select();
    void delete(Course course);
    List<Course> SelectById (int id);
    void update(Course course);
}
