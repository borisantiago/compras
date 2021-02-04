package compras.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import compras.modelos.ArticulosPedido;
import compras.repository.ArticulosPedidoRepository;

@Service
public class ArticulosPedidoService implements IArticulosPedido {

	@Autowired
	ArticulosPedidoRepository articulosPedidoRespository;
	
	
	@Override
	public List<ArticulosPedido> findAll() {
		return (List<ArticulosPedido>) articulosPedidoRespository.findAll();
	}

	@Override
	public ArticulosPedido findById(int id) {
		return articulosPedidoRespository.findById(id).orElse(null);
	}

	@Override
	public ArticulosPedido createArticulosPedido(ArticulosPedido articulosPedido) {
		return articulosPedidoRespository.save(articulosPedido);
	}

	@Override
	public ArticulosPedido updateArticulosPedido(ArticulosPedido articulosPedido) {
		return articulosPedidoRespository.save(articulosPedido);
	}

	@Override
	public void deleteById(int id) {
		articulosPedidoRespository.deleteById(id);
	}

	@Override
	public void deleteAll() {
		articulosPedidoRespository.deleteAll();
		
	}
	
	
	
	//Creados
	public double total = 0;
	
	public double costoTotalArticulo(int cantidad, double precio, boolean iva) {
		total= cantidad * precio;
		if( iva = true ) {
			double r= total* 0.12;
			total = total +r;
		}
		return total;
	}

	
	

}
