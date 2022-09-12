package Util;

public class CurrencyConverter {
public static final double IOF = 0.06; 
	
	public static double Calculator(double amount, double dollarPrice){
		return amount * dollarPrice * (1.00 + IOF); 

	} 
}
