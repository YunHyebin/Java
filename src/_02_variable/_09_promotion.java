package _02_variable;

public class _09_promotion {

	public static void main(String[] args) {
		// ---1. 자동형변환---
		// 컴파일러가 생략된 타입을 추가하여 자동적으로 형변환한다.
		float f = 123; // float f = (float)123;

		// ---2. 바이트 크기가 작은 작은 자료형 -> 큰 자료형으로, 덜 정밀한 자료형 -> 더 정밀한 자료형으로 자동 형변환---
		// byte(1바이트) < short, char (2바이트) < int(4바이트) < long(8바이트) < float(4바이트) <
		// double(8바이트)
		byte byteNum = 10;
		short shortNum = byteNum;
		int intNum = shortNum;
		long longNum = intNum;
		float floatNum = longNum;
		double doubleNum = floatNum;
		System.out.println("doubleNum: " + doubleNum + "\n");

		// ---3. 더 큰 크기의 타입으로 변환 시 메모리의 빈 공간을 0으로 채운다.
		System.out.println("8-bit byte binary bit: " + Integer.toBinaryString(byteNum & 0xFF));

		StringBuilder binaryString = new StringBuilder();
		for (int i = 31; i >= 0; i--) {
			binaryString.append((intNum >> i) & 1);
		}
		System.out.println("32-bit int binary bit: " + binaryString + "\n");

		// ---4. 음수 값인 정수형을 더 큰 정수형 타입으로 변환 시 2의 보수법으로 빈 공간을 1로 채운다.
		byteNum = -2;
		intNum = byteNum;
		System.out.println("8-bit byte binary bit: " + Integer.toBinaryString(byteNum & 0xFF));
		binaryString.setLength(0);
		for (int i = 31; i >= 0; i--) {
			binaryString.append((intNum >> i) & 1);
		}
		System.out.println("32-bit int binary bit: " + binaryString + "\n");

		// ---5. 정수형 -> 실수형 변환
		// 정수형을 실수형으로 바꿀 때 정수형 값을 2진수로 변환한 다음 정규화를 거쳐 실수로 저장
		intNum = 7;
		floatNum = intNum;
		System.out.println("int value: " + intNum);
		System.out.println("32-bit int binary bit: " + Integer.toBinaryString(intNum));

		int intBits = Float.floatToIntBits(floatNum);
		int sign = (intBits >> 31) & 1; // 부호 비트 추출(1bit)
		int exponent = (intBits >> 23) & 0xFF; // 지수 추출 (8bit)
		int mantissa = intBits & 0x7FFFFF; // 가수 추출 (23bit)

		System.out.println("float value: " + floatNum);
		System.out.println("float value bit: " + sign + Integer.toBinaryString(exponent)
				+ Integer.toBinaryString(mantissa) + "\n");

		// int 타입은 10진수로 최대 10자리 정밀도.
		// float 타입은 10진수로 최대 약 7자리 정밀도
		// double 타입은 10진수로 최대 15자리 정밀도를 갖는다.
		// 정밀도는 int > float이라서 10진수로 8자리 이상의 값을 실수형으로 변환할 땐 double 형으로 변환해야 오차x
		intNum = 91234567;
		System.out.println("intNum: " + intNum);

		floatNum = intNum;
		int iNum1 = (int) floatNum;

		System.out.printf("floatNum: %f ||| float -> int: %d\n", floatNum, iNum1);

		doubleNum = intNum;
		int iNum2 = (int) doubleNum;
		System.out.printf("doubleNum: %f ||| double -> int: %d\n\n", doubleNum, iNum2);

		// ---6. 서로 다른 타입의 연산에서 표현범위가 더 넓은 타입으로 형변환하여 타입 일치시킨 후 연산 수행
		intNum = 3;
		double result = 1.0 + intNum; //// int형 intNum변수를 double 타입으로 변환 후 연산
		System.out.println("result: " + result + "\n");

		// ---7. char 타입의 변환
		// 유니코드와 아스키코드 표현을 위한 정수형 타입이라 음수 표현x
		// 따라서 음수를 포함한 byte 타입 -> char 타입 변환x
		// char charValue = byteValue;

		// int 타입으로 자동 변환 시 유니코드 값이 int 타입에 대입된다.
		char charValue = 'A';
		intNum = charValue;
		System.out.println("charValue: " + charValue);
		System.out.println("charValue -> intValue: " + intNum);

		// ---8. 문자열 <-> 기본타입
		String str = "10";
		byte byteValue = Byte.parseByte(str); // String -> byte
		str = "200";
		short shortValue = Short.parseShort(str); // String -> short
		str = "300000";
		int intValue = Integer.parseInt(str); // String -> int
		str = "40000000000";
		long longValue = Long.parseLong(str); // String -> long
		str = "12.345";
		float floatValue = Float.parseFloat(str); // String -> float
		double doubleValue = Double.parseDouble(str); // String -> double
		str = "true";
		boolean booleanValue = Boolean.parseBoolean(str); // String -> boolean

		str = String.valueOf(intValue);
		System.out.println("int -> String : " + str);
		str = String.valueOf(longValue);
		System.out.println("long -> String : " + str);
		str = String.valueOf(booleanValue);
		System.out.println("boolean -> String : " + str);

	}

}
