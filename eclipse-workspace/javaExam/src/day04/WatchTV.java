package day04;

public class WatchTV {
	public static void main(String[] args) {
		TV tv = new TV();
		System.out.printf("ä�� : %d ���� : %d ���� : %s \t ���� Ȯ��\n",tv.channel,tv.volume,tv.power);
		
		tv.channelUp();
		System.out.printf("ä�� : %d ���� : %d ���� : %s \t ä�οø���\n",tv.channel,tv.volume,tv.power);
		
		tv.channelDown();
		System.out.printf("ä�� : %d ���� : %d ���� : %s \t ä�γ�����\n",tv.channel,tv.volume,tv.power);
		
		tv.volumeUp();
		System.out.printf("ä�� : %d ���� : %d ���� : %s \t �����ø���\n",tv.channel,tv.volume,tv.power);
		
		tv.volumeDown();
		System.out.printf("ä�� : %d ���� : %d ���� : %s \t ����������\n",tv.channel,tv.volume,tv.power);
		
		tv.powerOn();
		System.out.printf("ä�� : %d ���� : %d ���� : %s \t ���� �ѱ�\n",tv.channel,tv.volume,tv.power);
		
		tv.powerOff();
		System.out.printf("ä�� : %d ���� : %d ���� : %s \t ���� ����\n",tv.channel,tv.volume,tv.power);
		
		tv.setChannel(22);
		System.out.printf("ä�� : %d ���� : %d ���� : %s \t ä�� �����ϱ�\n",tv.channel,tv.volume,tv.power);
		System.out.println(tv.getChannel()+" ä�� Ȯ���ϱ�");
		
		System.out.println(tv.isPower()+" ���� Ȯ���ϱ�");
		
		System.out.println(tv.getVolume()+" ���� Ȯ���ϱ�");
	}
}
