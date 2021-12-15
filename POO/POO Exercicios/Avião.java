package Exercicios_VeM;

public class Avião {
	private String nome;
	private String cor;
	private double vel;
	
	public Avião (String nome, String cor, double vel) {
		this.nome = nome;
		this.cor = cor;
		this.vel = vel;
	}
	public void imprimirinfo() {
		System.out.println("\nNome/modelo do avião: "+nome+"\nCor do avião: "+cor+"\nSua velocidade é de: "+vel+" Km/h");
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getVel() {
		return vel;
	}
	public void setVel(double vel) {
		this.vel = vel;
	}
	

}
