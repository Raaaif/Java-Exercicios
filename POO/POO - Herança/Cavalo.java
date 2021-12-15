package Exercicios_VeM;

public class Cavalo extends Animais {
	
	private String sela;
	private int altura;
	
	public Cavalo(String nome, int idade, String raça,String nomeCient,String domesticado,String alimento,String somEmetido,float velocidade,String sela,int altura) {
	super(nomeCient,domesticado,nome,somEmetido,alimento,idade,velocidade,raça);
	this.sela = sela;
	this.altura = altura;
	}

	public String getSela() {
		return sela;
	}

	public void setSela(String sela) {
		this.sela = sela;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nNome do cavalo: "+getNome()+"\nIdade: "+getIdade()+" anos\nRaça: "+getRaça()+"\nNome cientifico: "+getNomeCient()+"\nÉ um animal domesticável? R: "+getDomesticado()+
				"\nAlimentação baseada em: "+getAlimento()+"Emite um som: "+getSomEmetido()+"\nSua velocidade máxima é de: "+getVelo()+"Km/h\nSua sela atual é feita de: "+sela+" cm\nSua altura é: "+altura+" cm");
		
	}

}
