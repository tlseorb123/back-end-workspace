package com.kh.variable;

public class C_Printf {

	public static void main(String[] args) {
          
		// System.out.println(출력하고자하는값); -- 출력 후 줄바꿈 발생 O 
		// system.out.print(출력하고자하는값); -- 출력만 함 (줄바꿈 발생 X) 
		System.out.print("hello\n");
		System.out.println("hello");
		
		System.out.println("--------------------------");
		
	 	// System.out.printf("출력하고자하는형식(포멧)", 출력하고자하는 값, 값, ...);
	    // 출력하고자하는 값들이 제시한 형식에 맟춰서 출력만 진행
	
	    /*
	     * 포맷으로 쓰이는 키워드 
	     * %d : 정수 
	     * %f : 실수 
	     * %c : 문자 
	     * %s : 문자열 (문자도 가능) 
	     * */
		int iNum1 = 10; 
		int iNum2 = 20; 
		
		// 10% 20% 
		System.out.println(iNum1 + "% " + iNum2 + "%"); 
		System.out.printf("%d%% %d%%", iNum1, iNum2); // 퍼센티지 뒤에 하나더 붙여준다.
		System.out.println();
		System.out.println("-----------------------");
		
		System.out.printf("%5d\n", iNum1); // 5d는 5칸 공간 확보 후 양수 오른쪽 정렬
		System.out.printf("%-5d\n", -iNum2); // 음수 왼쪽 정렬
		System.out.printf("%5d\n", 300);
		
		double dNum1 = 1.23456789;
		double dNum2 = 4.53; 
		
		System.out.printf("%f\t%f\n", dNum1, dNum2); // 무조건 소수점 아래 6번째 자리까지
		System.out.printf("%.3f\t%.2f\n", dNum1, dNum2);
		
		System.out.println("-------------------------------------");
		
		char ch = 'a';
		String str = "Hello";
		
		System.out.printf("%c %10s %s\n", ch, str, ch, str); // a    Hello a
		System.out.printf("%C %S", ch, str); // A HELLO --> 대문자로만 출력 
	}

}
