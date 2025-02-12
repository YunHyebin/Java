package _03_operators._02_binary;

public class _05_bitwise {

    public static void main(String[] args) {
        int num1 = 45, num2 = 25;
        int result; // 비트 연산 결과 저장

        // 10진수를 2진수 8bit로 변환하여 출력하는 함수
        String bin1 = toBinaryString(num1);
        String bin2 = toBinaryString(num2);

        System.out.println("=========[ 10진수를 2진수(8bit)로 변환 ]=========");
        System.out.printf("10진수 %2d → 2진수: %s\n", num1, bin1);
        System.out.printf("10진수 %2d → 2진수: %s\n", num2, bin2);
        // 1. AND 연산 (&)
        result = num1 & num2;
        printBitwiseOperation(num1, num2, result, "&");

        // 2. OR 연산 (|)
        result = num1 | num2;
        printBitwiseOperation(num1, num2, result, "|");

        // 3. XOR 연산 (^)
        result = num1 ^ num2;
        printBitwiseOperation(num1, num2, result, "^");

        // 4. NOT 연산 (~)
        result = ~num1;
        printNotOperation(num1, result);

        // 1의 보수법 확인
        System.out.println("\n=========[ 1의 보수 검증 ]=========");
        System.out.printf("%d + ~%d + 1 = %d\n", num1, num1, (num1 + ~num1 + 1));
    }

    // 10진수를 8비트 2진수 문자열로 변환하는 함수
    private static String toBinaryString(int num) {
        return String.format("%8s", Integer.toBinaryString(num & 0xFF)).replace(' ', '0');
    }

    // 비트 연산 결과를 출력하는 함수
    private static void printBitwiseOperation(int num1, int num2, int result, String operator) {
        String bin1 = toBinaryString(num1);
        String bin2 = toBinaryString(num2);
        String binResult = toBinaryString(result);

        System.out.printf("=========[ %s 연산 결과 ]=========\n", operator);
        System.out.printf("10진수: %2d %s %2d = %d\n", num1, operator, num2, result);
        System.out.println(" " + bin1);
        System.out.println(operator + bin2);
        System.out.println("--------------------");
        System.out.println(" " + binResult + "\n");
    }

    // NOT 연산 결과를 출력하는 함수
    private static void printNotOperation(int num, int result) {
        String binNum = toBinaryString(num);
        String binResult = toBinaryString(result);

        System.out.println("=========[ %s 연산 결과 ]=========");
        System.out.printf("10진수: ~%d = %d\n", num, result);
        System.out.println("~" + binNum);
        System.out.println("--------------------");
        System.out.println(" " + binResult + "\n");
    }
}
