package com.university.university.university.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.university.university.university.Collections.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student,String>{
    public boolean existsById(String id);
    
}
