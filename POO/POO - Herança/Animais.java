package Exercicios_VeM;

public class Animais {
	private String nomeCient;
	private String habitat;
	private String domesticado;
	private String nome;
	private String somEmetido;
	private String alimento;
	private int idade;
	private double velo;
	private String raça;
	
	public Animais(String nomeCient,String habitat, String domesticado,String somEmetido,String alimento,int idade,double velo) {
		this.domesticado = domesticado;
		this.velo = velo;
		this.habitat = habitat;
		this.nomeCient = nomeCient;
		this.somEmetido =  somEmetido;
		this.alimento = alimento;
		this.idade = idade;
	}
	public Animais(String nomeCient, String domesticado, String nome,String somEmetido,String alimento,int idade,double velo,String raça) {
		this.domesticado = domesticado;
		this.velo = velo;
		this.nomeCient = nomeCient;
		this.somEmetido =  somEmetido;
		this.nome = nome;
		this.alimento = alimento;
		this.raça = raça;
		this.idade = idade;

	}

	public String getNomeCient() {
		return nomeCient;
	}

	public void setNomeCient(String nomeCient) {
		this.nomeCient = nomeCient;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String getDomesticado() {
		return domesticado;
	}

	public void setDomesticado(String domesticado) {
		this.domesticado = domesticado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSomEmetido() {
		return somEmetido;
	}

	public void setSomEmetido(String somEmetido) {
		this.somEmetido = somEmetido;
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getRaça() {
		return raça;
	}

	public void setRaça(String raça) {
		this.raça = raça;
	}
	public double getVelo() {
		return velo;
	}
	public void setVelo(double velo) {
		this.velo = velo;
	}
	
	

}
