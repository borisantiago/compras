package compras.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import compras.modelos.ArticulosPedido;

public interface ArticulosPedidoRepository extends MongoRepository<ArticulosPedido, Integer> {

}
