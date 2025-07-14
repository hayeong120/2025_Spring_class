package kr.hs.study.boardMybatis.service;

import kr.hs.study.boardMybatis.DAO.commentDAO;
import kr.hs.study.boardMybatis.DTO.commentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class commentServiceImpl implements commentService {
    @Autowired
    private commentDAO dao;

    @Override
    public void insert(commentDTO dto) { dao.insert(dto); }

    @Override
    public void delete(int id) { dao.delete(id); }

    @Override
    public List<commentDTO> selectAll() {
        List<commentDTO> commentList = dao.selectAll();
        return commentList;
    }
}
