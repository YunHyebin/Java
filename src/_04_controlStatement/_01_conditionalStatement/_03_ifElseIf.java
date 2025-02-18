package _04_controlStatement._01_conditionalStatement;

import java.util.Scanner;

public class _03_ifElseIf {

	public static void main(String[] args) {
		// -------------[ 3. if-else if문 ]-------------
		// age가 8살 미만일 경우 "취학 전 아동입니다." / 14살 미만일 경우 "초등학생입니다" / 20살 미만일경우 "중,고등학생입니다" /
		// 그외 "일반인입니다
		// 입장료(charge): 취학전 아동(1000) / 초등학생(2000) / 중,고등학생(2500) / 일반인(3000)
		// 모든 조건문 수행 후 "입장료는 charge 원 입니다 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 입력: ");
		int num = sc.nextInt();
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

	}

}
