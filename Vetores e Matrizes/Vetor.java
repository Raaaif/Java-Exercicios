package Exercicios_VeM;

import java.util.Scanner;

public class Vetor 
{

	public static void main(String[] args) 
	{
		
		int[] A = new int[6];
		
		int somaP = 0, cont;
		
		Scanner leia = new Scanner(System.in);
		
		for(cont = 0; cont < 6; cont ++)
		{
			System.out.printf("Digite o valor do vetor %d : ",cont + 1);
			A[cont] = leia.nextInt();
			
			
		}
		
		
		somaP = A[0] + A[1] + A[5];
		
		System.out.printf("\nA soma dos vetores A[0], A[1], A[5] é %d ", somaP);
		System.out.printf("\n\nDigite o valor do novo do vetor 4: ");
		A[4] = leia.nextInt(); 
		System.out.printf("\nVetores em linha  ");
		
		
		for(cont = 0; cont < 6; cont ++)
		{
			System.out.printf("\nVetor %d = \t  [ %d ] \t ",cont + 1 ,A[cont]);
		}

	}

}