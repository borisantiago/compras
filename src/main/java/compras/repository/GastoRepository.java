package compras.repository;


//import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import compras.modelos.Gasto;


public interface GastoRepository extends MongoRepository<Gasto, Integer> {
	
//public interface GastoRepository {
	
	/*List<Gasto> findAll();
	
	Gasto findById(int id);
	

	Gasto findIdGasto(int idGasto);
	
	Gasto updateGasto(Gasto gasto);
	
	void deleteIdGasto(int idGasto);
	
	void deleteAllGasto();*/
	
}
