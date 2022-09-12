package application;

import java.util.Locale;
import java.util.Scanner;

import Util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Whats is the dollar price? ");
		double dollarPrice = scan.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double amount = scan.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.Calculator(amount, dollarPrice));
		scan.close();
	}

}
