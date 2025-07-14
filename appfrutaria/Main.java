package br.com.appfrutaria;

import br.com.appfrutaria.view.Atendente;
import br.com.appfrutaria.service.Estoque;

public class Main {

	public static void main(String[] args) {

		Atendente atendente = new Atendente();

		int escolha = 0;
		int opcaoMenuEscolhida = 0;

		Estoque estoque = new Estoque();

		do {
			escolha = atendente.escolha();
			opcaoMenuEscolhida = atendente.menuPrincipal();
			estoque.gerenciarEstoque(opcaoMenuEscolhida, atendente, escolha);

		} while (opcaoMenuEscolhida != 0);
	}
}
