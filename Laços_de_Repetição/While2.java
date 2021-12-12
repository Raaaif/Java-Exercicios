package Exercicios_La�os_Repeticao;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
	
		int num,cont=0,somanum=0;
		float media;
		
		System.out.println("\nDigite um n�mero: ");
		num=leia.nextInt();		
		do
		{
			if(num % 3 == 0) 
			{
				cont++;
				somanum+=num;
			}
			System.out.println("\nDigite um n�mero: ");
			num=leia.nextInt();		
		}while(num!=0);
		
		media=(float)somanum/cont;
		System.out.println("\nForam informados "+cont+" n�mero(s) m�ltiplo(s) de 3, sua soma � de "+somanum+" e sua m�dia � "+media);
	}
}
