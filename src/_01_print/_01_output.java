package _01_print;

public class _01_output {

	public static void main(String[] args) {
		System.out.println("Hello Java");
		// 예약어: syso+ctrl+space
		System.out.println();
		System.out.println();
		System.out.println();
		// System : 현재 사용중인 운영체제
		// out: 운영체제에서 사용중인 출력장치(모니터)
		// println() : 괄호안의 내용을 출력한 후 라인을 변경해라. 다음 명령은 다음줄부터 표출된다.
		// ln: line의 약자
		// print() : 내용 출력 후 줄바꿈 없음.
		// printf() : 형식 지정 출력 방식 (%d(digit) 정수, %f(float) 실수, %c(character) 문자, %n 줄바꿈

		System.out.printf("%d", 1);
		int a = 3;
		System.out.printf("a 출력되나?");

	}

}
