package com.javaex.study01;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		Goods[] Goods = new Goods[1];

		boolean exit = true;

		for (int i = 0; exit;) {

			System.out.println("1.추가하기  \t 2.종료하기 \t 3.상품리스트 보기");
			int result = sc.nextInt();

			switch (result) {

			case 1:
				if(i!=0) {
					Goods[] copy = new Goods[Goods.length + 1];
					for (int j = 0; j < Goods.length; j++) {
						Goods[j] = copy[j];
					}

					Goods = copy;
				}
				Goods[i] = new Goods();
				System.out.print("이름: ");
				Goods[i].name = sc.next();
				System.out.print("가격: ");
				Goods[i].price = sc.nextInt();
				System.out.println(i+ 1 + "번째 이름은 " + Goods[i].name + "이고 가격은 " + Goods[i].price);

				i++;
				break;

			case 2:
				System.out.println("종료하겠습니다.");

				exit = false;
				break;

			case 3:
				for (int j = 0; j < Goods.length; j++) {
					System.out.println( ".  상품명: " + Goods[i].name + "\t가격: " + Goods[i].price);
				}
				break;
			default:
				System.out.println("잘못입력하였습니다.(다시 선택해주세요)");
				break;
			}

		}

	}
}
