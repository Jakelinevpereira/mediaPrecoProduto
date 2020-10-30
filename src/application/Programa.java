package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produtos;

public class Programa {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Produtos[]vetor= new Produtos[n];
		
		for(int i=0; i<n; i++) {
			sc.nextLine();
			String nome = sc.next();
			double preco = sc.nextDouble();
			vetor[i]= new Produtos(nome, preco);
		}
		
		double soma = 0.0;
		for(int i=0; i<n; i++) {
			soma += vetor[i].getPreco();
		}
		
		double media= soma / n;
		System.out.printf("Média de Preço: %.2f\n",media);
		
		
		
		sc.close();
		

	}

}
