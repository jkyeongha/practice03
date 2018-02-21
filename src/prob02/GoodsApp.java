package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Goods[] goods = new Goods[COUNT_GOODS];
		//String str[]=new String[COUNT_GOODS];
		
		for(int i=0; i<COUNT_GOODS; i++) {

		
			String str = scanner.nextLine();
			String[] strArray = str.split("\\s");
			
			String name = strArray[0];
			int price = Integer.parseInt(strArray[1]);
			int count = Integer.parseInt(strArray[2]);
			
			Goods strGoods = new Goods();
			strGoods.setName(name);
			strGoods.setPrice(price);
			strGoods.setCount(count);
			
			goods[i]=strGoods;
			
		}
		
		for(int i=0; i<goods.length; i++) {
			System.out.println(goods[i].getName()+"(가격:"+goods[i].getPrice()+"원)이 "+goods[i].getCount()+"개 입고 되었습니다.");
		}
		
		scanner.close();
	}
}
