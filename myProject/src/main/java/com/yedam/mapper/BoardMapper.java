package com.yedam.mapper;

import com.yedam.vo.BoardVO;

/*
 * 인터페이스(BoardMapper) - XML(BoardMapper.xml) 매칭
 */
public interface BoardMapper {
	public BoardVO selectBoard();
	public int insertBoard(BoardVO board);
	public int updateBoard(BoardVO board);
	public int deleteBoard(int bno);
}
