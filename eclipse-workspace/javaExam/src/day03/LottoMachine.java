package day03;
//�ζ� �ӽ� : �� 1~45(�迭) 

//putBall() �� ä��� �޼���
//mixBall() �� ���� or getBall() ��ȣ ����

//���� : �ζǸӽ� ���� -> putBall -> getBall 6��
public class LottoMachine {
	//45���� �� ����
	public int[] putBall(int ball[]) {
		for (int i = 0; i < 45; i++) {
			ball[i] = i + 1;
		}
		return ball;

	}
	// ���� ���� 2���� �̾Ƽ� swap �ݺ�
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
	// ��÷ ���� �� 6�� ����
	public int[] getBall(int ball[]) {
		int[] result = new int[6];
		for (int i = 0; i < 6; i++) {
			int random = (int) (Math.random() * 45);
			if (ball[random] != 0) {	//�� �� ����� ��ȣ�� 0���� �������ش�
				result[i] = ball[random];
				ball[random] = 0;
			}
			else {	// �������� ���� �ε����� 0�� ��� i���� 1 ���缭 ��õ�
				i-=1;
			}

		}
		
		return result;
	}

}
