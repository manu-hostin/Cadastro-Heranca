package br.com.appCadastro.service;

import br.com.appCadastro.model.Cliente;
import br.com.appCadastro.model.Entregador;
import java.util.Scanner;

public class CadastroService {

	public Cliente cadastrarCliente(Scanner leia) {
		Cliente cliente = new Cliente();

		System.out.print("Nome do Cliente: ");
		cliente.setNome(leia.nextLine());

		System.out.print("Telefone do Cliente: ");
		cliente.setTelefone(leia.nextLine());

		System.out.print("Endereço de entrega: ");
		cliente.setEndereco(leia.nextLine());

		return cliente;
	}

	public Entregador cadastrarEntregador(Scanner leia) {
		Entregador moto = new Entregador();

		System.out.print("Nome do Entregador: ");
		moto.setNome(leia.nextLine());

		System.out.print("Telefone do Entregador: ");
		moto.setTelefone(leia.nextLine());

		System.out.print("Placa da moto: ");
		moto.setPlacaMoto(leia.nextLine());

		return moto;
	}

}
