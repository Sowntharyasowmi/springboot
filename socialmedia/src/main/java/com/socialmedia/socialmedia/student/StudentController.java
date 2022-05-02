package com.socialmedia.socialmedia.student;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    List<Students>studentsList=new ArrayList<>();
    @PostMapping("/students")
    public Students  addStudent(@RequestBody Students students){
       studentsList.add(students);
       return students;
    }
    @GetMapping("/students")
    public List<Students> getAllStudents(){
        return studentsList;
    }
    @GetMapping("/students/{id}")
    public Students get(@PathVariable("id")Integer id){
  Students response=null;
  for (Students students:studentsList){
      if (students.getId()==(id)){
          response=students;
          break;
      }
  }return response;
    }
    @DeleteMapping("/students/{id}")
    public void delete(@PathVariable ("id")Integer id){
        List<Students>studentsList1=new ArrayList<>();
        for (Students students:studentsList){
            if (students.getId()!=(id)){
                studentsList1.add(students);
            }
        }
        studentsList=studentsList1;
    }
}
