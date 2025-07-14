package kr.hs.study.boardMybatis.DAO;

import kr.hs.study.boardMybatis.DTO.commentDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface commentDAO {
    public void insert(commentDTO dto);
    public void delete(int id);
    public List<commentDTO> selectAll();
}
