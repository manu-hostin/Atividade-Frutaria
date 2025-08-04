package br.com.appfrutaria.view;

import br.com.appfrutaria.model.Fruta;
import br.com.appfrutaria.model.Verdura;
import br.com.appfrutaria.model.Produto;

import java.util.Scanner;

public class Atendente {
	Scanner leia;

	public Atendente() {
		leia = new Scanner(System.in);
	}

	public Scanner getLeia() {
		return leia;
	}

	public void setLeia(Scanner leia) {
		this.leia = leia;
	}

	public int menuPrincipal() {
		int opcaoMenu = 0;
		boolean invalido = true;

		do {
			System.out.println("\n===============================");
			System.out.println("      🌿 TABELA FRUTARIA 🌿");
			System.out.println("===============================");
			System.out.println("  1️  Cadastrar fruta;");
			System.out.println("  2️  Cadastrar Verdura;");
			System.out.println("  3  Listar produtos;");
			System.out.println("  4  Excluir produto.");
			System.out.println("-------------------------------");
			System.out.println("  0  Sair");
			System.out.println("===============================");
			System.out.print("Escolha uma opção: > ");
			String texto = leia.nextLine();
			try {
				opcaoMenu = Integer.parseInt(texto);
				invalido = false;
			} catch (NumberFormatException erro) {
				System.out.println("\n❌ Erro! Digite uma entrada válida.");
			}
		} while (invalido);

		return opcaoMenu;

	}

	public String cadastrarNomeFruta() {
		System.out.println("\n-------------------------------");
		System.out.println("Cadastrar fruta:");
		System.out.println("Digite o nome da fruta para cadastrar: ");
		System.out.print(">");
		String nome = leia.nextLine();
		return nome;
	}

	public String cadastrarNomeVerdura() {
		System.out.println("\n-------------------------------");
		System.out.println("Cadastrar verdura:");
		System.out.println("Digite o nome da verdura para cadastrar: ");
		System.out.print(">");
		String nome = leia.nextLine();
		return nome;
	}

	public double cadastrarPreco() {
		double preco = 0;
		boolean invalido = true;

		do {
			System.out.println("\nDigite o preço:");
			System.out.print("> R$");
			String texto = leia.nextLine();

			try {
				preco = Double.parseDouble(texto);
				invalido = false;
			} catch (NumberFormatException erro) {
				System.out.println("\n❌ Erro! Digite uma entrada válida.");
			}

		} while (invalido);

		return preco;

	}

	public int cadastrarQuantidade() {
		int quantidade = 0;
		boolean invalido = true;

		do {
			System.out.println("\nDigite a quantidade: ");
			System.out.print(">");
			String texto = leia.nextLine();

			try {
				quantidade = Integer.parseInt(texto);
				invalido = false;
			} catch (NumberFormatException erro) {
				System.out.println("\n❌ Erro! Digite uma entrada válida.");
			}

		} while (invalido);

		return quantidade;
	}

	public double cadastrarPesoFruta() {
		double peso = 0;
		boolean invalido = true;

		do {
			System.out.println("\nDigite o peso: ");
			System.out.print(">");
			String texto = leia.nextLine();

			try {
				peso = Integer.parseInt(texto);
				invalido = false;
			} catch (NumberFormatException erro) {
				System.out.println("\n❌ Erro! Digite uma entrada válida.");
			}
		} while (invalido);

		return peso;
	}

	public String cadastrarTipoVerdura() {
		System.out.println("\nDigite o tipo: ");
		System.out.print(">");
		String tipo = leia.nextLine();
		return tipo;
	}

	public void imprimirProduto(Produto produto) {
		System.out.println("\n-------------------------------");
		System.out.println(produto);
	}

	public void imprimirVerdura(Verdura verdura) {
		System.out.println("🥦 Verdura");
		System.out.println(verdura);
	}

	public void imprimirFruta(Fruta fruta) {
		System.out.println("🍎 Fruta");
		System.out.println(fruta);
	}

	public String solicitarNomeParaExcluir() {
		System.out.println("\n-------------------------------");
		System.out.println("Excluir produto:");
		System.out.println("Digite o nome do produto que deseja excluir: ");
		System.out.print(">");
		return leia.nextLine();
	}

}
