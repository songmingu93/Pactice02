package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		String alphabet; //글자
		
		Scanner sc = new Scanner(System.in);
		System.out.println("알파벳 1글자(소문자)를 입력하세요");
		System.out.print("알파벳: ");
		alphabet = sc.nextLine();
		
		switch(alphabet) {
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
				System.out.println("모음입니다.");
				break;
			default:
				System.out.println("자음입니다.");
				break;
		}
		
		sc.close();

	}
}
