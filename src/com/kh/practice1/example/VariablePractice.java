package com.kh.practice1.example;

import java.util.Scanner;

public class VariablePractice {

	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ���: ");
		
		String name = sc.nextLine();
		System.out.print("���̸� �Է��ϼ���: ");
		
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("������ �Է��ϼ���(��/��): ");
		
		char gender = sc.nextLine().charAt(0);
		System.out.print("Ű�� �Է��ϼ���(cm): ");
		
		double height = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("Ű "+ height + "�� "+ gender + "�� "+ name + "�� �ݰ����ϴ�^^");
		
	}
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ������ �Է��ϼ���: ");
		int first = sc.nextInt();
		
		System.out.print("�� ��° ������ �Է��ϼ���: ");
		int second = sc.nextInt();
		
		System.out.print("���ϱ� ���: " + (first+second));
		System.out.println();
	
		System.out.print("���� ���: " + (first-second));
		System.out.println();
		
		System.out.print("���ϱ� ���: " + (first*second));
		System.out.println();
		
		System.out.print("������ �� ���: " + (first/second));
	
	}
	
	public void method3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����: ");
		double width = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("����: ");
		double length = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("����: " + width * length);
		System.out.print("�ѷ�: " + (width + length)*2);
		
	}
	
	public void method4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ��� �Է��ϼ���: ");
		String str = sc.nextLine();
		
		System.out.print("ù ��° ����: " + str.charAt(0));
		System.out.println();
		
		System.out.print("�� ��° ����: " + str.charAt(1));
		System.out.println();
		
		System.out.print("�� ��° ����: " + str.charAt(2));
		System.out.println();
	
	}
	
	
	
}
