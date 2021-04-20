package day03;
//로또 머신 : 공 1~45(배열) 

//putBall() 공 채우는 메서드
//mixBall() 공 섞기 or getBall() 번호 추출

//유저 : 로또머신 생성 -> putBall -> getBall 6번
public class LottoMachine {
	//45개의 공 생성
	public int[] putBall(int ball[]) {
		for (int i = 0; i < 45; i++) {
			ball[i] = i + 1;
		}
		return ball;

	}
	// 랜덤 숫자 2개를 뽑아서 swap 반복
	public int[] mixBall(int ball[]) {

		for (int i = 0; i <= 100; i++) {
			int temp = 0;
			int a = (int) (Math.random() * 45);
			int b = (int) (Math.random() * 45);
			temp = ball[a];
			ball[a] = ball[b];
			ball[b] = temp;
		}
		return ball;
	}
	// 당첨 공을 총 6개 추출
	public int[] getBall(int ball[]) {
		int[] result = new int[6];
		for (int i = 0; i < 6; i++) {
			int random = (int) (Math.random() * 45);
			if (ball[random] != 0) {	//한 번 사용한 번호는 0으로 변경해준다
				result[i] = ball[random];
				ball[random] = 0;
			}
			else {	// 랜덤으로 뽑은 인덱스가 0일 경우 i값을 1 낮춰서 재시도
				i-=1;
			}

		}
		
		return result;
	}

}
