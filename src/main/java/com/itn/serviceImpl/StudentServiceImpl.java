/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.serviceImpl;

import com.itn.dao.StudentDao;
import com.itn.model.Student;
import com.itn.service.StudentService;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author RANJIT
 */
public class StudentServiceImpl implements StudentService {
    @Autowired
StudentDao StudentDao;
    public List<Student> update(Student student) {
     
        
        StudentDao.update(student);
        
        return Arrays.asList(new Student());
    }
}
