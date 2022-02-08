package com.dc14.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.springframework.data.mongodb.core.mapping.Field;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class Department {
    @Field(name = "department_name")
    String name;

    String location;
}
