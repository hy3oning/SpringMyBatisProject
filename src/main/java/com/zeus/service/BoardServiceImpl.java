package com.zeus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zeus.domain.Board;
import com.zeus.mapper.BoardMapper;

@Service
@Transactional
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardMapper mapper;

	@Override
	public int create(Board board) throws Exception {
		return mapper.create(board);
	}

	@Override
	public Board read(Board board) throws Exception {
		return mapper.read(board);
	}

	@Override
	public int update(Board board) throws Exception {
		return mapper.update(board);
	}

	@Override
	public int delete(Board board) throws Exception {
		return mapper.delete(board);
	}

	@Override
	@Transactional(readOnly = true)

	public List<Board> list() throws Exception {
		return mapper.list();
	}

	@Override
	@Transactional(readOnly = true)
	public List<Board> search(Board board) throws Exception {
		return mapper.search(board);
	}

}
