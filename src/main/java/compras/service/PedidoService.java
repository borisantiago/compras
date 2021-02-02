package compras.service;

import java.util.List;
//import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import compras.modelos.Pedido;
import compras.repository.PedidoRepository;


@Service
public class PedidoService implements IPedidoService {

	@Autowired
	PedidoRepository pedidoRepository;
	
	@Override
	public List<Pedido> findAll() {
		return (List<Pedido>) pedidoRepository.findAll();
	}
	
	@Override
	public Pedido findByIdPedido(Pedido pedido) {
		return (Pedido) pedidoRepository.findByIdPedido(pedido.getIdPedido());
	}
	
	@Override
	public Pedido findById(int id) {
		return pedidoRepository.findById(id).orElse(null);
	}
	
	@Override
	public Pedido createPedido(Pedido pedido) {
		return pedidoRepository.save(pedido);
	}

	@Override
	public Pedido updatePedido(Pedido pedido) {
		return (Pedido) pedidoRepository.save(pedido);
	}

	@Override
	public void deletePedido(int idPedido) {
		pedidoRepository.deleteById(idPedido);		
	}

	@Override
	public void deleteAllPedido() {
		pedidoRepository.deleteAll();
		
	}

	
}
