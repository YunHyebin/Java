package _02_variable;

public class _04_longType {
	public static void main(String[] args) {
		// 1. long 타입 변수 선언 및 초기화
		long num1 = 10;
		long num2 = 20000000;

		// 2. int 범위를 넘어가는 리터럴값은 항상 L 또는 소문자l을 붙여줘야 한다.
		// long num3 = 10000000000;
		// -> The literal 10000000000 of type int is out of range;
		long num3 = 10000000000L;
		long num4 = 20L;

		System.out.println(num3);
		System.out.println(num4);

	}

}
