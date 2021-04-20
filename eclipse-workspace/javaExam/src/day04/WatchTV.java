package day04;

public class WatchTV {
	public static void main(String[] args) {
		TV tv = new TV();
		System.out.printf("채널 : %d 볼륨 : %d 전원 : %s \t 생성 확인\n",tv.channel,tv.volume,tv.power);
		
		tv.channelUp();
		System.out.printf("채널 : %d 볼륨 : %d 전원 : %s \t 채널올리기\n",tv.channel,tv.volume,tv.power);
		
		tv.channelDown();
		System.out.printf("채널 : %d 볼륨 : %d 전원 : %s \t 채널내리기\n",tv.channel,tv.volume,tv.power);
		
		tv.volumeUp();
		System.out.printf("채널 : %d 볼륨 : %d 전원 : %s \t 볼륨올리기\n",tv.channel,tv.volume,tv.power);
		
		tv.volumeDown();
		System.out.printf("채널 : %d 볼륨 : %d 전원 : %s \t 볼륨내리기\n",tv.channel,tv.volume,tv.power);
		
		tv.powerOn();
		System.out.printf("채널 : %d 볼륨 : %d 전원 : %s \t 전원 켜기\n",tv.channel,tv.volume,tv.power);
		
		tv.powerOff();
		System.out.printf("채널 : %d 볼륨 : %d 전원 : %s \t 전원 끄기\n",tv.channel,tv.volume,tv.power);
		
		tv.setChannel(22);
		System.out.printf("채널 : %d 볼륨 : %d 전원 : %s \t 채널 설정하기\n",tv.channel,tv.volume,tv.power);
		System.out.println(tv.getChannel()+" 채널 확인하기");
		
		System.out.println(tv.isPower()+" 전원 확인하기");
		
		System.out.println(tv.getVolume()+" 볼륨 확인하기");
	}
}
