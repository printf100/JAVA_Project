package com.test01;

import java.util.Arrays;

// 로또 번호 생성기

public class Lotto {
	
	public static void main(String[] args) {
		
		int Lotto[] = new int[6];
		
		for(int i=0; i<Lotto.length; i++) {
			Lotto[i] = (int) (Math.random() * 45 + 1);	// 로또 번호는 1~45번
			
			// 중복 제거
			for(int j=0; j<i; j++) {
				if(Lotto[j] == Lotto[i]) {
					i--;
					break;
				}
			}
		}
		
		// 배열 정렬
		Arrays.sort(Lotto);
		
		for(int i=0; i<Lotto.length; i++) {
			System.out.print(Lotto[i] + " ");
		}
	}
}
