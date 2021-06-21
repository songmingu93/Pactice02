package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		int AD; //몫
		int RD; //나머지
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		int num01 = sc.nextInt();
		
		System.out.print("두번째 숫자: ");
		int num02 = sc.nextInt();
		
		if(num01>num02) { // num1이 num2보다 클때
			AD = num01 / num02;
			RD = num01 % num02;
		}else { //num2가 num1보다 크거나 같을때
			AD = num02 / num01;
			RD = num02 % num01;
		}

		System.out.println("몫: " + AD );
		System.out.println("나머지: " + RD );
		

		sc.close();

	}
}
