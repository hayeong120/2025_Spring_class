package kr.hs.study.myBatisPrj.DAO;

import kr.hs.study.myBatisPrj.DTO.TodoDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TodoDAO {
    public void insert(TodoDTO dto);
    public void update(TodoDTO dto);
    public void delete(int idx);
    public List<TodoDTO> listAll();
    public TodoDTO selectOne(int idx);
}
