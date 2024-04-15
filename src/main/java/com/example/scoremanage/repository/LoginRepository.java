package com.example.scoremanage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.scoremanage.model.LoginModel;

public interface LoginRepository extends JpaRepository<LoginModel, Long> {
    LoginModel findByLoginIdAndPassword(Long loginId, String password);
}
