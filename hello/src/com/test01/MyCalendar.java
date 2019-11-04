package com.test01;

import java.util.Calendar;
import java.util.Scanner;

public class MyCalendar {
	
	public static void main(String[] args) {

		// 원하는 년월 입력받기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("YEAR : ");
		String year = sc.next();
		
		System.out.print("MONTH : ");
		String month = sc.next();
		

		System.out.println("\t\t   " + year + "년 " + month + "월");
		System.out.println("---------------------------------------------------");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		
		Calendar c = Calendar.getInstance();
		
		c.set(Calendar.YEAR, Integer.valueOf(year));
		c.set(Calendar.MONTH, Integer.valueOf(month)-1); // MONTH 범위가 0~11 이기 때문에 입력한 월에서 -1 해줘야 함
		
		//달의 마지막 날짜
		int lastOfDate = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		// 한 주의 요일
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);	// 일=1, 월=2, 화=3, ...
		
		
		for(int i=1; i<dayOfWeek; i++) {
			System.out.print("\t");
		}
		
		for(int i=1; i<=lastOfDate; i++) {
			
			System.out.printf("%d\t", i);
			
			// 토요일에 날짜 출력하고 줄바꿈
			if(dayOfWeek % 7 == 0) {
				System.out.println();
			}
			
			dayOfWeek++;	// 요일 카운트
		}
	}
}
