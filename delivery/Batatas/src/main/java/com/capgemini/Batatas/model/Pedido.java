package com.capgemini.Batatas.model;

import java.sql.Date;
import java.util.ArrayList;

import com.capgemini.enums.FormaPagamento;
import com.capgemini.enums.StatusPedido;

public class Pedido {

	private int codigo;
	ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	private Cliente cliente;
	private double valorTotal;
	private String descricao;
	private StatusPedido status;
	private FormaPagamento fPagamento;
	private Date data;	
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public ArrayList<Produto> getListaProdutos() {
		return listaProdutos;
	}
	public void setListaProdutos(ArrayList<Produto> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public StatusPedido getStatus() {
		return status;
	}
	public void setStatus(StatusPedido status) {
		this.status = status;
	}
	public FormaPagamento getfPagamento() {
		return fPagamento;
	}
	public void setfPagamento(FormaPagamento fPagamento) {
		this.fPagamento = fPagamento;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	
	
	
}
