package compras.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import compras.modelos.Gasto;
//import compras.service.GastoServices;
import compras.service.GastoService;

@RestController
public class GastoController {
	
	@Autowired 
	private GastoService service;
	
	@GetMapping("/gastos")
	public List<Gasto> getAllGasto(){
		return service.findAll();
	}
	
	/*
	@GetMapping("/gasto/{id}")
	public Optional<Gasto> getGasto(@PathVariable int id){
		return service.findById().getIdGastos();
	}
	*/
	
	@PostMapping("/gasto")
	public String createGasto(@RequestBody Gasto gasto) {
		
		if(service.findById(gasto.getIdGastos()) == null) {
			if(gasto.getValorTotalGasto()>0) {
				service.createGasto(gasto);
				return "Se almaceno el gasto : " + gasto.getIdGastos();
			}
			return "El valor del gasto debe justificarse con valores positivos : " + gasto.getIdGastos();
		}else {
			return "El gasto ya fue registrado, intente otro id " + gasto.getIdGastos();
		}
	}
	
	@PutMapping("/gasto")
	public String updateGasto(@RequestBody Gasto gasto) {
		if(service.findById(gasto.getIdGastos()) != null ) {
		service.updateGasto(gasto);
		return "Se actualizo el gasto : " + gasto.getIdGastos();
		}else
		return "No se actualizo el gasto, no esta el id registrado : " + gasto.getIdGastos();
	}
	
	@DeleteMapping("/deletegasto/{id}")
	public String deletePedido(@PathVariable int id) {
		service.deleteGasto(id);
		return "Se elemino el gasto : "+ id;
	}
	

}
