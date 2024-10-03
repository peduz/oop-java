package it.lessons.oop.calculator;

public class Main {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Inserisci due numeri per ottenerne la somma");
//		
//		double a = scan.nextDouble();
//		double b = scan.nextDouble();
//		
//		BigDecimal result = CalculatorHelper.sum(a, b);
//		
//		System.out.println(result);
//		
//		System.out.println("Inserisci due numeri per ottenerne la differenza");
//		
//		a = scan.nextDouble();
//		b = scan.nextDouble();
//		
//		result = CalculatorHelper.subtract(a, b);
//		
//		System.out.println(result);
		
		CalculatorHelper.somma();
		CalculatorHelper.somma(1);
		CalculatorHelper.somma(1,2,4,5);
		CalculatorHelper.somma(23,546, 546, 4);
		CalculatorHelper.somma(2,5,2);
		
	}
}
