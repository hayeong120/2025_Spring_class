package kr.hs.study.myBatisPrj.controller;

import kr.hs.study.myBatisPrj.DTO.MemoDTO;
import kr.hs.study.myBatisPrj.DTO.TodoDTO;
import kr.hs.study.myBatisPrj.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class TodoController {
    @Autowired
    private TodoService service;

    @GetMapping("/todo")
    public String todo(Model model) {
        List<TodoDTO> allList = service.listAll();
        model.addAttribute("todo_result", allList);
        System.out.println("size : " + allList.size());
        return "todo";
    }

    @PostMapping("/todo_input")
    public String insert(TodoDTO dto) {
        service.insert(dto);
        return "redirect:/todo";
    }

    @GetMapping("/todo_edit/{idx}")
    public String edit_form(@PathVariable("idx") int idx, Model model) {
        System.out.println("idx : " + idx);
        TodoDTO dto = service.selectOne(idx);
        model.addAttribute("edit_one", dto);
        return "todo_edit";
    }

    @PostMapping("/todo_edit")
    public String update(@RequestParam("password") String password, TodoDTO dto) {
        TodoDTO userdto = service.selectOne(dto.getIdx());
        System.out.println("password : " + password);
        if (userdto.getPassword().equals(password)){
            service.update(dto);
            return "redirect:/todo";
        }
        return "redirect:/todo_edit";
    }

    @PostMapping("/todo_delete")
    public String delete(@RequestParam("password") String password, TodoDTO dto) {
        TodoDTO userdto = service.selectOne(dto.getIdx());
        System.out.println("password : " + password);
        if (userdto.getPassword().equals(password)){
            service.delete(dto.getIdx());
            return "redirect:/todo";
        }
        return "redirect:/todo_edit";
    }
}
