package br.com.appfrutaria.service;

import br.com.appfrutaria.model.Fruta;
import br.com.appfrutaria.model.Verdura;
import br.com.appfrutaria.model.Produto;
import java.util.ArrayList;
import java.util.List;
import br.com.appfrutaria.view.Atendente;

public class Estoque {
	List<Produto> estoque;

	public Estoque() {
		estoque = new ArrayList<>();
	}

	public List<Produto> getEstoque() {
		return estoque;
	}

	public void setEstoque(List<Produto> estoque) {
		this.estoque = estoque;
	}

	public void gerenciarEstoque(int opcaoMenuEscolhida, Atendente atendente) {

		switch (opcaoMenuEscolhida) {

		case 0:
			System.out.println("Saindo...");
			break;

		case 1:
			String nomeFruta = atendente.cadastrarNomeFruta();
			double precoFruta = atendente.cadastrarPreco();
			int quantidadeFruta = atendente.cadastrarQuantidade();
			double pesoFruta = atendente.cadastrarPesoFruta();

			Produto fruta = new Fruta(nomeFruta, precoFruta, quantidadeFruta, pesoFruta);
			estoque.add(fruta);

			break;

		case 2:
			String nomeVerdura = atendente.cadastrarNomeVerdura();
			double precoVerdura = atendente.cadastrarPreco();
			int quantidadeVerdura = atendente.cadastrarQuantidade();
			String tipoVerdura = atendente.cadastrarTipoVerdura();

			Produto verdura = new Verdura(nomeVerdura, precoVerdura, quantidadeVerdura, tipoVerdura);
			estoque.add(verdura);

			break;

		case 3:
			for (int i = 0; i < estoque.size(); i++) {
				Produto produto = estoque.get(i);
				System.out.println("\n-------------------------------");
				System.out.println("Índice: " + i);

				if (produto instanceof Fruta ImpFruta) {
					atendente.imprimirFruta(ImpFruta);
				} else if (produto instanceof Verdura ImpVerdura) {
					atendente.imprimirVerdura(ImpVerdura);
				}

			}
			break;

		case 4:
			int indice = atendente.excluirFruta();

			if (indice >= 0 && indice < estoque.size()) {
				Produto removido = estoque.remove(indice);
				System.out.println("✅ Produto \"" + removido.getNome() + "\" removido com sucesso!");
			} else {
				System.out.println("⚠️ Produto não encontrado!");
			}

			break;
		}

	}
}
