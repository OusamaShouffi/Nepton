package com.example.Nepton.service;

import com.example.Nepton.repository.Subject;

public interface SubjectService {
    public Long insertSubject(SubjectVO subject);
    public Long updateSubject(SubjectVO subject,Long ID);
    public Long deleteSubject(Long ID);
    public Subject selectSubject(Long ID);



}
