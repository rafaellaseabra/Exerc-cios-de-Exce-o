package Exercicios3107;

import java.util.ArrayList;
import java.util.Scanner;

public class Att2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		ArrayList<Integer> numeros = new ArrayList<>();
		System.out.println("****************");
		System.out.println("Digite 0 para terminar!!");
		System.out.println("****************");
		
		int i=1;
		while(i !=0) {
		System.out.println("Informe um valor: ");
		i=ler.nextInt();
		numeros.add(i);
		}
		
		
		for (int n: numeros) {
			if (n %2==0) {
		
		System.out.println(n);
			}
		
		}}
	}


