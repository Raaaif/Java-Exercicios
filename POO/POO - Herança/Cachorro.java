package Exercicios_VeM;

public class Cachorro extends Animais {
	
	private String cor;
	private float comprimento;
	
	public Cachorro(String nome, int idade, String raça,String nomeCient,String domesticado,String alimento,String somEmetido,float velocidade,float comprimento,String cor) {
		super(nomeCient,domesticado,nome,somEmetido,alimento,idade,velocidade,raça);
		this.cor = cor;
		this.comprimento = comprimento;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getComprimento() {
		return comprimento;
	}

	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nNome do cachorro: "+getNome()+"\nIdade: "+getIdade()+" anos\nRaça: "+getRaça()+"\nNome cientifico: "+getNomeCient()+"\nÉ um animal domesticável? R: "+getDomesticado()+
				"\nAlimentação baseada em: "+getAlimento()+"Emite um som: "+getSomEmetido()+"\nSua velocidade máxima é de: "+getVelo()+"Km/h\nSeu comprimento total é de: "+comprimento+" cm\nSua cor é: "+cor);
		
	}

}
