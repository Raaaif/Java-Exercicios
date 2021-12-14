package Exercicios_VeM;

public class CadastrodeAvioes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Avião aviao1 = new Avião("Globemaster III","Azul",5.000);
		aviao1.imprimirinfo();
		System.out.println("\n**************************************************************************\n");
		Avião aviao2 = new Avião("Stratocruiser","cinza",3.500);
		aviao2.imprimirinfo();
		System.out.println("\n**************************************************************************\n");
		Avião aviao3 = new Avião("Stratofortress","verde",4.000);
		aviao3.imprimirinfo();
		System.out.println("\n**************************************************************************\n");
		Avião aviao4 = new Avião("Peacemaker","Azul",3.000);
		aviao4.imprimirinfo();
		System.out.println("\n**************************************************************************\n");

	}

}
