package Exercicios_switch;

import java.util.Scanner;

public class Exercicio2_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int n1,n2,n3;
		
		System.out.println("Digite o primeiro n�mero: ");
		n1 = leia.nextInt();
		System.out.println("Digite o primeiro n�mero: ");
		n2 = leia.nextInt();
		System.out.println("Digite o primeiro n�mero: ");
		n3 = leia.nextInt();
		
		if(n1 < n2 && n2 < n3) 
		{			
			System.out.printf("Ordem crescente �: "+n1+", "+n2+", "+n3);
		} else if((n1 < n2 && n3 < n2) && n1 < n3){
			System.out.printf("Ordem crescente �: "+n1+", "+n3+", "+n2);
		}else if(n2 < n1 && n1 < n3) {
			System.out.printf("Ordem crescente �: "+n2+", "+n1+", "+n3);
		} else if(n2 < n1 && n2 < n3) {
			System.out.printf("Ordem crescente �: "+n2+", "+n3+", "+n1);
		} else if(n3 < n1 && n1 < n2) {
			System.out.printf("Ordem crescente �: "+n3+", "+n1+", "+n2);
		} else {
			System.out.printf("Ordem crescente �: "+n3+", "+n2+", "+n1);
		}

	}

}
