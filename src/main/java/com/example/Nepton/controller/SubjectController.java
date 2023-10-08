package com.example.Nepton.controller;

import com.example.Nepton.service.SubjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SubjectController {
    private final SubjectService subjectService;

    @PostMapping(path = "/subject")
    public Long insertSubject(@RequestBody SubjectDto subject) {
        return subjectService.insertSubject(subject.toVO());
    }

}
