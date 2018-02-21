package prob06;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		
		while( true ) {
			
			System.out.print(">>");
			String str = scanner.nextLine();
			
			/*  코드를 완성 합니다 */
			if(str.equals("quit")) {
				break;
			}
			
			if(str.length()!=3) {
				System.out.println("잘못된 식입니다.");
				break;
			}
			
			String[] strArray = str.split("");
			int a=Integer.parseInt(strArray[0]),b=Integer.parseInt(strArray[2]);
			String c = strArray[1];
			
			switch(c) {
				case "+" : 
					Add add=new Add();
					add.setValue(a, b);
					System.out.println(">>"+add.calculate());
					break;
						   
				case "-" : 
					Sub sub=new Sub();
					sub.setValue(a, b);
					System.out.println(">>"+sub.calculate());
					break;
					
				case "*" : 
					Mul mul=new Mul();
					mul.setValue(a, b);
					System.out.println(">>"+mul.calculate());
					break;
					
				case "/" : 
					Div div=new Div();
					div.setValue(a, b);
					System.out.println(">>"+div.calculate());
					break;	
			}
			
			
			
			
		}
		
		scanner.close();

	}

}
