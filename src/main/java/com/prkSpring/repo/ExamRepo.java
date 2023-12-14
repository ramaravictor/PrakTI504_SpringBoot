/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prkSpring.repo;

import org.springframework.data.repository.CrudRepository;

import com.prkSpring.entity.Exam;

/**
 *
 * @author ramar
 */
public interface ExamRepo extends CrudRepository<Exam, Long> {
    
}
