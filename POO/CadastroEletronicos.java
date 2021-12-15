package Exercicios_VeM;

public class CadastroEletronicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aparelho_eletronico aparelho1 = new Aparelho_eletronico("S10","Cinza","Samsung",12,1500);
		aparelho1.imprimirinfo();
		System.out.println("\n\n********************************************Alteração de modelo*************************************************");
		aparelho1.setAparelho("S9");
		aparelho1.setCor("Rosê");
		aparelho1.setTamanhoTela(10);
		aparelho1.setValor(1200);
		aparelho1.imprimirinfo();
		System.out.println("\n\n**************************************************************************************************************************");


	}

}
