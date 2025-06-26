package kr.hs.study.boardMybatis.service;

import kr.hs.study.boardMybatis.DTO.boardDTO;

import java.util.List;

public interface boardService {
    // 1. insert
    public void insert(boardDTO boardDto);

    // 2. update
    public void update(boardDTO boardDto);

    // 3. delete
    public void delete(int idx);

    // 4. select : list 전체 가져오기
    public List<boardDTO> selectAll();

    // 5. select : list 한 개만 가져오기
    public boardDTO selectOne(int idx);

    // 6. 조회수 올리기
    public void countHits(int idx);
}
