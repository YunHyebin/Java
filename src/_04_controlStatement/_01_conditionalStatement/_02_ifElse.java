package _04_controlStatement._01_conditionalStatement;

import java.util.Scanner;

public class _02_ifElse {

	public static void main(String[] args) {
		// -------------[ 2. if-else문 ]-------------
		// 사용자가 입력한 비밀번호가 "java1234"와 일치하는지 판별
		// 맞으면 "비밀번호가 일치합니다."
		// 틀리면 "비밀번호가 틀렸습니다.
		
		Scanner sc = new Scanner(System.in);
		String str;
		
		System.out.print("비밀번호를 입력하세요: ");
		str = sc.next();

		if (str.equals("java1234")) {
			System.out.println("비밀번호가 일치합니다.");
		} else {
			System.out.println("비밀번호가 틀렸습니다.");
		}

	}

}
