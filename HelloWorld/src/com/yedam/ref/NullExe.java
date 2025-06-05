package com.yedam.ref;

public class NullExe {
	public static void main(String[] args) {
		String str1 = "홍길동"; // new String("홍길동");
		String str2 = null;

//		System.out.println(str2.toString());

//		let ary = [10, "string", 11.2] // JS에서는 배열의 문자열 타입 관계없이 넣을 수 있었지만 JAVA에서는 불가
		// ary라는 "정수 배열" 타입
//		int[] ary = 10; // 불가 배열로 입력이 되어야함
		// 변수 선언과 동시에 초기화
		int[] ary = { 10, 20, 30 }; // JAVA = 선언한 문자열 형태만 가능
		System.out.printf("ary배열의 크기 %d\t", ary.length);

		int[] intAry; // 변수 선언
		intAry = new int[] { 40, 50, 60 }; // 값 할당
		System.out.printf("intAry배열의 크기 %d\n", intAry.length);

		// 첫번째 위치의 40 => 400 변경
		intAry[0] = 400;

		// 인덱스 3 => 4번째 위치
		// intAry[3] = 10; // ArrayIndexOutOfBoundsException....

		// for 반복문
		for (int i = 0; i < 3; i++) {
			System.out.printf("[%d]번째의 값: %d\n", i, intAry[i]);
		}

		// 배열은 선언하면 크기가 고정
		// 크기를 변경하려면 새로 선언해줘야함
		intAry = new int[5];
		intAry[0] = 40;
		intAry[1] = 50;
		intAry[2] = 60;
		intAry[3] = 10;
		for (int i = 0; i < intAry.length; i++) {
			System.out.printf("intAry[%d]번째의 값: %d\n", i, intAry[i]);
		}

		// 배열선언 : double Type dblAry
		double[] dblAry;
		dblAry = new double[3];
		dblAry[0] = 10.2;
		dblAry[1] = 23.2;
		dblAry[2] = 34.5;

		for (int i = 0; i < dblAry.length; i++) {
			System.out.printf("dlbAry[%d]번째의 값: %.1f\n", i, dblAry[i]);
		}
		// 배열선언 : String Type strAry
		String[] strAry = new String[10]; // {"Hello", "World"};
		for (int i = 0; i < strAry.length; i++) {
			System.out.printf("strAry[%d]번째의 값: %s\n", i, strAry[i]);
		}

	}
}
