package com.example.studentmanage.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student jayne = new Student(
                    "Jayne",
                    "jayne@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 10)
            );
            Student tobi = new Student(
                    "Tobi",
                    "Tobi@gmail.com",
                    LocalDate.of(1998, Month.OCTOBER, 10)
            );

            repository.saveAll(
                    List.of(jayne, tobi)
            );
        };
    }
}
