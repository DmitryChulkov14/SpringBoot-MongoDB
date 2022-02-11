package com.dc14.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@Document(collection = "department")
public class Department {

    @Id
    String id;

    @Field(name = "department_name")
    String name;

    String location;
}
