package kr.hs.study.myBatisPrj.service;

import kr.hs.study.myBatisPrj.DAO.JoinDAO;
import kr.hs.study.myBatisPrj.DTO.JoinDTO;
import kr.hs.study.myBatisPrj.DTO.MemoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JoinServiceImpl implements JoinService {
    @Autowired
    private JoinDAO dao;

    @Override
    public void insert(JoinDTO dto) {
        dao.insert(dto);
    }

    @Override
    public void update(JoinDTO dto) {
        dao.update(dto);
    }

    @Override
    public void delete(int idx) {
        dao.delete(idx);
    }

    @Override
    public List<JoinDTO> listAll() {
        List<JoinDTO> allList = dao.listAll();
        return allList;
    }

    @Override
    public JoinDTO selectOne(int idx) {
        return dao.selectOne(idx);
    }
}
