package com.yedam.app;

import java.util.Scanner;

import com.yedam.service.MemberService;
import com.yedam.service.MemberServiceDAO;
import com.yedam.vo.Member;

/*
 * 사용자의 입력값을 등록, 수정, 삭제
 */
public class MemberApp {
	public void execute() {
		Scanner scn = new Scanner(System.in);
		MemberService svc = new MemberServiceDAO();

		boolean run = true;

		while (run) {
			System.out.println("---------------------------------------");
			System.out.println("1.회원등록 2.정보수정 3.회원삭제 4.목록보기 5. 종료");
			System.out.println("---------------------------------------");
			System.out.println("선택>> ");
			// 메뉴선택
			int menu = scn.nextInt();
			scn.nextLine();
			switch (menu) {
			case 1: // 등록
				System.out.print("회원 아이디>> ");
				String mid = scn.nextLine();
				System.out.print("회원 이름>> ");
				String name = scn.nextLine();
				System.out.print("연락처>> ");
				String phone = scn.nextLine();
				System.out.print("포인트>> ");
				String point = scn.nextLine();
				// parameter(Member)
				Member member = new Member(mid, name, phone, Integer.parseInt(point));
				if (svc.addMember(member)) {
					System.out.println("등록완료.");
				} else {
					System.out.println("등록실패");
				}

			case 2: // 수정
				System.out.print("수정할 회원 아이디>> ");
				String umid = scn.nextLine();
				System.out.print("연락처>> ");
				String uphone = scn.nextLine();
				System.out.print("포인트>> ");
				int upoint = Integer.parseInt(scn.nextLine());
				Member umember = new Member();
				umember.setMemberId(umid);
				umember.setPhone(uphone);
				umember.setPoint(upoint);
				if (svc.modifyMember(umember)) {
					System.out.println("수정완료.");
				} else {
					System.out.println("수정실패");
				}

			case 3: // 삭제
				System.out.print("삭제할 회원 아이디>> ");
				String delId = scn.nextLine();
				if (svc.removeMember(delId)) {
					System.out.println("삭제완료.");
				} else {
					System.out.println("삭제실패");
				}
				break;
			case 4: // 목록
				for (Member mem : svc.memberList()) {
					System.out.println(mem.toString());
				}
				break;
			case 5: // 종료
				System.out.println("프로그램 종료.");
				run = false;
			default:
				System.out.println("다른 메뉴 선택");
			} // end of switch
		} // end of while
		System.out.println("end of prog");
	} // end of execute
}
