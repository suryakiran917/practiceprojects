package com.suryakiran.jpapractice.controller;

import com.suryakiran.jpapractice.entity.StudentsEntity;
import com.suryakiran.jpapractice.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/web/student")
public class StudentController {

    @Autowired
    private StudentsService studentsService;

    @RequestMapping("")
    public String homeController(){
        return "Hello World";
    }


    @PostMapping("/save")
    public StudentsEntity save(@RequestBody StudentsEntity studentsEntity){
        return  studentsService.save(studentsEntity);
    }
}
