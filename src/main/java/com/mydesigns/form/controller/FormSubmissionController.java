package com.mydesigns.form.controller;


import com.mydesigns.form.entity.FormSubmissionFields;
import com.mydesigns.form.service.FormSubmissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class FormSubmissionController {

    @Autowired
    FormSubmissionService service;

    @GetMapping("/submit-form")
    public String createForm(Model model) {

        model.addAttribute("formSubmit", new FormSubmissionFields());
        return "submit-form";
    }

    @PostMapping("/save-form")
    public String createFormSubmission(@ModelAttribute FormSubmissionFields formSubmit)
    {
        service.createFormSubmission(formSubmit);
        return "results";
    }

}
