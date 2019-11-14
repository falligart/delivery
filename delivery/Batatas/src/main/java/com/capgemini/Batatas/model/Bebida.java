package com.capgemini.Batatas.model;

import java.util.ArrayList;

import com.capgemini.enums.tipoProduto;

public class Bebida extends Produto {

	public Bebida(int id, String nome, double valor, tipoProduto tipo, ArrayList<Adicional> adicionais) {
		super();
		super.setId(id);
		super.setNome(nome);
		super.setValor(valor);
		super.setTipo(tipo);
		super.setAdicionais(adicionais);
	}	
	
	public Bebida(int id, String nome, double valor, tipoProduto tipo) {
		super();
		super.setId(id);
		super.setNome(nome);
		super.setValor(valor);
		super.setTipo(tipo);
	}	
	
	public Bebida(int id, String nome, tipoProduto tipo) {
		super();
		super.setId(id);
		super.setNome(nome);
		super.setTipo(tipo);
	}	
	
	public Bebida(int id, String nome, String descricao, double valor, tipoProduto tipo) {
		super();
		super.setId(id);
		super.setNome(nome);
		super.setDescricao(descricao);
		super.setValor(valor);
		super.setTipo(tipo);
	}
	
}
