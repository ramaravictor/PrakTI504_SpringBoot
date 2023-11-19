/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prkSpring.contoller;

import com.prkSpring.entity.Course;
import com.prkSpring.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class CoursesController {
    
    //anotasikan class service ke controller
    @Autowired
    private CourseService courseService;

    @GetMapping("/courses")
    public String courses(Model model) {
        model.addAttribute("activePage", "courses");
        model.addAttribute("course", courseService.findAll());
        return "courses";
    }

    @GetMapping("/view/{id}")
    public String showView(@PathVariable Long id, Model model) {
        // Panggil metode layanan untuk mendapatkan data berdasarkan ID
        Course course = courseService.getCourseById(id);
        // Simpan data ke model untuk digunakan di tampilan
        model.addAttribute("course", course);
        model.addAttribute("activePage", "courses");
        // Kembalikan nama tampilan yang sesuai
        return "viewCourse";
    }

    // @GetMapping("/edit/{id}")
    // public String view(@PathVariable("id") long id, Model model){
    // model.addAttribute("course", courseService.getDataById(id));
    // return "viewCourse";
    // }
}
