package Exercicios_VeM;

public class Cadastro_funcionarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("*************************************Lista de funcionários************************************************");
		
		Funcionario funcionario1 = new Funcionario("Carlos Antônio","Gerente de vendas",4200,29);
		funcionario1.imprimirinfo();
		System.out.println("\n\n*******************************************************************************************************");
		Funcionario funcionario2 = new Funcionario("Felipe Andrade","Gerente de Logistica",3800,27);
		funcionario2.imprimirinfo();
		System.out.println("\n\n*******************************************************************************************************");
		Funcionario funcionario3 = new Funcionario("Lucas Felipe","Vendedor",1500,23);
		funcionario3.imprimirinfo();
		System.out.println("\n\n*******************************************************************************************************");
		Funcionario funcionario4 = new Funcionario("Caio Marques","Estoquista",1900,29);
		funcionario4.imprimirinfo();
		System.out.println("\n\n*******************************************************************************************************");
		Funcionario funcionario5 = new Funcionario("André Claudio","Vendedor",1700,28);
		funcionario5.imprimirinfo();
		System.out.println("\n\n*******************************************************************************************************");


	}

}
