package compras.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import compras.modelos.Gasto;

public interface GastoRepository extends MongoRepository<Gasto, Integer> {

}
