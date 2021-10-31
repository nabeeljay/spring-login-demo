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
                "Nabeel",
                "nabeel.javed@naukri.com",
                LocalDate.of(1996, Month.MAY,22)
            );
            Student adeel = new Student(
                    "Adeel",
                    "nabeel.javed@naukri.com",
                    LocalDate.of(2001, Month.DECEMBER,10)
            );

            repository.saveAll(
                    List.of(nabeel,adeel)
            );
        };
    }
}
