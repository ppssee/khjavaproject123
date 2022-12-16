package com.kh.practice.member.view;

import java.util.*;
import java.util.Scanner;

import com.kh.practice.member.model.vo.Member;

public class MemberView {
//	======= 회원관리 프로그램 =======
//			1. 회원정보 전체조회
//			2. 회원 아이디로 조회
//			3. 회원 이름으로 조회
//			4. 회원가입
//			5. 회원정보 변경
//			6. 회원탈퇴
//			0. 프로그램 종료
//			메뉴 선택 :
	
	public int mainMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== === === 회원관리 프로그램 === === ===");
		System.out.println("1. 회원 정보 전체 조회");
		System.out.println("2. 회원 아이디로 조회");
		System.out.println("3. 회원 이름으로 조회");
		System.out.println("4. 회원 가입");
		System.out.println("5. 회원 정보 변경");
		System.out.println("6. 회원 탈퇴");
		System.out.println("0. 프로그램 종료");
		System.out.print("메뉴 선택 : ");
		int value = sc.nextInt();
		return value;
	}
	
	public Member inputMember() {		// 반환 타입 Member 클래스
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String memberId = sc.next();
		System.out.print("비밀번호 : ");
		String memberPwd = sc.next();
		System.out.print("이름 : ");
		String memberName = sc.next();
		System.out.print("나이 : ");
		int memberAge = sc.nextInt();
		System.out.print("성별 : ");
		String memberGender = sc.next();
		System.out.print("이메일 : ");
		String memberEmail = sc.next();
		System.out.print("전화번호 : ");
		String memberPhone = sc.next();
		System.out.print("주소 : ");
		sc.nextLine();
		String memberAddress = sc.nextLine();
		System.out.print("취미 : ");
		String memberHobby = sc.next();
		
		Member member = new Member();        // Controller로 보내기
		member.setMemberId(memberId);
		member.setMemberPwd(memberPwd);
		member.setMemberName(memberName);
		member.setMemberAge(memberAge);
		member.setMemberGender(memberGender);
		member.setMemberEmail(memberEmail);
		member.setMemberPhone(memberPhone);
		member.setMemberAddress(memberAddress);
		member.setMemberHobby(memberHobby);
		
		return member;
		
	}
	
	public String inputMemberId(String category) { 	  // 2.
		Scanner sc = new Scanner(System.in);
		System.out.print(category+"할 아이디 입력 : ");
		String memberId = sc.next();
		return memberId;
	}
	
	public void showAllmember(List<Member> mList) {			// 1. 
		System.out.println("=== === === 회원정보 전체조회 === === ==");
		for(Member mOne : mList) {
			System.out.println("회원 아이디 : " + mOne.getMemberId());
			System.out.println("회원 이름 : " + mOne.getMemberName());
			System.out.println("회원 성별 : " + mOne.getMemberGender());
			System.out.println("회원 나이 : " + mOne.getMemberAge());
			System.out.println("회원 이메일 : " + mOne.getMemberEmail());
			System.out.println("회원 폰번호 : " + mOne.getMemberPhone());
			System.out.println("회원 주소 : " + mOne.getMemberAddress());
			System.out.println("회원 취미 : " + mOne.getMemberHobby());
			System.out.println("=== === === === === === === === === =====");

		}
	}
	
	public void printOneById(Member mOne) {		//2.
		System.out.println(mOne.toString());
	}
	
	public String inputMemberName() {		// 3.  검색 이름 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 이름 입력 : ");
		String memberName = sc.next();
		return memberName;
	}
	
	public void printOneByName(Member mOne) {		// 3. 출력
		System.out.println(mOne.toString());
	}
	
	public void displaySuccess(String message) {
		System.out.println("[처리결과] : " + message);
	}
	
	public void displayError(String message) {
		System.out.println("[오류 발생] : " + message);
	}
	
	
	
	
	
	
	
	
	
	
	public String printMemberInfoSet() {			// 5. 
		Scanner sc = new Scanner(System.in);
		System.out.print("변경할 회원의 아이디 입력 : ");
		String memberId = sc.next();
		return memberId;
	}

	public int setMemberInfo() {		// 5.
		Scanner sc = new Scanner(System.in);

		System.out.println("변경할 정보 선택.");
		System.out.println("1. 회원 아이디 ");
		System.out.println("2. 회원 이름 " );
		System.out.println("3. 회원 성별 ");
		System.out.println("4. 회원 나이 ");
		System.out.println("5. 회원 이메일 ");
		System.out.println("6. 회원 폰번호 ");
		System.out.println("7. 회원 주소 ");
		System.out.println("8. 회원 취미 ");
		System.out.println("0. 종료 ");
		System.out.print("입력: ");
		int num = sc.nextInt();

		return num;

	}

	public void setMemberInfo2(Member member, int num) {
		Scanner sc = new Scanner(System.in);

		switch(num) {
		case 1: 
			System.out.print("1. 변경할 회원 아이디 : ");
			String memberId = sc.next();
			member.setMemberId(memberId);
			break;
		case 2: 
			System.out.print("2. 변경할 회원 이름 : " ); 
			String memberName = sc.next();
			member.setMemberName(memberName);
			break;
		case 3: 
			System.out.print("3. 변경할 회원 성별 : "); 
			String memberGender = sc.next();
			member.setMemberGender(memberGender);
			break;
		case 4: 
			System.out.print("4. 회원 나이 : ");
			int memberAge = sc.nextInt();
			member.setMemberAge(memberAge);
			break; 
		case 5: 
			System.out.print("5. 회원 이메일 : ");
			String memberEmail = sc.next();
			member.setMemberGender(memberEmail);
			break;
		case 6: 
			System.out.print("6. 회원 폰번호 : ");
			String memberPhone = sc.next();
			member.setMemberGender(memberPhone);
			break;
		case 7: 
			System.out.print("7. 회원 주소 : ");
			sc.nextLine();
			String memberAddress = sc.nextLine();
			member.setMemberGender(memberAddress);
			break;
		case 8: 
			System.out.print("8. 회원 취미 : ");
			String memberHobby = sc.next();
			member.setMemberHobby(memberHobby);
			break;
		
		}

		System.out.println("수정이 완료됐습니다.");
	}

}
