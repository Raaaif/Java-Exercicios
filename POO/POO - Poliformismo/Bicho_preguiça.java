package Exercicios_VeM;

public class Bicho_pregui�a extends Animais{
	
	private int horaSono;
	private String sobe;
	
	public Bicho_pregui�a(String nomeCient,String habitat, String domesticado,String somEmetido,String alimento,int idade,double velocidade, String sobe, int horaSono) {
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
		System.out.println("\nNome cientifico: "+getNomeCient()+"\nQual seu habitat? R:"+getHabitat()+"\n� um animal domestic�vel? R: "+getDomesticado()+"Emite um som? R:"+getSomEmetido()+"\nAlimenta��o baseada em: "+getAlimento()+"\nQuanto tempo vive em m�dia? R: "+getIdade()+
				" anos\nSua velocidade m�xima � de: "+getVelo()+"Km/h\nSobe em �rvores? R: "+sobe+"\nDorme em m�dia"+horaSono+" horas por dia");
		
	}

}
