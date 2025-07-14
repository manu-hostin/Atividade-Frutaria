package br.com.appfrutaria.view;

import br.com.appfrutaria.model.Fruta;
import br.com.appfrutaria.model.Verdura;

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

	public int escolha() {
		System.out.println("\n-------------------------------");
		System.out.println("Olá!:)\nOque você deseja cadastrar?");
		System.out.println("1. Fruta;");
		System.out.println("2.  Verdura.");
		System.out.print(">");
		int escolha = leia.nextInt();
		return escolha;
	}

	public int menuPrincipal() {
		System.out.println("\n===============================");
		System.out.println("      🌿 TABELA FRUTARIA 🌿");
		System.out.println("===============================");
		System.out.println("  1️⃣  Cadastrar produto");
		System.out.println("  2️⃣  Listar produtos");
		System.out.println("  3️⃣  Excluir produto");
		System.out.println("-------------------------------");
		System.out.println("  0️⃣  Sair");
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
		String nome = leia.next();
		return nome;
	}

	public String cadastrarNomeVerdura() {
		System.out.println("\n-------------------------------");
		System.out.println("Cadastrar verdura:");
		System.out.println("Digite o nome da verdura para cadastrar: ");
		System.out.print(">");
		String nome = leia.next();
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
		String tipo = leia.next();
		return tipo;
	}

	public void imprimirFruta(Fruta fruta) {
		System.out.println("-------------------------------");
		System.out.println("Listar fruta:");
		System.out.println("Nome: " + fruta.getNome());
		System.out.println("Preço: " + fruta.getPreco());
		System.out.println("Quantidade: " + fruta.getQuantidade());
		System.out.println("Peso: " + fruta.getPeso());
	}

	public void imprimirVerdura(Verdura verdura) {
		System.out.println("-------------------------------");
		System.out.println("Listar verdura:");
		System.out.println("Nome: " + verdura.getNome());
		System.out.println("Preço: " + verdura.getPreco());
		System.out.println("Quantidade: " + verdura.getQuantidade());
		System.out.println("Tipo: " + verdura.getTipo());
	}

	public int excluirFruta() {
		System.out.println("\n-------------------------------");
		System.out.println("Excluir fruta:");
		System.out.println("Digite o índice da fruta que deseja excluir: ");
		System.out.print(">");
		int indice = leia.nextInt();
		return indice;
	}

	public int excluirVerdura() {
		System.out.println("\n--------------------------------");
		System.out.println("Excluir verdura:");
		System.out.println("Digite o índice da verdura que deseja excluir: ");
		System.out.print(">");
		int indice = leia.nextInt();
		return indice;
	}
}
