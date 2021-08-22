package com.kh.variable;

import java.util.Scanner;


// ����ڰ� Ű����� �Է��� ���� �޾Ƶ��̴� Scanner �ǽ�
public class B_KeyboardInput {
	
	public void inputTest1() {
		
		/*
		 * Ű����� ���� �Է��ϴ� ���
		 * Scanner �� ����Ѵ�!
		 * (��, java.util.Scanner �ɷ����� �̿��ϴ� ���̴�.)
		 * Scanner Ŭ���� ������ �޼ҵ帣�� ȣ���Ͽ� �Է� �޴� ��.
		 */
		
		// ��ĳ�� Ŭ������ ��ü ����
		Scanner sc = new Scanner(System.in);
		// System.in �� �Է¹��� ���� ����Ʈ ������ �޾Ƶ��̰ڴٴ� �ǹ�
		// ��� �ÿ� ����ߴ� System.out �̶�� ������ �ݴ�
		
		System.out.print("�ƹ��ų� �Է��غ�����:");
		String amuguna = sc.nextLine();
		
		System.out.println("�Է¹��� ����:" + amuguna);
		
	}

	public void inputTest2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����� �̸��� �����Դϱ�:");
		
		//����ڰ� �Է��� ���� ���ڿ��� �޾ƿ��� �޼ҵ� (next(), nextLine())
		//String name = sc.next();
		//  1       3     2       �� ������ �����
		// next(): ����ڰ� �Է��� �� �� ������ ���� ��� ���� ���������� ���� �о��.
		//			(���� ������ ���� ���배�� ��� ������ ���� �� �־� ����� �� ���� �������� ���� �� ����)
		
		String name = sc.nextLine();
		 //nextLine(): ����ڰ� �Է��� ����Ű ���������� ��� ���� �ҷ���.
		
		System.out.print("����� ���̴� ����Դϱ�: ");
		int age = sc.nextInt(); // ����ڰ� �Է��� ���� ������ �о���̴� �޼ҵ�
		
		System.out.print("����� Ű�� ���Դϱ�(�Ҽ��� ù ° �ڸ�����): ");
		double height = sc.nextDouble();
		// xxx���� xx���̸�, Ű�� xxx.xcm�Դϴ�.
		System.out.print(name + "���� " + age + "���̸�, Ű�� " + height +"cm�Դϴ�.");
		
		}
		
	
	//Ű����� ���� �Է¹��� �� ���� �߻��ϴ� ����
	public void inputTest3() {
			
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸�: ");
		String name = sc.nextLine();
		//sc.nextLine(): ���ۿ��� '����' ���������� ��� ���� ������ ��  '����'�� ����ִ� ����.
		
		System.out.print("����: ");
		int age = sc.nextInt();
		//sc.nextInt(): '����'�� ������� ����.
		
		//���ۿ� �����ִ� ���͸� ����ִ� �ڵ� �߰�
		sc.nextLine();
		//���: sc.nextxxx() �޼ҵ� �ڿ� sc.nextLine() �޼ҵ尡 ���� �� ��� ���ۿ� �����ִ� '����'�� ����ִ� ���� �ʼ�!
		
		System.out.print("�ּ�: ");
		String address = sc.nextLine();
		
		System.out.print("Ű: ");
		double height = sc.nextDouble();
		
		System.out.println(name + "���� " + age + "���̸�, ��� ���� " + address + "�̰�, Ű�� " + height + "cm�Դϴ�.");
		
		System.out.printf("%s���� %d���̸�, ��°��� %s�̰�, Ű�� %.1fcm�Դϴ�",name,age,address,height);
		
		
		
	}
	
	public void inputTest4() {
		
		Scanner sc = new Scanner(System.in);
		
		// ���ڿ��� �Է� ���� �� => sc.nextLine()
		// �������� �Է� ���� �� => sc.nextInt()
		// �Ǽ����� �Է� ���� �� => sc.nextDouble()
		
		System.out.print("�̸�: ");
		String name = sc.nextLine();
		
		System.out.print("����(M/F) : ");
		// char gender = sc.nextChar(); // nextChar��� �޼ҵ�� �������� ����!
		char gender = sc.nextLine().charAt(0);
		// ���ڿ�.charAt(�ε���): �ش� ���ڿ��κ��� �ش� �ε����� ���ڸ� �������ִ� �޼ҵ�
		// **�ε���: �������� ����. ��, 0���� ������!
		
		System.out.print("����: ");
		int age = sc.nextInt();
		
		System.out.print("Ű: ");
		double height = sc.nextDouble();
		
		System.out.println(name + "���� ��������");
		System.out.println("����: " + gender);
		System.out.println("����: " + age);
		System.out.println("Ű: " + height);	
		
		
	}
	
	public void charAtTest() {
		String str = "Hello";
		//////// �ε��� 01234
		char ch = str.charAt(0);
		System.out.println(ch);
		
		System.out.println(str.charAt(4));
		//������ ������� �ʰ� ��ٷ� ����ϴ� ���
		
		//System.out.println(str.charAt(10)); // StringIndexOutOfBoundsException�߻�
		
	}
	
	/*
	 * **����**
	 * 1. �ܼ� â(�����)�� ����ϱ� ����: System.out.print[ln]() �޼ҵ� �̿�    *[]�� ���� ����
	 * 2. �ܼ� â(Ű����)�� ���� �Է¹ޱ� ����: Scanner �̿��ؼ� (nextLine(), next(), nextInt(), nextDouble()...)
	 * 		> ���ǻ���
	 * 		1) sc.nextXXX() �޼ҵ� �ڿ� sc.nextLine() �޼ҵ尡 �;��� ���
	 * 		   sc.nextLine() �޼ҵ带 �ѹ� �� ���༭ ���ۿ� �����ִ� '����'�� ���ִ� ���� �ʼ�!
	 * 		2)'����' ���� �Է¹޾ƾ��� ���
	 * 		   sc.nextLine() �޼ҵ带 ���� �켱 ���ڿ��� ���� �Է¹ް�, �� �ڿ� .charAt(�ε���) �޼ҵ带 ���� ���� �ϳ� ����
	 * 
	 * 
	 */
	
}
