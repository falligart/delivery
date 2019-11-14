package com.capgemini.Batatas.model;
import java.util.ArrayList;

import com.capgemini.enums.tipoProduto;;


public class Produto {
	
	private String nome;
	private double valor;
	private tipoProduto tipo;
	private int id;	
	private String descricao;
	private ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
	private ArrayList<Adicional> adicionais = new ArrayList<Adicional>();
	
	public Produto(int id, String nome, double valor, tipoProduto tipo, ArrayList<Adicional> adicionais) {
		super();
		this.id = id;
		this.nome = nome;
		this.valor = valor;
		this.tipo = tipo;
		this.adicionais = adicionais;
	}	
	
	public Produto(int id, String nome, double valor, tipoProduto tipo) {
		super();
		this.id = id;
		this.nome = nome;
		this.valor = valor;
		this.tipo = tipo;
	}	
	
	public Produto(int id, String nome, tipoProduto tipo) {
		super();
		this.id = id;
		this.nome = nome;
		this.tipo = tipo;
	}	
	
	public Produto(int id, String nome, String descricao, double valor, tipoProduto tipo) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
		this.tipo = tipo;
	}
	
	public Produto() {
		super();
	}
	
	
	public Produto(ArrayList<Ingrediente> ingredient) {
		super();
		this.ingredientes = ingredient;
	}

	public ArrayList<Ingrediente> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}

	public ArrayList<Adicional> getAdicionais() {
		return adicionais;
	}

	public void setAdicionais(ArrayList<Adicional> adicionais) {
		this.adicionais = adicionais;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public tipoProduto getTipo() {
		return tipo;
	}
	public void setTipo(tipoProduto tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", valor=" + valor + ", tipo=" + tipo + ", id=" + id + ", descricao="
				+ descricao + ", ingredientes=" + ingredientes + ", adicionais=" + adicionais + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adicionais == null) ? 0 : adicionais.hashCode());
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + id;
		result = prime * result + ((ingredientes == null) ? 0 : ingredientes.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		long temp;
		temp = Double.doubleToLongBits(valor);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (adicionais == null) {
			if (other.adicionais != null)
				return false;
		} else if (!adicionais.equals(other.adicionais))
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (id != other.id)
			return false;
		if (ingredientes == null) {
			if (other.ingredientes != null)
				return false;
		} else if (!ingredientes.equals(other.ingredientes))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (tipo != other.tipo)
			return false;
		if (Double.doubleToLongBits(valor) != Double.doubleToLongBits(other.valor))
			return false;
		return true;
	}


	
	
	

}
