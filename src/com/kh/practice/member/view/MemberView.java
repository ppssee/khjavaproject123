package com.kh.practice.member.view;

import java.util.*;
import java.util.Scanner;

import com.kh.practice.member.model.vo.Member;

public class MemberView {
//	======= ȸ������ ���α׷� =======
//			1. ȸ������ ��ü��ȸ
//			2. ȸ�� ���̵�� ��ȸ
//			3. ȸ�� �̸����� ��ȸ
//			4. ȸ������
//			5. ȸ������ ����
//			6. ȸ��Ż��
//			0. ���α׷� ����
//			�޴� ���� :
	
	public int mainMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== === === ȸ������ ���α׷� === === ===");
		System.out.println("1. ȸ�� ���� ��ü ��ȸ");
		System.out.println("2. ȸ�� ���̵�� ��ȸ");
		System.out.println("3. ȸ�� �̸����� ��ȸ");
		System.out.println("4. ȸ�� ����");
		System.out.println("5. ȸ�� ���� ����");
		System.out.println("6. ȸ�� Ż��");
		System.out.println("0. ���α׷� ����");
		System.out.print("�޴� ���� : ");
		int value = sc.nextInt();
		return value;
	}
	
	public Member inputMember() {		// ��ȯ Ÿ�� Member Ŭ����
		Scanner sc = new Scanner(System.in);
		System.out.print("���̵� : ");
		String memberId = sc.next();
		System.out.print("��й�ȣ : ");
		String memberPwd = sc.next();
		System.out.print("�̸� : ");
		String memberName = sc.next();
		System.out.print("���� : ");
		int memberAge = sc.nextInt();
		System.out.print("���� : ");
		String memberGender = sc.next();
		System.out.print("�̸��� : ");
		String memberEmail = sc.next();
		System.out.print("��ȭ��ȣ : ");
		String memberPhone = sc.next();
		System.out.print("�ּ� : ");
		sc.nextLine();
		String memberAddress = sc.nextLine();
		System.out.print("��� : ");
		String memberHobby = sc.next();
		
		Member member = new Member();        // Controller�� ������
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
		System.out.print(category+"�� ���̵� �Է� : ");
		String memberId = sc.next();
		return memberId;
	}
	
	public void showAllmember(List<Member> mList) {			// 1. 
		System.out.println("=== === === ȸ������ ��ü��ȸ === === ==");
		for(Member mOne : mList) {
			System.out.println("ȸ�� ���̵� : " + mOne.getMemberId());
			System.out.println("ȸ�� �̸� : " + mOne.getMemberName());
			System.out.println("ȸ�� ���� : " + mOne.getMemberGender());
			System.out.println("ȸ�� ���� : " + mOne.getMemberAge());
			System.out.println("ȸ�� �̸��� : " + mOne.getMemberEmail());
			System.out.println("ȸ�� ����ȣ : " + mOne.getMemberPhone());
			System.out.println("ȸ�� �ּ� : " + mOne.getMemberAddress());
			System.out.println("ȸ�� ��� : " + mOne.getMemberHobby());
			System.out.println("=== === === === === === === === === =====");

		}
	}
	
	public void printOneById(Member mOne) {		//2.
		System.out.println(mOne.toString());
	}
	
	public String inputMemberName() {		// 3.  �˻� �̸� �Է�
		Scanner sc = new Scanner(System.in);
		System.out.print("�˻��� �̸� �Է� : ");
		String memberName = sc.next();
		return memberName;
	}
	
	public void printOneByName(Member mOne) {		// 3. ���
		System.out.println(mOne.toString());
	}
	
	public void displaySuccess(String message) {
		System.out.println("[ó�����] : " + message);
	}
	
	public void displayError(String message) {
		System.out.println("[���� �߻�] : " + message);
	}
	
	
	
	
	
	
	
	
	
	
	public String printMemberInfoSet() {			// 5. 
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ȸ���� ���̵� �Է� : ");
		String memberId = sc.next();
		return memberId;
	}

	public int setMemberInfo() {		// 5.
		Scanner sc = new Scanner(System.in);

		System.out.println("������ ���� ����.");
		System.out.println("1. ȸ�� ���̵� ");
		System.out.println("2. ȸ�� �̸� " );
		System.out.println("3. ȸ�� ���� ");
		System.out.println("4. ȸ�� ���� ");
		System.out.println("5. ȸ�� �̸��� ");
		System.out.println("6. ȸ�� ����ȣ ");
		System.out.println("7. ȸ�� �ּ� ");
		System.out.println("8. ȸ�� ��� ");
		System.out.println("0. ���� ");
		System.out.print("�Է�: ");
		int num = sc.nextInt();

		return num;

	}

	public void setMemberInfo2(Member member, int num) {
		Scanner sc = new Scanner(System.in);

		switch(num) {
		case 1: 
			System.out.print("1. ������ ȸ�� ���̵� : ");
			String memberId = sc.next();
			member.setMemberId(memberId);
			break;
		case 2: 
			System.out.print("2. ������ ȸ�� �̸� : " ); 
			String memberName = sc.next();
			member.setMemberName(memberName);
			break;
		case 3: 
			System.out.print("3. ������ ȸ�� ���� : "); 
			String memberGender = sc.next();
			member.setMemberGender(memberGender);
			break;
		case 4: 
			System.out.print("4. ȸ�� ���� : ");
			int memberAge = sc.nextInt();
			member.setMemberAge(memberAge);
			break; 
		case 5: 
			System.out.print("5. ȸ�� �̸��� : ");
			String memberEmail = sc.next();
			member.setMemberGender(memberEmail);
			break;
		case 6: 
			System.out.print("6. ȸ�� ����ȣ : ");
			String memberPhone = sc.next();
			member.setMemberGender(memberPhone);
			break;
		case 7: 
			System.out.print("7. ȸ�� �ּ� : ");
			sc.nextLine();
			String memberAddress = sc.nextLine();
			member.setMemberGender(memberAddress);
			break;
		case 8: 
			System.out.print("8. ȸ�� ��� : ");
			String memberHobby = sc.next();
			member.setMemberHobby(memberHobby);
			break;
		
		}

		System.out.println("������ �Ϸ�ƽ��ϴ�.");
	}

}
