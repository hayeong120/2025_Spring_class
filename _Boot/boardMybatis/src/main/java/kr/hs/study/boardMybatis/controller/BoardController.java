package kr.hs.study.boardMybatis.controller;

import kr.hs.study.boardMybatis.DTO.boardDTO;
import kr.hs.study.boardMybatis.service.boardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class BoardController {
    @Autowired
    private boardService service;

    @GetMapping("/boardForm")
    public String board() {
        return "boardForm";
    }

    @GetMapping("/boardList")
    public String boardList(Model model) {
        List<boardDTO> boardList = service.selectAll();
        model.addAttribute("boardList", boardList);
        System.out.println("size : " + boardList.size());
        return "boardList";
    }

    @PostMapping("/save")
    public String save(boardDTO boardDto, Model model) {
        service.insert(boardDto);
        model.addAttribute("boardDTO", boardDto);
        return "boardList";
    }
}
