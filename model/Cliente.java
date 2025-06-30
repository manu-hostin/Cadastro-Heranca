package br.com.appCadastro.model;

public class Cliente extends Usuario {

	private String endereco;

	public Cliente() {
		super();
		this.endereco = "";
	}

	public Cliente(String endereco) {
		super();
		this.endereco = endereco;
	}

	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void mostrarDados() {
		dados();
		System.out.println ("Endereço: "+endereco);
	}
	
}
