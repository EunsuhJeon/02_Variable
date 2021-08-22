package com.kh.variable;

public class C_Printf {

	public void printfTest() {
		
		//System.out.Print(출력하고자하는 값); //출력만. 줄바꿈 발생x
		//System.out.println(출력하고자하는 값); // 출력후 줄바꿈 발생o
		
		// System.out.printf("출력하고자하는 형식(포맷)", 출력하고자하는값, 값,...);
		// 출력하고자한느 값들이 제시한 형식에 맞춰 출력만 진행 (자동 줄바꿈 없음!)
		
		/*
		 * 포맷 안에서 쓰일 수 있는 키워드
		 * %d: 정수
		 * %c: 문자
		 * %s: 문자열, 문자
		 * %f: 실수
		 */
		
		int iNum1 = 10;
		int iNum2 = 20;
		
		// "10 20"
		System.out.println(iNum1 + " " + iNum2);
		System.out.printf("%d %d", iNum1, iNum2);
		System.out.println();
		System.out.println("하하");
		
		System.out.printf("%5d\n", iNum1); // 5칸의 공간 확보 후 오른쪽 정렬 (음수면 왼쪽정렬)
		System.out.printf("%5d\n", 250);
		System.out.printf("%5d\n", 3000);
		
		double dNum1 = 1.23456789;
		double dNum2 = 4.53;
		
		System.out.printf("%f %f\n", dNum1, dNum2);// 소숫점 아래 6째자리까지 보여줌
		System.out.printf("%.2f %.1f\n", dNum1, dNum2);// 원하는 자리까지 출력하는 방법
		
		char ch = 'a';
		String str = "Hello";
		
		System.out.printf("%c %10s %s\n", ch, str, ch);
		System.out.printf("%C %S\n", ch, str); // 대문자로도 출력 가능
		
	}
	
}
