package kr.co.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.dao.BoardDAO;
import kr.co.vo.BoardVO;
import kr.co.vo.Criteria;

@Service
public class BoardServiceImpl implements BoardService{
	@Inject
	private BoardDAO dao;
	@Override
	public void write(BoardVO boardVO) throws Exception {
		dao.write(boardVO);
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<BoardVO> list(Criteria cri) throws Exception {
		// TODO Auto-generated method stub
		return dao.list(cri);
	}
	@Override
	public int listCount() throws Exception {
		// TODO Auto-generated method stub
		return dao.listCount();
	}
	// 게시물 목록 조회
	@Override
	public BoardVO read(int bno) throws Exception {

		return dao.read(bno);
	}
	
	@Override
	public void update(BoardVO boardVO) throws Exception {

		dao.update(boardVO);
	}

	@Override
	public void delete(int bno) throws Exception {
		
		dao.delete(bno);
	}


}
