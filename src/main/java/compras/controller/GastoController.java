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
//import compras.service.GastoServices;

@RestController
public class GastoController {
	
	@Autowired 
	private GastoRepository service;
	
	@GetMapping("/gastos")
	public List<Gasto> getAllGasto(){
		return service.findAll();
	}
	
	@GetMapping("/gasto/{id}")
	public Optional<Gasto> getGasto(@PathVariable int id){
		return service.findById(id);
	}
	
	@PostMapping("/gasto")
	public String createGasto(@RequestBody Gasto gastosModel) {
		
		service.save(gastosModel);
		return "Se almaceno el gasto : " + gastosModel.getIdGastos();
	}
	
	@DeleteMapping("/deletegasto/{id}")
	public String deletePedido(@PathVariable int id) {
		service.deleteById(id);
		return "Se elemino el gasto : "+ id;
	}
	

}
