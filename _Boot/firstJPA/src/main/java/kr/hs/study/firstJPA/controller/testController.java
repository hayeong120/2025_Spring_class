package kr.hs.study.firstJPA.controller;

import kr.hs.study.firstJPA.service.memoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class testController {
    @Autowired
    private memoService memoService;

    @GetMapping("/input")
    public String input() {
        return "input";
    }

    @PostMapping("/input_done")
    public String inputDone() {
        return "index";
    }
}
