package com.example.scoremanage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.scoremanage.model.StudentModel;

@Repository
public interface RegistrationRepository extends JpaRepository<StudentModel, String> {

    
    boolean existsByNo(String no);
}
