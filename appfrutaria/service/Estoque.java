package br.com.appfrutaria.service;

import br.com.appfrutaria.model.Fruta;
import br.com.appfrutaria.model.Verdura;
import java.util.ArrayList;
import java.util.List;
import br.com.appfrutaria.view.Atendente;

public class Estoque {
	List<Fruta> estoqueFruta;
	List<Verdura> estoqueVerdura;

	public Estoque() {
		estoqueFruta = new ArrayList<>();
		estoqueVerdura = new ArrayList<>();
	}

	public List<Fruta> getEstoqueFruta() {
		return estoqueFruta;
	}

	public void setEstoqueFruta(List<Fruta> estoqueFruta) {
		this.estoqueFruta = estoqueFruta;
	}

	public List<Verdura> getEstoqueVerdura() {
		return estoqueVerdura;
	}

	public void setEstoqueVerdura(List<Verdura> estoqueVerdura) {
		this.estoqueVerdura = estoqueVerdura;
	}

	public void gerenciarEstoque(int opcaoMenuEscolhida, Atendente atendente, int escolha) {

		if (escolha == 1) {

			switch (opcaoMenuEscolhida) {
			case 0:
				System.out.println("Saindo...");
				break;

			case 1:
				String nomeFruta = atendente.cadastrarNomeFruta();
				double precoFruta = atendente.cadastrarPreco();
				int quantidadeFruta = atendente.cadastrarQuantidade();
				double pesoFruta = atendente.cadastrarPesoFruta();

				Fruta fruta = new Fruta(nomeFruta, precoFruta, quantidadeFruta, pesoFruta);
				estoqueFruta.add(fruta);
				break;

			case 2:
				for (int novaFruta = 0; novaFruta < estoqueFruta.size(); novaFruta++) {
					System.out.println("\n-------------------------------");
					System.out.println("Índice: " + novaFruta);
					atendente.imprimirFruta(estoqueFruta.get(novaFruta));
				}
				break;

			case 3:
				int indice = atendente.excluirFruta();
				estoqueFruta.remove(indice);
				break;
			}

		} else if (escolha == 2) {
			switch (opcaoMenuEscolhida) {

			case 0:
				System.out.println("Saindo...");
				break;

			case 1:
				String nomeVerdura = atendente.cadastrarNomeVerdura();
				double precoVerdura = atendente.cadastrarPreco();
				int quantidadeVerdura = atendente.cadastrarQuantidade();
				String tipoVerdura = atendente.cadastrarTipoVerdura();

				Verdura verdura = new Verdura(nomeVerdura, precoVerdura, quantidadeVerdura, tipoVerdura);
				estoqueVerdura.add(verdura);
				break;

			case 2:
				for (int novaVerdura = 0; novaVerdura < estoqueVerdura.size(); novaVerdura++) {
					System.out.println("\n-------------------------------");
					System.out.println("Índice: " + novaVerdura);
					atendente.imprimirVerdura(estoqueVerdura.get(novaVerdura));
				}
				break;

			case 3:
				int i = atendente.excluirVerdura();
				estoqueVerdura.remove(i);
				break;
			}
		}
	}
}
