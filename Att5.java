package Exercicios3107;

import java.util.Scanner;

public class Att5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		double v1=0,v2=0, v3=0;
		try {
			System.out.println("Informe o valor 1|: ");
			v1=ler.nextDouble();
			System.out.println("Informe o valor 2|: ");
			v2=ler.nextDouble();
			System.out.println("Informe o valor 3|: ");
			v3=ler.nextDouble();
		}

		catch(Exception error){
			System.out.println("ERRO! Informe um valor em números!");
			System.exit(0);
		}

		if (v1 == v2 && v1 == v3) {
			System.out.print("Todos valores são iguais");
		}
		else if (v1>v2 && v1>v3) {
			System.out.print("O PRIMEIRO valor é maior" + v1);
		}
		else if (v2>v3) {
			System.out.print("O SEGUNDO valor é maior " + v2);
		}
		else {
			System.out.print("O TERCEIRO valo é maior "+ v3);
		}
	}
}