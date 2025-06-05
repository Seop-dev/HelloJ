package com.yedam.api;

public class StringExe {
	public static void main(String[] args) {
		String str1 = new String("Hello");
//		str1 = new String(new byte[] { 72, 101, 108, 108, 111 }, 0, 2);
		
		System.out.println(str1.charAt(1)); // "", ''
		System.out.println(str1.indexOf("s"));
		
		// 508 ~ 520 page
		// 509page
		// 문자추출(charAt())
		String ssn = "010624-1230123";
		char sex = ssn.charAt(7); // ssn의 7번째 문자를 추출하여 sex에 저장
		switch(sex) { // 7번째 문자(주민등록번호 뒷자리의 1번째)가 1,3 이면 남자 2,4면 여자
		case'1':
		case'3':
			System.out.println("남자 입니다");
			break;
		case'2':
		case'4':
			System.out.println("여자 입니다");
			break;
		}
		
		// 511page
		// 문자열 비교(equals())
		String strVar1 = new String("신민철");
		String strVar2 = "신민철";
		String strVar3 = "신민철";
		
		if(strVar1 == strVar2) {
			System.out.println("같은 String 객체를 참조");
		}else {
			System.out.println("다른 String 객체를 참조");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("같은 문자열을 가짐");
		}else {
			System.out.println("다른 문자열을 가짐");
		}
		
		// 512page
		// 바이트 배열로 변환(get Bytes())
		String str = "안녕하세요";
		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1.length: " + bytes1.length);
		String str2 = new String(bytes1);
		
		
	} // end of main
} // end of class 
