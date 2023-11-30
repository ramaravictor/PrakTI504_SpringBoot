package com.prkSpring.service;

import com.prkSpring.entity.Exam;
import com.prkSpring.utils.RandomNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

//anotasikan dengan
@Service
public class ExamService {
    // deklasarikan static data dan diinisiasikan menggunakan arrays
    private static List<Exam> exams = new ArrayList<Exam>() {
        {
            add(new Exam(RandomNumber.getRandom(1000, 9999), "Exam 1", "15", "10", "2023-11-23T13:23","2023-11-23T13:23"));
            add(new Exam(RandomNumber.getRandom(1000, 9999), "Exam 2", "30", "25", "2023-11-23T13:23","2023-11-23T13:23"));
            add(new Exam(RandomNumber.getRandom(1000, 9999), "Exam 3", "50", "30", "2023-11-23T13:23","2023-11-23T13:23"));
            add(new Exam(RandomNumber.getRandom(1000, 9999), "UAS", "50", "30", "2023-11-23T13:23","2023-11-23T13:23"));
            add(new Exam(RandomNumber.getRandom(1000, 9999), "Mid Exam", "60", "50", "2023-11-23T13:23","2023-11-23T13:23"));
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
        exam.setId(RandomNumber.getRandom(1000, 9999));
        exams.add(exam);
    }

    //function delete
    public void deleteById (Long id){
        exams.removeIf(x -> x.getId() == id);
    }

    //function edit
    public Optional<Exam> findById(Long id){
        return exams.stream().filter(x -> x.getId() == id).findFirst();
    }

    //function update
    public void updateExam(Exam exam){
        deleteById(exam.getId());
        exams.add(exam);
    }
}
