package _03_operators._01_unary;

public class _02_IncreseDecrese {

	public static void main(String[] args) {
		
		int a = 10, pre, post;
		
		//전위형
		pre = ++a; //a값 증가 후 pre에 저장
		System.out.printf("pre = ++a 실행 후, a: [%d], pre: [%d]\n", a, pre);
		
		a = 10;
		//후위형
		post = a++; //post에 a값 저장 후 a값 증가
		System.out.printf("post = a++ 실행 후, a: [%d], post: [%d]\n", a, post);
		System.out.println("----------------------------");
		
		//전위 증감 연산자
		int prefix  = 10;
		System.out.println(++prefix); //출력: 11, 값: 11
		System.out.println(--prefix); //출력: 10, 값: 10
		System.out.println("----------------------------");
		
		//후위 증감 연산자
		int postfix = 10;
		System.out.println(postfix++); //출력: 10, 값: 11
		System.out.println(postfix--); //출력: 11, 값: 10
		System.out.println("----------------------------");
		
		int num = 10;
		System.out.println(++num); //출력: 11, 값: 11
		System.out.println(num--); //출력: 11, 값: 10
		System.out.println(num++); //출력: 10, 값: 11
		System.out.println(num); //출력: 11, 값: 11
		
	}

}
