package Exercicios_VeM;

public class Bicho_preguiça extends Animais{
	
	private int horaSono;
	private String sobe;
	
	public Bicho_preguiça(String nomeCient,String habitat, String domesticado,String somEmetido,String alimento,int idade,double velocidade, String sobe, int horaSono) {
		super(nomeCient,habitat,domesticado,somEmetido,alimento,idade,velocidade);
		this.horaSono = horaSono;
		this.sobe = sobe;
	}

	public int getHoraSono() {
		return horaSono;
	}

	public void setHoraSono(int horaSono) {
		this.horaSono = horaSono;
	}

	public String getSobe() {
		return sobe;
	}

	public void setSobe(String sobe) {
		this.sobe = sobe;
	}
	public void imprimirInfo()
	{
		System.out.println("\nNome cientifico: "+getNomeCient()+"\nQual seu habitat? R:"+getHabitat()+"\nÉ um animal domesticável? R: "+getDomesticado()+"Emite um som? R:"+getSomEmetido()+"\nAlimentação baseada em: "+getAlimento()+"\nQuanto tempo vive em média? R: "+getIdade()+
				" anos\nSua velocidade máxima é de: "+getVelo()+"Km/h\nSobe em árvores? R: "+sobe+"\nDorme em média"+horaSono+" horas por dia");
		
	}

}
