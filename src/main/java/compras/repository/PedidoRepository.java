package compras.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import compras.modelos.Pedido;

public interface PedidoRepository extends CrudRepository<Pedido, Integer> {

	Pedido findByIdPedido(int idPedido);
	
	//Optional<Pedido> findById(int idPedido);
}
