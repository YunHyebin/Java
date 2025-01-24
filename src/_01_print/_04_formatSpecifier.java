package _01_print;

public class _04_formatSpecifier {

	public static void main(String[] args) {
		// ---1. %b : boolean 형식 출력---
		boolean b1 = true;
		int b2 = 1;
		int b3 = 0;
		boolean b4 = false;
		System.out.printf("b1: %b%n", b1);
		System.out.printf("b2: %b%n", b2);
		System.out.printf("b3: %b%n", b3);
		System.out.printf("b4: %b%n", b4);

		// ---2. %d : 10진수 형식 출력---
		byte varByte = 1;
		int varShort = 2;
		char varChar = 'a';
		System.out.printf("varByte: %d%n", varByte);
		System.out.printf("varShot: %d%n", varShort);
		System.out.printf("varChar: %c, %d %n", varChar, (int) varChar);

		int number = 123;
		long big = 100_000_000_000L;
		System.out.printf("number: [%5d]%n", number); // 출력 폭 5칸 지정 & 10진 형식 지정 & 기본 오른쪽 정렬
		System.out.printf("number: [%-5d]%n", number); // -d는 값이 왼쪽으로 정렬됨
		System.out.printf("number: [%05d]%n", number); // 빈 칸을 0으로 채움
		System.out.printf("big: %d%n", big);

		// ---3. %o : 8진수 형식 출력---
		int oct = 010; // 10진수로는 8
		System.out.printf("oct: %#o, %d %n", oct, (int) oct); // #은 접두사.
		System.out.printf("oct: %o, %d %n", oct, (int) oct);

		// ---4. %x : 16진수 형식 출력---
		long hex1 = 0xFFFF_FFFF_FFFF_FFFFL;
		int hex2 = 0x10; // 10진수로는 10
		System.out.printf("hex1: %#x, %d %n", hex1, (int) hex1);
		System.out.printf("hex1: %x, %d %n", hex1, (int) hex1);
		System.out.printf("hex2: %#x, %d %n", hex2, (int) hex2);
		System.out.printf("hex2: %x, %d %n", hex2, (int) hex2);

		// ---5. %s : 문자character로 출력---
		int varBin = 0b10; // b: 2진수를 나타냄. 10진수로는 2
		System.out.printf("varBin: %s, %d %n", Integer.toBinaryString(varBin), varBin); // 10진수를 2진수로 출력하는 지시자는 없다.

		// ---6. %e : 부동소수점 형식 출력
		String url = "www.naver.com";
		float f1 = .10f; // 0.10, 1.0e-1
		float f2 = 1e1f; // 10.0, 1.0e1
		float f3 = 3.14e3f;
		double d = 1.23456789;

		System.out.printf("f1: %f, %e, %g %n", f1, f1, f1);
		System.out.printf("f2: %f, %e, %g %n", f2, f2, f2);
		System.out.printf("f3: %f, %e, %g %n", f3, f3, f3);

		System.out.printf("d: %f %n", d); // 마지막 자리 반올림됨.
		System.out.printf("d: %14.10f%n", d); // 출력폭 15칸 지정 & 소수점 아래10자리 &빈칸 0으로

		System.out.printf("[%s]%n", url);
		System.out.printf("[%20s]%n", url); // 출력 폭 20칸 지정
		System.out.printf("[%-20s]%n", url); // 왼쪽 정렬
		System.out.printf("[%.8s]%n", url); // 왼쪽에서 8글자만 출력
	}

}
