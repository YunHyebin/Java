package _04_controlStatement;

import java.util.Scanner;

public class _01_conditionalStatement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, num2;
		String str;

		// -------------[ 1. If문 ]-------------
		// 사용자가 숫자를 입력하면 짝수인지 홀수인지 판별
		// x는 [짝수/홀수]입니다.
		System.out.print("숫자를 입력하세요: ");
		num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.printf("%d는 짝수입니다.", num);
		} else {
			System.out.printf("%d는 홀수입니다", num);
		}

		System.out.println("\n-----------------------------");

		// -------------[ 2. if-else문 ]-------------
		// 사용자가 입력한 비밀번호가 "java1234"와 일치하는지 판별
		// 맞으면 "비밀번호가 일치합니다."
		// 틀리면 "비밀번호가 틀렸습니다.
		System.out.print("비밀번호를 입력하세요: ");
		str = sc.next();

		if (str.equals("java1234")) {
			System.out.println("비밀번호가 일치합니다.");
		} else {
			System.out.println("비밀번호가 틀렸습니다.");
		}

		System.out.println("-----------------------------");

		// -------------[ 3. if-else if문 ]-------------
		// age가 8살 미만일 경우 "취학 전 아동입니다." / 14살 미만일 경우 "초등학생입니다" / 20살 미만일경우 "중,고등학생입니다" /
		// 그외 "일반인입니다
		// 입장료(charge): 취학전 아동(1000) / 초등학생(2000) / 중,고등학생(2500) / 일반인(3000)
		// 모든 조건문 수행 후 "입장료는 charge 원 입니다 출력

		System.out.print("나이 입력: ");
		num = sc.nextInt();
		int charge;
		if (num < 8) {
			System.out.println("취학 전 아동입니다");
			charge = 1000;
		} else if (num < 14) {
			System.out.println("초등학생입니다");
			charge = 2000;
		} else if (num < 20) {
			System.out.println("중,고등학생입니다");
			charge = 2500;
		} else if (num < 60) {
			System.out.println("일반인입니다");
			charge = 3000;
		} else {
			System.out.println("경로우대입니다");
			charge = 0;
		}
		System.out.println("입장료는 " + charge + "원 입니다");

		System.out.println("-----------------------------");

		// -------------[ 4. 중첩 if문 ]-------------
		// 두 개의 숫자를 입력받고 더 큰 숫자를 출력.
		// 만약 두 숫자가 같다면 "두 숫자는 같습니다" 출력
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

		System.out.println("-----------------------------");

		// -------------[ 5. switch-case문 ]-------------
		// 사용자가 1~7 사이의 숫자를 입력하면 해당하는 요일 출력
		// 1: 월 / 2: 화 ~ 7 : 일
		// 그 외 숫자 "잘못된 입력입니다." 출력
		System.out.print("숫자 입력(1~7): ");
		num = sc.nextInt();
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
