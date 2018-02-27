package quiz2;

import java.lang.Math;
public class quiz2 {
	private int totalPrice;
	private int downPayment;
	private int lengthOfLoan;
	private double interestRate;
	
	public quiz2(int totalprice, int downpayment, int Lengthofloan, double interestrate) {
		super();
		totalPrice=totalprice;
		downPayment=downpayment;
		lengthOfLoan=Lengthofloan;
		interestRate=interestrate;
		
	}
	
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	public int getDownPayment() {
		return downPayment;
	}
	public void setDownPayment(int downPayment) {
		this.downPayment = downPayment;
	}
	public int getLengthOfLoan() {
		return lengthOfLoan;
	}
	public void setLengthOfLoan(int lengthOfLoan) {
		this.lengthOfLoan = lengthOfLoan;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public double MonthlyPayment() {
		double fv=this.totalPrice * Math.pow((1 + this.interestRate/12), this.lengthOfLoan);
		return (double) Math.round((fv * this.interestRate/12) / (Math.pow((1 + this.interestRate/12), this.lengthOfLoan ) - 1)*100)/100;
	}
	public double TotalInterest() {
		double fv=this.totalPrice * Math.pow((1 + this.interestRate/12), this.lengthOfLoan);
		double c=(((double)fv * this.interestRate/12) / (Math.pow((1 + this.interestRate/12), this.lengthOfLoan ) - 1));
		return (double) Math.round(((c*this.lengthOfLoan)-this.totalPrice)*100)/100;
	}
}

