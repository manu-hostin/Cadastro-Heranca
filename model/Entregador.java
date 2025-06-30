package br.com.appCadastro.model;

public class Entregador extends Usuario {

	private String placaMoto;

	public Entregador() {
		super();
		this.placaMoto = "";
	}

	public Entregador(String placaMoto) {
		super();
		this.placaMoto = placaMoto;
	}

	public String getPlacaMoto() {
		return placaMoto;
	}

	public void setPlacaMoto(String placaMoto) {
		this.placaMoto = placaMoto;
	}

	public void mostrarDados() {
		dados();
		System.out.println("Placa da moto: " + placaMoto);
	}

}
