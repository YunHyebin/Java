package _01_print;

import java.util.Scanner; //java.util의 Scanner 클래스 import

public class _03_scanner {

	public static void main(String[] args) {
		// Scanner 클래스의 객체 생성
		Scanner sc = new Scanner(System.in);

		System.out.println("short 입력>");
		short b = sc.nextShort(); // short 타입 입력
		System.out.println("입력 내용: " + b + "%n");

		System.out.println("int 입력>");
		int c = sc.nextInt(); // int 타입 입력
		System.out.println("입력 내용: " + c + "%n");

		System.out.println("long 입력>");
		long d = sc.nextLong(); // long 타입 입력
		System.out.println("입력 내용: " + d + "%n");

		System.out.println("float 입력>");
		float e = sc.nextFloat(); // float 타입 입력
		System.out.println("입력 내용: " + e + "%n");

		System.out.println("double 입력>");
		double f = sc.nextDouble(); // double 타입 입력
		System.out.println("입력 내용: " + f + "%n");

		System.out.println("boolean 입력>");
		boolean g = sc.nextBoolean(); // boolean 타입 입력
		System.out.println("입력 내용: " + g + "%n");

		System.out.println("문자 입력>");
		String h = sc.next(); // 한 단어 읽음
		System.out.println("입력 내용: " + h + "%n");

		System.out.println("문자 입력>");
		String i = sc.nextLine();
		System.out.println("입력 내용: " + i + "%n");

	}

}
