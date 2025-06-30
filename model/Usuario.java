package br.com.appCadastro.model;

public class Usuario {

	protected String nome;
	protected String telefone;

	public Usuario() {
		this.nome = "";
		this.telefone = "";
	}

	public Usuario(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
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

	public void dados() {
		System.out.println("Usuário: " + nome + " | Telefone: " + telefone);
	}

}
