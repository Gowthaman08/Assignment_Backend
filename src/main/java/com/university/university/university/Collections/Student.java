package com.university.university.university.Collections;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Document(collection ="student")
public class Student {

    @Id
    private String studentId;
    @JsonFormat(pattern="yyyy-MM-DD")
    private Date dob;
    private String name;
    private String address;
    private int phoneNumber;
    @JsonFormat(pattern="yyyy-MM-DD")
    private Date joinDate;
    
}
