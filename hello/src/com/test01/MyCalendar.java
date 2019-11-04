package com.test01;

import java.util.Calendar;
import java.util.Scanner;

public class MyCalendar {
	
	public static void main(String[] args) {

		// ���ϴ� ��� �Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("YEAR : ");
		String year = sc.next();
		
		System.out.print("MONTH : ");
		String month = sc.next();
		

		System.out.println("\t\t   " + year + "�� " + month + "��");
		System.out.println("---------------------------------------------------");
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		
		
		Calendar c = Calendar.getInstance();
		
		c.set(Calendar.YEAR, Integer.valueOf(year));
		c.set(Calendar.MONTH, Integer.valueOf(month)-1); // MONTH ������ 0~11 �̱� ������ �Է��� ������ -1 ����� ��
		
		//���� ������ ��¥
		int lastOfDate = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		// �� ���� ����
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);	// ��=1, ��=2, ȭ=3, ...
		
		
		for(int i=1; i<dayOfWeek; i++) {
			System.out.print("\t");
		}
		
		for(int i=1; i<=lastOfDate; i++) {
			
			System.out.printf("%d\t", i);
			
			// ����Ͽ� ��¥ ����ϰ� �ٹٲ�
			if(dayOfWeek % 7 == 0) {
				System.out.println();
			}
			
			dayOfWeek++;	// ���� ī��Ʈ
		}
	}
}
