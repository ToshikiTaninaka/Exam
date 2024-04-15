package com.example.scoremanage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.scoremanage.model.StudentModel;
import com.example.scoremanage.service.RegistrationService;

@Controller
public class RegistrationController {

    @Autowired
    private RegistrationService userService;

    @GetMapping("/registration")
    public String showRegistrationPage(@ModelAttribute("user") StudentModel user) {
        return "registration"; // ".html" 拡張子は省略
    }
    
    @GetMapping("/registrationcompletion")
    public String showRegistrationCompletionPage(@ModelAttribute("user") StudentModel user) {
        return "registrationcompletion"; // ".html" 拡張子は省略
    }
    
    @GetMapping("/schoolchange")
    public String schoolChangePage(@ModelAttribute("user") StudentModel user) {
        return "schoolchange"; // ".html" 拡張子は省略
    }
    
    @PostMapping("/schoolchange")
    public String updateStudent(@ModelAttribute("student") StudentModel studentModel) {
        userService.updateStudent(studentModel);
        return "redirect:/registration"; // 変更後に登録画面にリダイレクトする例
    }


    @PostMapping("/registration")
    public String registerUser(@ModelAttribute("user") StudentModel user, RedirectAttributes redirectAttributes) {
        String result = userService.registerNewUser(user);
        if (result.equals("ユーザーが正常に登録されました")) {
            // 登録が成功した場合はリダイレクトする
            return "redirect:/registrationcompletion";
        } else {
            // 登録が失敗した場合はエラーメッセージを表示
            redirectAttributes.addFlashAttribute("errorMessage", result);
            return "redirect:/registration"; // リダイレクトしてもう一度トップページを表示
        }
    }
}
