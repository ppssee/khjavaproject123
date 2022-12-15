package com.kh.practice.member.controller;

import java.util.ArrayList;
import java.util.*;

import com.kh.practice.member.model.vo.Member;

public class MemberController {
	List<Member> mList;
	
	public MemberController() {
		mList = new ArrayList<Member>();
	}
	
	public void registerMember(Member member) {
		mList.add(member);
	}
	
	public List<Member> printAllMember() {   // 1. 회원 정보 전체 조회
		return mList;
	}
	
	// 같은 id가 있을 때 인덱스를 리턴
	public int findMemberId(String memberId) {
		for(int i=0; i < mList.size(); i++) {
			Member mOne = mList.get(i);
			
			if(memberId.equals(mOne.getMemberId())) {
				return i;
			}
		}
		return -1; // 못 찾았음.
	}
	
	
	// 리턴된 인덱스 값을 이용하여 데이터 찾기.
	public Member printOneByIndex(int index) {
		Member member = mList.get(index);
		return member;
	}

	public int findMemberName(String memberName) {
		for(int i=0; i < mList.size(); i++) {
			Member mOne = mList.get(i);
			
			if(memberName.equals(mOne.getMemberName())) {
				return i;
			}
		}
		return -1; // 못 찾았음.
	}
	
	
	
	
	
	
	
	
	public Member memberSet(String memberId) {		// 6.
		for(int i=0; i<mList.size(); i++) {
			Member mOne = mList.get(i);
			
			if(memberId.equals(mOne.getMemberId())) {
				return mOne;
			}
		}
		
		return null;
	}
	
	
	
}
