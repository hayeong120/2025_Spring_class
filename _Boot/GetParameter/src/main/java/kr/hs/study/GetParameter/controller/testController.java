package kr.hs.study.GetParameter.controller;

import jakarta.servlet.http.HttpServletRequest;
import kr.hs.study.GetParameter.dto.GetParameterDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

@Controller
public class testController {
    @GetMapping("/test1")
    public String test1(HttpServletRequest req) {
        String str1=req.getParameter("data1");
        String str2=req.getParameter("data2");
        String [] str3=req.getParameterValues("data3");

        System.out.println("data1 : " + str1);
        System.out.println("data2 : " + str2);
        for(String a : str3) {
            System.out.println("data3 : " + a);
        }
        System.out.println("----------------");
        return "result";
    }

    @GetMapping("/test2")
    public String test2(WebRequest weq) {
        String str1=weq.getParameter("data1");
        String str2=weq.getParameter("data2");
        String [] str3=weq.getParameterValues("data3");

        System.out.println("data1 : " + str1);
        System.out.println("data2 : " + str2);
        for(String a : str3) {
            System.out.println("data3 : " + a);
        }
        System.out.println("----------------");
        return "result";
    }

    @GetMapping("/test3/{data1}/{data2}/{data3}")
    public String test3(@PathVariable("data1") int data1,
                        @PathVariable("data2") int data2,
                        @PathVariable("data3") int data3) {
        System.out.println("data1 : " + data1);
        System.out.println("data2 : " + data2);
        System.out.println("data1 : " + data3);
        System.out.println("----------------");
        return "result";
    }

    @GetMapping("/test4")
    public String test4(@RequestParam("data1") int data1,
                        @RequestParam("data2") int data2,
                        @RequestParam("data3") int [] data3) {
        System.out.println("data1 : " + data1);
        System.out.println("data2 : " + data2);
        for (int i : data3) {
            System.out.println("data3 : " + i);
        }
        System.out.println("----------------");
        return "result";
    }

    @GetMapping("/test5")
    public String test5(@ModelAttribute GetParameterDTO dto) {
        System.out.println("data1 : " + dto.getData1());
        System.out.println("data2 : " + dto.getData2());
        return "result";
    }
}
