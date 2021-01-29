package compras.service;

import java.util.List;

import compras.modelos.Compra;

public interface ICompraService {
	
	List<Compra> findAll();
	
	Compra findByIdPedido(Compra compra);
	
	//Compra findByIdCompra(Compra compra);
	
	Compra findById(int id);
	
	Compra createCompra(Compra compra);
	
	Compra updateCompra(Compra compra);
	
	void deleteIdCompra(int id);
	
	void deleteAllCompras();
	

}
