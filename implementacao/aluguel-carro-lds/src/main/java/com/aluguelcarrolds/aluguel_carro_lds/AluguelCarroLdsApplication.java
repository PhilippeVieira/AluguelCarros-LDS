package com.aluguelcarrolds.aluguel_carro_lds;

import com.aluguelcarrolds.aluguel_carro_lds.model.Automovel;
import com.aluguelcarrolds.aluguel_carro_lds.model.Cliente;
import com.aluguelcarrolds.aluguel_carro_lds.model.Pedido;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


@SpringBootApplication
public class AluguelCarroLdsApplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Cliente cliente = new Cliente();
		List<Automovel> automoveisDisponiveis = criarAutomoveisExemplo();

		boolean exit = false;

		System.out.println("Bem-vindo ao sistema de aluguel de automóveis!");

		while (!exit) {
			System.out.println("\nMenu:");
			System.out.println("1. Cadastrar Cliente");
			System.out.println("2. Criar Pedido");
			System.out.println("3. Consultar Pedido");
			System.out.println("4. Modificar Pedido");
			System.out.println("5. Cancelar Pedido");
			System.out.println("6. Listar Automóveis Disponíveis");
			System.out.println("0. Sair");
			System.out.print("Escolha uma opção: ");

			int opcao = scanner.nextInt();
			scanner.nextLine(); // Consumir o newline

			switch (opcao) {
				case 1:
					cliente = cadastrarCliente(scanner);
					break;

				case 2:
					criarPedido(scanner, cliente, automoveisDisponiveis);
					break;

				case 3:
					consultarPedido(scanner, cliente);
					break;

				case 4:
					modificarPedido(scanner, cliente);
					break;

				case 5:
					cancelarPedido(scanner, cliente);
					break;

				case 6:
					listarAutomoveis(automoveisDisponiveis);
					break;

				case 0:
					exit = true;
					System.out.println("Saindo...");
					break;

				default:
					System.out.println("Opção inválida. Tente novamente.");
					break;
			}
		}

		scanner.close();
	}

	private static Cliente cadastrarCliente(Scanner scanner) {
		Cliente cliente = new Cliente();
		System.out.println("Cadastro de Cliente:");
		System.out.print("Nome: ");
		cliente.setNome(scanner.nextLine());

		System.out.print("RG: ");
		cliente.setRg(scanner.nextLine());

		System.out.print("CPF: ");
		cliente.setCpf(scanner.nextLine());

		System.out.print("Endereço: ");
		cliente.setEndereco(scanner.nextLine());

		System.out.print("Profissão: ");
		cliente.setProfissao(scanner.nextLine());

		System.out.println("Cliente cadastrado com sucesso!");
		return cliente;
	}

	private static void criarPedido(Scanner scanner, Cliente cliente, List<Automovel> automoveisDisponiveis) {
		if (cliente.getNome() == null) {
			System.out.println("Nenhum cliente cadastrado. Cadastre um cliente primeiro.");
			return;
		}

		listarAutomoveis(automoveisDisponiveis);

		System.out.print("Escolha o automóvel pela matrícula: ");
		String matriculaEscolhida = scanner.nextLine();
		Automovel automovelEscolhido = automoveisDisponiveis.stream()
				.filter(a -> a.getMatricula().equals(matriculaEscolhida))
				.findFirst()
				.orElse(null);

		if (automovelEscolhido == null) {
			System.out.println("Automóvel não encontrado.");
			return;
		}

		Pedido novoPedido = new Pedido();
		novoPedido.setAutomovel(automovelEscolhido);
		novoPedido.setDataCriacao(LocalDate.now());
		novoPedido.setStatus("Pendente");

		if (cliente.getPedidos() == null) {
			cliente.setPedidos(new ArrayList<>());
		}
		cliente.getPedidos().add(novoPedido);

		System.out.println("Pedido criado com sucesso!");
	}

	private static void consultarPedido(Scanner scanner, Cliente cliente) {
		if (cliente.getPedidos() == null || cliente.getPedidos().isEmpty()) {
			System.out.println("Nenhum pedido encontrado para este cliente.");
			return;
		}

		System.out.print("Informe o ID do pedido para consulta: ");
		Long pedidoId = scanner.nextLong();

		Pedido pedido = cliente.consultarPedido(pedidoId);
		if (pedido != null) {
			System.out.println("Detalhes do Pedido:");
			System.out.println("ID: " + ((Pedido) pedido).getId());
			System.out.println("Status: " + pedido.getStatus());
			System.out.println("Automóvel: " + pedido.getAutomovel().getMarca() + " " + pedido.getAutomovel().getModelo());
		} else {
			System.out.println("Pedido não encontrado.");
		}
	}

	private static void modificarPedido(Scanner scanner, Cliente cliente) {
		System.out.print("Informe o ID do pedido que deseja modificar: ");
		Long pedidoId = scanner.nextLong();
		scanner.nextLine(); // Consumir o newline

		Pedido pedidoExistente = cliente.consultarPedido(pedidoId);
		if (pedidoExistente == null) {
			System.out.println("Pedido não encontrado.");
			return;
		}

		System.out.print("Novo status para o pedido (Ex: Aprovado, Rejeitado): ");
		String novoStatus = scanner.nextLine();
		pedidoExistente.setStatus(novoStatus);

		System.out.println("Pedido modificado com sucesso!");
	}

	private static void cancelarPedido(Scanner scanner, Cliente cliente) {
		System.out.print("Informe o ID do pedido que deseja cancelar: ");
		Long pedidoId = scanner.nextLong();
		cliente.cancelarPedido(pedidoId);
		System.out.println("Pedido cancelado com sucesso.");
	}

	private static void listarAutomoveis(List<Automovel> automoveisDisponiveis) {
		System.out.println("Automóveis disponíveis:");
		for (Automovel auto : automoveisDisponiveis) {
			System.out.println(auto.getMatricula() + ": " + auto.getMarca() + " " + auto.getModelo() + " (" + auto.getAno() + ")");
		}
	}

	private static List<Automovel> criarAutomoveisExemplo() {
		List<Automovel> automoveis = new ArrayList<>();
		automoveis.add(new Automovel("ABC1234", 2022, "Toyota", "Corolla", "AAA-1234"));
		automoveis.add(new Automovel("DEF5678", 2021, "Honda", "Civic", "BBB-5678"));
		automoveis.add(new Automovel("GHI9101", 2023, "Chevrolet", "Onix", "CCC-9101"));
		return automoveis;
	}
}
