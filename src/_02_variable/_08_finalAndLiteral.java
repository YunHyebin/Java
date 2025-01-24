package _02_variable;

public class _08_finalAndLiteral {

	public static void main(String[] args) {
		// final(상수): 값을 한번 저장하면 변경할 수 없는 저장공간.
		// literal: 변수에 저장될 수 있는 데이터 자체 값

		// 1. 상수 선언 및 초기화
		final int COUNT_MONTHS = 12;
		final int COUNT_WEEKDAYS = 7;
		final double PI = 3.14;
		// COUNT_MONTHS, COUNT_WEEKDAYS, PI, MAX_VALUE: 상수
		// 12, 7, 3,14: 리터럴(실제값)

		// 2. 상수를 먼저 선언만 한 상태에서 초기화
		// 초기화를 하지 않은 상태에선 값 할당 가능
		// 상수 선언 및 초기화된 상태에선 값 변경 불가능
		final int MAX_VALUE;
		MAX_VALUE = 100;
		// MAX_VALUE = 10;
		// -> The final local variable MAX_VALUE may already have been assigned

		// 3. 상수 출력
		System.out.println(MAX_VALUE);
		System.out.println("1년은 " + COUNT_MONTHS + "개월입니다.");
		System.out.println("일주일은 " + COUNT_WEEKDAYS + "일입니다.");
		System.out.println("반지름이 2인 원의 넓이는 " + (2 * 2 * PI) + "입니다.");

	}

}
