package _02_variable;

public class _02_byteType {

	public static void main(String[] args) {
		// 1. byte 타입 변수 선언 및 초기화
		byte num1 = -128;
		byte num2 = 127;

		// 2. byte 타입 범위: -128~127
		// byte num3 = 129;
		// -> Type mismatch: cannot convert from int to byte 컴파일 에러

		// 3. byte 타입 범위의 최솟값보다 작아질 경우 127부터 다시 시작
		System.out.println("변경 전 num1: " + num1);
		System.out.println("변경 후 num1: " + --num1);

		// 4. byte 타입 범위의 최댓값보다 커질 경우 -128부터 다시 시작
		System.out.println("\n변경 전 num2: " + num2);
		System.out.println("변경 후 num2: " + ++num2);

	}

}
