package com.yedam.control;

import java.io.IOException;

import javax.servlet.http.*;

import com.yedam.common.Control;
import com.yedam.service.*;

public class RemoveReplyControl implements Control {
    @Override
    public void exec(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        int rno = Integer.parseInt(req.getParameter("rno"));

        ReplyService service = new ReplyServiceImpl();
        boolean result = service.removeReply(rno);

        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().print("{\"retCode\":\"" + (result ? "OK" : "NG") + "\"}");
    }
}
