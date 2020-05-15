package com.javaex.study02;

public class Tv {
	// 필드
	private int channel;
	private int volume;
	private boolean power;

	// g/s
	public int getChannel() {
		return channel;
	}

	// 생성자
	public Tv() {

	}

	public Tv(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;

	}

	// 메소드 조건문
	public void channel() {
		if (this.channel > 250) {
			System.out.println("채널은 250까지입니다.");
			this.channel = 250;
		} else if (this.channel < 0) {
			System.out.println("채널은 0까지 입니다.");
			this.channel = 0;
		}
	}

	public void volume() {
		if (this.volume < 0) {
			System.out.println("볼륨은 최소 0입니다.");
			this.volume = 0;
		} else if (this.volume > 100) {
			System.out.println("볼륨은 최대 100입니다.");
			this.volume = 100;
		}
	}
	
	//메소드
	public void power(boolean on) {
		if (on == true) {
			this.power = true;
		} else if (on == false) {
			this.power = false;
		}
	}

	public void channel(int channel) {

		this.channel = channel;

		this.channel();
	}

	public void channel(boolean up) {
		if (up == true) {
			this.channel += 1;
		} else if (up == false) {
			this.channel -= 1;
		}
		this.channel();
	}

	public void volume(int volume) {
		this.volume = volume;
		
		this.volume();
	}

	public void volume(boolean up) {
		if (up == true) {

			this.volume += 1;

		} else if (up == false) {
			this.volume -= 1;
		}
		this.volume();
	}

	// to String
	@Override
	public String toString() {
		return "Tv [channel=" + channel + ", volume=" + volume + ", power=" + power + "]";
	}

	// 출력문
	public void status() {
		if (power == true) {
			System.out.println("채널:" + getChannel() + "\t 볼륨: " + volume + "입니다.");
			System.out.println("=====================================================");
		} else {
			System.out.println("tv가 꺼져있습니다.");
		}
	}

}
