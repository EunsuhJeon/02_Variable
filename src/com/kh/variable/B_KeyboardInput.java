package com.kh.variable;

import java.util.Scanner;


// 사용자가 키보드로 입력한 값을 받아들이는 Scanner 실습
public class B_KeyboardInput {
	
	public void inputTest1() {
		
		/*
		 * 키보드로 값을 입력하는 방법
		 * Scanner 를 사용한다!
		 * (즉, java.util.Scanner 믈래스를 이용하는 것이다.)
		 * Scanner 클래스 내부의 메소드르르 호출하여 입력 받는 것.
		 */
		
		// 스캐너 클래스의 객체 생성
		Scanner sc = new Scanner(System.in);
		// System.in 은 입력받은 값을 바이트 단위로 받아들이겠다는 의미
		// 출력 시에 사용했던 System.out 이라는 구문과 반대
		
		System.out.print("아무거나 입력해보세요:");
		String amuguna = sc.nextLine();
		
		System.out.println("입력받은 내용:" + amuguna);
		
	}

	public void inputTest2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 이름은 무엇입니까:");
		
		//사용자가 입력한 값을 문자열로 받아오는 메소드 (next(), nextLine())
		//String name = sc.next();
		//  1       3     2       의 순서로 실행됨
		// next(): 사용자가 입력한 값 중 공백이 있을 경우 공백 이전까지의 값만 읽어옴.
		//			(따라서 거주지 등의 내용같은 경우 공백이 있을 수 있어 제대로 된 값을 가져오지 못할 수 있음)
		
		String name = sc.nextLine();
		 //nextLine(): 사용자가 입력한 엔터키 이전까지의 모든 값을 불러옴.
		
		System.out.print("당신의 나이는 몇살입니까: ");
		int age = sc.nextInt(); // 사용자가 입력한 값을 정수로 읽어들이는 메소드
		
		System.out.print("당신의 키는 몇입니까(소숫점 첫 째 자리까지): ");
		double height = sc.nextDouble();
		// xxx님은 xx살이며, 키는 xxx.xcm입니다.
		System.out.print(name + "님은 " + age + "살이며, 키는 " + height +"cm입니다.");
		
		}
		
	
	//키보드로 값을 입력받을 때 종종 발생하는 문제
	public void inputTest3() {
			
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름: ");
		String name = sc.nextLine();
		//sc.nextLine(): 버퍼에서 '엔터' 이전까지의 모든 값을 가져온 후  '엔터'를 비워주는 역할.
		
		System.out.print("나이: ");
		int age = sc.nextInt();
		//sc.nextInt(): '엔터'를 비워주지 않음.
		
		//버퍼에 남아있는 엔터를 비워주는 코드 추가
		sc.nextLine();
		//결론: sc.nextxxx() 메소드 뒤에 sc.nextLine() 메소드가 오게 될 경우 버퍼에 남아있는 '엔터'를 비워주는 과정 필수!
		
		System.out.print("주소: ");
		String address = sc.nextLine();
		
		System.out.print("키: ");
		double height = sc.nextDouble();
		
		System.out.println(name + "님은 " + age + "살이며, 사는 곳은 " + address + "이고, 키는 " + height + "cm입니다.");
		
		System.out.printf("%s님은 %d살이며, 사는곳은 %s이고, 키는 %.1fcm입니다",name,age,address,height);
		
		
		
	}
	
	public void inputTest4() {
		
		Scanner sc = new Scanner(System.in);
		
		// 문자열을 입력 받을 때 => sc.nextLine()
		// 정수값을 입력 받을 때 => sc.nextInt()
		// 실수값을 입력 받을 때 => sc.nextDouble()
		
		System.out.print("이름: ");
		String name = sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		// char gender = sc.nextChar(); // nextChar라는 메소드는 존재하지 않음!
		char gender = sc.nextLine().charAt(0);
		// 문자열.charAt(인덱스): 해당 문자열로부터 해당 인덱스의 문자를 추출해주는 메소드
		// **인덱스: 순번같은 존재. 단, 0부터 시작함!
		
		System.out.print("나이: ");
		int age = sc.nextInt();
		
		System.out.print("키: ");
		double height = sc.nextDouble();
		
		System.out.println(name + "님의 개인정보");
		System.out.println("성별: " + gender);
		System.out.println("나이: " + age);
		System.out.println("키: " + height);	
		
		
	}
	
	public void charAtTest() {
		String str = "Hello";
		//////// 인덱스 01234
		char ch = str.charAt(0);
		System.out.println(ch);
		
		System.out.println(str.charAt(4));
		//변수로 기록하지 않고 곧바로 출력하는 방법
		
		//System.out.println(str.charAt(10)); // StringIndexOutOfBoundsException발생
		
	}
	
	/*
	 * **정리**
	 * 1. 콘솔 창(모니터)에 출력하기 위해: System.out.print[ln]() 메소드 이용    *[]는 생략 가능
	 * 2. 콘솔 창(키보드)에 값을 입력받기 위해: Scanner 이용해서 (nextLine(), next(), nextInt(), nextDouble()...)
	 * 		> 주의사항
	 * 		1) sc.nextXXX() 메소드 뒤에 sc.nextLine() 메소드가 와야할 경우
	 * 		   sc.nextLine() 메소드를 한번 더 써줘서 버퍼에 남아있는 '엔터'를 빼주는 과정 필수!
	 * 		2)'문자' 값을 입력받아야할 경우
	 * 		   sc.nextLine() 메소드를 통해 우선 문자열로 먼저 입력받고, 그 뒤에 .charAt(인덱스) 메소드를 통해 문자 하나 추출
	 * 
	 * 
	 */
	
}
