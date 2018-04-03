package main.java;

public class Calc {
	private double sum;
	private double percent;
	private int mounth;
	
	private double percentSum;
	private double totalSum;
	
	private double mounthPayment;
	
	
	public Calc(double sum, double percent, int mounth) {
		this.sum = sum;
		this.percent = percent;
		this.mounth = mounth;
		
		if(this.mounth == 0) {
			throw new ArithmeticException();
		}
		
		this.percentSum =(this.sum / 100)*this.percent;
		this.totalSum = this.percentSum + this.sum;
		this.mounthPayment = this.totalSum/this.mounth;
	}
	
	public double getSum() {
		return this.sum;
	}
	
	public double getPercent() {
		return this.percent;
	}
	
	public int getMounth() {
		return this.mounth;
	}

	public double getPercentSum() {
		return percentSum;
	}

	public double getTotalSum() {
		return this.totalSum;
	}
	
	public double getMounthPaid() {
		return this.mounthPayment;
	}
}
