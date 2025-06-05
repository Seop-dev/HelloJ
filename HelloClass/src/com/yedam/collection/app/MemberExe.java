package com.yedam.collection.app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
 * 배열 → 컬렉션(ArrayList) 변환 예제
 * 2025-05-23
 */
public class MemberExe {
    public static void main(String[] args) {
        boolean run = true;
        List<Member> members = new ArrayList<>();

        Scanner scn = new Scanner(System.in);

        while (run) {
            System.out.println("--------------------------------------------");
            System.out.println("1.추가  2.수정  3.삭제  4.조회  5.종료");
            System.out.println("--------------------------------------------");
            System.out.print("선택>> ");

            int selectNo = Integer.parseInt(scn.nextLine());

            switch (selectNo) {
            case 1:   // 추가
                System.out.print("아이디를 입력>> ");
                String id = scn.nextLine();
                System.out.print("이름을 입력>> ");
                String name = scn.nextLine();
                System.out.print("전화번호를 입력>> ");
                String telNo = scn.nextLine();
                System.out.print("포인트를 입력>> ");
                int point = Integer.parseInt(scn.nextLine());

                // List에 바로 add
                members.add(new Member(id, name, telNo, point));
                System.out.println("등록완료.");
                break;

            case 2:   // 수정
                System.out.print("아이디를 입력>> ");
                id = scn.nextLine();
                System.out.print("전화번호를 입력>> ");
                telNo = scn.nextLine();

                boolean modified = false;
                for (Member m : members) {
                    if (m.getMemberId().equals(id)) {
                        m.setPhone(telNo);
                        modified = true;
                        break;
                    }
                }
                System.out.println(modified ? "수정완료." : "해당 아이디가 없습니다.");
                break;

            case 3:   // 삭제
                System.out.print("아이디를 입력>> ");
                id = scn.nextLine();

                // Iterator 또는 removeIf 로 안전하게 제거
                boolean removed = members.removeIf(m -> m.getMemberId().equals(id));
                System.out.println(removed ? "삭제완료." : "해당 아이디가 없습니다.");
                break;

            case 4:   // 조회
                System.out.print("이름을 입력(빈칸=전체)>> ");
                String nameKey = scn.nextLine();

                System.out.printf("%-10s %-5s %-15s\n", "UserId", "회원명", "TelNo");
                for (Member m : members) {
                    if (nameKey.isEmpty() || nameKey.equals(m.getMemberName())) {
                        System.out.printf("%-10s %-5s %-15s\n",
                                m.getMemberId(), m.getMemberName(), m.getPhone());
                    }
                }
                break;

            case 5:   // 종료
                run = false;
                break;

            default:
                System.out.println("메뉴를 다시 선택하세요.");
            }
        } // end while
        scn.close();
        System.out.println("*** end of prog ***");
    }
}