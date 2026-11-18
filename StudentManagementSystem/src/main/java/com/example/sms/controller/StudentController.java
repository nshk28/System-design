package com.example.sms.controller;

import com.example.sms.entity.Student;
import com.example.sms.service.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private StudentService studentService;

    public void StudentController(StudentService studentService){
        this.studentService = studentService;
    }
    //create
    @PostMapping("/create")
    public String createStudent(@RequestBody Student student){
        Student createdStudent = studentService.createStudent(student);
        return "Student created successfully with ID: " + createdStudent.getId();
    }
    //student object jo mai expect kr rha hoon wo ek request body hai
    //jackson library is used to convert the JSON data in the request body into a Java object. The @RequestBody annotation tells Spring to look for the student object in the request body and automatically map it to the Student class.
    //the student object will be sent in the request body as JSON, and Spring will automatically deserialize it into a Student object. You can then use this object to perform any necessary operations, such as saving it to a database or performing validation.
    //read

    //update

    //delete
}


//controller layer work is to process teh incoming request , map the request body to java object and delegeate the work to service layer so that it can perform the business logic and interact with the database to store or retrieve data. The controller layer is responsible for handling the request and response, while the service layer is responsible for the business logic and interacting with the database.