package com.example.StudentCrud.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StudentCrud.domain.Student;
import com.example.StudentCrud.repository.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    public List<Student> getAllStudents(){
        return userRepository.findAll();
    }

    public Student getStudentById(long id){
        // return userRepository.findById(id).get();
        Optional<Student> student = userRepository.findById(id);
    if (student.isPresent()) {
        return student.get();
    } else {
        // Handle case when student is not found
        throw new RuntimeException("Student not found for id :: " + id);
    }
    }

    public Student addStudent(Student std){
        return userRepository.save(std);
    }

    public void deleteStudent(long id){
        userRepository.deleteById(id);
    }

}
