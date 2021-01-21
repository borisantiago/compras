package compras.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import compras.modelos.ProductosPedido;

public interface ProductosPedidoRepository extends MongoRepository<ProductosPedido, Integer> {

}
