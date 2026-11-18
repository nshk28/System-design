package com.example.sms.service;

import com.example.sms.entity.Student;
import com.example.sms.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    public StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    public Student createStudent(Student studentReq){
        //business logic

        //store to db
        Student studentResp = studentRepository.saveToDB(studentReq);
        return studentResp;
    }
}

//1. End point ko listen krna(map endpoint to method)
//2. Business logic basically jo input request body aayegi wo java object me kaise map krna
//3. Interact with DB to store
//4. Return response back to controller

//Separate out responsibility of controller , service layer, and repository layer.
//we follow the Controller-service-repository architecture.
//Controller layer is responsible for handling the request and response, service layer is responsible for business logic, and repository layer is responsible for interacting with the database.
//pojo class which tells what information we are storing in db retrieving from db.
//the request body needs to be converted to java object(entity class) and then we can use that java object to store in db and retrieve from db.
