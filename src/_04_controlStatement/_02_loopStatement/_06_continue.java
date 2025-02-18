package _04_controlStatement._02_loopStatement;

import java.util.Scanner;

public class _06_continue {

	public static void main(String[] args) throws InterruptedException {
		// 1부터 N까지의 숫자를 출력하는데, 짝수는 건너뛰고 홀수만 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력> ");
		int cnt = sc.nextInt();
		
		for(int i = 1; i <= cnt; i++) {
			if(i % 2 == 0) {
				continue;
			}
			System.out.println(i);
			Thread.sleep(500);
		}

	}

}
