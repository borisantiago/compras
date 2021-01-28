package compras.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import compras.modelos.Compra;
import compras.repository.CompraRepository;

@RestController
public class CompraController {

	@Autowired
	private CompraRepository compraRepository;
	
	
	
	@GetMapping("/compras")
	public List<Compra> getAllGastos(){
		return compraRepository.findAll();
	}
	
	@GetMapping("/compra/{id}")
	public Optional<Compra> getCompraModel(@PathVariable long id){
		return compraRepository.findById(id);
	}
	
	@PostMapping("/compra")
	public String createCompra(@RequestBody Compra compra) {
		compraRepository.save(compra);
		return "Se almaceno la compra : " + compra.getIdCompra();
	}
	
	
	
	@DeleteMapping("/deletecompra/{id}")
	public String deletePedido(@PathVariable long id) {
		compraRepository.deleteById(id);
		return "Se elemino la compra : "+ id;
	}
	
	
}
