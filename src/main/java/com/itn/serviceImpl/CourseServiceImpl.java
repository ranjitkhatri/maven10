/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.serviceImpl;

import com.itn.dao.CourseDao;
import com.itn.model.Course;
import com.itn.service.CourseService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author RANJIT
 */
@Service
@Transactional
public class CourseServiceImpl implements CourseService {
    
    @Autowired
    CourseDao courseDao;
    
    @Override
    public void addCourse(Course course){
        courseDao.insert(course);
    }
    @Override
    public List<Course> findAllCourse() {
        
        return courseDao.select();
        // List<course> al = courseDao.select();
        //return al;
    }
@Override
    public List<Course> delete(Course course) {
        
        courseDao.delete(course);
        return courseDao.select();
    }
@Override
    public List<Course> getById(int id) {
        return courseDao.SelectById(id);
        
        //list<Course> al = courseDao.selectById(id);
        //return al;
    }
@Override
    public List<Course> update(Course course) {
     
        
        courseDao.update(course);
        
        return courseDao.select();
    }

  
   
}
