package kr.hs.study.myBatisPrj.controller;

import kr.hs.study.myBatisPrj.DTO.LoginDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login_input")
    public String login_input(@ModelAttribute LoginDTO dto, Model model) {
        String samId = "jhy120";
        String samPw = "alflaakrh";
        String result = "";

        if(dto.getUserId().equals(samId) && dto.getUserPw().equals(samPw)) {
            result = "로그인에 성공하였습니다!";
        } else {
            result = "로그인에 실패하였습니다!";
        }

        model.addAttribute("login_result", result);

        return "result";
    }
}
