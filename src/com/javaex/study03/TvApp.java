package com.javaex.study03;

import java.util.Scanner;

public class TvApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv tv = new Tv(7, 20, false);

		Scanner sc = new Scanner(System.in);
		boolean exit = true;
		boolean power = false;
		System.out.println("TV를 켜주세요.");
		while (exit) {
			System.out.println("메뉴를 선택하세요.");
			System.out.println("1.전원 2.채널 3.볼륨");
			int num = sc.nextInt();

			switch (num) {
			case 1:
				if (power == false) {
					tv.power(false);
					power = true;
				} else if (power == true) {
					tv.power(true);
					exit = false;
				}
				break;
			case 2:
				System.out.println("이동하실 채널을 입력해주세요.+는1증가 -는 1감소\n>>");
				tv.channel(sc.next());
				tv.status();
				// Integer.parseInt(str);
			}
		}
	}

}
