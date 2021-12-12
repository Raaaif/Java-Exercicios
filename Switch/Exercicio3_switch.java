package Exercicios_switch;

import java.util.Scanner;

public class Exercicio3_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		System.out.println("\nQual sua idade: ");
		idade = leia.nextInt();
		
		if(idade >= 10 && idade <= 14)
		{
			System.out.println("\nVoc� est� na categoria Infantil");
		}
		else if(idade >= 15 && idade <= 17)
		{
			System.out.println("\nVoc� est� na categoria Juvenil");
		}
		else if(idade >= 18 && idade <= 25)
		{
			System.out.println("\nVoc� est� na categoria Adulto");
		}
		else
		{
			System.out.println("Voc� est� fora das classifica��es de idade.");
		}

	}

}
