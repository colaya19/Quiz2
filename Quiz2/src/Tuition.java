import java.util.Scanner;

public class Tuition 
{
	static double tuition0 = 0.0;
	static double tuition = 0.0;
	
	static double percent = 0.0;
	static double total = 0.0;

	public static void main(String[] args) 
	{
		rate();
		Scanner scans = new Scanner(System.in);
		
		System.out.println("What is the tuition rate you will pay?");
		tuition0 = scans.nextDouble();
		tuition = tuition0;
		
		System.out.println("What is the percent increase?");
		percent = scans.nextDouble();
		
		for (int x = 0; x < 3; x++)
		{
			tuition0 = tuition0 + rate();
			total = total + tuition0;
		}
		System.out.printf("For 4 years it'll cost: $%.2f%n",total+tuition);
	}
	
	public static double rate()
	{
		double perc = percent/100;
		double temp = 0.0;
		temp = tuition0*perc;
		
		return temp;
	}

}
