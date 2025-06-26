package kr.hs.study.boardMybatis.DAO;

import kr.hs.study.boardMybatis.DTO.boardDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface boardDAO {
    public void insert (boardDTO boardDto);
    public void update (boardDTO boardDto);
    public void delete (int idx);
    public List<boardDTO> selectAll();
    public boardDTO selectOne(int idx);
    public void countHits(int idx);
}
