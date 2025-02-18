package _04_controlStatement._01_conditionalStatement;

import java.util.Scanner;

public class _01_if {

	public static void main(String[] args) {
		// -------------[ 1. If문 ]-------------
		// 사용자가 숫자를 입력하면 짝수인지 홀수인지 판별
		// x는 [짝수/홀수]입니다.

		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("숫자를 입력하세요: ");
		num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.printf("%d는 짝수입니다.", num);
		} else {
			System.out.printf("%d는 홀수입니다", num);
		}

	}

}
