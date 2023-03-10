package com.shop.myapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shop.myapp.dao.BoardMapper;
import com.shop.myapp.dto.BoardDTO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService{
    private final BoardMapper boardMapper;

    @Override
    public List<BoardDTO> findAll() {
        return boardMapper.findAll();
    }
    
	@Override
	public BoardDTO getBoard(long id) {
		boardMapper.hitsUpdate(id);
		return boardMapper.getBoard(id);
	}
	
	@Override
	public void addBoard(BoardDTO board) {
		boardMapper.addBoard(board);
	}
	
	@Override
	public void updateBoard(BoardDTO board) {
		boardMapper.updateBoard(board);
	}

	@Override
	public void delBoard(long id) {
		boardMapper.delBoard(id);
	}   
	

}
