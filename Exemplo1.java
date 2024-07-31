package Exercicios3107;

import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {
		int a,b,c;

		Scanner ler = new Scanner(System.in);
		a=10;
		System.out.println("Digite um número");
		b=ler.nextInt();
		try {
			c=a/b;
			System.out.println("Valor de c é: "+c);
		}
		catch (Exception erro) {
			System.out.println("ERRO! Não existe divisão com ZERO");
		}
	}

}
//Arithmetic
//Runtime