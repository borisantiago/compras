package compras.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import compras.modelos.GastoModel;

public interface GastosRepository extends MongoRepository<GastoModel, Integer> {

}
