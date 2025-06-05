package com.yedam.ref;

import java.util.Scanner;

public class ArrayExe {
	public static void main(String[] args) {
//		strAry();
//		deleteAry();
		friendApp();
	}

	public static void friendApp() {
		Scanner scn = new Scanner(System.in);
		String[] friendAry = new String[10];

		boolean run = true;
		while (run) {

			System.out.println("1.추가 2.목록 3.삭제 4.종료");
			System.out.println("선택>> ");
			// 메뉴 선택
			int menu = Integer.parseInt(scn.nextLine());
			//
			switch (menu) {
			case 1: // 추가
				System.out.println("친구 이름을 입력하세요>> ");
				String name = scn.nextLine();
				boolean add = true;
				boolean isDuplicate = false;

				// 중복 확인하는 구문
				for (int i = 0; i < friendAry.length; i++) {
					if (friendAry[i] != null && friendAry[i].equals(name)) {
						isDuplicate = true;
						break;
					}
				}
				// 중복이 있을 경우
				if (isDuplicate) {
					System.out.println("동일한 이름이 있습니다 추가 하시겠습니까 ? 예(1) 아니오(2)");
					String addnum = scn.nextLine();

					if (addnum.equals("1")) {
						// null 에 추가
						for (int i = 0; i < friendAry.length; i++) {
							if (friendAry[i] == null) {
								friendAry[i] = name;
								System.out.println("이름 추가 완료");
								break;
							}
						}
					} else if (addnum.equals("2")) {
						add = false;
						System.out.println("초기화면으로 돌아갑니다.");
					}

				} else {
					// 중복이 없을 경우 바로 추가
					for (int i = 0; i < friendAry.length; i++) {
						if (friendAry[i] == null) {
							friendAry[i] = name;
							System.out.println("이름 입력 성공");
							break;
						}
					}
				}
				continue;
			case 2: // 목록
				for (int j = 0; j < friendAry.length; j++) {
					if (friendAry[j] != null) { // StringAry에 Null이 없는 값들만 출력

						System.out.printf("[%d]번째 친구 이름: %s\n", j + 1, friendAry[j]);
					}
				}
				continue;
			case 3: // 삭제
				System.out.println("삭제할 친구 이름을 입력하세요>> ");
				String delname = scn.nextLine();
				boolean del = false;
				for (int k = 0; k < friendAry.length - 1; k++) {
					if (friendAry[k] != null && friendAry[k].equals(delname)) {
						friendAry[k] = null;
						del = true;
						System.out.println(delname + "을(를) 삭제했습니다.");
						break;
					}
				}
				
				if (!del) {
					System.out.println(delname + "은 목록에 없습니다");
				}
				continue;
			case 4: // 종료
				run = false;
				System.out.println("프로그램을 종료합니다");
				break;
			}
			break;

		} // end of while
		System.out.println("end of prog");
	}

	public static void deleteAry() {
		Scanner scn = new Scanner(System.in);
		// 배열 선언
		String[] stringAry = new String[10]; // 입력한 값을 저장
		stringAry[0] = "홍길동";
		stringAry[1] = "김친구";
		stringAry[2] = "김태완";
		stringAry[3] = "김태희";

		System.out.println("삭제할 친구 이름을 입력하세요>> ");
		String name = scn.nextLine(); // 입력한 이름 저장

		for (int i = 0; i < stringAry.length; i++) {
			if (stringAry[i] != null && stringAry[i].equals(name)) { // 배열에서 저장된 이름과 같은 값이 있으면
				stringAry[i] = null; // null = 삭제한다
			}
		}
		// 입력한 값 출력
		for (int i = 0; i < stringAry.length; i++) {
			if (stringAry[i] != null) { // StringAry에 Null이 없는 값들만 출력
				System.out.printf("[%d]번째의 값: %s\n", i, stringAry[i]);
			}
		}
		System.out.println("end of prog");
	}

	// 문자배열
	public static void strAry() {
		Scanner scn = new Scanner(System.in);
		// 배열 선언
		String[] stringAry = new String[10]; // 입력한 값을 저장

		while (true) {
			System.out.println("이름을 입력하세요>> ");
			String name = scn.nextLine();
			if (name.equals("quit")) {
				break; // while문 종료
			}

			for (int i = 0; i < stringAry.length; i++) {
				// 빈공간(null) 체크
				if (stringAry[i] == null) { // 빈 공간(null)인지 확인 후 추가 입력한 값 추가
					stringAry[i] = name;
					System.out.printf("입력성공\n");
					break;
				}
			} // end of for
		} // end of while
			// 입력한 값 출력
		for (int i = 0; i < stringAry.length; i++) {
			if (stringAry[i] != null) { // StringAry에 Null이 없는 값들만 출력
				System.out.printf("[%d]번째의 값: %s\n", i, stringAry[i]);
			}
		}
		System.out.println("end of prog");

	} // end of main
} // end of class
