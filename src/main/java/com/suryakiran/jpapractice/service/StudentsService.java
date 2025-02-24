package com.suryakiran.jpapractice.service;

import com.suryakiran.jpapractice.entity.StudentsEntity;

import java.util.List;
import java.util.Optional;

public interface StudentsService {

    StudentsEntity save(StudentsEntity studentsEntity);

    List<StudentsEntity> getAllStudentsData();

    Optional<StudentsEntity> getStudentDataById(int id);

    String deleteStudentById(int id);
}
