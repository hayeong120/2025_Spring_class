package kr.hs.study.Test.Controller;

import kr.hs.study.Test.DTO.MemoDTO;
import kr.hs.study.Test.Service.MemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MemoController {
    @Autowired
    private MemoService service;

    @GetMapping("/memo")
    public String memo() {
        return "memo";
    }

    @PostMapping("/memo_save")
    public String save(MemoDTO dto) {
        service.insert(dto);
        return "redirect:/memo_list";
    }

    @GetMapping("/memo_list")
    public String List(Model model) {
        List<MemoDTO> list = service.listAll();
        model.addAttribute("memo_result", list);
        return "memo_list";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") int id, Model model) {
        MemoDTO dto = service.selectOne(id);
        model.addAttribute("edit", dto);
        return "memo_edit";
    }

    @PostMapping("/edit")
    public String update(MemoDTO dto) {
        MemoDTO original = service.selectOne(dto.getId());
        if(dto.getPassword().equals(original.getPassword())) {
            service.update(dto);
            return "redirect:/memo_list";
        }
        return "redirect:/edit/" + dto.getId();
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id) {
        service.delete(id);
        return "redirect:/memo_list";
    }
}
