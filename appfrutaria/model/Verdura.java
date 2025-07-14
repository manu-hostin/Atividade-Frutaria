package br.com.appfrutaria.model;

public class Verdura extends Produto {

	protected String tipo;
	
	public Verdura (String nome, double preco, int quantidade, String tipo) {
		super(nome, preco, quantidade);
		this.tipo=tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	

	
}
