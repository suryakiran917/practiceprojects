package com.suryakiran.jpapractice.controller;

import com.suryakiran.jpapractice.entity.StudentsEntity;
import com.suryakiran.jpapractice.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/getData")
    public List<StudentsEntity> getStudentsList(){
        return studentsService.getAllStudentsData();
    }

    @GetMapping("/getdatabyid/{id}")
    public Optional<StudentsEntity> getStudentDataById(@PathVariable(name = "id") int id){
        return studentsService.getStudentDataById(id);
    }

    @DeleteMapping("/deletebyid/{id}")
    public String deleteById(@PathVariable int id){
        return  studentsService.deleteStudentById(id);
    }
}
