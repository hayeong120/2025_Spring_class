package kr.hs.study.myBatisPrj.DAO;

import kr.hs.study.myBatisPrj.DTO.MemoDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemoDAO {
    public void insert(MemoDTO dto);
    public void update(MemoDTO dto);
    public void delete(int idx);
    public List<MemoDTO> listAll();
    public MemoDTO selectOne(int idx);
}
