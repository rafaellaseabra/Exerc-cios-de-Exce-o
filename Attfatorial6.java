package Exercicios3107;

import java.util.Scanner;

public class Attfatorial6 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int fat= 1, num=0;
		
		try {
		System.out.print("Informe o Fatorial: ");
		num= ler.nextInt();
		}
		
		catch (Exception error){
			System.out.print("NÃO existe fatorial de LETRA");
			System.exit(0);
		}
		if (num < 0) {
			System.out.print(" Não existe fatorial de número negativo!");
			System.exit(0);
		}
		for (int i=1; i <= num; i++) {
			fat *= i;
		}
		System.out.println("O fatorial de "+ num + "é: " + fat);
		ler.close();


	}

}
