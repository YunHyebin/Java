package _04_controlStatement;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _02_ifEx2 {
	 // 🛒 제품 재고 저장
    private static final Map<String, Integer> stockMap = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 초기 재고 설정
        stockMap.put("노트북", 5);
        stockMap.put("스마트폰", 10);
        stockMap.put("태블릿", 15);

        while (true) {
            System.out.println("\n실행할 기능을 선택하세요:");
            System.out.println("1: 나이 확인 (if문)");
            System.out.println("2: 로그인 (if-else문)");
            System.out.println("3: 주문 가능 여부 확인 (if-else if문)");
            System.out.println("4: 대량 주문 할인 적용 (중첩 if문)");
            System.out.println("5: 제품 재고 확인 (switch-case문)");
            System.out.println("0: 종료");

            int choice = scanner.nextInt();
            scanner.nextLine(); // 개행 문자 처리

            if (choice == 0) {
                System.out.println("프로그램 종료.");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("나이를 입력하세요: ");
                    int age = scanner.nextInt();
                    checkAdult(age);
                    break;
                case 2:
                    System.out.print("아이디 입력: ");
                    String username = scanner.nextLine();
                    System.out.print("비밀번호 입력: ");
                    String password = scanner.nextLine();
                    login(username, password);
                    break;
                case 3:
                    System.out.print("주문 수량을 입력하세요: ");
                    int quantity = scanner.nextInt();
                    checkOrderAvailability(quantity);
                    break;
                case 4:
                    System.out.print("주문 상품명: ");
                    String product = scanner.nextLine();
                    System.out.print("주문 수량: ");
                    int orderQty = scanner.nextInt();
                    applyBulkDiscount(product, orderQty);
                    break;
                case 5:
                    System.out.print("조회할 제품명을 입력하세요: ");
                    String productName = scanner.nextLine();
                    checkStock(productName);
                    break;
                default:
                    System.out.println("올바른 번호를 입력하세요.");
            }
        }

        scanner.close();
    }

    // ✅ if문 사용: 성인 여부 확인
    private static void checkAdult(int age) {
        if (age >= 18) {
            System.out.println("성인입니다.");
        }
    }

    // ✅ if-else문 사용: 로그인 기능
    private static void login(String username, String password) {
        String storedUsername = "admin";
        String storedPassword = "1234";

        if (username.equals(storedUsername) && password.equals(storedPassword)) {
            System.out.println("로그인 성공!");
        } else {
            System.out.println("로그인 실패: 아이디 또는 비밀번호가 틀렸습니다.");
        }
    }

    // ✅ if-else if문 사용: 주문 가능 여부 확인
    private static void checkOrderAvailability(int quantity) {
        if (quantity <= 0) {
            System.out.println("잘못된 주문 수량입니다.");
        } else if (quantity > 100) {
            System.out.println("재고 부족으로 주문할 수 없습니다.");
        } else {
            System.out.println("주문 가능합니다.");
        }
    }

    // ✅ 중첩 if문 사용: 대량 주문 할인 적용 + 재고 감소
    private static void applyBulkDiscount(String product, int quantity) {
        int stock = getStock(product);

        if (stock == -1) {
            System.out.println("존재하지 않는 상품입니다.");
        } else if (quantity <= stock) {
            if (quantity > 10) {
                System.out.println("대량 주문 할인 적용! 주문이 완료되었습니다.");
            } else {
                System.out.println("주문이 완료되었습니다.");
            }
            // 🔥 주문 완료 후 재고 차감
            stockMap.put(product, stock - quantity);
            System.out.println("현재 " + product + " 재고: " + (stock - quantity) + "개");
        } else {
            System.out.println("재고 부족: 현재 재고는 " + stock + "개입니다.");
        }
    }

    // ✅ switch-case문 사용: 제품별 재고 확인
    private static void checkStock(String product) {
        int stock = getStock(product);

        switch (stock) {
            case -1:
                System.out.println("존재하지 않는 제품입니다.");
                break;
            case 0:
                System.out.println(product + "은(는) 품절되었습니다.");
                break;
            default:
                System.out.println(product + "의 재고는 " + stock + "개입니다.");
        }
    }

    // 🛒 상품별 재고 조회 (Map에서 가져오기)
    private static int getStock(String product) {
        return stockMap.getOrDefault(product, -1);
    }
}