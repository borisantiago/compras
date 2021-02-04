package compras.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import compras.modelos.Gasto;
import compras.repository.GastoRepository;

@Service
public class GastoService implements IGastoService {
	
	@Autowired 
	GastoRepository gastoRespository;

	@Override
	public List<Gasto> findAll() {
		return (List<Gasto>) gastoRespository.findAll();
	}

	@Override
	public Gasto findById(int id) {
		return gastoRespository.findById(id).orElse(null);
	}

	@Override
	public Gasto createGasto(Gasto gasto) {
		return (Gasto) gastoRespository.save(gasto);
	}

	@Override
	public Gasto updateGasto(Gasto gasto) {
		return gastoRespository.save(gasto);
	}

	@Override
	public void deleteGasto(int id) {
		gastoRespository.deleteById(id);
	}

	@Override
	public void daleteAll() {
		gastoRespository.deleteAll();
	}

}
