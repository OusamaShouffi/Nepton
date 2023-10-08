package com.example.Nepton.service;

import com.example.Nepton.repository.Subject;
import lombok.Data;

@Data
public class SubjectVO {
    private final Long id;
    private final String name;
    private final int semester;
    private final String teacher;
    private final int score;

    public Subject toEntity() {
        return new Subject(id, name, semester, teacher, score);
    }
}
