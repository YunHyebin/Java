package _03_operators._02_binary;

import java.util.*;

public class _04_logical {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//-------------------------<<1. AND 결합 (&&)>>-------------------------
		System.out.print("문자 하나 입력>> ");
		char charCode = sc.next().charAt(0);
		
        if (charCode >= 65 && charCode <= 90) { // 'A' ~ 'Z' 범위
            System.out.printf("입력한 %c는 대문자입니다.\n", charCode);
        } else if (charCode >= 97 && charCode <= 122) { // 'a' ~ 'z' 범위
            System.out.printf("입력한 %c는 소문자입니다.\n", charCode);
        } else {
            System.out.printf("입력한 %c는 알파벳이 아닙니다.\n", charCode);
        }
        
     // -------------------------<< 2. 논리 연산자 비교 (&& vs &) >>-------------------------
        boolean circuit = false;

        //&& 연산: 왼쪽 피연산자가 false이면 오른쪽 피연산자 평가x
        System.out.println("--&&연산 수행--");
        if( circuit && getB()) { //circuit이 false이면 getB()는 호출(평가) x
        	System.out.println("결과 true");
        }else {
        	System.out.println("결과 false");
        }
        
        //& 연산: 항상 두 피연산자 평가.
        System.out.println("--&연산 수행--");
        if( circuit & getB()) { //circuit이 false여도 getB() 호출됨
        	System.out.println("결과 true");
        }else {
        	System.out.println("결과 false");
        }
        
        System.out.println("-------------------------");
        
		//---------------------------------<<3. OR 결합 (||)>>---------------------------------
		//피연산자 중 하나라도 true이면 true 반환
        System.out.print("숫자 하나 입력>> ");
		int value = sc.nextInt();
		
        if ((value % 2 == 0) || (value % 3 == 0)) {
            System.out.println("2 또는 3의 배수입니다.");
        } else {
            System.out.println("2 또는 3의 배수가 아닙니다.");
        }
		
		System.out.println("-------------------------");
		
		//---------------------------------<<4. NOT 결합 (!)>>---------------------------------
		//피연산자가 true이면 false 반환, false이면 true 반환
		boolean isOn = false;
		
		if(!isOn) { //꺼졌을 때 (false)
			isOn = !isOn; //false -> true (켜짐)
			System.out.println("켜졌습니다");
		}
		
		if(isOn) { //켜졌을 때 (true)
			isOn = !isOn; //true -> false (꺼짐)
			System.out.println("꺼졌습니다");
		}
		
		System.out.println("-------------------------");
		
		//---------------------------------<<5. XOR 결합 (^)>>---------------------------------
		//하나는 true이고 다른 하나가 false일 때만 true반환
		boolean x = true, y = false;
        System.out.println("true ^ false: " + (x ^ y)); // true
        System.out.println("true ^ true: " + (x ^ x)); // false
        System.out.println("false ^ true: " + (y ^ x)); // true
        System.out.println("false ^ false: " + (y ^ y)); // false
		
		
	}
	
    public static boolean getB() {
    	System.out.println("getB() 호출!");
    	return true;
    }

}
