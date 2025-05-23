package kr.hs.study.myBatisPrj.service;

import kr.hs.study.myBatisPrj.DTO.TodoDTO;

import java.util.List;

public interface TodoService {
    // 1. insert
    public void insert(TodoDTO dto);

    //2. update
    public void update(TodoDTO dto);

    //3. delete
    public void delete(int idx);

    //4. select : list 전체 가져오기
    public List<TodoDTO> listAll();

    //4. select : list 한 개만 가져오기
    public TodoDTO selectOne(int idx);
}
