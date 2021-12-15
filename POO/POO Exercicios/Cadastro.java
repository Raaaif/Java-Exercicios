package Exercicios_VeM;

public class Cadastro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cliente1 = new Cliente("Raif",11,"984571596",2301,25);
		cliente1.imprmirinfo();
		System.out.println("\n*******Alteração de cadastro*******");
		cliente1.setNome("Claudio");
		cliente1.setIdade(20);
		cliente1.imprmirinfo();
	}

}
