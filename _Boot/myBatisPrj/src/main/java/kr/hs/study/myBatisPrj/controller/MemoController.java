package kr.hs.study.myBatisPrj.controller;

import kr.hs.study.myBatisPrj.DTO.MemoDTO;
import kr.hs.study.myBatisPrj.service.MemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemoController {
    @Autowired
    private MemoService service;

    @GetMapping("/memo")
    public String memo() {
        return "memo";
    }

    @PostMapping("/memo_input")
    public String insert(MemoDTO dto) {
        service.insert(dto);
        return "result";
    }
}
