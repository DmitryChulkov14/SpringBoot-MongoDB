package com.dc14.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
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

    @Transient
    @Getter(AccessLevel.NONE)
    double percentage;

    Department department;

    List<Subject> subjects;

    public double getPercentage() {
        if (subjects != null && !subjects.isEmpty()) {
            int total = subjects.stream()
                    .map(Subject::getMarksObtained)
                    .reduce(0, Integer::sum);

            return (double) total / subjects.size();
        }

        return 0.00;
    }
}
