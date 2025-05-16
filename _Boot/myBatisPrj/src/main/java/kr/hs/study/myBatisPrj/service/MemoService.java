package kr.hs.study.myBatisPrj.service;

import kr.hs.study.myBatisPrj.DTO.MemoDTO;

import java.util.List;

public interface MemoService {
    // crud 삽입, 조회, 수정, 삭제
    // 1. insert
    public void insert(MemoDTO dto);

    //2. update
    public void update(MemoDTO dto);

    //3. delete
    public void delete(int idx);

    //4. select : list 전체 가져오기
    public List<MemoDTO> listAll();

    //4. select : list 한 개만 가져오기
    public MemoDTO selectOne(int idx);
}
