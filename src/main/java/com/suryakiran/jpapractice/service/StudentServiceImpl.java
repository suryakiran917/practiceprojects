package com.suryakiran.jpapractice.service;

import com.suryakiran.jpapractice.entity.StudentsEntity;
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
}
