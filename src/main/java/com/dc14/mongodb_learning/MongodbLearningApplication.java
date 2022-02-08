package com.dc14.mongodb_learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("com.dc14.repository")
@ComponentScan("com.dc14.*")
public class MongodbLearningApplication {

    public static void main(String[] args) {
        SpringApplication.run(MongodbLearningApplication.class, args);
    }

}
