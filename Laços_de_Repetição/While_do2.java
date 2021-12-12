package Exercicios_La�os_Repeticao;

import java.util.Scanner;

public class While_do2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
	
		int num,cont=0,somaNum=0;
		float media;
		
		System.out.println("\nInforme um n�mero ");
		num=leia.nextInt();
		
		do
		{
			if(num%3==0) 
			{
			cont++;
			somaNum+=num;
			}
			System.out.println("\nInforme um n�mero ");
			num=leia.nextInt();
			
		}while(num!=0);
		
		media=(float)somaNum/cont;
		System.out.printf("\nForam informados %d n�mero(s) m�ltiplo(s) de 3, sua soma � de %d e sua m�dia � %.2f ",cont,somaNum,media);
	}
}