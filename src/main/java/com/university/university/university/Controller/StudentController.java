package com.university.university.university.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.university.university.university.Collections.Student;
import com.university.university.university.Service.StudentService;

@CrossOrigin(origins = "http://localhost:3000/")
@RequestMapping("/student")
@RestController
public class StudentController {

    @Autowired
	private StudentService studentService;
	
	@PostMapping("/save")
	public String save(@RequestBody Student student) {
        if(!studentService.existsById(student.getStudentId()))
		{
		    studentService.saveStudent(student);
		    return "Student saved Successfully";
        }
		else
		    return "Student Id Already Exist";
	}

	@PutMapping("/update/{id}")
	public String Update(@PathVariable String id,@RequestBody Student student) {
		studentService.updateStudent(id,student);
		return "Student Updated Successfully";
	}

	@GetMapping("/getAll")
	public List<Student> getAllBook() {
		return studentService.getAll();
		
	}

	@GetMapping("/getOne/{id}")
	public Optional<Student> getByOne(@PathVariable String id) {
		return studentService.getById(id);
		
	}

	@DeleteMapping("/delete/{id}")
	public String Delete(@PathVariable String id) {
		studentService.deleteId(id);
		return "Student Deleted Successfully";
		
	}
    
}
