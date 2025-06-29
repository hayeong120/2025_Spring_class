package kr.hs.study.Test.Service;

import kr.hs.study.Test.DAO.MemoDAO;
import kr.hs.study.Test.DTO.MemoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemoServiceImpl implements MemoService {
    @Autowired
    private MemoDAO memoDAO;

    @Override
    public void insert(MemoDTO dto) { memoDAO.insert(dto); }

    @Override
    public void update(MemoDTO dto) { memoDAO.update(dto); }

    @Override
    public void delete(int id) { memoDAO.delete(id); }

    @Override
    public List<MemoDTO> listAll() {
        List<MemoDTO> list = memoDAO.listAll();
        return list;
    }

    @Override
    public MemoDTO selectOne(int id) { return memoDAO.selectOne(id); }
}
