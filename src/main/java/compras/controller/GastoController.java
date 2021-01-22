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

import compras.modelos.Gasto;
import compras.repository.GastoRepository;

@RestController
public class GastoController {
	
	@Autowired 
	private GastoRepository gastosRepository;
	
	@GetMapping("/gastos")
	public List<Gasto> getAllGastos(){
		return gastosRepository.findAll();
	}
	
	@GetMapping("/gasto/{id}")
	public Optional<Gasto> getGastosModel(@PathVariable int id){
		return gastosRepository.findById(id);
	}
	
	@PostMapping("/gasto")
	public String createGasto(@RequestBody Gasto gastosModel) {
		gastosRepository.save(gastosModel);
		return "Se almaceno el gasto : " + gastosModel.getIdGastos();
	}
	
	@DeleteMapping("/deletegasto/{id}")
	public String deletePedido(@PathVariable int id) {
		gastosRepository.deleteById(id);
		return "Se elemino el gasto : "+ id;
	}
	

}
