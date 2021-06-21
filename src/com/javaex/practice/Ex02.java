package com.javaex.practice;

import java.util.Scanner;

public class Ex02 {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		// if문의 구조인 참과 거짓을 구분해야하므로 = 가 아닌 관계연산자 ==를 써준다
		
		if(x == 0) {
			System.out.println("x는 0이다.");
		}
		sc.close();
	}

}
