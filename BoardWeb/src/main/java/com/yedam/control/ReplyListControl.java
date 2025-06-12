package com.yedam.control;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.*;

import com.yedam.common.Control;
import com.yedam.service.*;
import com.yedam.vo.ReplyVO;

public class ReplyListControl implements Control {
    @Override
    public void exec(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        int bno = Integer.parseInt(req.getParameter("bno"));
        ReplyService service = new ReplyServiceImpl();
        List<ReplyVO> list = service.replyList(bno);

        // JSON 문자열 직접 구성
        StringBuilder json = new StringBuilder();
        json.append("[");
        for (int i = 0; i < list.size(); i++) {
            ReplyVO vo = list.get(i);
            json.append("{")
                .append("\"replyNo\":").append(vo.getBoardNo()).append(",")
                .append("\"boardNo\":").append(vo.getBoardNo()).append(",")
                .append("\"reply\":").append("\"").append(vo.getReply().replace("\"", "\\\"")).append("\",")
                .append("\"replyer\":").append("\"").append(vo.getReplyer().replace("\"", "\\\"")).append("\",")
                .append("\"replyDate\":").append("\"").append(vo.getReplyDate()).append("\"")
                .append("}");
            if (i < list.size() - 1) json.append(",");
        }
        json.append("]");

        resp.setContentType("application/json;charset=utf-8");
        resp.getWriter().print(json.toString());
    }
}
