package quiz2;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int i, j, k;
		double l;
		System.out.println("enter the total price");
		i= scan.nextInt();
		System.out.println("enter the down payment");
		j= scan.nextInt();
		System.out.println("enter the length of the loan");
		k= scan.nextInt();
		System.out.println("enter the interest rate as a decimal");
		l= scan.nextDouble();
		quiz2 rate1= new quiz2(i,j,k,l);
		System.out.println(rate1.MonthlyPayment());
		System.out.println(rate1.TotalInterest());
	}
}
