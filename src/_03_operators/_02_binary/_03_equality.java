package _03_operators._02_binary;

public class _03_equality {

	public static void main(String[] args) {
		//1. 'A'가 int타입으로 변환되어 65와 비교
		System.out.printf("a == 65 \t %b\n", 'A' == 65);
		
		System.out.printf("'A' + 1 == 'B' \t %b\n", 'A' + 1 == 'B');
		
		//2. int형 3을 double타입인 3.0으로 변환되어 3.0과 비교
		System.out.printf("3 == 3.0 \t %b\n", 3 == 3.0);
		
		//3. 부동 소수점 방식을 사용하는 실수타입은 0.1을 정확히 표현할 수 없고, 
		//float과 double 타입의 정밀도 차이로 false가 나온다.
		System.out.printf("0.1f == 0.1 \t %b\n", 0.1f == 0.1);
		
		//4. 참조형은 객체 주소값을 저장하기 때문에 같은 객체를 참조하고 있는지 비교한다.
		System.out.printf("abc == abc \t %b\n", "abc" == "abc");
		System.out.printf("abc == def \t %b\n", "abc" == "def");
		
		String str1 = "abc";
		String str2 = str1;
		String str3 = new String("abc");
		
		System.out.println("str1 = \"abc\" \t str2 = str1 \t st3 = new String(\"abc\")");
		System.out.printf("str1 == str2 \t %b\n", str1 == str2);
		System.out.printf("str2 == str3 \t %b\n", str2 == str3);
		
		//참조형 타입 문자열 비교할 때 객체의 값을 비교하는 메소드
		//.equals() : 대소문자까지 정확하게 비교
		System.out.printf("hello.equals(Hello) \t %b\n", "hello".equals("Hello")); //false
		
		//.equalsIgnoreCase() : 대소문자 무시하고 비교
		System.out.printf("hello.equalsIgnoreCase(Hello) \t %b\n", "hello".equalsIgnoreCase("Hello")); //true
		
		//.compareTo() : 사전 순 정렬 비교
		//0 : 같은 문자열
		//음수: 앞의 문자열이 사전순으로 더 앞
		//양수: 뒤의 문자열이 사전순으로 더 앞
		System.out.printf("apple.compareTo(\"apple\") \t %d\n", "apple".compareTo("apple")); //0
		System.out.printf("apple.compareTo(\"orange\") \t %d\n", "apple".compareTo("orange")); //-14
		System.out.printf("orange.compareTo(\"apple\") \t %d\n", "orange".compareTo("apple")); //14
		
		String sentence = "Java Programming";
		
		//.startsWith() : 특정 문자열로 시작하는지 확인
		System.out.println(sentence.startsWith("Java")); //true
		System.out.println(sentence.startsWith("Pro")); //false
		
		//.endWith() : 특정 문자열로 끝나는지 확인
		System.out.println(sentence.endsWith("Jaava")); //false
		System.out.println(sentence.endsWith("ing")); //true
		
		//.contains() : 특정 문자열 포함 여부
		System.out.println(sentence.contains("Java")); //true
		System.out.println(sentence.contains("code")); //false
		
		//matches() : 정규식을 이용한 문자열 비교
		String sentence2 = "Java2";
		System.out.println(sentence2.matches("Java[0-9]+")); //true (Java 뒤에 숫자)
		System.out.println(sentence2.matches("Java[A-Z]+")); //false (Java 뒤에 대문자)
	}

}
