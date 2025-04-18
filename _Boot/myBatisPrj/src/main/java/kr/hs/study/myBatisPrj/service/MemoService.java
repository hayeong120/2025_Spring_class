package kr.hs.study.myBatisPrj.service;

import kr.hs.study.myBatisPrj.DTO.MemoDTO;

import java.util.List;

public interface MemoService {
    // crud 삽입, 조회, 수정, 삭제
    // 1. insert
    public void insert(MemoDTO dto);

    //2. update
    public void update(int idx);

    //3. delete
    public void delete(int idx);

    //4. select
    public List<MemoDTO> listAll();
}
