package kr.hs.study.login_sample.controller;

import kr.hs.study.login_sample.DTO.LoginDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
    @PostMapping("/loginTest")
    public String login(@ModelAttribute LoginDTO dto, Model model) {
        String samId = "lay";
        String samPw = "1111";
        String resultMessage;

        if(dto.getUserId().equals(samId) && dto.getUserPw().equals(samPw)) {
            resultMessage = "로그인되었습니다.";
        } else {
            resultMessage = "아이디나 비밀번호가 올바르지 않습니다.";
        }

        model.addAttribute("message", resultMessage);
        model.addAttribute("dto", dto);

        return "login_result";
    }
}
