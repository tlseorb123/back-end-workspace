// 클래스 이름 : com.kh.practice.VariablePractice 
// FQCN(Fully Qualified Class Name)
package com.kh.practice;

public class VariablePractice {

	public static void main(String[] args) {
        VariablePractice v = new VariablePractice();
	    v.method1();
	}

	public void method1() {
		
		int i = 2;
		int e = 3; 
		int r = 10000;
		int re = 7000;
		int ri = r * i;
		int ree = re * e;   
		char m = '명';
		char on = '원';
		String oi = "성인";
		String ch = "청소년";
		String wi = "총 금액";
		
		
		System.out.printf("%s %d %s %d %s", oi, i, m, ri, on);

		
		
	}
}
