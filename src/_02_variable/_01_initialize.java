package _02_variable;

public class _01_initialize {

	public static void main(String[] args) {
		// 1. 변수 선언
		int num1;
		int num2;
		int num3, num4; // 같은 자료형은 여러개 선언 가능

		// 2. 변수 초기화(값 할당)
		num1 = 10;
		num2 = 20;
		// num3, num4 = 30; 변수 여러개 동시에 초기화 불가능

		// 3. 변수 선언과 동시에 값 초기화
		int num5 = 30;
		int num6, num7, num8 = 40; // 여러 변수 선언O, num8만 초기화

		// 4. 초기화되지 않은 변수 사용 불가능
		// System.out.println(num6);
		// -> The local variable num6 may not have been initialized

		// 5. 초기화된 변수 사용
		int sum = num1 + num2; // result변수도 연산하면서 바로 초기화
		System.out.println("num1 + num2 = " + sum);

		// 6. 값 변경
		System.out.println("num5: " + num5);
		num5 = 1000;
		System.out.println("changed num5: " + num5);

		// 7. 자료형 다른 경우 에러
		// num6 =100F;
		// -> Type mismatch: cannot convert from float to int

	}

}
