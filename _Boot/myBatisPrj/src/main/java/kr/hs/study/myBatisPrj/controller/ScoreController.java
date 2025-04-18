package kr.hs.study.myBatisPrj.controller;

import kr.hs.study.myBatisPrj.DTO.ScoreDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ScoreController {
    @GetMapping("/score")
    public String score() {
        return "score";
    }

    @PostMapping("/score_input")
    public String score_input(@ModelAttribute ScoreDTO dto, Model model) {
        int sum = 0;
        double avg = 0;
        String result = "";

        sum = dto.getKor() + dto.getEng() + dto.getMat();
        avg = (double)sum / 3;

        result += "이름 : " + dto.getName() + "<br>";
        result += "국어 : " + dto.getKor() + "<br>";
        result += "영어 : " + dto.getEng() + "<br>";
        result += "수학 : " + dto.getMat() + "<br>";
        result += "총점 : " + sum + "<br>";
        result += "평균 : " + avg;

        model.addAttribute("score_result", result);

        return "result";

        // dto.setTotal(dto.getKor()+dto.getEng()+dto.getMath());
        // String avg = String.format("%.2f", dto.getTotal()/3.0);
        // dgo.setAvg(Double.parseDouble(avg));
        // model.addAttribute("list", dto);
    }
}
