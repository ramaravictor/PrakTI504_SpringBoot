/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prkSpring.contoller;

import com.prkSpring.dto.SearchFormData;
import com.prkSpring.entity.Exam;
import com.prkSpring.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author ramar
 */
@Controller
public class ExamController {
    // anotasikan class service ke controller
    @Autowired
    private ExamService examService;

    @GetMapping("/exam")
    public String exam(Model model) {
        model.addAttribute("activePage", "exam");
        model.addAttribute("searchForm", new SearchFormData());
        
        model.addAttribute("exam", examService.findAll());
        return "exam";
    }

    @GetMapping("/addExam")
    public String addExam(Model model) {
        model.addAttribute("activePage", "exam");
        model.addAttribute("exam", new Exam());
        return "addExam";
    }

    @PostMapping("/save")
    public String save(Exam exam, Model model) {
        examService.addExam(exam);
        return "redirect:/exam";
    }

    @GetMapping("/viewExam/{id}")
    public String view(@PathVariable("id") Long id, Model model) {
        // Panggil service untuk melakukan edit
        model.addAttribute("exam", examService.findById(id));
        // membuka halaman "/exam"
        return "viewExam";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        // Panggil service untuk melakukan penghapusan
        examService.deleteById(id);
        // Redirect ke halaman "/exam"
        return "redirect:/exam";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, Model model) {
        // Panggil service untuk melakukan edit
        model.addAttribute("exam", examService.findById(id));
        // membuka halaman "/exam"
        return "editExam";
    }

    @PostMapping("/update")
    public String update(Exam exam, Model model) {
        // call service update
        examService.updateExam(exam);
        // Redirect ke halaman "/exam"
        return "redirect:/exam";
    }

    //function untuk search
    @GetMapping("/search")
    public String search(SearchFormData searchFormData, Model model){
        model.addAttribute("searchForm", searchFormData);
        model.addAttribute("exam", examService.findByName(searchFormData.getKeyword()));
        return "exam";
    }
}
