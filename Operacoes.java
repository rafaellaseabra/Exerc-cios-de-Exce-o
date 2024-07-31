package Exercicios3107;

import java.util.Scanner;

public class Operacoes {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int a=0,b=0;
		try {
			System.out.print("Digite o primeiro valor: ");
			a= ler.nextInt();

			System.out.print("Digite o segundo valor: ");
			b= ler.nextInt();


			System.out.println("RESULTADOS");
			System.out.println("Soma: "+(a+b));
			System.out.println("Subtração: "+(a-b));
			System.out.println("Multiplicação: "+(a*b));
			System.out.println("Divisão Inteira: "+(a%b));
			System.out.println("Divisão Exata: "+(double)a/b);
			ler.close();
		}
		catch(Exception error){
			System.out.println("Informe um valor do tipo INTEIRO!");
			System.exit(0);
		}

	}

}
