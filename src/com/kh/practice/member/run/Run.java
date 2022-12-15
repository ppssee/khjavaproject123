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
					String memberId = view.inputMemberId();
					int index = mCon.findMemberId(memberId);
					if(index == -1) {
						// 없습니다 view 출력.
					}
					Member mOne = mCon.printOneByIndex(index);
					view.printOneById(mOne);
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
					Member member = view.inputMember();
					mCon.registerMember(member);
					break;
				case 5 : 
					
					break;
				case 6 : break;
				case 0 : break done;
				}
			}


	}
}
