package Exercicios_switch;

import java.util.Scanner;

public class Exercicio1_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.//
		
		int n1,n2,n3;
		float media;
		
		System.out.println("Escreva o primeiro valor: ");
		n1 = leia.nextInt();
		System.out.println("Escreva o segundo valor valor: ");
		n2 = leia.nextInt();
		System.out.println("Escreva o terceiro valor: ");
		n3 = leia.nextInt();
		
		media = (n1 + n2 + n3) / 3;
		
		if(n1 > n2 && n1 > n3)
		{
			System.out.println("O maior valor foi o primeiro com o valor de: "+n1);
		}
		else if(n2 > n3 && n2 > n1)
		{
			System.out.println("O maior valor foi o segundo com o valor de: "+n2);

		}
		else if(n3 > n1 && n3 > n2)
		{
			System.out.println("O maior valor foi o terceiro com o valor de: "+n3);

		}
		else
		{
			System.out.println("Os valores s�o iguais, voc� digitou 3 vezes o valor de: "+n3);
		}
		
	    System.out.printf("\n\nA m�dia dos valore digitados � de: %2.2f",media);

				
		
		
		

	}

}
