package com.kh.practice.member.run;

import com.kh.practice.member.controller.MemberController;
import com.kh.practice.member.model.vo.Member;
import com.kh.practice.member.view.MemberView;

import java.util.List;

public class Run {
	public static void main(String[] args) {
		MemberView view = new MemberView();
		MemberController mCon = new MemberController();
		
		done :
			while(true) {
				int choice = view.mainMenu();
				switch(choice) {
				case 1 : 
					List<Member> mList = mCon.printAllMember();
					view.showAllmember(mList);
					break;
				case 2 : 
					String memberId = view.inputMemberId("��ȸ");
					int index = mCon.findMemberId(memberId);
					if(index == -1) {
						// �����ϴ� view ���.
					}
					Member member0 = mCon.printOneByIndex(index);
					view.printOneById(member0);
					break;
				case 3 :
					String memberName = view.inputMemberName();
					int index2 = mCon.findMemberName(memberName);
					if(index2 == -1) {
						// �����ϴ� view ��� 
					} 
					Member mOneName = mCon.printOneByIndex(index2);
					view.printOneByName(mOneName);
					break;
				case 4 :   // ��ü������ ��ü����. 
					Member member1 = view.inputMember();
					mCon.registerMember(member1);
					view.displaySuccess("������ �Ϸ�ƽ��ϴ�.");
					break;
				case 5 :  // ȸ������ ����.
					String memberId2 = view.inputMemberId("����");
					Member member2 = mCon.memberSet(memberId2);
					int num2 = view.setMemberInfo();
					view.setMemberInfo2(member2, num2);
					
					break;
			
				case 6 : 
					memberId = view.inputMemberId("����");
					int aaa = mCon.findMemberIndex(memberId);
					mCon.removeMember(aaa);
					view.displaySuccess("������ �����ƽ��ϴ�.");
					break;
				case 0 : break done;
				}
			}


	}
}
