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

import compras.modelos.GastoModel;
import compras.repository.GastosRepository;

@RestController
public class GastosController {
	
	@Autowired 
	private GastosRepository gastosRepository;
	
	@GetMapping("/gastos")
	public List<GastoModel> getAllGastos(){
		return gastosRepository.findAll();
	}
	
	@GetMapping("/gasto/{id}")
	public Optional<GastoModel> getGastosModel(@PathVariable int id){
		return gastosRepository.findById(id);
	}
	
	@PostMapping("/gasto")
	public String createGasto(@RequestBody GastoModel gastosModel) {
		gastosRepository.save(gastosModel);
		return "Se almaceno el gasto" + gastosModel.getId();
	}
	
	@DeleteMapping("/deletegasto/{id}")
	public String deletePedido(@PathVariable int id) {
		gastosRepository.deleteById(id);
		return "Se elemino el gasto : "+ id;
	}
	

}
