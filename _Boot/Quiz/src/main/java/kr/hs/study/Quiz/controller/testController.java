package kr.hs.study.Quiz.controller;

import kr.hs.study.Quiz.dto.QuizDTO1;
import kr.hs.study.Quiz.dto.QuizDTO2;
import kr.hs.study.Quiz.dto.QuizDTO3;
import kr.hs.study.Quiz.dto.QuizDTO4;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class testController {
    @GetMapping("/test1")
    public String test1(@RequestParam("data") int [] data) {
        int even=0, odd=0;
        for(int i=0; i<data.length; i++) {
            if(data[i]%2==0) {
                even += data[i];
            } else odd += data[i];
        }

        System.out.println("짝수 합계 : " + even);
        System.out.println("홀수 합계 : " + odd);

        return "result";
    }

    @PostMapping("/test2")
    public String test2(@ModelAttribute QuizDTO2 dto) {
        int i = 1, mul=0;
        for (i=1; mul<=100; i++) {
            System.out.print((dto.getData1() * i) + " ");
            mul = dto.getData1() * i;
        }

        return "result";
    }

    @PostMapping("/test3")
    public String test3(@ModelAttribute QuizDTO3 dto) {
        int max=0, min=0;
        if(dto.getData1() < dto.getData2()) {
            max = dto.getData1();
            min = dto.getData2();
        } else {
            max = dto.getData2();
            min = dto.getData1();
        }

        for(int i=min; i<=max; i++) {
            System.out.print(i + ", ");
        }

        return "result";
    }

    @PostMapping("/test4")
    public String test4(@ModelAttribute QuizDTO4 dto) {
        int sum=0;
        for(int i=1; i<=dto.getData1(); i++) {
            if(i%5==0) sum += i;
        }

        System.out.println(sum);

        return "result";
    }


    @GetMapping("/test5")
    public String test5(@RequestParam("data") int [] data) {
        int even=0, odd=0;
        for(int i=0; i<data.length; i++) {
            if(data[i] % 2 ==0) {
                even++;
            } else odd++;
        }

        System.out.println("짝수의 개수 : " + even);
        System.out.println("홀수의 개수 : " + odd);

        return "result";
    }

    @GetMapping("/test6")
    public String test6(@RequestParam("data") int [] data) {
        int even=0, odd=0;
        for(int i=0; i<data.length; i++) {
            if(data[i] % 2 ==0) {
                even++;
            } else odd++;
        }

        System.out.println("짝수의 개수 : " + even);
        System.out.println("홀수의 개수 : " + odd);

        return "result";
    }
}
