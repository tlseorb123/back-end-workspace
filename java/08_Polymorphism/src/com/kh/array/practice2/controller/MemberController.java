package com.kh.array.practice2.controller;

import java.util.Arrays;

import com.kh.array.practice2.model.Member;

public class MemberController {
<<<<<<< HEAD

	private Member[] mArr = new Member[3];
	public int count = 0;
	
	// 멤버 추가
	public void insertMember(Member m) {
		mArr[count++] = new Member(m.getId(), m.getName(), m.getPassword(), 
									m.getEmail(), m.getGender(), m.getAge());
	}
	
	// 멤버 index를 아이디로 조회
	public int checkId(String id) {
		for(int i=0; i<mArr.length; i++) {
			if(mArr[i]!=null && mArr[i].getId().equals(id)) {
				return i;
			}
		}
		return -1;
	}
	
	// 멤버 수정
	public void updateMember(String id, String name, String email, String password) {
		int index = checkId(id);
		mArr[index].setName(name);
		mArr[index].setEmail(email);
		mArr[index].setPassword(password);
	}
	
	// 멤버 조회
	public Member[] printAll() {
		return mArr;
	}
}
=======
   
   private Member[] mArr = new Member[3];
   public int count = 0;
	
   // 멤버 추가 
   public void insertMember(Member m) {
	   mArr[count++] = new Member(m.getId(), m.getName(), m.getPassword(), m.getEmail(), m.getGender(), m.getAge());
	   System.out.println(Arrays.toString(mArr)); //임시 확인
   }
   
   // 멤버가 있는지 아이디로 조회 
   public boolean checkId(String id) {
	   for(Member m : mArr) {
		  if(m != null && m.getId().equals(id)) {
			  return true;
		  }
	   }
	   return false;
   }
}





>>>>>>> 844d0d826ee4e85ce22fda0014b87c7ee2293788
