package _04_controlStatement._02_loopStatement;

import java.util.Scanner;

public class _03_doWhile {

	public static void main(String[] args) {
		//사용자가 0을 입력하기 전까지 계속 숫자를 입력받아 합게 출력
		//숫자를 입력하세요(0 입력 시 종료):
		//총 합: N
		Scanner sc = new Scanner(System.in);
		int sum = 0, num = 0;
		do {
			System.out.print("숫자를 입력하세요(0 입력 시 종료): ");
			num = sc.nextInt();
			sum += num;
		}while(num != 0);
		System.out.println("총 합: " + sum);
	}

}
