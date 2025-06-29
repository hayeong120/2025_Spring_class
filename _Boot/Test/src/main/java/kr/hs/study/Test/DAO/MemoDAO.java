package kr.hs.study.Test.DAO;

import kr.hs.study.Test.DTO.MemoDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemoDAO {
    public void insert(MemoDTO dto);
    public void update(MemoDTO dto);
    public void delete(int id);
    public List<MemoDTO> listAll();
    public MemoDTO selectOne(int id);
}
