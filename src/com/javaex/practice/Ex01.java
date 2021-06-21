package com.javaex.practice;

import java.util.Scanner;

public class Ex01 {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int age = sc.nextInt();
		
		/*if는 조건식인 참인 "딱 한 곳만"을 찾아가서 구현부에 적혀있는 내용들을 실행하고 이 세트를 
		 종료하므로 나이가 0보다 크고(true) 18보다 낮으면(true) 이라는 조건을 만족시키려면
		 논리연산자인 &&(두 조건이 일치할 때 참(true)를 써준다. 
		 */
		
		if(age>0 && age < 18) {
			
			System.out.println("청소년 입니다.");
		}
		sc.close();
	}

}
