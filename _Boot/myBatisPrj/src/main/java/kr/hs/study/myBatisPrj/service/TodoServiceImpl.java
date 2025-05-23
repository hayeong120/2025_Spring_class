package kr.hs.study.myBatisPrj.service;

import kr.hs.study.myBatisPrj.DAO.TodoDAO;
import kr.hs.study.myBatisPrj.DTO.TodoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {
    @Autowired
    private TodoDAO dao;

    @Override
    public void insert(TodoDTO dto) {
        dao.insert(dto);
    }

    @Override
    public void update(TodoDTO dto) {
        dao.update(dto);
    };

    @Override
    public void delete(int idx) {
        dao.delete(idx);
    };

    @Override
    public List<TodoDTO> listAll() {
        List<TodoDTO> allList = dao.listAll();
        return allList;
    };

    @Override
    public TodoDTO selectOne(int idx) {
        return dao.selectOne(idx);
    };

}
