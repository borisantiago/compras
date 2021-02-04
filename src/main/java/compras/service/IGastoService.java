package compras.service;

import java.util.List;

import compras.modelos.Gasto;

public interface IGastoService {

	List<Gasto> findAll();
	
	Gasto findById(int id);
	
	Gasto createGasto(Gasto gasto);
	
	Gasto updateGasto(Gasto gasto);
	
	void deleteGasto(int id);
	
	void daleteAll();
	
}
