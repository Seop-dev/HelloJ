package com.yedam.control;

import java.io.IOException;

import javax.servlet.http.*;

import com.yedam.common.Control;
import com.yedam.service.ReplyService;
import com.yedam.service.ReplyServiceImpl;

public class RemoveReplyControl implements Control {
    @Override
    public void exec(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    	// TODO rno을 삭제
    	String rno = req.getParameter("rno");
    	
    	// DB 입력처리
    	ReplyService svc = new ReplyServiceImpl();
    	if(svc.removeReply(Integer.parseInt(rno))){
    		//{"retCode": "Success"}
    		resp.getWriter().print("{\"retCode\": \"Success\"}");
    	}else {
    		//{"retCode": "Fail"}
    		resp.getWriter().print("{\"retCode\": \"Fail\"}");
    	}
    }
}
