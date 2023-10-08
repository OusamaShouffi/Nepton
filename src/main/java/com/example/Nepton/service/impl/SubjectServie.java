package com.example.Nepton.service.impl;

import com.example.Nepton.repository.Subject;
import com.example.Nepton.repository.SubjectRepository;
import com.example.Nepton.service.SubjectVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class SubjectServie implements com.example.Nepton.service.SubjectService{
    private final SubjectRepository subjectRepository;

    @Override
    public Long insertSubject(SubjectVO subject) {
        Subject newSubject = subjectRepository.save(subject.toEntity());
        return newSubject.getId();
    }
}
