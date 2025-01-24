package _02_variable;

public class _05_floatAndDoubleType {

	public static void main(String[] args) {
		// double 타입이 float 타입보다 더 큰 실수를 저장하고, 정밀도 또한 더 높다

		// 1. float 타입 변수 선언 및 초기화
		// 컴파일러가 실수 리터럴을 기본으로 double 타입으로 해석한다.
		// 따라서 float타입에 대입하고 싶다면 리터럴 뒤에 f, F를 붙여 float타입을 알 수 있도록 한다.
		float fNum1 = 3.14f;
		float fNum2 = 5.245F;
		System.out.println("fNum1: " + fNum1);
		System.out.println("fNum2: " + fNum2);

		// 2. double 타입 변수 선언 및 초기화
		double dNum1 = 89.1234;
		double dNum2 = 11.984;
		System.out.println("dNum1: " + dNum1);
		System.out.println("dNum2: " + dNum2);

		// 3. double 타입이 float 타입보다 더 큰 실수를 저장하고, 정밀도 또한 더 높다
		// flaot result = fNum1 * fNum2;
		// -> flaot cannot be resolved to a type
		double result = fNum1 * fNum2;
		System.out.println("result: " + result);

		// 4. e, E가 포함된 10의 거듭제곱 리터럴
		double x = 5e2; // 5.0 x 10^2 = 500.0
		double y = 0.12E-2; // 0.12 x 10^-2 = 0.0012
		System.out.println("x: " + x);
		System.out.println("y: " + y);
	}

}
