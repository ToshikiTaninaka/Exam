package com.example.scoremanage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.scoremanage.model.StudentModel;
import com.example.scoremanage.repository.RegistrationRepository;

@Service
public class RegistrationService {

    @Autowired
    private RegistrationRepository userRepository;

    // 新規登録機能のメソッド
    public String registerNewUser(StudentModel user) {
    	
    	if (userRepository.existsByNo(user.getNo())) {
            return "ユーザーネームが既に使用されています";
        }
        
        // いずれも重複していない場合は新規登録を行う
        userRepository.save(user);
        return "ユーザーが正常に登録されました";
    }
    
    public StudentModel updateStudent(StudentModel user) {
    	return userRepository.save(user);
    }
}
