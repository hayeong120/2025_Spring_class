package kr.hs.study.boardMybatis.controller;

import kr.hs.study.boardMybatis.DTO.boardDTO;
import kr.hs.study.boardMybatis.service.boardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class BoardController {
    @Autowired
    private boardService service;

    @GetMapping("/boardForm")
    public String boardForm() {
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
        return "redirect:/boardList";
    }

    // 상세 페이지
    @GetMapping("/board/{id}")
    public String boardDetail(@PathVariable("id") int id, Model model) {
        service.countHits(id);
        boardDTO board = service.selectOne(id);
        model.addAttribute("board", board);
        return "boardDetail";
    }

    // 수정 페이지
    @GetMapping("/board/update")
    public String updateForm(@RequestParam("id") int id, Model model) {
        boardDTO board = service.selectOne(id);
        model.addAttribute("board", board);
        return "boardUpdate";
    }

    @PostMapping("/update/{id}")
    public String update(boardDTO boardDto, Model model) {
        boardDTO original = service.selectOne(boardDto.getId());

        // 비밀번호 검증
        if (!original.getBoardPass().equals(boardDto.getBoardPass())) {
            model.addAttribute("board", original);
            model.addAttribute("error", "비밀번호가 일치하지 않습니다.");
            return "boardUpdate";
        }

        service.update(boardDto);
        return "redirect:/board/" + boardDto.getId();
    }

    // 삭제
    @GetMapping("/board/delete/{id}")
    public String delete(@PathVariable int id) {
        service.delete(id);
        return "redirect:/boardList";
    }
}
