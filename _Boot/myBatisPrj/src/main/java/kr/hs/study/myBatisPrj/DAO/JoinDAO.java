package kr.hs.study.myBatisPrj.DAO;

import kr.hs.study.myBatisPrj.DTO.JoinDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface JoinDAO {
    public void insert(JoinDTO dto);
    public void update(JoinDTO dto);
    public void delete(int idx);
    public List<JoinDTO> listAll();
    public JoinDTO selectOne(int idx);
}
