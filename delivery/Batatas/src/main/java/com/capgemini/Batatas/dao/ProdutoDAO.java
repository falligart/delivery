package com.capgemini.Batatas.dao;

import java.util.ArrayList;

import com.capgemini.Batatas.model.Adicional;
import com.capgemini.Batatas.model.Batata;
import com.capgemini.Batatas.model.Ingrediente;
import com.capgemini.enums.tipoProduto;

public class ProdutoDAO {
	ArrayList<Batata> produtos = new ArrayList<Batata>();
	ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
	ArrayList<Adicional> adicionais = new ArrayList<Adicional>();
	
	public ProdutoDAO() {
		buscarIngredientes();
		buscarAdicional();
		buscarBatata();
	}
	
	
	public ArrayList<Ingrediente> buscarIngredientes() {
		//POPULANDO OBJETO INGREDIENTE
		Ingrediente ingrediente;
		ingrediente = new Ingrediente(7, "pão", 4.99, tipoProduto.INGREDIENTE);
		ingredientes.add(ingrediente);
		
		Ingrediente ingrediente2;
		ingrediente2 = new Ingrediente(8, "carne", 4.99, tipoProduto.INGREDIENTE);
		ingredientes.add(ingrediente2);
		
		Ingrediente ingrediente3;
		ingrediente3 = new Ingrediente(9, "queijo", 4.99, tipoProduto.INGREDIENTE);
		ingredientes.add(ingrediente3);
		
		return ingredientes;
	}

	public ArrayList<Adicional> buscarAdicional() {
		//POPULANDO OBJETO Adicionais
		Adicional adicional;
		adicional = new Adicional(4, "Bacon", 4.99, tipoProduto.ADICIONAL);
		adicionais.add(adicional);
		
		Adicional adicional2;
		adicional2 = new Adicional(5, "Alho", 4.99, tipoProduto.ADICIONAL);
		adicionais.add(adicional2);
		
		Adicional adicional3;
		adicional3 = new Adicional(6, "Ovomaltine", 4.99, tipoProduto.ADICIONAL);
		adicionais.add(adicional3);
		
		
		return adicionais;
	}
	
	public ArrayList<Batata> buscarBatata() {
		//POPULANDO OBJETO BATATA
		Batata batata;
		batata = new Batata(1, "Batata", 4.99, tipoProduto.BATATA);
		batata.setAdicionais(adicionais);
		batata.setIngredientes(ingredientes);
		
		
		Batata batata1;
		batata1 = new Batata(2, "Batata Salgada", 6.99, tipoProduto.BATATA);
		batata1.setAdicionais(adicionais);
		batata1.setIngredientes(ingredientes);
		
		
		Batata batata2;
		batata2 = new Batata(3, "Batata Doce", 9.99, tipoProduto.BATATA);
		batata2.setAdicionais(adicionais);
		batata2.setIngredientes(ingredientes);
		
		produtos.add(batata);
		produtos.add(batata1);
		produtos.add(batata2);

		
		System.out.println(produtos);

		return produtos;
	}
	
	

	
	boolean excluirBatata(int id) {
		boolean encontrou = false;
		
		for (Batata batata : produtos) {
			if(batata.getId() == id) {
				produtos.remove(batata);
				encontrou = true;
				break;
			}
		}		
		return encontrou;
	}
	
	public Batata buscarBatata(int id) {

		for (Batata elemento : produtos) {
			if(elemento.getId() == id) {
				return elemento;
			}
			
		}
		return null;

	}
	
	
	

}
