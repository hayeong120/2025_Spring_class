package kr.hs.study.myBatisPrj.service;

import kr.hs.study.myBatisPrj.DAO.MemoDAO;
import kr.hs.study.myBatisPrj.DTO.MemoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemoServiceImpl implements MemoService {
    @Autowired
    private MemoDAO dao;

    @Override
    public void insert(MemoDTO dto) {
        dao.insert(dto);
    }

    @Override
    public void update(MemoDTO dto) {
        dao.update(dto);
    }

    @Override
    public void delete(int idx) {
        dao.delete(idx);
    }

    @Override
    public List<MemoDTO> listAll() {
        List<MemoDTO> all = dao.listAll();
        return all;
    }

    @Override
    public MemoDTO selectOne(int idx) {
        return dao.selectOne(idx);
    }
}
