package kr.hs.study.myBatisPrj.controller;

import kr.hs.study.myBatisPrj.DTO.MemoDTO;
import kr.hs.study.myBatisPrj.service.MemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MemoController {
    @Autowired
    private MemoService service;

    @GetMapping("/memo")
    public String memo(Model model) {
        List<MemoDTO> all = service.listAll();
        model.addAttribute("memo_result", all);
        System.out.println("size : " + all.size());
        return "memo";
    }

    @PostMapping("/memo_input")
    public String insert(MemoDTO dto) {
        service.insert(dto);
        return "redirect:/memo";
    }

    @GetMapping("/edit/{idx}")
    public String edit_form(@PathVariable("idx") int idx, Model model) {
        System.out.println("idx: " + idx);
        MemoDTO dto = service.selectOne(idx);
        model.addAttribute("one", dto);
        return "edit_form";
    }

    @PostMapping("/edit")
    public String update(MemoDTO dto) {
        service.update(dto);
        return "redirect:/memo";
    }

    @GetMapping("/delete/{idx}")
    public String delete(@PathVariable("idx") int idx) {
        service.delete(idx);
        return "redirect:/memo";
    }

//    @GetMapping("/memo/list")
//    public String listAll(Model model) {
//        List<MemoDTO> all = service.listAll();
//        model.addAttribute("memo_result", all);
//        System.out.println("size : " + all.size());
//        return "result";
//    }
}
