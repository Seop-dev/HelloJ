package com.yedam.api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * Calendar: 날짜, 시간 관련
 * DAte: 날짜, 시간
 */
public class CalendarExe {
	public static void main(String[] args) {
		makeCalendar(2025, 4);
	}
	
	// 달력.
	public static void makeCalendar(int year, int month) {
		Calendar cal = Calendar.getInstance();

		// 월은 0부터 시작하므로 -1 해줌
		cal.set(year, month - 1, 1);

		int firstDay = cal.get(Calendar.DAY_OF_WEEK); // 1일의 요일 (1=일요일, 7=토요일)
		int lastDate = cal.getActualMaximum(Calendar.DATE); // 그 달의 마지막 날짜

		// 헤더 출력
		System.out.printf("      < %d년 %d월 >\n", year, month);
		System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

		// 1일 전까지 공백 출력
		for (int i = 1; i < firstDay; i++) {
			System.out.print("    ");
		}

		// 날짜 출력
		for (int day = 1; day <= lastDate; day++) {
			System.out.printf("%4d", day);
			if ((firstDay + day - 1) % 7 == 0) {
				System.out.println(); // 줄바꿈
			}
		}
		System.out.println(); // 마지막 줄 줄바꿈
	}
	
	
	public static void date() {
		Date today = new Date();
		System.out.println(today.toString());

		// 생성자의 매개값으로 포맷 지정
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String timestr = sdf.format(today);
		System.out.println(timestr);
		// 2025년05월12일 13:22:38
		// 위처럼 형식만 바꿔서 출력 가능

		try {
			today = sdf.parse("2025-08-01 09:01:10"); // String -> Date
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(today);

	}

	public static void cal() {
		// Calendar 클래스
		Calendar now = Calendar.getInstance();

		// 시간변경
		now.set(2025, 0, 1); // now의 값을 2025년 1월 1일로 셋팅
		now.set(Calendar.YEAR, 2024); // 2024년으로 변경

		// 요일
		int dayOfWeek = now.get(Calendar.DAY_OF_WEEK);
		switch (dayOfWeek) {
		case 1:
			System.out.println("일요일");
			break;
		case 2:
			System.out.println("월요일");
			break;
		case 3:
			System.out.println("화요일");
			break;
		}

		System.out.printf("년도: %d \n 월: %d \n 일: %d \n 요일: %d \n 말일: %d \n", //
				now.get(Calendar.YEAR), // 년도
				now.get(Calendar.MONTH), // 월
				now.get(Calendar.DATE), // 일
				now.get(Calendar.DAY_OF_WEEK), // 요일
				now.getActualMaximum(Calendar.DATE) //
		); //
	}
}
