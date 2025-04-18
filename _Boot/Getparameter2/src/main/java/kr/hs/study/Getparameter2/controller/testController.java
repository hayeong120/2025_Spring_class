package kr.hs.study.Getparameter2.controller;

import kr.hs.study.Getparameter2.dto.LoginDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class testController {
    @GetMapping("/login")
    public String login() {
        return "login";
    }

//    @PostMapping("/test1")
//    public String test1(@RequestParam("userId") String userId,
//                        @RequestParam("userPass") String userPass) {
//        System.out.println("userId : " + userId);
//        System.out.println("userPass : " + userPass);
//        return "result";
//    }

    @PostMapping("/test1")
    public String test1(@ModelAttribute LoginDTO dto) {
        // get을 이용해 자동으로 가져오기
        System.out.println("userId : " + dto.getUserId());
        System.out.println("userPassword : " + dto.getUserPass());
        return "result";
    }
}
