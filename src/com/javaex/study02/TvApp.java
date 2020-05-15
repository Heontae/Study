package com.javaex.study02;


public class TvApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv tv = new Tv(7, 20, false);

		tv.status();

		tv.power(true);
		tv.volume(120);
		tv.status();

		tv.volume(false);
		tv.status();
		

		tv.channel(255);
		tv.status();

		tv.channel(false);
		tv.channel(false);
		tv.channel(false);
		tv.status();

		tv.power(false);
		tv.status();

	}
}
