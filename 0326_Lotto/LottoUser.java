package day03;

public class LottoUser {
	public static void main(String[] args) {
		LottoMachine lm = new LottoMachine();
		int ball[] = new int[45];	//��ü ��
		int result[] = new int[6];	//��÷ ��
		lm.putBall(ball);
		lm.mixBall(ball);
		result=lm.getBall(ball);
		
		for(int b:result) {
		System.out.print(b+"\t");
		} //���� ��ȣ Ȯ��
	}
}
