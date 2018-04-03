package main.java;

import java.util.Scanner;

public class Enter {

	public static void main(String[] args) {
		run();
	}
	
	public static void run() {
		
		System.out.println("¬ведите желаемую сумму");
		
		double sum = (new Scanner(System.in)).nextDouble();
		
		System.out.println("¬ведите желаемую процентную ставку");
		
		double persent = (new Scanner(System.in)).nextDouble();
		
		System.out.println("¬ведите желаемый срок кредита (в мес€цах)");
		
		int mounth = (new Scanner(System.in)).nextInt();
		
		System.out.println("++++++ –езультаты расчетов ++++++");
		Calc calc = new Calc(sum, persent, mounth);
		
		System.out.println(">>>> —умма процентов \n >>"+calc.getPercentSum());
		System.out.println(">>>> ќбща€ сумма кредита \n >>"+calc.getTotalSum());
		System.out.println(">>>> ≈жемес€чные платежи");
		for(int i = 0; i<mounth; i++) {
			System.out.println(">>" + calc.getMounthPaid());
		}
	}
}
