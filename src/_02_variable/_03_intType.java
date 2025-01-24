package _02_variable;

public class _03_intType {

	public static void main(String[] args) {
		// 2진수: 0b 또는 0B로 시작. 0과 1로 작성
		int binary = 0b1011;
		System.out.println("0b1011 : 1x2^3 + 0x2^2 + 1x2^1 + 1x2^0");
		System.out.println("2진수 0b1011 -> 10진수: " + binary);

		// 8진수: 0으로 시작. 0~7로 작성
		int octal = 0206;
		System.out.println("\n0206 : 2x8^2 + 0x8^1 + 6x8^0");
		System.out.println("8진수 206 -> 10진수: " + octal);

		// 10진수: 소숫점이 없는 0~9로 작성
		int decimal = 365;
		System.out.println("\n10진수 365: " + decimal);

		// 16진수: 0x 또는 0X로 시작. 0~9 또는 A,B,C.. 또는 a,b,c...로 작성
		int hexadecimal = 0x2A0F;
		System.out.println("\n0x2A0F : 2x16*3 + 10x16^2 + 0x16^1 + 15x16^0");
		System.out.println("16진수 0x2A0F -> 10진수: " + hexadecimal);

	}

}
