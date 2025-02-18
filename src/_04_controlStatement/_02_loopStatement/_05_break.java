package _04_controlStatement._02_loopStatement;

import java.util.Scanner;

public class _05_break {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bank bank = new Bank();
		long money;
		
		boolean power = true;
		
		while(power) {
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			
			System.out.print("선택> ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1: //예금
				System.out.print("예금액> ");
				money = sc.nextLong();
				bank.deposit(money);
				money = 0;
				break;
			case 2: //출금
				System.out.print("출금액> ");
				money = sc.nextLong();
				bank.withdraw(money);
				money = 0;
				break;
			case 3: //잔고 조회
				bank.getAccount();
				break;
			case 4:
				System.out.println("프로그램 종료");
				power = false;
				break;
			}
		}
		
	}
	
	public static class Bank {
		private long account;
		
		public long getAccount() {
			System.out.println("현재 잔액: " + this.account);
			return this.account;
		}
		
		//예금 메소드
		public void deposit(long money) {
			this.account += money;
			getAccount();
		}
		
		//출금 메소드
		public void withdraw(long money) {
			if(this.account - money < 0) {
				System.out.println("잔액 부족. 출금 실패");
			}else {
				this.account-= money;				
			}
			getAccount();
		}
	}

}
