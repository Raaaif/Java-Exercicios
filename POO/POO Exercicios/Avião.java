package Exercicios_VeM;

public class Avi�o {
	private String nome;
	private String cor;
	private double vel;
	
	public Avi�o (String nome, String cor, double vel) {
		this.nome = nome;
		this.cor = cor;
		this.vel = vel;
	}
	public void imprimirinfo() {
		System.out.println("\nNome/modelo do avi�o: "+nome+"\nCor do avi�o: "+cor+"\nSua velocidade � de: "+vel+" Km/h");
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
