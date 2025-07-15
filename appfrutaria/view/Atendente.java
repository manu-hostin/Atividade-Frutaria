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
		int opcaoMenu = leia.nextInt();
		leia.nextLine();
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
		System.out.println("\nDigite o preço:");
		System.out.print("> R$");
		double preco = leia.nextDouble();
		return preco;
	}

	public int cadastrarQuantidade() {
		System.out.println("\nDigite a quantidade: ");
		System.out.print(">");
		int quantidade = leia.nextInt();
		leia.nextLine();
		return quantidade;
	}

	public double cadastrarPesoFruta() {
		System.out.println("\nDigite o peso: ");
		System.out.print(">");
		double peso = leia.nextDouble();
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

	public int excluirFruta() {
		System.out.println("\n-------------------------------");
		System.out.println("Excluir fruta:");
		System.out.println("Digite o índice da fruta que deseja excluir: ");
		System.out.print(">");
		int indice = leia.nextInt();
		leia.nextLine();
		return indice;
	}

	public int excluirVerdura() {
		System.out.println("\n--------------------------------");
		System.out.println("Excluir verdura:");
		System.out.println("Digite o índice da verdura que deseja excluir: ");
		System.out.print(">");
		int indice = leia.nextInt();
		leia.nextLine();
		return indice;
	}
}
