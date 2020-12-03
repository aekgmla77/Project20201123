package com.ydm.board;

import java.util.List;

public interface BoardService {
	public List getBarList();
	public BoardVO getBar(int barNo);
	public void inserBar(BoardVO barVO);
	public void deleteBar(int barNo);
	public void updateBar(BoardVO barVO);
	

}
