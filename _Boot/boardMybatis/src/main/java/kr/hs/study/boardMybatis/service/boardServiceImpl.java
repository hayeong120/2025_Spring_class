package kr.hs.study.boardMybatis.service;

import kr.hs.study.boardMybatis.DAO.boardDAO;
import kr.hs.study.boardMybatis.DTO.boardDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class boardServiceImpl implements boardService {
    @Autowired
    private boardDAO boardDao;

    @Override
    public void insert(boardDTO boardDto) { boardDao.insert(boardDto); }

    @Override
    public void update(boardDTO boardDto) { boardDao.update(boardDto); }

    @Override
    public void delete(int idx) { boardDao.delete(idx); }

    @Override
    public List<boardDTO> selectAll() {
        List<boardDTO> boardList = boardDao.selectAll();
        return boardList;
    }

    @Override
    public boardDTO selectOne(int idx) { return boardDao.selectOne(idx); }

    @Override
    public void countHits(int idx) { boardDao.countHits(idx); }
}
