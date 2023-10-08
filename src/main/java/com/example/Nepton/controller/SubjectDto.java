package com.example.Nepton.controller;

import com.example.Nepton.service.SubjectVO;
import lombok.Data;
import org.hibernate.annotations.SQLUpdates;
import org.springframework.format.annotation.DateTimeFormat;

@Data
public class SubjectDto {
    private final Long id;
    private final String name;
    private final int semester;
    private final String teacher;
    private final int score;

    public SubjectVO toVO() {
        return new SubjectVO(id, name, semester, teacher, score);
    }
}
