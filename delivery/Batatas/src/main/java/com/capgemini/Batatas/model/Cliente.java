package com.capgemini.Batatas.model;

public class Cliente extends Pessoa{
	
	public Cliente(String nome, String cpf, String telefone, String endereco) {
		super();
		super.setNome(nome);
		super.setCpf(cpf);
		super.setTelefone(telefone);
		super.setEndereco(endereco);
	}
}
