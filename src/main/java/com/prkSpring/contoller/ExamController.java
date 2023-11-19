/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prkSpring.contoller;


import com.prkSpring.entity.Exam;
import com.prkSpring.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author ramar
 */
@Controller
public class ExamController {
    //anotasikan class service ke controller
    @Autowired
    private ExamService examService;

    @GetMapping("/exam")
    public String exam(Model model) {
        model.addAttribute("activePage", "exam");
        model.addAttribute("exam", examService.findAll());
        return "exam";
    }

    @GetMapping("/viewExam/{id}")
    public String showView(@PathVariable Long id, Model model) {
        // Panggil metode layanan untuk mendapatkan data berdasarkan ID
        Exam exam = examService.getExamById(id);
        // Simpan data ke model untuk digunakan di tampilan
        model.addAttribute("exam", exam);
        model.addAttribute("activePage", "exam");
        // Kembalikan nama tampilan yang sesuai
        return "viewExam";
    }
}
