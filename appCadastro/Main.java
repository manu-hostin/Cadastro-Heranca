package br.com.appCadastro;

import br.com.appCadastro.model.Cliente;
import br.com.appCadastro.model.Entregador;
import br.com.appCadastro.service.CadastroService;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		CadastroService cadastro = new CadastroService();

		System.out.println("=== Cliente ===");
		Cliente cliente = cadastro.cadastrarCliente(leia);

		System.out.println("\n=== Entregador ===");
		Entregador entrega = cadastro.cadastrarEntregador(leia);

		System.out.println("\n=== Dados ===");
		cliente.mostrarDados();
		System.out.println();
		entrega.mostrarDados();

		leia.close();
	}

}
