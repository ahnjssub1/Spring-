package service;

import common.Board;
import dataservice.게시물DAO;

public class 게시물업무 {
	public void 등록하다(Board board) {
	//2.업무
	//  2.1.업무규칙검사 
        System.out.println("업무 규칙 검사 코드 실행 완료");
    //  2.2.(DB) 처리 요청  직접DBX
                게시물DAO dao = new   게시물DAO();
        dao.저장하다(board);
	}
}
