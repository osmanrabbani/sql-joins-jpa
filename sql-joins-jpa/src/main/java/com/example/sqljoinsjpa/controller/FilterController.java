package com.example.sqljoinsjpa.controller;


import com.example.sqljoinsjpa.repository.StudentRepository;
import com.example.sqljoinsjpa.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
@RequestMapping("/filter")
public class FilterController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/{name}")
    public Student getStdByName(@PathVariable String name){
        //System.out.println( studentRepository.getStudentsByName("Pratik"));
        return studentRepository.getStudentsByName(name);
    }

//    @GetMapping("city/{CITY}")
//    public List<Student> getStdByCity(@PathVariable(name = "CITY") String city){
//        return studentRepository.findByAddressCity(city);
//    }

//    @GetMapping("/subject/{SUB}")
//    public List<Student> getStdBySubject(@PathVariable(name = "SUB") String subject) {
//        return studentRepository.findBySubjectsName(subject);
//    }
}
