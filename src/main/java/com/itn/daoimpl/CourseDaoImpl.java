/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.daoimpl;

import com.itn.dao.CourseDao;
import com.itn.model.Course;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author RANJIT
 */
@Repository
public class CourseDaoImpl implements CourseDao {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public void insert(Course course) {
        Session s = sessionFactory.openSession();
        s.beginTransaction();
        s.save(course);
        s.getTransaction().commit();
        s.close();
        // sessionFactory.openSession().save(course)
    }

    // return sessionFactory().openSession().createCriteria(Course.class).list();
    public List<Course> select() {
        Session s = sessionFactory.openSession();
        List<Course> al = s.createCriteria(Course.class).list();
        s.beginTransaction().commit();
        s.close();
        return al;
        // return sessionFactory().openSession().createCriteria(Course.class).list();

    }

    @Override
    public void delete(Course course) {
        Session s = sessionFactory.openSession();
        s.delete(course);
        s.beginTransaction().commit();
        s.close();
        //sessionFactory.openSession().delete(course);
    }

    public List<Course> SelectById(int id) {

        Session s = sessionFactory.openSession();
        List<Course> al = s.createCriteria(Course.class).add(Restrictions.eq("courseid",id)).list();
        return al;
    }

    public void update(Course course) {
        Session s = sessionFactory.openSession();
        s.update(course);
        s.beginTransaction().commit();
        s.close();
        
       // sessionFactory.openSession().update(course);
    }
}
