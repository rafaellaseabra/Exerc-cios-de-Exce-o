package Exercicios3107;

import java.util.ArrayList;
import java.util.Scanner;

public class Att01teste {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		ArrayList<Integer> numeros = new ArrayList<>();
		System.out.println("***************");
		System.out.println("Digite o valor 0 para sair");
		System.out.println("***************");
		
		int i=1, soma = 0;
		while(i != 0) {
		System.out.println("Informe o valor a ser somado: ");
		i=ler.nextInt();
		numeros.add(i);
		}
		
			for (int n: numeros) {
				soma = soma+n;
			}
			System.out.println("A lista:" + numeros);
			System.out.println("A soma é: "+soma);
		}

	}


