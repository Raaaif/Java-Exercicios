package Exercicios_La�os_Repeticao;

import java.util.Scanner;

public class For1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int x,cont=0;
		
		for(x=1000;x<=1999;x++)
		{
			if(x % 11 == 5)
			{
				cont ++;
				System.out.println(" "+x);
			}
		}
		System.out.println("\n\nA quantidade de divisores por 11 com sobra de 5 entre 1000 e 1999 � de: "+cont);


	}

}