package _04_controlStatement._01_conditionalStatement;

import java.util.Scanner;

public class _05_switchCase {

	public static void main(String[] args) {
		// -------------[ 5. switch-case문 ]-------------
		// 사용자가 1~7 사이의 숫자를 입력하면 해당하는 요일 출력
		// 1: 월 / 2: 화 ~ 7 : 일
		// 그 외 숫자 "잘못된 입력입니다." 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력(1~7): ");
		int num = sc.nextInt();
		
		switch (num) {
		case 1:
			System.out.println("월");
			break;
		case 2:
			System.out.println("화");
			break;
		case 3:
			System.out.println("수");
			break;
		case 4:
			System.out.println("목");
			break;
		case 5:
			System.out.println("금");
			break;
		case 6:
			System.out.println("토");
			break;
		case 7:
			System.out.println("일");
			break;
		default:
			System.out.println("잘못된 입력입니다.");
			break;
		}

		System.out.println("-----------------------------");

		// 사용자가 월을 입력하면 해당 월에 맞는 계절 출력
		// 12,1,2: 겨울 / 3,4,5: 봄 / 6,7,8: 여름 / 9,10,11: 가을

		System.out.print("월 입력(1~12): ");
		num = sc.nextInt();

		// JDK 14이상 ->화살표 사용. ;세미콜론 붙여야 함
		String session1 = switch (num) {
		case 12, 1, 2 -> "겨울";
		case 3, 4, 5 -> "봄";
		case 6, 7, 8 -> "여름";
		case 9, 10, 11 -> "가을";
		default -> "잘못된 입력";
		};

		// JDK 12~13버전 ->, yield 사용. yield사용 시 중괄호 사용
		String session2 = switch (num) {
		case 12, 1, 2 -> {
			yield "겨울";
		}
		case 3, 4, 5 -> {
			yield "봄";
		}
		case 6, 7, 8 -> {
			yield "여름";
		}
		case 9, 10, 11 -> {
			yield "가을";
		}
		default -> "잘못된 입력";
		};

		String session3 = switch (num) {
		case 12, 1, 2:
			yield "겨울";
		case 3, 4, 5:
			yield "봄";
		case 6, 7, 8:
			yield "여름";
		case 9, 10, 11:
			yield "가을";
		default:
			yield "잘못된 입력";
		};

		System.out.printf("해당 계절: [s1 = %s], [s2 %s], [s3 = %s]", session1, session2, session3);

	}

}
