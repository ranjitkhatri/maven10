/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.controller;

import com.itn.model.Course;
import com.itn.service.CourseService;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

/**
 *
 * @author RANJIT
 */
@Controller // denotes that this class is a servlet class
public class IndexController { 
    
@Autowired
CourseService courseService;
    @RequestMapping(value={"/index","/"},method=RequestMethod.GET)
        public String index(){
            
            return "index";
        }
    @RequestMapping(value="/admin/course/add",method=RequestMethod.GET)
        public String addcourse(){
            return "addcourse";
        }    
    @RequestMapping(value="/admin/course/save",method=RequestMethod.POST)
        public String save(@RequestParam("title") String title, @RequestParam("price") String price, @RequestParam("duration") String duration, @RequestParam("files") CommonsMultipartFile files, HttpServletRequest request){
            // to upload file CommonsMultipartFile need to import
            
            String path=request.getServletContext().getRealPath("/imagecourse");
            String fileName = files.getOriginalFilename();
            
            try {
                byte[] upload = files.getBytes();
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(path+"/"+fileName));
        } catch (Exception e) {
        }
            
            //@modelAttribute("course") Course course
            Course c = new Course();
            c.setCoursetitle(title);
            c.setPrice(price);
            c.setDuration(duration);
            
            courseService.addCourse(c);
            
            return "addcourse";
        }
       
    @RequestMapping(value={"/admin/user/add"},method=RequestMethod.GET)
    public String adduser(){
        return "adduser";
}
    @RequestMapping(value={"/admin/course/display"},method=RequestMethod.GET)
    public String displaycourse(Model model){
        List<Course> al = courseService.findAllCourse();
        model.addAttribute("coursedata",al);
        
        //model.addAttribute("coursedata","courseService.findAllCourse());
        return "displayCourse";
    }
    @RequestMapping(value="/admin/course/delete/{id}", method=RequestMethod.GET)
    public String delete(@PathVariable("id") int id, Model model){
        Course c = new Course();
        c.setCourseid(id);
        List<Course> al =courseService.delete(c);
        model.addAttribute("coursedata", al);
        
        return "displayCourse";
        
    }
    @RequestMapping(value="/admin/course/edit/{id}", method=RequestMethod.GET)
    public String edit(@PathVariable("id") int id, Model model){
//        List<Course> al = courseService.getByid(id);
//        model.addAttribute("coursedata", al);

    model.addAttribute("coursedata", courseService.getById(id));
    return "editcourse";
  
    }
    @RequestMapping(value="/admin/course/update", method=RequestMethod.POST)
    public String update(@ModelAttribute("course") Course course, Model model){
        model.addAttribute("coursedata", courseService.update(course));
        
        return "displayCourse";
    }
    @RequestMapping(value="/login", method=RequestMethod.GET)
    public String login(){
       
        return "login";
    }
}

    

