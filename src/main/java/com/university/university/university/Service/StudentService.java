package com.university.university.university.Service;

import java.util.List;
import java.util.Optional;

import com.university.university.university.Collections.Student;

public interface StudentService {
    public String saveStudent(Student student);
    public String updateStudent(String id,Student student);
    public List<Student> getAll();
    public Optional<Student> getById(String id);
    public boolean existsById(String id);
    public String deleteId(String id);
}
