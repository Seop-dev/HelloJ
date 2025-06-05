package com.yedam.ref.app;

/*
 * 회원 추가, 수정, 삭제 조회 기능
 * 1)추가
 *  - 아이디, 이름, 전화번호, 포인트
 * 2)수정
 *  - 사용자에게 아이디 물어본 후
 *  - 바꿀 전화번호를 입력 받아 변경
 * 3)삭제
 *  - 사용자에게 아이디 물어본 후 일치시 삭제
 * 4)조회
 *	- 이름검색 (조회)
 */


import java.util.Scanner;

public class MemberExe {

    static Member[] person = null;

    public static void main(String[] args) {
        boolean run = true;
        Scanner scanner = new Scanner(System.in);
        int memberNum = 0;   // 회원 수
        int inputCount = 0;  // 현재까지 입력된 회원 수

        System.out.print("등록할 회원 수를 입력하세요>> ");
        memberNum = Integer.parseInt(scanner.nextLine());
        person = new Member[memberNum];

        while (run) {
            System.out.println("---------------------------------------------------------");
            System.out.println("1. 회원 추가 | 2. 정보 수정 | 3. 회원 삭제 | 4. 회원 조회 | 5. 종료");
            System.out.println("---------------------------------------------------------");
            System.out.print("선택> ");
            int selectNo = Integer.parseInt(scanner.nextLine());

            // 회원추가
            if (selectNo == 1) {
                if (inputCount >= memberNum) {
                    System.out.println("더 이상 추가할 수 없습니다.");
                    continue;
                }

                System.out.printf("Member[%d] 아이디>> ", inputCount);
                String id = scanner.nextLine();
                System.out.printf("Member[%d] 이름>> ", inputCount);
                String name = scanner.nextLine();
                System.out.printf("Member[%d] 전화번호>> ", inputCount);
                String phone = scanner.nextLine();
                System.out.printf("Member[%d] 포인트>> ", inputCount);
                int point = Integer.parseInt(scanner.nextLine());
                
                Member member = new Member();

                member.MemID = id;
                member.MemName = name;
                member.MemPhone = phone;
                member.MemPoint = point;

                person[inputCount] = member;
                inputCount++;
            }

            // 정보수정
            else if (selectNo == 2) {
                System.out.print("수정할 회원의 아이디>> ");
                String id = scanner.nextLine();
                boolean found = false;

                for (int i = 0; i < inputCount; i++) {
                    if (person[i].MemID.equals(id)) {
                        System.out.print("새 전화번호>> ");
                        String newPhone = scanner.nextLine();
                        person[i].MemPhone = newPhone;
                        System.out.println("전화번호가 수정되었습니다.");
                        found = true;
                        break;
                    }
                }
                if (!found) System.out.println("해당 아이디의 회원이 없습니다.");
            }

            // 회원 삭제
            else if (selectNo == 3) {
                System.out.print("삭제할 회원의 아이디>> ");
                String delId = scanner.nextLine();
                boolean deleted = false;

                for (int i = 0; i < inputCount; i++) {
                    if (person[i].MemID.equals(delId)) {
                        // 뒤 요소를 한 칸씩 앞으로 복사
                        for (int j = i; j < inputCount - 1; j++) {
                            person[j] = person[j + 1];
                        }
                        person[inputCount - 1] = null;
                        inputCount--;
                        deleted = true;
                        System.out.println("회원 삭제 완료.");
                        break;
                    }
                }
                if (!deleted) System.out.println("해당 아이디의 회원이 없습니다.");
            }

            // 회원 조회
            else if (selectNo == 4) {
                System.out.print("조회할 회원의 이름>> ");
                String searchName = scanner.nextLine();
                boolean found = false;

                for (int i = 0; i < inputCount; i++) {
                    if (person[i].MemName.equals(searchName)) {
                        System.out.println("아이디: " + person[i].MemID);
                        System.out.println("이름: " + person[i].MemName);
                        System.out.println("전화번호: " + person[i].MemPhone);
                        System.out.println("포인트: " + person[i].MemPoint);
                        found = true;
                    }
                }
                if (!found) System.out.println("해당 이름의 회원이 없습니다.");
            }

            // 종료
            else if (selectNo == 5) {
                run = false;
                System.out.println("end of prog");
            }
            else {
                System.out.println("1 ~ 5 사이의 번호를 입력하세요");
            }
        } // end of while
    } // end of main
}
