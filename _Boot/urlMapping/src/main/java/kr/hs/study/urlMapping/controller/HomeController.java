package kr.hs.study.urlMapping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // Component와 같은 역할이지만 좀 더 명확하게 역할 지정
public class HomeController {
    @GetMapping("/")
    public String home() {
        return  "index";
    }
}
