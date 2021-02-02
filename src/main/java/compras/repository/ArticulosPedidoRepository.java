package compras.repository;

//import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

import compras.modelos.ArticulosPedido;

public interface ArticulosPedidoRepository extends CrudRepository<ArticulosPedido, Integer> {

	ArticulosPedido findByIdPedido(int idPedido);
	
	
}
