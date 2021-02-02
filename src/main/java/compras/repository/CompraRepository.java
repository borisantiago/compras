package compras.repository;

//import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

import compras.modelos.Compra;

public interface CompraRepository extends CrudRepository<Compra, Integer> {

	Compra findByIdPedido(int idPedido);
	
	Compra findByIdCompra(int idCompra);
	
}
