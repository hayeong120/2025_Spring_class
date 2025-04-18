package kr.hs.study.myBatisPrj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class T_TableController {
    @GetMapping("t_Table")
    public String tTable() {
        return "table_input";
    }

    @PostMapping("/ttable_input")
    public String ttable_input(@RequestParam("dan") int dan, Model model) {
        String result = "";

        for (int i=1; i<=9; i++) {
            result += dan + " X " + i + " = " + dan*i + "<br>";
        }

        model.addAttribute("table_result", result);

        return "result";
    }
}
