package com.prkSpring.service;

import com.prkSpring.entity.Exam;
import com.prkSpring.repo.ExamRepo;
import com.prkSpring.utils.RandomNumber;

import jakarta.transaction.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//anotasikan dengan
@Service
@Transactional
public class ExamService {

    @Autowired
    private ExamRepo repo;
    

    // fungsi untuk return course
    public Iterable<Exam> findAll() {
        return repo.findAll();
    }

    // Function create exam data
    public void addExam(Exam exam) {
        repo.save(exam);
    }

    //function delete
    public void deleteById (Long id){
        repo.deleteById(id);
    }

    //function edit
    public Optional<Exam> findById(Long id){
        return repo.findById(id);
    }

    //function update
    public void updateExam(Exam exam){
        repo.save(exam);
    }
}
