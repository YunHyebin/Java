package _02_variable;

public class _06_charType {

	public static void main(String[] args) {
		// 1. char 타입 변수 선언 및 초기화
		// char는 ''작은 따옴표로 감싼 한개의 문자로 초기화한다.
		char ch1 = 'A';
		char ch2 = 65;
		char ch3 = '\u0041';
		char ch4 = '가';
		char ch5 = 44032;
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(ch4);
		System.out.println(ch5);

		// 2. 문자를 unicode 10진수로 변환
		char ch6 = '자';
		// 해당 char 타입의 변수를 int 변수에 저장하면 10진수 unicode 값을 추출
		int uniCode = ch6;
		System.out.println(ch6);
		System.out.println((int) ch6);

		// 3. 빈칸을 사용할 땐 spacebar 값을 추가한다.
		// char ch7 = '';
		// 빈칸을 변수의 값 리터럴로 저장하면 에러
		// -> Invalid character constant
		char ch7 = ' ';
		System.out.println(ch7);
		System.out.println((int) ch7);

	}

}
