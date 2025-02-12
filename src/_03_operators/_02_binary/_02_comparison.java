package _03_operators._02_binary;

public class _02_comparison {

	public static void main(String[] args) {
		int a = 5, b = 10;
		boolean result;
		
		System.out.printf("a = [%d]   b = [%d]\n", a, b);
		
		// a > b : a가 크면 true, 아니면 false
		result = a > b;
		System.out.println("a > b : " + result);
		System.out.println("'A' > 'B' : " + ('A' > 'B'));
		
		// a < b : a가 작으면 true, 아니면 false
		result = a < b;
		System.out.println("a < b : " + result);
		
		// a >= b : a가 b보다 크거나 같으면 true, 아니면 false
		result = a >= b;
		System.out.println("a >= b : " + result);
		
		// a <= b : a가 b보다 작거나 같으면 true, 아니면 false
		result = a <= b;
		System.out.println("a <= b : " + result);
	}

}
