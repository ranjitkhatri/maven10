/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.service;

import com.itn.model.Course;
import java.util.List;

/**
 *
 * @author RANJIT
 */
public interface CourseService {
    void addCourse(Course course);
    List<Course> findAllCourse();
    List<Course> delete (Course course);
    List<Course> getById(int id);
    List<Course> update (Course course);
}
