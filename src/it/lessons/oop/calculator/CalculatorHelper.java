package it.lessons.oop.calculator;

import java.math.BigDecimal;

/*
 * strutturare la classe in modo che non 
 * possa essere istanziata e che presenti i seguenti metodi static:
- Somma di due numeri interi
- Somma di due numeri double
- Differenza tra due numeri interi
- Differenza tra due numeri double
- Moltiplicazione di due numeri interi
- Moltiplicazione di due numeri double
- Valore assoluto di un numero intero
- Valore assoluto di un numero double
- Minimo tra due numeri interi
- Minimo tra due numeri double
- Massimo tra due numeri interi
- Massimo tra due numeri double
 */
public class CalculatorHelper {

    public static final double PI_GRECO = 3.14159265358979323846;
    
	private CalculatorHelper() {}
	
	public static long sum(int a, int b) {
		return a+b;
	}
	
	public static BigDecimal sum(double a, double b) {
		BigDecimal result = BigDecimal.ZERO;
		
		return result.add(BigDecimal.valueOf(a)).add(BigDecimal.valueOf(b));
	}
	
	public static long subtract(int a, int b) {
		return a-b;
	}
	
	public static BigDecimal subtract(double a, double b) {
		BigDecimal result = BigDecimal.ZERO;
		
		return result.subtract(BigDecimal.valueOf(a)).subtract(BigDecimal.valueOf(b));
	}
	
	public static long multiply(int a, int b) {
		return a*b;
	}
	
	public static BigDecimal multiply(double a, double b) {
		return BigDecimal.valueOf(a).multiply(BigDecimal.valueOf(b));
	}
	
	public static Double multiply(double a, double b, double c) {
		return a * b * c;
	}
	
	public static int abs(int a) {
		if(a < 0) {
			return a * -1;
		}
		return a;
	}
	
	public static double abs(double a) {
		return (a < 0) ? (a * -1) : a;
	}

	public static int max(int a, int b) {
		return a > b ? a : b;
	}
	
	public static double max(double a, double b) {
		if(a > b) {
			return a;
		}
		return b;
	}
	
	public static int min(int a, int b) {
		if(a < b) {
			return a;
		} else {
			return b;
		}
	}
	
	public static double min(double a, double b) {
		Math.min(a, b);
		return a < b ? a : b;
	}
	
	
	public static void somma(int...a) {
		long somma = 0;
		for(int i = 0; i < a.length; i++) {
			somma += a[i];
		}
		System.out.println(somma);
	}
	
}
