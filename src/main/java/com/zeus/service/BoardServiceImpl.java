package com.zeus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zeus.domain.Board;
import com.zeus.mapper.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardMapper mapper;

	@Override
	public void create(Board board) throws Exception {
		mapper.create(board);
	}

	@Override
	public Board read(Integer no) throws Exception {
		return mapper.read(no);
	}

	@Override
	public void update(Board board) throws Exception {
		mapper.update(board);
	}

	@Override
	public void delete(Integer no) throws Exception {
		mapper.delete(no);
	}

	@Override
	public List<Board> list() throws Exception {
		return mapper.list();
	}

	@Override
	public List<Board> search(Board board) throws Exception {
		return mapper.search(board);
	}

}
