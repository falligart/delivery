package com.capgemini.Batatas.Controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.capgemini.Batatas.dao.ProdutoDAO;
import com.capgemini.Batatas.model.Adicional;
import com.capgemini.Batatas.model.Batata;
import com.capgemini.Batatas.model.Ingrediente;

@Controller
public class ProdutoController {
	
	private static ProdutoDAO dao = new ProdutoDAO();
	
	@GetMapping("/adicionais")
	@ResponseBody
	public ArrayList<Adicional> buscarAdicionais() {
		ArrayList<Adicional> lista = dao.buscarAdicional();
		return lista;
	}

	@GetMapping("/ingredientes")
	@ResponseBody
	public ArrayList<Ingrediente> buscarIngredientes() {
		ArrayList<Ingrediente> lista = dao.buscarIngredientes();
		return lista;
	}

	@GetMapping("/batatas")
	@ResponseBody
	public ArrayList<Batata> buscarBatatas() {
		ArrayList<Batata> lista = dao.buscarBatata();
		return lista;
	}
	
	@GetMapping("/batatas/{index}")
	@ResponseBody
	public Batata buscarBatatas(@PathVariable int index) {
		return dao.buscarBatata(index);
	}



}
