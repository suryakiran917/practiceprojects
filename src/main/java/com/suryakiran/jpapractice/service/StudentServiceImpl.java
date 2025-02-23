package com.suryakiran.jpapractice.service;

import com.suryakiran.jpapractice.entity.StudentsEntity;
import com.suryakiran.jpapractice.exception.StudentNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.nonNull;

@Service
public class StudentServiceImpl implements StudentsService {


    List<StudentsEntity> studentsList = new ArrayList<>();

    @Override
    public StudentsEntity save(StudentsEntity studentsEntity) {
        studentsList.add(studentsEntity);
        return studentsEntity;
    }

    @Override
    public List<StudentsEntity> getAllStudentsData() {
        return studentsList;
    }

    @Override
    public StudentsEntity getStudentDataById(int id) {
        return studentsList.
                stream().
                filter(studentsEntity -> studentsEntity.getId() == id).
                findFirst().orElseThrow(()->new RuntimeException("Student Not Found Exception with Id : " + id));
    }

    @Override
    public String deleteStudentById(int id) {
        StudentsEntity student =studentsList.
                stream().
                filter(studentsEntity -> studentsEntity.getId() == id).
                findFirst().orElseThrow(()->new RuntimeException("Student Not Found Exception with Id : " + id));
        studentsList.remove(student);
        return "Student Data Deleted Successfully with Id : " + id;
    }
}
