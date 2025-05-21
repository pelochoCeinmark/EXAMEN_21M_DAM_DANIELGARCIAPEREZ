package examen_21m;

import java.util.Scanner;

public class NumeroPrimo {
	
	public static boolean CalcularPrimo(int num) {
        for (int i=2; i<=num; i++) { 
            if (num%i == 0) {
            	System.out.println(i + " es un divisor.");
            	return false;
            }
            
        }
        return true;
    }//fin calcular primo

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
	
		int num = Integer.parseInt(ent.nextLine());
		
		if (CalcularPrimo(num)) {
			System.out.println("No hay divisores. Es un número primo.");
		}else {
			System.out.println("No es un número primo.");
		}
	}//fin main

}//fin clase
