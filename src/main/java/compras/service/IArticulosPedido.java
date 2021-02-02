package compras.service;

import java.util.List;

import compras.modelos.ArticulosPedido;



public interface IArticulosPedido {

	List<ArticulosPedido> findAll();
	
	ArticulosPedido findById(int id);
	
	ArticulosPedido createArticulosPedido(ArticulosPedido articulosPedido);
	
	ArticulosPedido updateArticulosPedido(ArticulosPedido articulosPedido);
	
	void deleteById(int id);
	
	void deleteAll();
	
	
	
}
