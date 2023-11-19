/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uts.uts.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MahasiswaController {
    
    @GetMapping("/mahasiswa")
    public String home(Model model){
        return "mahasiswa";
    }
    @GetMapping("/detail")
    public String detail(Model model){
        return "detailmhs";
    }
}
