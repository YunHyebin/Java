package _04_controlStatement._02_loopStatement;

import java.util.Scanner;

public class _01_for {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;

		// 1. 1부터 N까지의 합 구하기
		// 사용자에게 숫자 N을 입력받고, 1부터 N까지의 합을 출력한다.
		// N을 입력하세요:
		// 1부터 N가지의 합은 [ ]입니다.
		System.out.print("숫자 N을 입력하세요: ");
		num = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.printf("1부터 %d까지의 합은 %d 입니다.\n", num, sum);

		System.out.println("-------------------------------");

		// 2. 별찍기
		// 사용자에게 N을 입력받고 높이가 N인 삼각형을 출력한다.
		for (int i = num; i > 0; i--) {
			// 공백 출력
			for (int j = i - 1; j >= 1; j--) {
				System.out.print(" ");
			}
			// 별 출력
			for (int k = 1; k <= (num - i) * 2 + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("-------------------------------");

		//3. 1부터 입력받은 정수 중 3의 배수 총합 출력
		sum = 0;
		for(int i = 1; i <= num; i++) {
			if(i % 3 == 0) {
				sum += i;
			}
			System.out.println("총 합: " + sum);
		}
		
		//4. 방적식 4x + 5y = 60의 모든 해를 구해서 (x, y)의 형태로 출력
		//x와 y는 10 이하의 자연수
		for(int x = 1; x <= 10; x++) {
			for(int y = 1; y <= 10; y++) {
				if(4 * x + 5 * y == 60) {
					System.out.printf("(%d, %d)", x, y);
				}
			}
		}
	}

}
