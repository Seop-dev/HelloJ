package com.yedam.operator;

import java.util.Scanner;

public class ScannerExe {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int balance = 0; // 계좌의 금액
		while (true) {
			System.out.println("1.입금 2.출금 3.잔액 4.종료");
			int menu = Integer.parseInt(scn.nextLine()); // Integer.pasrseInt("30");
			if (menu == 1) {
				System.out.print("입금액을 입력하세요.>>");
				// 입금 기능
				String value = scn.nextLine();
				int summoney = Integer.parseInt(value);
				if (summoney <= 0) {
					System.out.println("0보다 큰 금액을 입금해주세요");
					break;
				} else if (summoney > 100000) {
					System.out.println("10만원 이하로 입금해주세요");
					break;
				}
				System.out.println("입금액은 " + value + "원 입니다.");
				balance += summoney;
				System.out.println("입금 후 잔액은" + balance + "원 입니다.");
				if (balance > 100000) {
					System.out.println("총 잔액이 10만원을 초과합니다");
					break;
				}
			} else if (menu == 2) {
				System.out.print("출금액을 입력하세요.>>");
				// 출금 기능
				String value1 = scn.nextLine();
				int minusmoney = Integer.parseInt(value1);
				System.out.println("출금액은 " + value1 + "원 입니다.");
				balance -= minusmoney;
				System.out.println("출금 후 남은 잔액은" + balance + "원 입니다.");
				if(balance < 0) {
					System.out.println("현재 잔액보다 많은 금액을 출금하셨습니다");
					break;
				}
			} else if (menu == 3) {
//				System.out.println("현 잔액>> ");
				// 잔액 확인
				System.out.println("현 잔액은" + balance + "원 입니다.");
			} else if (menu == 4) {
				System.out.println("종료 선택");
				break;
			} else {
				System.out.println("유효한 번호를 입력하세요.");
			}
		} // end of while.
		System.out.println("end of prog");
	} // end of main.
}
