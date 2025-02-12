package _03_operators._02_binary;

public class _01_arithmetic {

	public static void main(String[] args) {
		System.out.println("-------<<산술 연산자 종류>>-------");
		int a = 30;
		int b = 7;
		float c = 7;

		// 1. 덧셈
		System.out.printf("%d + %d = %d\n", a, b, a + b);

		// 2. 뺄셈
		System.out.printf("%d - %d = %d\n", a, b, a - b);

		// 3. 곱셈
		System.out.printf("%d * %d = %d\n", a, b, a * b);

		// 4. 나눗셈
		System.out.printf("%d / %d = %d\n", a, b, a / b); // int타입 / int타입 -> 소수점 이하 버려짐.

		// 5. 나머지 산출
		System.out.printf("%d %% %d = %d\n", a, b, a % b);

		
		// 6. 피연산자 정수(byte,short,char,int) -> 연산 결과 int 타입
		System.out.println("\n-------<<피연산자가 정수형(byte, short, char, int) -> 연산결과 int 타입>>-------");
		byte bNum1 = 10;
		byte bNum2 = 4;
		System.out.printf("byte 타입 %d + byte 타입 %d = %d (Type: %s)\n"
				, bNum1, bNum2, bNum1+bNum2, ((Object) (bNum1+bNum2)).getClass().getSimpleName());
		
		int iNum1 = 10;
		int iNum2 = 4;
		System.out.printf("int타입 %d / int타입 %d = %d (Type: %s)\n"
				, iNum1, iNum2, iNum1/iNum2, ((Object) (iNum1/iNum2)).getClass().getSimpleName());

		
		// 7. 피연산자 중 실수(float, double) -> 연산 결과 실수 타입
		System.out.println("\n-------<<피연산자가 실수형(float, double) -> 연산결과 실수 타입>>-------");
		float fNum = (float) iNum2;
		System.out.printf("int타입 %d / float타입 %.1f = %.1f (Type: %s)\n"
				, iNum1, fNum , iNum1/fNum, ((Object) (iNum1/fNum)).getClass().getSimpleName());
		
		
		//8. Overflow
		System.out.println("\n-------<<Overflow>>-------");
		//byte 범위: -128 ~ 127
		byte var1 = 125;
		for(int i=0; i<4; i++) {
			var1++;
			System.out.println("var1: " + var1);
		}
		
		//9. Underflow
		System.out.println("\n-------<<Underflow>>-------");
		byte var2 = -126;
		for(int i=0; i<4; i++) {
			var2--;
			System.out.println("var2:" + var2);
		}
		
		//10. Overflow, Underflow를 피하기 위해 큰 범위 또는 long 타입으로 연산 수행하기.
		System.out.println("\n-------<<long타입으로 연산 비교>>-------");
		int num1 = 1000000;
		int num2 = 1000000;
		int result1 = num1 * num2;
		long result2 = (long)num1 * num2;
		System.out.printf("int타입 %d * %d = %d\n", num1, num2, result1);
		System.out.printf("long타입 %d * %d = %d\n", num1, num2, result2);
		
		//11. NaN
		//NaN, Infinity는 부동소수점(double, float) 산술 연산 시 좌측 피연산자가 0.0일 때 발생
		System.out.println("\n-------<<NaN>>-------");
		double nan1 = 0.0 / 0.0; //0.0 으로 나누기
		double nan2 = Math.sqrt(-1); //음수의 제곱근
		double nan3 = Math.log(-1); //음수의 로그
		
		System.out.println("0.0 / 0.0 = " + nan1);
		System.out.println("Math.sqrt(-1) = " + nan2);
		System.out.println("Math.log(-1) = " + nan3);
		System.out.println("nan 체크: " + Double.isNaN(nan1));
		
		//12. Infinity
		System.out.println("\n-------<<Infinity>>-------");
		double posInf = 1 / 0.0; //양수를 0.0으로 나눌 때
		double negInf = -1 / 0.0; //음수를 0.0으로 나눌 때
		double overflow = Double.MAX_VALUE * 2; //최대값을 넘어서 연산할 때
		
		System.out.println("1 / 0.0 = " + posInf);
		System.out.println("-1 / 0.0 = " + negInf);
		System.out.println("Double.MAX_VALUE * 2 = " + overflow);
		System.out.println("infiniity 체크: " + Double.isInfinite(posInf));
				
		//13. ArithmeticException
		int x = 10, y = 0;
		//System.out.println(x / y);
		//-> Exception in thread "main" java.lang.ArithmeticException: / by zero
		
		
		
		
	}

}
