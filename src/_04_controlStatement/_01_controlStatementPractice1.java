package _04_controlStatement;

import java.util.Scanner;

public class _01_controlStatementPractice1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("실행할 기능을 선택하세요:");
		System.out.println("1: 나이 제한 확인 (if문)");
		System.out.println("2: 로그인 (if-else문)");
		System.out.println("3: 회원 등급 확인 (if-else if문)");
		System.out.println("4: 비밀번호 변경 (중첩 if문)");
		System.out.println("5: 회원 상태 조회 (switch-case문)");

		int choice = scanner.nextInt();
		scanner.nextLine(); // 개행 문자 처리

		switch (choice) {
		case 1:
			System.out.print("나이를 입력하세요: ");
			int age = scanner.nextInt();
			checkAgeRestriction(age);
			break;
		case 2:
			System.out.print("아이디 입력: ");
			String username = scanner.nextLine();
			System.out.print("비밀번호 입력: ");
			String password = scanner.nextLine();
			login(username, password);
			break;
		case 3:
			System.out.print("회원 포인트를 입력하세요: ");
			int points = scanner.nextInt();
			checkUserLevel(points);
			break;
		case 4:
			System.out.print("아이디 입력: ");
			String userId = scanner.nextLine();
			System.out.print("현재 비밀번호 입력: ");
			String oldPassword = scanner.nextLine();
			System.out.print("새 비밀번호 입력: ");
			String newPassword = scanner.nextLine();
			changePassword(userId, oldPassword, newPassword);
			break;
		case 5:
			System.out.print("회원 상태를 조회할 아이디를 입력하세요: ");
			String userStatusId = scanner.nextLine();
			checkUserStatus(userStatusId);
			break;
		default:
			System.out.println("올바른 번호를 입력하세요.");
		}

		scanner.close();

	}

	// if문 : 나이 제한 확인 (18세 이상 가입)
	private static void checkAgeRestriction(int age) {
		if (age >= 18) {
			System.out.println("회원 가입이 가능합니다.");
		}
	}

	// if-else문 : 로그인 기능
	private static void login(String username, String pwd) {
		String storedUsername = "user123";
		String storedPassword = "pass123";

		if (username.equals(storedUsername) && pwd.equals(storedPassword)) {
			System.out.println("로그인 성공!");
		} else {
			System.out.println("로그인 실패: 아이디 또는 비밀번호가 틀렸습니다.");
		}
	}

	// if-else if문: 주문 가능 여부 확인
	private static void checkUserLevel(int points) {
		if (points < 1000) {
			System.out.println("회원 등급: 일반 회원");
		} else if (points < 5000) {
			System.out.println("회원 등급: VIP 회원");
		} else {
			System.out.println("회원 등급: 관리자");
		}
	}

	// 중첩 if문 : 비밀번호 변경
	private static void changePassword(String userId, String oldPassword, String newPassword) {
		String storedPasswrd = "pass123";

		if (userId.equals("user123")) {
			if (oldPassword.equals(storedPasswrd)) {
				System.out.println("비밀번호가 성공적으로 변경되었습니다.");
			} else {
				System.out.println("비밀번호 변경 실패: 기존 비밀번호가 일치하지 않습니다.");
			}
		} else {
			System.out.println("사용자를 찾을 수 없습니다.");
		}
	}

	// switch-case문: 회원 상태 조
	private static void checkUserStatus(String userId) {
		String status = getUserStatus(userId);

		switch (status) {
		case "active":
			System.out.println(userId + "님의 상태: 활성 계정");
			break;
		case "inactive":
			System.out.println(userId + "님의 상태: 비활성 계정");
			break;
		case "suspended":
			System.out.println(userId + "님의 상태: 정지된 계정");
			break;
		case "deleted":
			System.out.println(userId + "님의 계정 상태: 탈퇴한 계정");
			break;
		default:
			System.out.println("해당 회원 정보를 찾을 수 없습니다.");
		}
	}

	// 회원 상태 조회(가상 데이터)
	private static String getUserStatus(String userId) {
		switch (userId) {
		case "user123":
			return "active";
		case "user456":
			return "inactive";
		case "user789":
			return "suspended";
		default:
			return "deleted";
		}
	}

}
