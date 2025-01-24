package _01_print;

public class _02_escapeString {

	public static void main(String[] args) {
		System.out.println("H\t e\t l\t l\t o\t");

		// 1. 백슬래시
		System.out.println("Path: C:\\Windows"); // 백슬래시 출력

		// 2. 큰따옴표
		System.out.println("She said, \"Hello\""); // 큰따옴표 출력

		// 3. 작은따옴표
		System.out.println("It's a sunny day."); // 작은따옴표 출력

		// 4. 새 줄
		System.out.println("Hello\nWorld!"); // 줄바꿈

		// 5. 탭
		System.out.println("Column1\tColumn2"); // 탭

		// 6. 백스페이스
		System.out.println("Hello\bWorld!"); // 이전 문자 삭제

		// 7. 캐리지 리턴
		System.out.print("123\rABC"); // 줄 처음으로 이동하여 ABC 출력

		// 8. 폼 피드
		System.out.println("Page1\fPage2"); // 페이지 넘김 (콘솔에서는 효과 없음)

		// 9. 유니코드
		System.out.println("\u2764"); // 유니코드 문자 출력 (❤)

	}

}
