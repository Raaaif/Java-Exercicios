package Exercicio1;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1 ano -- 365 dias
		 * 1 m�s -- 30 dias
		 * 1 dia -- 1 dia
		 */
		Scanner leia = new Scanner(System.in);
		
		int anos,meses,dias,tempo;
		
		System.out.println("Digite quantos dias de vida voc� j� tem: ");
		tempo = leia.nextInt();
		anos = tempo / 365;
		meses = (tempo - (365 * anos)) / 30;
		dias = (tempo - (365 * anos)) %30;
		
		System.out.println("\nVoc� viveu at� o momento: "+anos+" anos, "+meses+" meses e "+dias+" dias de vida.");



	}

}
