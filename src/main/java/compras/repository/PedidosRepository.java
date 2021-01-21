package compras.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import compras.modelos.PedidoModel;

public interface PedidosRepository extends MongoRepository<PedidoModel, Integer> {

}
