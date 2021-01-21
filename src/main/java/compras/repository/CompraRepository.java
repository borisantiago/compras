package compras.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import compras.modelos.Compra;

public interface CompraRepository extends MongoRepository<Compra, Long> {

}
