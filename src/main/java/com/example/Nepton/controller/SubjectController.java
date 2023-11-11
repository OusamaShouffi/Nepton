package com.example.Nepton.controller;

import com.example.Nepton.repository.Subject;
import com.example.Nepton.service.SubjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.yaml.snakeyaml.events.Event;

@RestController
@RequiredArgsConstructor
public class SubjectController {
    private final SubjectService subjectService;

    @PostMapping(path = "/subject")
    public Long insertSubject(@RequestBody SubjectDto subject) {
        return subjectService.insertSubject(subject.toVO());
    }
    @PutMapping(path = "/subject/{id}")
    public Long updateSubject(@RequestBody SubjectDto subject, @PathVariable("id") Long ID){
        return subjectService.updateSubject(subject.toVO(),ID);
    }
    @GetMapping(path = "/subject/{id}")
    public Subject selectSubject( @PathVariable("id") Long ID){
        return subjectService.selectSubject(ID);
    }
    @DeleteMapping(path = "/subject/{id}")
    public Long deleteSubject(@PathVariable("id") Long ID){
        return subjectService.deleteSubject(ID);
    }

}
