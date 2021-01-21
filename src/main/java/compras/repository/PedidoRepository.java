package compras.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import compras.modelos.Pedido;

public interface PedidoRepository extends MongoRepository<Pedido, Integer> {

}
