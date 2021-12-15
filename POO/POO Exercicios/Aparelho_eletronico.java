package Exercicios_VeM;

public class Aparelho_eletronico {
	private String aparelho;
	private String cor;
	private String marca;
	private int tamanhoTela;
	private int valor;
	
	public Aparelho_eletronico(String modeloCel,String cor,String marca,int tela,int valor) {
		this.aparelho = modeloCel;
		this.cor = cor;
		this.marca = marca;
		this.tamanhoTela = tela;
		this.valor = valor;
	}
	public void imprimirinfo() {
		System.out.println("\nO aparelho é um(a): "+aparelho+"\nA cor dele é: "+cor+"\nA marca é: "+marca+"\nO tamanhode sua tela é: "+tamanhoTela+" Polegadas\nO seu valor é: R$ "+valor);
	}
	public String getAparelho() {
		return aparelho;
	}
	public void setAparelho(String aparelho) {
		this.aparelho = aparelho;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getTamanhoTela() {
		return tamanhoTela;
	}
	public void setTamanhoTela(int tamanhoTela) {
		this.tamanhoTela = tamanhoTela;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}

}
