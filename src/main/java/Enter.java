package main.java;

import java.util.Scanner;

public class Enter {

	public static void main(String[] args) {
		run();
	}
	
	public static void run() {
		
		System.out.println("������� �������� �����");
		
		double sum = (new Scanner(System.in)).nextDouble();
		
		System.out.println("������� �������� ���������� ������");
		
		double persent = (new Scanner(System.in)).nextDouble();
		
		System.out.println("������� �������� ���� ������� (� �������)");
		
		int mounth = (new Scanner(System.in)).nextInt();
		
		System.out.println("++++++ ���������� �������� ++++++");
		Calc calc = new Calc(sum, persent, mounth);
		
		System.out.println(">>>> ����� ��������� \n >>"+calc.getPercentSum());
		System.out.println(">>>> ����� ����� ������� \n >>"+calc.getTotalSum());
		System.out.println(">>>> ����������� �������");
		for(int i = 0; i<mounth; i++) {
			System.out.println(">>" + calc.getMounthPaid());
		}
	}
}
