package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		int num; //사번
		int team; //팀번호
		
		Scanner sc = new Scanner(System.in);
		System.out.println("사번(정수)를 입력해주세요");
		System.out.print("사번: ");
		num = sc.nextInt();
		
		team =num % 3;
		
		switch(team) {
			case 0:
				System.out.println("A팀입니다.");
				break;
				
			case 1:
				System.out.println("B팀입니다.");
				break;
				
			case 2:
				System.out.println("C팀입니다.");
				break;
			
			default:
				System.out.println("잘못입력하셨습니다.");
		}
		
		sc.close();

	}
}