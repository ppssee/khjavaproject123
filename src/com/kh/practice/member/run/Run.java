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
					String memberId = view.inputMemberId("조회");
					int index = mCon.findMemberId(memberId);
					if(index == -1) {
						// 없습니다 view 출력.
					}
					Member member0 = mCon.printOneByIndex(index);
					view.printOneById(member0);
					break;
				case 3 :
					String memberName = view.inputMemberName();
					int index2 = mCon.findMemberName(memberName);
					if(index2 == -1) {
						// 없습니다 view 출력 
					} 
					Member mOneName = mCon.printOneByIndex(index2);
					view.printOneByName(mOneName);
					break;
				case 4 :   // 객체생성과 객체저장. 
					Member member1 = view.inputMember();
					mCon.registerMember(member1);
					view.displaySuccess("가입이 완료됐습니다.");
					break;
				case 5 :  // 회원정보 수정.
					String memberId2 = view.inputMemberId("수정");
					Member member2 = mCon.memberSet(memberId2);
					int num2 = view.setMemberInfo();
					view.setMemberInfo2(member2, num2);
					
					break;
			
				case 6 : 
					memberId = view.inputMemberId("삭제");
					int aaa = mCon.findMemberIndex(memberId);
					mCon.removeMember(aaa);
					view.displaySuccess("계정이 삭제됐습니다.");
					break;
				case 0 : break done;
				}
			}


	}
}
