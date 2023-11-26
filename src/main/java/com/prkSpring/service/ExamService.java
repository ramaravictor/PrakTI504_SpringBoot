package com.prkSpring.service;

import com.prkSpring.entity.Exam;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

//anotasikan dengan
@Service
public class ExamService {
    // deklasarikan static data dan diinisiasikan menggunakan arrays
    private static List<Exam> exams = new ArrayList<Exam>() {
        {
            add(new Exam(System.currentTimeMillis(), "Exam 1", "15", "10", "Kamis, 16 November 2023 09:00",
                    "Kamis, 16 November 2023 09:30"));
            add(new Exam(System.currentTimeMillis(), "Exam 2", "30", "25", "Sabtu, 18 November 2023 09:00",
                    "Sabtu, 18 November 2023 09:40"));
            add(new Exam(System.currentTimeMillis(), "Exam 3", "50", "30", "Sabtu, 2 Desember 2023 09:00",
                    "Sabtu, 2 Desember 2023 10:30"));
            add(new Exam(System.currentTimeMillis(), "UAS", "50", "30", "Sabtu, 2 Desember 2023 09:00",
                    "Sabtu, 2 Desember 2023 10:30"));
            add(new Exam(System.currentTimeMillis(), "Mid Exam", "60", "50", "Sabtu, 9 Desember 2023 09:00",
                    "Sabtu, 9 Desember 2023 11:30"));
        }
    };

    // fungsi untuk return course
    public List<Exam> findAll() {
        return exams;
    }

    // fungsi untuk mengambil data dari id
    public Exam getExamById(Long id) {
        return exams.stream()
                .filter(exam -> id != null && id.equals(exam.getId()))
                .findFirst()
                .orElse(null);
    }

    // Function create exam data
    public void addExam(Exam exam) {
        exam.setId(System.currentTimeMillis());
        exams.add(exam);
    }
}
