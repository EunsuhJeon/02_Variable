package com.kh.variable;

public class A_Variable {

	// �ñް� �ٹ��ð��� �ٹ��ϼ��� ���ؼ� ������ ����ؼ� ����ϴ� �޼ҵ�
	public void printVariable() {
		
		System.out.println("======== ���� ��� �� ==========");
		
		System.out.println("�ñ�: 9450��");
		System.out.println("�ٹ��ð�: 6�ð�");
		System.out.println("�ٹ��ϼ�: 8��");
		
		// ���� = �ñ�*�ٹ��ð�*�ٹ��ϼ�
		// �谩��: 00000�� �������� ����ϰ� �ʹ�!
		System.out.println("�谩��: " + (9450*6*8) + "��");
		System.out.println("�Ǵ���: " + (9450*6*8) + "��");
		System.out.println("�Ǽ���: " + (9450*6*8) + "��");
		System.out.println("������: " + (9450*6*8) + "��");
		System.out.println("���ѳ�: " + (9450*6*8) + "��"); // �ڹٿ��� ������ '*'�� ��Ÿ����
		
		// ���� �����
		System.out.println("======== ���� ��� �� ========");
		
		int pay = 9450; // �ڹٿ��� '=' �̶�� ��ȣ�� �����ϴٸ��� ���� �ƴ϶� �����ϰڴٴ� �ǹ�.
		// ��, 8500�̶�� ���� pay��� ���ڿ� �����ϰڴ�.
		int time = 6;
		int day = 8;
		
		System.out.println("�谡��: " + (pay*time*day) + "��");
		System.out.println("���: " + (pay*time*day) + "��");
		System.out.println("�����: " + (pay*time*day) + "��");
		System.out.println("����: " + (pay*time*day) + "��");
		System.out.println("�迹��: " + (pay*time*day) + "��");
		
		/*
		 * ������ ����ϴ� ����
		 * 1. ������ �켱������ ���� �ǹ̸� �ο��� �������� ����Ѵ�.
		 * 2. �� �ѹ� ���� ����ϰ� �ʿ��� ������ ������ ���� �������� ����. (���뼺�� ��������.)
		 * 3. ���������� ���� ���� �� �� �ִ�.
		 */
	} 
	
	//������ ����
	public void declareVariable() {
		
		
		/*
		 * ������ ����
		 * ���� ����ϱ� ���� ������ �޸� ������ Ȯ��(�Ҵ�)�Ѵ�. => ��, ���� �����ϱ� ���� ���ڸ� ����ڴ�
		 * 
		 * [ǥ����] �ڷ��� �����̸�;
		 * 
		 * �ڷ���: ������ ũ�� �� ����� �������ִ� �κ�
		 * �����̸�: ������ �̸��� �ٿ��ִ� �κ�(�ǹ̺ο�)
		 * 
		 * ���� ���� �� ��������
		 * 1. �����̸��� �ҹ��ڷ� ����/ ��, ��Ÿ�� ǥ����� ��ų ��!/ ������ ���Ұ�
		 * 2. ���� ����('{}'�� ���� ����) �ȿ����� ������ ���������� ���� �Ұ� => ��, �ߺ��� �Ұ����ϴ�.
		 * 3. �ش� ����('{}'�� ���� ����) �ȿ��� ����� ������ �� ���� �ȿ����� ��� ���� => ��, �ٸ� �޼ҵ忡���� ����� �Ұ��ϴ�
		 */
		
		
		//---------�ڷ����� ���� ����----------
		// 1. ���� (����= true or false)
		boolean isTrue;
		boolean isFalse = true; // 1byte, ���� ����� ���ÿ� ���� ����(=)
		System.out.println("isFalse�� ���ο� ������ ���� ��: " + isFalse);
		
		isTrue = true;
		isFalse = false;
		
		
		// 2. ������ 
		// 2_1. ������
		byte bNum; // 1byte (-128 ~ 127)
		bNum = -128;
		//�� �� �ܰ迡 ���� ���� �����ϴ� ���
		
		short sNum = 1000; // 2byte
		//�� �� ���� ���� �����ϴ� ���
		
		int iNum = 10000; // 4byte, �������� �⺻ �ڷ���
		
		long lNum = 100000; // 8byte
		
		// 2_2. �Ǽ���
		float fNum = 0.1f; //4byte => �Ҽ��� 7�ڸ�����
						   //double�� �����ϱ� ���� �� �ڿ� 'f'�� �Է��ؾ���
		
		double dNum = 0.1234567; //8byte => �Ҽ��� 15�ڸ�����, �Ǽ����� �⺻ �ڷ���
		
		// 3. ������
		// 3_1. ����
		char ch = 'a'; // 2byte
		char kim;
		kim = '��';
		
		// 3_2. ���ڿ�
		String str = "abc"; // ������
		
		System.out.println(isTrue);
		System.out.println("isFalse�� ���ο� ���� ���� ��:" + isFalse);
		System.out.println(bNum);
		
		// �����̸�: ���� ���·� ����ϰ�ʹ�
		System.out.println("sNum: " + sNum);
		System.out.println("iNum: " + iNum);
		System.out.println("lNum: " + lNum);
		System.out.println("fNum: " + fNum);
		System.out.println("dNum: " + dNum);
		
		System.out.println("ch: " + ch);
		System.out.println("kim: " + kim);
		System.out.println("str: " + str);
		
		// ����� ����
		// [ǥ����] final �ڷ��� ����̸�;
		final int AGE; // ��� �̸��� ��� �빮�ڷ� ���´�
		AGE = 10; // �ʱ�ȭ
		
		System.out.println("AGE: " + AGE);
		
		/*
		 * AGE = 11; <<= ����� ���� ������ �Ұ��ϴ�!!
		
		System.out.println("AGE: " + AGE);
		*/
		// ��ǥ���� ����� ��: 3.14 (����, ������)
		System.out.println("����: " + Math.PI);
		
		//����
		int etc = 999_999_999;
		
		System.out.println("etc: " + etc);
		
		// ��������Ģ
		int number;
		
		// 1) ���� ���� ���� �ߺ��� �̸� �ȵ�!
		//int number;
		// ��ҹ��ڴ� ����
		int numBer;
		
		// 2) ����� (�̹� �ڹٿ��� ���ǰ� �ִ� Ű����) ���x
		/*
		 * int class;
		 * int static;
		 * int true;
		 */
		
		int number1;
		int num1ber;
		//int 1number;
		int number_1;
		int _number;
		int number$;
		//int number!;
		//int number#;
		
		// �������!! (������ �߻����� ������, ��Ű�� ������. ��, �����ڰ��� ��Ģ)
		// 1) ��Ÿ��ǥ���
		String username; // ���ʻ� Ʋ��
		String userName; // ���ʻ� �´� ǥ��
		
		// 2) ����ǥ�� (�ѱ��� ������� �ʴ� �ܱ������� ������ �߻���.)
		int ����; //X
		int userAge; //O
		
		
		/*
		 * ** ���� **
		 * -��(���ͷ�): ���α׷� �� �ʿ��� ������� ��
		 * 			   �Ǵ� ����ڰ� ���콺 �Ǵ� Ű����� �Է��� ��
		 * -����: ���� �����ϱ� ���� ���� (�޸𸮿� ���� ����ϱ� ���� ����)
		 */
		
		
	}
		
	
}
