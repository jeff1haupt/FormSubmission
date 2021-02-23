package com.mydesigns.form.service;

import com.mydesigns.form.entity.FormSubmissionFields;
import com.mydesigns.form.repository.FormSubmissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormSubmissionService {

    @Autowired
    FormSubmissionRepository repo;

    public FormSubmissionFields createFormSubmission(FormSubmissionFields formSubmit) {
        return repo.save(formSubmit);
    }

}
