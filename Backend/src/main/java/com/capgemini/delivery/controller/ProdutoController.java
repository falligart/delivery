package com.capgemini.delivery.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.capgemini.delivery.dao.ProdutoDAO;
import com.capgemini.delivery.model.Batata;
import com.capgemini.delivery.model.Bebida;
import com.capgemini.delivery.model.Cliente;
import com.capgemini.delivery.model.Imagem;
import com.capgemini.delivery.model.Produto;
import com.capgemini.delivery.model.Stock;
import com.capgemini.delivery.model.StockDetail;
import com.capgemini.delivery.model.Tag;
import com.capgemini.delivery.model.Telefone;
import com.capgemini.delivery.model.Tipo;
import com.capgemini.delivery.repository.ClienteRepository;
import com.capgemini.delivery.repository.ImagensRepository;
import com.capgemini.delivery.repository.ProdutoRepository;
import com.capgemini.delivery.repository.StockRepository;

@Controller
@RequestMapping("/produtos")
public class ProdutoController {

	private static ProdutoDAO dao = new ProdutoDAO();
	
	@Autowired
	private ImagensRepository imagemRepository;
	
	@Autowired
	private StockRepository stockRepository;

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;	
	




	

	
	@RequestMapping(value = "bebidas", method = RequestMethod.GET)
    @ResponseBody
    public List<Bebida> buscarTodosBebidas() {
		List<Bebida> bebidas = dao.buscarBebidas();
		return bebidas;
    }
    
	@RequestMapping(value = "adicionais", method = RequestMethod.GET)
    @ResponseBody
    public List<Produto> buscarTodosAdicionais() {
        List<Produto> adicionais = dao.buscarTodosAdicionais();
        return adicionais;
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    @ResponseBody
    public Optional<Produto> buscarUm(@PathVariable long id) {    	
    	return produtoRepository.findById(id);
    }
    
    @RequestMapping(value = "/buscar", method = RequestMethod.GET)
    @ResponseBody
    public List<Produto> buscarTodosProdutos() {    	
    	return (List<Produto>) produtoRepository.findAll();
    }
    
	@RequestMapping(value = "/buscar/tipo/{tipo}", method = RequestMethod.GET)
    @ResponseBody
    public List<Produto> buscarTipoProduto(@PathVariable Tipo tipo) {    	
		return produtoRepository.findByTipo(tipo);
    }
    
    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    @ResponseBody
    String excluirProduto(@PathVariable Long id) {
    	produtoRepository.deleteById(id);
    	return "sucess";
    }
    
    @RequestMapping(value = "" , method = RequestMethod.POST)
    @ResponseBody
    Produto inserirProduto(@RequestBody Produto produto) {
    	return produtoRepository.save(produto);
    }
    
    @RequestMapping(value = "/update/{id}" , method = RequestMethod.PUT)
    @ResponseBody
    Produto atualizarProduto(@PathVariable int id,@RequestBody Produto produto) {    	
    	Optional<Produto> p = buscarUm(id);
    	produto.setId(p.get().getId());
    	if(produto.getTitulo() == null){produto.setTitulo(p.get().getTitulo());}
    	if(produto.getPreco() == 0){produto.setPreco(p.get().getPreco());}
    	if(produto.getObervacao() == null){produto.setObervacao(p.get().getObervacao());}
    	if(produto.getTipo() == null){produto.setTipo(p.get().getTipo());}
    	return produtoRepository.save(produto);
    }
}