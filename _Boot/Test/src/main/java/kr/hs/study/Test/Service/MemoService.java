package kr.hs.study.Test.Service;

import kr.hs.study.Test.DTO.MemoDTO;

import java.util.List;

public interface MemoService {
    public void insert(MemoDTO dto);
    public void update(MemoDTO dto);
    public void delete(int id);
    public List<MemoDTO> listAll();
    public MemoDTO selectOne(int id);
}
