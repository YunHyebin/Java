package _03_operators._03_ternaryOp;

public class _01_assignment {
	public static void main(String[] args) {
		int a = 10, b = 5;
		
		System.out.println("---------------<<산술 복합 대입 연산자>>---------------");

        System.out.println("초기 값: a = " + a + ", b = " + b);

        // = 대입 연산
        a = b;
        System.out.println("a = b \t-> a: " + a); // a = 5

        // += 덧셈 후 대입
        a += 3; // a = a + 3
        System.out.println("a += 3 \t-> a: " + a); // a = 8

        // -= 뺄셈 후 대입
        a -= 2; // a = a - 2
        System.out.println("a -= 2 \t-> a: " + a); // a = 6

        // *= 곱셈 후 대입
        a *= 4; // a = a * 4
        System.out.println("a *= 4 \t-> a: " + a); // a = 24

        // /= 나눗셈 후 대입
        a /= 6; // a = a / 6
        System.out.println("a /= 6 \t-> a: " + a); // a = 4

        // %= 나머지 연산 후 대입
        a %= 3; // a = a % 3
        System.out.println("a %= 3 \t-> a: " + a); // a = 1
        
		System.out.println("---------------<<비트 복합 대입 연산자>>---------------");
        // 비트 연산자 대입
        a = 5; // 5 = 0b0101
        b = 3; // 3 = 0b0011

        a &= b; // a = a & b
        System.out.println("a &= b \t-> a: " + a); // a = 1 (0b0001)

        a |= b; // a = a | b
        System.out.println("a |= b \t-> a: " + a); // a = 3 (0b0011)

        a ^= b; // a = a ^ b
        System.out.println("a ^= b \t-> a: " + a); // a = 0 (0b0000)

        
		System.out.println("---------------<<시프트 복합 대입 연산자>>---------------");

        // 시프트 연산자 대입
        a = 8; // 8 = 0b1000
        a <<= 2; // a = a << 2
        System.out.println("a <<= 2 \t-> a: " + a); // a = 32 (0b100000)

        a >>= 3; // a = a >> 3
        System.out.println("a >>= 3 \t-> a: " + a); // a = 4 (0b0100)

        a >>>= 1; // a = a >>> 1 (부호 비트 고려 안 함)
        System.out.println("a >>>= 1 \t-> a: " + a); // a = 2 (0b0010)
	}
}
