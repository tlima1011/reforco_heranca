package application;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import entities.Aviao;
import entities.Caminhao;
import entities.Carro;
import entities.Furgao;
import entities.JetSki;
import entities.Navio;
import entities.Onibus;
import entities.Van;
import entities.Veiculo;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Informe a quantidade de veiculos: ");
		int n = sc.nextInt(); 
		
		ArrayList <Veiculo> veiculos = new ArrayList<>(); 
		
		for(int i = 0; i < n;i++) {
			System.out.println("Qual tipo de transporte");
			System.out.print("[1] - Carro"
					+ "\n[2] - Caminhao"
					+ "\n[3] - Caminhonete"
					+ "\n[4] - Camioneta"
					+ "\n[5] - Jet Ski"
					+ "\n[6] - Navio"
					+ "\n[7] - Onibus"
					+ "\n[8] - Van"
					+ "\n[9] - Furgao"
					+ "\n[10] - Aviao: ==> ");
			int tipo = sc.nextInt();
			System.out.print("Informe a capacidade: ");
			Integer capacidade = sc.nextInt(); 
			System.out.print("Informe a Velocidade Máxima: ");
			Double velocidadeMaxima = sc.nextDouble();  
			System.out.print("Informe a Largura: ");
			Double largura = sc.nextDouble(); 
			System.out.print("Informe comprimento: ");
			Double comprimento = sc.nextDouble(); 
			System.out.print("Informe passageiros: ");
			Integer passageiros = sc.nextInt(); 
			sc.nextLine();
			System.out.print("Peso: ");
			Double peso = sc.nextDouble();
			sc.nextLine(); 
			System.out.print("Informe combustivel: [G] - [A] - [D]: ");
			Character combustivel = sc.nextLine().charAt(0);
			//System.out.print("Parado: ");
			boolean parado = true; 
			switch(tipo) {
				case 1:
					veiculos.add(new Carro(capacidade,  velocidadeMaxima,largura, comprimento, passageiros,combustivel, peso,parado)); 	
					break;
				case 2: 
					System.out.print("Tamanho carroceria do caminhão: ");
					Double tamanhoCarroceria = sc.nextDouble(); 
					boolean possuiBau = false; 
					veiculos.add(new Caminhao(capacidade,  velocidadeMaxima,largura, comprimento, passageiros,combustivel, peso,parado,
							tamanhoCarroceria, possuiBau)); 
					break;
				case 3: 
					System.out.print("Tamanho carroceria de Caminhonete: ");
					tamanhoCarroceria = sc.nextDouble(); 
					possuiBau = false; 
					veiculos.add(new Caminhao(capacidade,  velocidadeMaxima,largura, comprimento, passageiros,combustivel, peso,parado,
							tamanhoCarroceria, possuiBau)); 
					break;
				case 4: 
					System.out.print("Tamanho carroceria de Camioneta: ");
					tamanhoCarroceria = sc.nextDouble(); 
					possuiBau = true; 
					veiculos.add(new Caminhao(capacidade,  velocidadeMaxima,largura, comprimento, passageiros,combustivel, peso,parado,
							tamanhoCarroceria, possuiBau)); 
					break;
				case 5: 
					veiculos.add(new JetSki(capacidade,  velocidadeMaxima,largura, comprimento, passageiros,combustivel, peso,parado));
					break;
				case 6: 
					veiculos.add(new Navio(capacidade,  velocidadeMaxima,largura, comprimento, passageiros,combustivel, peso,parado));
					break;
				case 7: 
					veiculos.add(new Onibus(capacidade,  velocidadeMaxima,largura, comprimento, passageiros,combustivel, peso,parado)); 
					break;
				case 8: 
					veiculos.add(new Van(capacidade,  velocidadeMaxima,largura, comprimento, passageiros,combustivel, peso,parado)); 
					break;
				case 9: 
					veiculos.add(new Furgao(capacidade,  velocidadeMaxima,largura, comprimento, passageiros,combustivel, peso,parado)); 
					break;
				case 10: 
					veiculos.add(new Aviao(capacidade,  velocidadeMaxima,largura, comprimento, passageiros,combustivel, peso,parado));
					break; 
				default: 
					System.out.println("Inválido");
			}
		}
		for (Veiculo v : veiculos) {
			System.out.println(v + "\n");
		}
		
		sc.close();
	}

}
