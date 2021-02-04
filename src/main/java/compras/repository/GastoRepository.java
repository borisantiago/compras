package compras.repository;



//import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

import compras.modelos.Gasto;


//public interface GastoRepository extends MongoRepository<Gasto, Integer> {
public interface GastoRepository extends CrudRepository<Gasto, Integer> {

	
}
