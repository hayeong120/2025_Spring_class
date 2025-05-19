package kr.hs.study.myBatisPrj.service;

import kr.hs.study.myBatisPrj.DTO.JoinDTO;
import kr.hs.study.myBatisPrj.DTO.MemoDTO;

import java.util.List;

public interface JoinService {
    // 1. insert
    public void insert(JoinDTO dto);

    //2. update
    public void update(JoinDTO dto);

    //3. delete
    public void delete(int idx);

    //4. select : list 전체 가져오기
    public List<JoinDTO> listAll();

    //4. select : list 한 개만 가져오기
    public JoinDTO selectOne(int idx);
}
