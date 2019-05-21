package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Estudantes;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Estudantes vect[] = new Estudantes[10];
		
		for(int i=0; i<n; i++) {
			System.out.printf("Rent #%d:\n",i+1);
			sc.nextLine();
			System.out.println("Name: ");
			String nome = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.nextLine();
			System.out.println("Room: ");
			int numero = sc.nextInt();
			
			vect[numero] = new Estudantes(nome, email,numero);
		}
		System.out.println("Busy rooms:");
		for(int i=0; i<10; i++) {	
			if(vect[i] != null) {
			System.out.printf("%d: %s, %s\n",vect[i].getQuarto(),vect[i].getNome(),vect[i].getEmail());
			
			}
		}	
	}
}
