package com.example.demo;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.List;

@Data
@Document
@AllArgsConstructor
public class Student {
    @Id
    private String firstName;
    private String lastName;
    private String email;
    private Gender  gender;
    private Address address;
    private List<String> subjects;
    private BigDecimal totalSpentInBooks;
    private LocalDateTime created;
    }
