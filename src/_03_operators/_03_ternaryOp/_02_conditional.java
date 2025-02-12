package _03_operators._03_ternaryOp;

public class _02_conditional {

	public static void main(String[] args) {
        int a = 10, b = 20;

        // 1. 변수에 저장하지 않고 출력문에서 직접 사용
        System.out.println(a > b ? "a가 b보다 크다" : "a가 b보다 작거나 같다");

        // 2. 변수에 저장 후 출력
        boolean isLoggedIn = true;  // 로그인 상태
        String userMessage = isLoggedIn ? "환영합니다!" : "로그인 해주세요.";
        System.out.println(userMessage);  // 로그인 여부에 따라 다른 메시지 출력
        
        int age = 25;
        System.out.println(age >= 18 ? "성인입니다." : "미성년자입니다.");

        // 3. 조건 연산자 중첩 사용
        int num = -5;
        String type = (num > 0) ? "양수" : (num < 0) ? "음수" : "0";
        System.out.println("num의 값은 " + type + "입니다.");
        
        int score = 85;  // 점수
        // 중첩된 조건을 통해 등급을 결정
        String grade = (score >= 90) ? "A"
                     : (score >= 80) ? "B"
                     : (score >= 70) ? "C"
                     : (score >= 60) ? "D"
                     : "F";
        System.out.println("등급: " + grade);
        
        int httpStatusCode = 404;  // HTTP 상태 코드
        String statusMessage = (httpStatusCode == 200) ? "OK"
                           : (httpStatusCode == 404) ? "Page Not Found"
                           : (httpStatusCode == 500) ? "Internal Server Error"
                           : "Unknown Error";
        System.out.println("HTTP Status: " + statusMessage);
	}

}
