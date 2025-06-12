package com.yedam.control;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yedam.common.Control;
import com.yedam.service.ReplyService;
import com.yedam.service.ReplyServiceImpl;
import com.yedam.vo.ReplyVO;

public class AddReplyControl implements Control {
    @Override
    public void exec(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        int bno = Integer.parseInt(req.getParameter("bno"));
        String reply = req.getParameter("reply");
        String replyer = req.getParameter("replyer");

        ReplyVO vo = new ReplyVO();
        vo.setBoardNo(bno);
        vo.setReply(reply);
        vo.setReplyer(replyer);

        ReplyService service = new ReplyServiceImpl();
        boolean result = service.addReply(vo);

        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().print("{\"retCode\":\"" + (result ? "OK" : "NG") + "\"}");
    }
}
