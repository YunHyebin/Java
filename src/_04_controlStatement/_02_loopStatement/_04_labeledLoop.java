package _04_controlStatement._02_loopStatement;

public class _04_labeledLoop {

	public static void main(String[] args) {
		// 1~5까지 두 개의 반복문을 돌며 (i, j) 쌍을 출력.
		//🔹 하지만 i == 3 && j == 2일 때, 반복문을 완전히 종료.
		outer:
			for(int i = 1; i <= 5; i++) {
				for(int j = 1; j <= 5; j++) {
					if(i == 3 && j == 2) {
						break outer;
					}
					System.out.printf("(%d, %d)", i, j);
				}
				System.out.println();
			}
		
		//서버 요청을 보낸다. (실제로는 API 요청이지만, 여기서는 랜덤 성공/실패 처리)
		//요청이 실패하면 최대 3번까지 재시도한다.
		//요청이 성공하면 즉시 반복을 종료한다.
		//3번의 재시도 후에도 실패하면 "최대 재시도 횟수를 초과했습니다."를 출력한
		
		//서버 요청 중... (N번째 시도)
		//요청 성공! 데이터를 처리합니다.
		//요청 실패! 재시도합니다.
		//최대 재시도 횟수를 초과했습니다.
		
		System.out.println("--------------------------------");
		
		int maxCnt = 3;
		int cnt = 1;
		
		server:
			while(cnt <= maxCnt) {				
				
				System.out.printf("서버 요청 중... (#%d)\n", cnt);
				
				boolean isSuccess = Math.random() < 0.3; //30%확률 성공
				
				if(isSuccess) {
					System.out.println("요청 성공! 데이터를 처리합니다.");
					break server;
				} else {
					System.out.println("요청 실패! 재시도합니다.");
				}
				
				cnt++;
				
				if(cnt >= maxCnt) {
					System.out.println("최대 재시도 횟수를 초과했습니다.");					
				}
				

			}

	}

}
