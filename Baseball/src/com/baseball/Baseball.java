package com.baseball;

import java.util.Scanner;

// ���� �߱� ����

public class Baseball {

	static int[] computer = new int[3];
	static int[] user = new int[3];

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("���� ����");
		setBase();

		boolean finish = false;
		int strike, ball;
		
		while(!finish) {
			
			strike = 0;
			ball = 0;
			
			System.out.print("���ڸ� �Է��ϼ��� (0 ~ 9) : ");

			for (int i = 0; i < 3; i++) {
				user[i] = sc.nextInt();
				
				for (int j = 0; j < 3; j++) {
					
					if (user[i] == computer[j]) {	// ���ڰ� ������
					
						if (i == j)	// �ε����� ������
							strike++;
						else	// �ε����� �ٸ���
							ball++;
					}
				}
				
			}
			
			System.out.println(strike + "S " + ball + "B");
			
			if(strike == 3)	// 3��Ʈ����ũ�� ���� ����
				finish = true;			
		}
		
		sc.close();
		
		System.out.println("�����մϴ�!");
		
	}

	// ���� ���� ����
	public static void setBase() {

		for (int i = 0; i < 3; i++) {
			computer[i] = (int) (Math.random() * 10);

			// �ߺ� ����
			for (int j = 0; j < i; j++) {
				if (computer[j] == computer[i]) {
					i--;
					break;
				}
			}

		}
		
		for (int i = 0; i < 3; i++)
			System.out.print(computer[i] + " ");

		System.out.println();
	}

}
