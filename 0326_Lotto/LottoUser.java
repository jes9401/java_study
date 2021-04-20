package day03;

public class LottoUser {
	public static void main(String[] args) {
		LottoMachine lm = new LottoMachine();
		int ball[] = new int[45];	//전체 공
		int result[] = new int[6];	//당첨 공
		lm.putBall(ball);
		lm.mixBall(ball);
		result=lm.getBall(ball);
		
		for(int b:result) {
		System.out.print(b+"\t");
		} //뽑은 번호 확인
	}
}
