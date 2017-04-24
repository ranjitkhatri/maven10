/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.daoimpl;

import com.itn.dao.StudentDao;
import com.itn.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author RANJIT
 */
public class StudentDaoImpl implements StudentDao{
     @Autowired 
    SessionFactory sessionFactory;
    
    public void update(Student student){
         Session s = sessionFactory.openSession();
        s.update(student);
        s.beginTransaction().commit();
        s.close();
    }
}
