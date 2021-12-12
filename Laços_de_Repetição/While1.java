package Exercicios_La�os_Repeticao;

import java.util.Scanner;

public class While1 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		int x,idade,totalPme21=0,totalPma50=0;
		
		System.out.println("\nInforme sua idade: ");
		idade=ler.nextInt();
				
		while(idade!=-99)
		{
			if(idade<21)
			{
				totalPme21++;
			}
			else if (idade>50)
			{
				totalPma50++;
			}
			else
			{
				System.out.println("Idade n�o computada!");
			}
			System.out.println("\nInforme sua idade: ");
			idade=ler.nextInt();
		}
		System.out.println("\nO total de pessoas com menos de 21 anos � de "+totalPme21);
		System.out.println("\nO total de pessoas com mais de 50 anos � de "+totalPma50);
		
	}
}