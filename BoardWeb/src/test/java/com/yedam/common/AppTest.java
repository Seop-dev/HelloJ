package com.yedam.common;

import java.util.List;

import com.yedam.service.ReplyService;
import com.yedam.service.ReplyServiceImpl;
import com.yedam.vo.ReplyVO;

public class AppTest {
	public static void main(String[] args) {
		ReplyService svc= new ReplyServiceImpl();
		
		// 단건조회
		
		
		// 입력
		ReplyVO rep = new ReplyVO();
		rep.setBoardNo(221);
		rep.setReply("댓글연습입니다");
		rep.setReplyer("newbie");
		svc.removeReply(9);
		
		// 목록	
		List<ReplyVO> list = svc.replyList(221);
		for(ReplyVO reply : list) {
			System.out.println(reply.toString());
		}
	}
}
