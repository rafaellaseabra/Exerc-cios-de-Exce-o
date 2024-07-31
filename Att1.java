package Exercicios3107;

import java.util.ArrayList;
import java.util.Scanner;

public class Att1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		ArrayList<Integer> valor = new ArrayList<>();
		
		int soma=0, numero;
		
		for (int i = 0; i<5; i++) {
		System.out.println ("Digite qualquer número! ");
		numero = ler.nextInt();
		
		soma= soma + numero;
		
		System.out.println("A soma dos numeros são: " + soma);
		}
	}

}
