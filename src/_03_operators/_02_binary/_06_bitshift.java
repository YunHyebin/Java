package _03_operators._02_binary;

public class _06_bitshift {

    public static void main(String[] args) {
        // 1. << 좌시프트
        printOperation(5, "<<", 3);
        printOperation(-5, "<<", 3);

        // 2. >> 우시프트 연산 (부호 유지)
        printOperation(-5, ">>", 3);

        // 3. >>> 우시프트 연산 (부호 무시)
        printOperation(-5, ">>>", 3);
    }

    // 10진수 정수를 8bit 2진수 문자열로 변환하는 함수
    private static String toBinaryString(int num) {
        return String.format("%8s", Integer.toBinaryString(num & 0xFF)).replace(' ', '0');
    }

    // 비트 이동 연산 결과 출력 함수
    private static void printOperation(int num1, String op, int num2) {
        int result = switch (op) {
            case "<<" -> num1 << num2;   // 왼쪽 시프트
            case ">>" -> num1 >> num2;   // 오른쪽 시프트 (부호 유지)
            case ">>>" -> num1 >>> num2; // 오른쪽 시프트 (부호 무시)
            default -> throw new IllegalArgumentException("지원하지 않는 연산자: " + op);
        };

        String binNum = toBinaryString(num1);
        String binResult = toBinaryString(result);

        System.out.printf("==========[ %s 연산 결과 ]========\n", op);
        System.out.printf("%d %s %d = %d\n", num1, op, num2, result);
        System.out.println("연산 전 2진수(8bit): " + binNum);
        System.out.println("연산 후 2진수(8bit): " + binResult + "\n");
    }
}
