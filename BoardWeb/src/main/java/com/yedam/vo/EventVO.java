package com.yedam.vo;

import lombok.Data;

@Data
public class EventVO {
    private String title; // 일정제목
    private String startDate; // 일정 시작 날짜
    private String endDate; // 일정 종료 날짜
}