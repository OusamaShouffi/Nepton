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

    @Override
    public Long updateSubject(SubjectVO subject, Long ID) {
        Subject subject1 = subjectRepository.findById(ID).get();
        subject1.setName(subject.getName());
        subject1.setScore(subject.getScore());
        subject1.setTeacher(subject.getTeacher());
        subject1.setSemester(subject.getSemester());
        subjectRepository.save(subject1);
        return subject1.getId();
    }

    @Override
    public Long deleteSubject(Long ID) {
        subjectRepository.deleteById(ID);
        return ID;
    }

    @Override
    public Subject selectSubject(Long ID) {
        return subjectRepository.findById(ID).get();
    }

}
