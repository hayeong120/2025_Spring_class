package kr.hs.study.myBatisPrj.controller;

import kr.hs.study.myBatisPrj.DTO.JoinDTO;
import kr.hs.study.myBatisPrj.service.JoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class JoinusController {
    @Autowired
    private JoinService service;

    @GetMapping("/joinUs")
    public String joinUs(){
        return "joinUs";
    }

    @PostMapping("/join_input")
    public String login_input(JoinDTO dto, Model model) {
        service.insert(dto);
        model.addAttribute("join_result", dto);
        return "result";
    }
}
