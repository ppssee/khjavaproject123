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
	
	public List<Member> printAllMember() {   // 1. ȸ�� ���� ��ü ��ȸ
		return mList;
	}
	
	// ���� id�� ���� �� �ε����� ����
	public int findMemberId(String memberId) {
		for(int i=0; i < mList.size(); i++) {
			Member mOne = mList.get(i);
			
			if(memberId.equals(mOne.getMemberId())) {
				return i;
			}
		}
		return -1; // �� ã����.
	}
	
	
	// ���ϵ� �ε��� ���� �̿��Ͽ� ������ ã��.
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
		return -1; // �� ã����.
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
