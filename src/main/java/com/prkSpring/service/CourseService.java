
package com.prkSpring.service;

import com.prkSpring.entity.Course;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;


//anotasikan dengan
@Service
public class CourseService {
    //deklasarikan static data dan diinisiasikan menggunakan arrays
    private static List<Course> courses = Arrays.asList(
        new Course(1L, "Progarammer Web", "Belajar Jadi Programmer Web"),
        new Course(2L, "Website", "Belajar Jadi Programmer Web"),
        new Course(3L, "Java", "Belajar Jadi Programmer Web"),
        new Course(4L, "SpringBoot", "Belajar Jadi Programmer Web"),
        new Course(5L, "MVC", "Belajar Jadi Programmer Web"),
        new Course(6L, "Database", "Belajar Jadi Programmer Web"),
        new Course(7L, "Alur Pengembangan Aplikasi Web", "Belajar Jadi Programmer Web")
    );

    //fungsi untuk return course
    public List<Course> findAll(){
        return courses;
    }
    
    //fungsi untuk mengambil data dari id
    public Course getCourseById(Long id) {
        return courses.stream()
                .filter(course -> id != null && id.equals(course.getId()))
                .findFirst()
                .orElse(null);
    }
    

    // public Optional<Course> findById(long id){
    //     return courses.stream().filter(c -> c.getId() == id).findFirst(); 
    // }
}
