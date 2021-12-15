package Exercicios_VeM;

public class Funcionario {
	private String nome;
	private String cargo;
	private int salario;
	private int idade; 
	
	public Funcionario(String nome, String cargo, int salario, int idade) {
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
		this.idade = idade;
	}
	public void imprimirinfo() {
		System.out.println("\nFuncionário: "+nome+"\nCargo:"+cargo+"\nSalário: R$"+salario+"\nIdade: "+idade+" anos");
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	

}
