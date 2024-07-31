package Exercicios3107;

import java.util.Scanner;

public class Att4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double x=0;
		try {
			System.out.println("Digite uma nota de 0 a 10: ");
			x=ler.nextDouble();
		}

		catch(Exception error){
			System.out.println("ERRO! Digite notas em números!");
			System.exit(0);
		}
		
		
        if (x > 10 ) {
        	System.out.print("Invalido! Somente notas de 0 a 10. Digite Novamente");
        	
        }
		if (x>=6) {
			System.out.println("Você está aprovado");
		}
		else if (x<6 && x>=4) {
			System.out.println("Exame");			
		}
		else {
			System.out.println ("REPROVADO");
		}
	
	}
}

