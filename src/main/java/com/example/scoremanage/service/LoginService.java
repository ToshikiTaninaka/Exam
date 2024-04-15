package com.example.scoremanage.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class LoginService implements UserDetailsService {

    public String authenticateUser(String loginId, String password) {
        // ここに認証ロジックを実装する
        // ユーザーIDとパスワードが正しい場合は "認証成功" を返す
        // 認証失敗の場合は適切なエラーメッセージを返す
        // 例:
        if ("234".equals(loginId) && "ohara".equals(password)) {
            return "認証成功";
        } else {
            return "ユーザーIDまたはパスワードが間違っています";
        }
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // loadUserByUsername メソッド内で authenticateUser メソッドを呼び出す
        String result = authenticateUser(username, ""); // パスワードは使わないので空文字列を渡す
        if (result.equals("認証成功")) {
            // 認証成功した場合は、固定のユーザー情報を返す
            return User.withUsername(username)
                    .password("") // パスワードは使わないので空文字列を設定
                    .roles("USER")
                    .build();
        } else {
            throw new UsernameNotFoundException("User not found");
        }
    }
}
