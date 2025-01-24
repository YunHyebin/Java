package _02_variable;

public class _09_casting {

	public static void main(String[] args) {
		// ---1. 메모리의 공간이 적어 표현할 수 있는 범위를 넘는 경우 값 손실 발생
		int intValue = 103029770;
		byte byteValue = (byte) intValue;

		System.out.println("int Value: " + intValue);
		System.out.println("int -> byte Value: " + byteValue);

		System.out.println("8-bit byte binary bit: " + Integer.toBinaryString(byteValue & 0xFF));

		StringBuilder binaryString = new StringBuilder();
		for (int i = 31; i >= 0; i--) {
			binaryString.append((intValue >> i) & 1);
		}
		System.out.println("32-bit int binary bit: " + binaryString + "\n\n");

		//
		double dNum1 = 1.2; // 더 정밀한 dNum1
		float fNum2 = 0.9F; // 덜 정밀한 fNum2

		int result1 = (int) dNum1 + (int) fNum2;
		System.out.println("결과1: " + result1); // 1

		int result2 = (int) (dNum1 + fNum2); // 2
		// 두 실수형의 자료형이 다르지만 float형이 double형으로 묵시적 형 변환 일어나면서 두 수가 더해져 2.1이 됨
		// but int 형으로 명시적 형변환이 되어 결과 값이 2가 됨
		float result3 = (float) (dNum1 + fNum2); // 2.1
		double result4 = (double) (dNum1 + fNum2); // 2.0999999761581423

		System.out.println("결과2: " + result2);
		System.out.println("결과3: " + result3);
		System.out.println("결과4: " + result4);

		int iMNum = 10;
		byte bMNum = (byte) iMNum;
		System.out.println(bMNum);

		int iMNum2 = 1000;
		byte bMNum2 = (byte) iMNum2;
		System.out.println(bMNum2); // byte의 최대표현범위인 127을 넘어가 자료손실 발생하여 1000이 아닌 대응리터럴 -24로 출력됨

		double dDNum = 3.14;
		int iDNum = (int) dDNum;
		System.out.println(iDNum);

		char chTest = 'A';
		System.out.println((int) chTest);
		int chTest2 = 67;
		System.out.println((char) chTest2);

		float fNum = 1.666f;
		int iNum3 = (int) fNum;
		System.out.printf("(int)%f=%d\n", fNum, iNum3);

	}

}
