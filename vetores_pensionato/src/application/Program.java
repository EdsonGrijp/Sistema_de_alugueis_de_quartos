package application;

import java.util.Scanner;

import entites.Alunos;

public class Program {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		Alunos[] vect = new Alunos[10];
		
		System.out.println("Quais quartos você quer locar? ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Rent #" +i+ ":");
			System.out.println("Nome ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("E-mail");
			String email = sc.next();
			System.out.println("Quarto ");
			int quartonumero = sc.nextInt(); 
			
			vect[quartonumero] =  new Alunos(nome, email);
			
		}
		
		for(int i = 1; i<10; i++) {
			if(vect[i] != null) {
			System.out.println(i + ":" + vect[i]);
		}
			}
		sc.close();
	}
}
