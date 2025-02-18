package _04_controlStatement._01_conditionalStatement;

import java.util.Scanner;

public class _04_nestingIf {

	public static void main(String[] args) {
		// -------------[ 4. 중첩 if문 ]-------------
		// 두 개의 숫자를 입력받고 더 큰 숫자를 출력.
		// 만약 두 숫자가 같다면 "두 숫자는 같습니다" 출력
		
		Scanner sc = new Scanner(System.in);
		int num, num2;
		
		System.out.print("숫자 1 입력: ");
		num = sc.nextInt();
		System.out.print("숫자 2 입력: ");
		num2 = sc.nextInt();

		if (num == num2)

		{
			System.out.println("두 숫자는 같습니다.");
		} else {
			if (num > num2) {
				System.out.printf("%d가 %d보다 %d 더 큽니다.", num, num2, (num - num2));
			} else {
				System.out.printf("%d가 %d보다 %d 더 큽니다.", num2, num, (num2 - num));
			}
		}

	}

}
