package com.Library.Manage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/call/students")
@CrossOrigin()
public class Studentcontroller {
    @Autowired
    Studentrepo repo;
    @GetMapping()
    public List<Student> getAllPosts()
    {
        return repo.findAll();
    }
    @PostMapping()
    public Student Addstudent(@RequestBody Student student){
        return repo.save(student);
    }
}
