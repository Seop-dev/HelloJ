package com.yedam.vo;

import lombok.Data;

@Data
public class EventVO {
    private Long eventId; // 일정번호
    private String title; // 일정제목
    private String startDate; // 일정 시작 날짜
    private String endDate; // 일정 종료 날짜
    private String allDay; // Y=종일 N=특정시간대
    private String color; // 일정 색상
    private String url; // 외부링크ㄴ
}