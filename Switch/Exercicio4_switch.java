package Exercicios_switch;

import java.util.Scanner;

public class Exercicio4_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este 
		n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for 
		�mpar exiba o n�mero elevado ao quadrado.*/
		
		Scanner leia = new Scanner(System.in);
		
		double n1,raiz,pot;
		
		System.out.println("\nEscreva qualquer n�mero: ");
		n1 = leia.nextDouble();
		
		if(n1 % 2 == 0)
		{
			raiz = Math.sqrt(n1);
			System.out.printf("\nO n�mero %.2f � par e sua raiz quadrada � %.2f",n1,raiz);
		}
		else if(n1 % 2 != 0)
		{
			pot = Math.pow(n1, 2);
			System.out.printf("\nO valor %.2f � �mpar e ao quadrado seu resultado � %.2f",n1,pot);
		}

	}

}
