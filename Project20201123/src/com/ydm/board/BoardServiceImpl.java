package com.ydm.board;

import java.util.List;

public class BoardServiceImpl implements BoardService {
	
	BoardDAO dao = new BoardDAO();

	@Override
	public List getBarList() {
		return dao.getBarList();
	}

	@Override
	public BoardVO getBar(int barNo) {
		return dao.getBar(barNo);
	}

	@Override
	public void inserBar(BoardVO barVO) {
		dao.insertBar(barVO);

	}
	
	@Override
	public void deleteBar(int barNo) {
		dao.deleteBar(barNo);
	}

	@Override
	public void updateBar(BoardVO barVO) {
		dao.updateBar(barVO);
	}

}
