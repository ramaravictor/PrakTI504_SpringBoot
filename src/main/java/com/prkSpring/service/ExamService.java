package com.prkSpring.service;

import com.prkSpring.entity.Exam;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

//anotasikan dengan
@Service
public class ExamService {
   //deklasarikan static data dan diinisiasikan menggunakan arrays
    private static List<Exam> exams = Arrays.asList(
        new Exam(1L, "Exam 1", "15", "10", "Kamis, 16 November 2023 09:00", "Kamis, 16 November 2023 09:30"),
        new Exam(2L, "Exam 2", "30", "25", "Sabtu, 18 November 2023 09:00", "Sabtu, 18 November 2023 09:40"),
        new Exam(3L, "Exam 3", "50", "30", "Sabtu, 2 Desember 2023 09:00", "Sabtu, 2 Desember 2023 10:30"),
        new Exam(5L, "UAS", "50", "30", "Sabtu, 2 Desember 2023 09:00", "Sabtu, 2 Desember 2023 10:30"),
        new Exam(4L, "Mid Exam", "60", "50", "Sabtu, 9 Desember 2023 09:00", "Sabtu, 9 Desember 2023 11:30")
            
    );

    //fungsi untuk return course
    public List<Exam> findAll(){
        return exams;
    }
    
    //fungsi untuk mengambil data dari id
    public Exam getExamById(Long id) {
        return exams.stream()
                .filter(exam -> id != null && id.equals(exam.getId()))
                .findFirst()
                .orElse(null);
    } 
}
