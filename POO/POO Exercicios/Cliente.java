package Exercicios_VeM;

public class Cliente {
	private String nome;
	private String telefone;
	private int ddd;
	private int codigo;
	private int idade;
	
	//Atributos
	
	public Cliente (String nome,int ddd, String telefone, int codigo, int idade) {
		this.nome = nome;
		this.telefone = telefone;
		this.codigo = codigo;
		this.idade = idade;
		this.ddd = ddd;
		
	}
	
	public void  imprmirinfo() {
		System.out.println("\nCliente: "+nome+"\nTelefone: "+ddd+" "+telefone+"\nCódigo do cliente: "+codigo+"\nIdade: "+idade);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
		
	

}
