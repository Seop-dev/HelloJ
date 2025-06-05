package com.yedam;

public class Calender {
	
	static boolean isLeapYear(int year) {
		// 윤년이면 true, 평년이면 false
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	static void showMonth() {
		// Sun Mon Tue Wed Thu Fri Sat
		//==============================
		//                   1   2   3
		//   4   5   6   7   8   9   10
			System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
			// 빈공간
			int mon = 5;
			int space = getSpace(mon);
			int lastday = getLastDate(mon);
			for(int s = 1; s <= space; s++) {
				System.out.printf("%4s", " ");
			}
			// 날짜출력
			for(int day=1; day<=lastday; day++) {
				System.out.printf("%4d", day); // ___d
				if((day+space) % 7 == 0) {
					System.out.println();
				}
		}
	} // end of showMonth
	public static int getSpace(int month) {
		int space = 0;
		if(month==3) { // 3월
			space = 6;
		} else if(month==4) { // 4월
			space = 2;
		} else if(month==5) { // 5월
			space = 4;
		} else if(month==7) { // 7월
			space = 2;
		}
		return space;
	} // end of getSpace.
	
	//"월" 정보를 입력하면 말일을 알려주는 메소드 getLastDate(월)
	public static int getLastDate(int month) {
		int lastDate = 31;
		switch(month) {
		case 2:
			lastDate = 28; break;
		case 4:
		case 6:
		case 9:
		case 11:
			lastDate = 30; break;
		}
		return lastDate;
	} // end of LastDate
}
