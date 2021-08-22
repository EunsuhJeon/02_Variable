package com.kh.variable;

public class C_Printf {

	public void printfTest() {
		
		//System.out.Print(����ϰ����ϴ� ��); //��¸�. �ٹٲ� �߻�x
		//System.out.println(����ϰ����ϴ� ��); // ����� �ٹٲ� �߻�o
		
		// System.out.printf("����ϰ����ϴ� ����(����)", ����ϰ����ϴ°�, ��,...);
		// ����ϰ����Ѵ� ������ ������ ���Ŀ� ���� ��¸� ���� (�ڵ� �ٹٲ� ����!)
		
		/*
		 * ���� �ȿ��� ���� �� �ִ� Ű����
		 * %d: ����
		 * %c: ����
		 * %s: ���ڿ�, ����
		 * %f: �Ǽ�
		 */
		
		int iNum1 = 10;
		int iNum2 = 20;
		
		// "10 20"
		System.out.println(iNum1 + " " + iNum2);
		System.out.printf("%d %d", iNum1, iNum2);
		System.out.println();
		System.out.println("����");
		
		System.out.printf("%5d\n", iNum1); // 5ĭ�� ���� Ȯ�� �� ������ ���� (������ ��������)
		System.out.printf("%5d\n", 250);
		System.out.printf("%5d\n", 3000);
		
		double dNum1 = 1.23456789;
		double dNum2 = 4.53;
		
		System.out.printf("%f %f\n", dNum1, dNum2);// �Ҽ��� �Ʒ� 6°�ڸ����� ������
		System.out.printf("%.2f %.1f\n", dNum1, dNum2);// ���ϴ� �ڸ����� ����ϴ� ���
		
		char ch = 'a';
		String str = "Hello";
		
		System.out.printf("%c %10s %s\n", ch, str, ch);
		System.out.printf("%C %S\n", ch, str); // �빮�ڷε� ��� ����
		
	}
	
}
