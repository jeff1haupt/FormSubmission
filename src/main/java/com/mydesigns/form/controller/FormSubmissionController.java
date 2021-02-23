package com.mydesigns.form.controller;


import com.mydesigns.form.entity.FormSubmissionFields;
import com.mydesigns.form.service.FormSubmissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/submitForm")
public class FormSubmissionController {

    @Autowired
    FormSubmissionService service;

    @RequestMapping(method = RequestMethod.POST)
    public String createFormSubmission(FormSubmissionFields formSubmit)
    {
        service.createFormSubmission(formSubmit);
        return "redirect:/";
    }

}
