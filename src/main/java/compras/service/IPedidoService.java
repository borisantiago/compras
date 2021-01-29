package compras.service;

import java.util.List;

import compras.modelos.Pedido;

public interface IPedidoService {

	List<Pedido> findAll();
	
	Pedido findByIdPedido(Pedido pedido);
	//Pedido findByIdPedido(int idPedido);
	
	
	Pedido findById(int id);
	
	Pedido createPedido(Pedido pedido);
	
	Pedido updatePedido(Pedido pedido);
	
	void deletePedido(int idPedido);
	
	void deleteAllPedido();
	
	
}
