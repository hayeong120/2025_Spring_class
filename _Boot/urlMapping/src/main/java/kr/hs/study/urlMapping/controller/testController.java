package kr.hs.study.urlMapping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@RequestMapping("/sub1")
public class testController {
    @RequestMapping(value="/test1", method= RequestMethod.GET)
    public String test1() {
        return "test1";
    }

    @RequestMapping(value = "/test2", method = RequestMethod.GET)
    public String test2() {
        return "test2";
    }

    @RequestMapping(value = "/sub1/test3", method = RequestMethod.GET)
    public String test3() {
        return "test3";
    }

    @RequestMapping(value = "/sub1/test4", method = RequestMethod.GET)
    public String test4() {
        return "test4";
    }

    @RequestMapping(value = "/sub1/test5", method = RequestMethod.GET)
    public String test5() {
        return "test5";
    }

    @PostMapping("/test6")
    public String test6() {
        return "test6";
    }
}
