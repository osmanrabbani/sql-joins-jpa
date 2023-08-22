package com.example.sqljoinsjpa.repository;

import com.example.sqljoinsjpa.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    //select & from student where name = 'osman'
    Student getStudentsByName(String name);
    //List<Student> findByAddressCity(String city);

   List<Student> findBySubjectsName(String subName);

}
