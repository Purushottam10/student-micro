package com.dz.student.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;



@Getter
@Setter
@NoArgsConstructor

@Document("student")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Student  extends IdentityModel {

    private String name;
    private String emailId;
    private int marks ;

    public Student(String name,String emailId,int marks) {
        this.name = name;
        this.emailId = emailId;
        this.marks = marks;
    }
}
