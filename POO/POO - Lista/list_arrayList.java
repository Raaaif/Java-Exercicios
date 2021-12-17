package Exercicios_VeM;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class list_arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int op;
		Scanner leia = new Scanner(System.in);
		
		ArrayList <String> loja = new ArrayList();
		loja.add("Camisetas");
		loja.add("Calças");
		loja.add("Meias");
		loja.add("Blusas");
		loja.add("Bermudas");
		do
		{
			
			System.out.println("-------------------------------------------------");
			System.out.println("\n\t\tMenu do meu Estoque");
			System.out.println("\n1-Deseja adicionar um produto no estoque?");
			System.out.println("\n2-Deseja remover um produto do estoque?");
			System.out.println("\n3-Deseja atualizar um produto no estoque?");
			System.out.println("\n4-Mostrar todos os produtos do estoque");
			System.out.println("\n0-Deseja sair do programa?");
			System.out.println("\nQual a sua opção?");
			op = leia.nextInt();
			
			switch(op)
			{
			case 1:
				leia.nextLine();
				System.out.println("\nDigite o produto para adicionar no estoque: ");
				String produto = leia.nextLine();
				loja.add(produto);
				break;
			case 2:
				leia.nextLine();
				System.out.println("\nDigite o produto para remover do estoque: ");
				String produtor = leia.nextLine();
				if(loja.contains(produtor))
				{
					loja.remove(produtor);
				}
				else
				{
					System.out.println("\nProduto não existe no estoque!!!");
				}
				break;
			case 3:
				leia.nextLine();
				System.out.println("\nDigite o produto que quer atualizar:");
				String verifica = leia.nextLine();
				System.out.println("\nDigite o nome do produto que entrará no lugar do produto: "+verifica+" : ");
				String novo = leia.nextLine();
				if(loja.contains(verifica))
				{
					loja.remove(verifica);
					loja.add(novo);
				}
				else
				{
					System.out.println("\nProduto não existe!!!");
				}
				System.out.println(loja);
				break;
			case 4:
				System.out.println("\nMostrar os produtos do estoque...");
				System.out.println(loja);
				break;
				default:
					System.out.println("\nFinalizou o programa...");
			}
			
			
		}while(op!=0);

	}

}
