package com.suryakiran.jpapractice.service;

import com.suryakiran.jpapractice.entity.StudentsEntity;

import java.util.List;

public interface StudentsService {

    StudentsEntity save(StudentsEntity studentsEntity);

    List<StudentsEntity> getAllStudentsData();

    StudentsEntity getStudentDataById(int id);

    String deleteStudentById(int id);
}
