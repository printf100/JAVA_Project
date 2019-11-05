package com.baseball;

import java.util.Scanner;

// 숫자 야구 게임

public class Baseball {

	static int[] computer = new int[3];
	static int[] user = new int[3];

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("기준 점수");
		setBase();

		boolean finish = false;
		int strike, ball;
		
		while(!finish) {
			
			strike = 0;
			ball = 0;
			
			System.out.print("숫자를 입력하세요 (0 ~ 9) : ");

			for (int i = 0; i < 3; i++) {
				user[i] = sc.nextInt();
				
				for (int j = 0; j < 3; j++) {
					
					if (user[i] == computer[j]) {	// 숫자가 같으면
					
						if (i == j)	// 인덱스가 같으면
							strike++;
						else	// 인덱스가 다르면
							ball++;
					}
				}
				
			}
			
			System.out.println(strike + "S " + ball + "B");
			
			if(strike == 3)	// 3스트라이크면 게임 종료
				finish = true;			
		}
		
		sc.close();
		
		System.out.println("축하합니다!");
		
	}

	// 기준 점수 셋팅
	public static void setBase() {

		for (int i = 0; i < 3; i++) {
			computer[i] = (int) (Math.random() * 10);

			// 중복 제거
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
