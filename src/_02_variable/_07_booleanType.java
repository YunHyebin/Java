package _02_variable;

public class _07_booleanType {

	public static void main(String[] args) {
		// 1. boolean타입 변수 선언 및 초기화
		int x = 10;
		boolean result = (x == 20);
		System.out.println(result);
		result = (x != 20);
		System.out.println(result);
		result = (x > 20);
		System.out.println(result);
		result = (0 < x && x < 20);
		System.out.println(result);
		result = (x < 0 || x > 200);
		System.out.println(result);

		// 2. 중지 시작 예시
		boolean stop = true;
		if (stop) {
			System.out.println("중지합니다");
		} else {
			System.out.println("시작합니다.");
		}

		// 3. 아이디 validation 체크 예시
		String id = "abcdef";
		boolean idValidation = false;
		if (id.length() >= 5 && id.length() < 2) {
			idValidation = true;
		}
		if (idValidation) {
			System.out.println("사용할 수 있는 아이디입니다.");
		} else {
			System.out.println("아이디는 5자 이상이어야 합니다.");
		}

		// 4. DB 커넥션 퓰 최대 연결 갯수 지정 예시
		final int MAX_CONNECTION = 20;
		final int MAX_VALUE;
		// 상수는 선언만 하고 나중에 값을 저장(초기화)해도 된다.

		MAX_VALUE = 10;
		// 한번 지정된 상수의 값은 변경할 수 없다.

		int userCnt = 0;
		while (true) {
			userCnt++;
			System.out.println("현재 사용자 수: " + userCnt);
			if (userCnt > MAX_CONNECTION) {
				System.out.println("DB 연결이 모두 사용중입니다.");
				System.out.println("DB 연결 대기");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
