package com.springbook.biz.board;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BoardServiceClient {
	public static void main(String[] args) {
		//1. Spring �����̳ʸ� ����
		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");
		
		//2. Spring �����̳ʷκ��� BoardServiceImpl ��ü�� Lookup
		BoardService boardService = (BoardService) container.getBean("boardService");
		
		//3. �� ��� test
		BoardVO vo = new BoardVO();
		vo.setTitle("�ӽ�����");
		vo.setWriter("ȫ�浿");
		vo.setContent("���� test.................");
		boardService.insertBoard(vo);
		
		//4. �� ��� �˻� ��� test
		List<BoardVO> boardList = boardService.getBoardList(vo);
		for (BoardVO board : boardList) {
			System.out.println("----> " + board.toString());
		}
		
		System.out.println(boardList);
		
		//5. Spring �����̳� ����
		container.close();
	} 
}
