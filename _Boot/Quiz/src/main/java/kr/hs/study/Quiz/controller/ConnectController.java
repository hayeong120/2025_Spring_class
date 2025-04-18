package kr.hs.study.Quiz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConnectController {
    @GetMapping("/quiz1")
    public String quiz1() {
        return "quiz1";
    }
    @GetMapping("/quiz2")
    public String quiz2() {
        return "quiz2";
    }
    @GetMapping("/quiz3")
    public String quiz3() {
        return "quiz3";
    }
    @GetMapping("/quiz4")
    public String quiz4() {
        return "quiz4";
    }
    @GetMapping("/quiz5")
    public String quiz5() {
        return "quiz5";
    }
    @GetMapping("/quiz6")
    public String quiz6() {
        return "quiz6";
    }
    @GetMapping("/quiz7")
    public String quiz7() {
        return "quiz7";
    }
}
