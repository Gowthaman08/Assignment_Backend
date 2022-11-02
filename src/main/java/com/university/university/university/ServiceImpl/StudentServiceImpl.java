package com.university.university.university.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.university.university.university.Collections.Student;
import com.university.university.university.Repository.StudentRepository;
import com.university.university.university.Service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepository studentRepository;

    @Override
    public String saveStudent(Student student) {
        studentRepository.save(student);
        return "Student details saved Successfully";
    }
    @Override
    public String updateStudent(String id, Student student) {
        Student studentUpdate=studentRepository.findById(id).get();
        studentUpdate.setDob(student.getDob());
        studentUpdate.setName(student.getName());
        studentUpdate.setAddress(student.getAddress());
        studentUpdate.setPhoneNumber(student.getPhoneNumber());
        studentUpdate.setJoinDate(student.getJoinDate());
        studentRepository.save(studentUpdate);
        return "Student details Updated Successfully";
    }

    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @Override
    public boolean existsById(String id) {
        if (!(studentRepository.existsById(id))) {
			return false;
		}
		return true;
    }
    @Override
    public Optional<Student> getById(String id) {
        return studentRepository.findById(id);
    }

    @Override
    public String deleteId(String id) {
        studentRepository.deleteById(id);
        return "Student details Deleted Successfully";
    }
    
}
