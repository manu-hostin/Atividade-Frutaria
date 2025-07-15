package br.com.appfrutaria;

import br.com.appfrutaria.view.Atendente;
import br.com.appfrutaria.service.Estoque;

public class Main {

	public static void main(String[] args) {

		Atendente atendente = new Atendente();

		int opcaoMenuEscolhida = 0;

		Estoque estoque = new Estoque();

		do {
			opcaoMenuEscolhida = atendente.menuPrincipal();
			estoque.gerenciarEstoque(opcaoMenuEscolhida, atendente);

		} while (opcaoMenuEscolhida != 0);
	}
}