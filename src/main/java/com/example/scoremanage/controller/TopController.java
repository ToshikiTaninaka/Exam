package com.example.scoremanage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.scoremanage.service.LoginService;

@Controller
public class TopController {

    @Autowired
    private LoginService loginService;
    
    @GetMapping("top")
    public String index(Model model) {
        return "top";
    }
    
    @GetMapping("/")
    public String showLoginForm() {
        return "login"; // login.htmlに遷移
    }

    @PostMapping("/login")
    public String loginUser(String loginId, String password, RedirectAttributes redirectAttributes) {
        String result = loginService.authenticateUser(loginId, password);
        if (result.equals("認証成功")) {
            // 認証成功した場合はリダイレクトして適切なページに移動する
            return "redirect:/top";
        } else {
            // 認証失敗の場合はエラーメッセージを表示してログインページに戻る
            redirectAttributes.addFlashAttribute("errorMessage", result);
            return "redirect:/";
        }
    }
}
