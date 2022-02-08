package com.dc14.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.springframework.data.mongodb.core.mapping.Field;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class Subject {
    @Field(name = "subject_name")
    String name;

    @Field(name = "marks_obtained")
    int marksObtained;
}
