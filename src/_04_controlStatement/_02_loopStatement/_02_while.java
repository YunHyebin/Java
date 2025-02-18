package _04_controlStatement._02_loopStatement;

import java.util.Scanner;

public class _02_while {

	public static void main(String[] args) {
		//------------[숫자 맞추기 게임]------------
		//1부터 100까지의 랜덤숫자를 맞출 때까지 계속 입력받는 프로그램 작성
		Scanner sc = new Scanner(System.in);
		
		int random = (int)(Math.random()*100) + 1;
		//Math.random은 0.0이상 1.0미만 난수 생성
		//Math.random() * 100 -> 0.0이상 100.0미만 난수 생성
		//(int)로 강제 형변환하면 0~99난수 생성
		//+1로 1~100 정수 생성
		System.out.println("random" + random);
		
		int num = 0;
		while(num != random) {
			System.out.print("숫자를 맞춰보세요: ");
			num = sc.nextInt();
			
			if(num > random) {
				System.out.println("더 작은 수를 입력하세요.");
			}
			else if(num < random) {
				System.out.println("더 큰 수를 입력하세요.");
			}
			else {
				System.out.printf("정답입니다!\t랜덤숫자: %d\n", random);
			}
		}
		
		//랜덤 주사위 합 맞추기
		//눈의 합이 5가 아니면 계속 주사위 던지기
		//눈의 합이 5이면 실행 멈추고,
		//두 개의 주사위를 던졌을 때 나오는 눈을 (눈1, 눈2) 형태로 출력
		int num1 = 0;
		int num2 = 1;
		while(num1 + num2 != 5) {
			num1 = (int)(Math.random()*6) + 1;
			num2 = (int)(Math.random()*6) + 1;
		}
		System.out.printf("(%d, %d)", num1, num2);
	}

}
