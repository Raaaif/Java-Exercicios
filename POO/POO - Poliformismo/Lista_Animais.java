package Exercicios_VeM;

public class Lista_Animais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("*******************************************Lista de animais***************************************************\n");
		System.out.println("\n\n\t\t\t\t******Lista de doguinhos*******");
		Cachorro dog1 = new Cachorro("Ted",3,"Pastor Alem�o","Canis lupus familiaris","Sim","Ra��o","Latido",48,64,"Marrom e preto");
		dog1.imprimirInfo();
		
		System.out.println("\n******************************************************************************************************************");
		Cachorro dog2 = new Cachorro("Malu",2,"Buldogue","Canis lupus familiaris","Sim","Ra��o","Latido",12,35,"Marrom, preto e branco");
		dog2.imprimirInfo();
		System.out.println("\n******************************************************************************************************************");
		
		System.out.println("\n\n\t\t\t\t******Lista de cavalitos*******");
		Cavalo cav1 = new Cavalo("Ellie",5,"Fr�sio","Equus caballus","Sim","Vegetais","Relincho",80,"De couro bege",175);
		cav1.imprimirInfo();
		System.out.println("\n******************************************************************************************************************");
		
		Cavalo cav2 = new Cavalo("Ben",7,"Paint Horse","Equus caballus","Sim","Vegetais","Relincho",72,"De couro preto",169);
		cav2.imprimirInfo();
		System.out.println("\n******************************************************************************************************************");
		
		Bicho_pregui�a pre1 = new Bicho_pregui�a("Folivora","Florestas tropicais �midas","N�o","N�o","Folhas, Frutos e Seivas",40,0.27,"Sim",17);
		pre1.imprimirInfo();
		
	}

}
