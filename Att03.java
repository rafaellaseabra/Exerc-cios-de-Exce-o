package Exercicios3107;

import java.util.ArrayList;

public class Att03 {

	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<>();
		try {
			nomes.add("Alice");
			nomes.add("Bob");
			nomes.add("Charlie");


			System.out.println("Nomes: "+ nomes.get(1));
		}
		catch(Exception error){
			System.out.print("Erro!");
		}


	}

}
