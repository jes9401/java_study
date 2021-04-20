package day04;

public class TV {
	int channel, volume;
	boolean power;

	public TV() {
		this(7, 20, false);
	}

	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	public void channelUp() {
		channel++;
	}

	public void channelDown() {
		channel--;
	}

	public void volumeUp() {
		volume++;
	}

	public void volumeDown() {
		volume--;
	}

	public void powerOn() {
		power = true;
	}

	public void powerOff() {
		power = false;
	}

	public void setChannel(int n) {
		channel = n;
	}

	public int getChannel() {
		return channel;
	}

	public boolean isPower() {
		return power;
	}

	public int getVolume() {
		return volume;
	}

}
