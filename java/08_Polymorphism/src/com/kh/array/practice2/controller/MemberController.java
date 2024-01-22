package com.kh.array.practice2.controller;

import java.util.Arrays;

import com.kh.array.practice2.model.Member;

public class MemberController {
   
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





