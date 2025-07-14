package kr.hs.study.boardMybatis.service;

import kr.hs.study.boardMybatis.DTO.commentDTO;

import java.util.List;

public interface commentService {
    public void insert(commentDTO dto);
    public void delete(int id);
    public List<commentDTO> selectAll();
}
