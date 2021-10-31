package com.example.demo;

import com.example.demo.models.Student;
import com.example.demo.respository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner (StudentRepository repository) {
        return args -> {
            Student nabeel = new Student(
                "John",
                "john.doe@example.com",
                LocalDate.of(2000, Month.JAN,22)
            );
            Student adeel = new Student(
                    "abc",
                    "abc@example.com",
                    LocalDate.of(2001, Month.FEB,10)
            );

            repository.saveAll(
                    List.of(nabeel,adeel)
            );
        };
    }
}
