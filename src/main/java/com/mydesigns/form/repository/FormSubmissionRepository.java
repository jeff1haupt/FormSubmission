package com.mydesigns.form.repository;

import com.mydesigns.form.entity.FormSubmissionFields;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormSubmissionRepository extends CrudRepository<FormSubmissionFields, Long> {



}
