package com.dc14.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document(collection = "student")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class Student {
    @Id
    String id;

    String name;

    @Field(name = "mail")
    String email;

    Department department;

    List<Subject> subjects;
}
