package com.test01;

import java.util.Arrays;

// �ζ� ��ȣ ������

public class Lotto {
	
	public static void main(String[] args) {
		
		int Lotto[] = new int[6];
		
		for(int i=0; i<Lotto.length; i++) {
			Lotto[i] = (int) (Math.random() * 45 + 1);	// �ζ� ��ȣ�� 1~45��
			
			// �ߺ� ����
			for(int j=0; j<i; j++) {
				if(Lotto[j] == Lotto[i]) {
					i--;
					break;
				}
			}
		}
		
		// �迭 ����
		Arrays.sort(Lotto);
		
		for(int i=0; i<Lotto.length; i++) {
			System.out.print(Lotto[i] + " ");
		}
	}
}
