package com.yedam.api;

public class SystemExe {
	public static void main(String[] args) {
		
		long now = System.currentTimeMillis();; // 현재시간을 1/1000초
		System.out.println(now);
		// 1747964887 => "초" => 몇일, 몇시간, 몇분, 몇초 계산
		// 60 * 60 * 24 => 1일
		// 60 * 60 => 1시간
		// 60 => 1분
		// 나머치가 초
		// 계산 
		long seconds = now / 1000;
		long minutes = seconds / 60;
		long hours = minutes / 60;
		long days = seconds / (24 * 60 * 60 * 365);
		long year = days / 12;
		
		System.out.println("현재 시간: " + now + "밀리초");
		System.out.println("초: " + seconds);
		System.out.println("분: " + minutes);
		System.out.println("시: " + hours);
		System.out.println("일: " + days);
		System.out.println("년: "+ year);
	}
	
	public static void exe() {
		//
		long start = System.nanoTime(); //System.currentTimeMillis();
		int sum = 0;
		for(int i=0; i<100000000; i++) {
			sum += i;
		}
		long end = System.nanoTime(); // System.currentTimeMillis();
		System.out.printf("합계 %d, 걸린시간 %d", sum, (end-start));
	}
}
