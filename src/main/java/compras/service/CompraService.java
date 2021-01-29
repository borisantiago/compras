package compras.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import compras.modelos.Compra;
import compras.repository.CompraRepository;

@Service
public class CompraService implements ICompraService {
	@Autowired
	CompraRepository compraRepository;
	
	@Override
	public List<Compra> findAll() {
		return (List<Compra>) compraRepository.findAll();
	}

	@Override
	public Compra findByIdPedido(Compra compra) {
		return (Compra) compraRepository.findByIdPedido(compra.getIdPedido());
	}
	
	/*
	@Override
	public Compra findByIdCompra(Compra compra) {
		return compraRepository.findByIdCompra(compra.getIdCompra());
	}
	*/

	@Override
	public Compra findById(int id) {
		return compraRepository.findById(id).orElse(null);
	}

	@Override
	public Compra createCompra(Compra compra) {
		return (Compra) compraRepository.save(compra);
	}

	@Override
	public Compra updateCompra(Compra compra) {
		return (Compra) compraRepository.save(compra);
	}

	@Override
	public void deleteIdCompra(int idCompra) {
		compraRepository.deleteById(idCompra);
		
	}

	@Override
	public void deleteAllCompras() {
		compraRepository.deleteAll();
		
	}

	

}
