package com.suryakiran.jpapractice.service;

import com.suryakiran.jpapractice.entity.StudentsEntity;
import com.suryakiran.jpapractice.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentsService {

    @Autowired
    private StudentRepository studentRepository;


    @Override
    public StudentsEntity save(StudentsEntity studentsEntity) {
       return studentRepository.save(studentsEntity);

    }

    @Override
    public List<StudentsEntity> getAllStudentsData() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<StudentsEntity> getStudentDataById(int id) {
        if (studentRepository.existsById(id)){
            return studentRepository.findById(id);
        }else{
            throw new RuntimeException("Student Not Found with Id :"+id);
        }

    }

    @Override
    public String deleteStudentById(int id) {
        if (studentRepository.existsById(id)) {
            studentRepository.deleteById(id);
            return "Student Data Deleted Successfully with Id : " + id;
        }else{
            throw new RuntimeException("Student Not Found with Id :"+id);
        }
    }
}
