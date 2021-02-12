package compras.controller;

import java.util.List;
///import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

import compras.modelos.Compra;
import compras.modelos.Pedido;
import compras.service.CompraService;
import compras.service.PedidoService;


@RestController
@CrossOrigin(origins = "*")
public class CompraController {

	@Autowired
	CompraService compraService;
	
	PedidoService pedidoService;
	
	
	@GetMapping("/compras")
	public List<Compra> getAllGastos(){
		return compraService.findAll();
	}
	/*
	@GetMapping("/compra/{id}")
	public Optional<Compra> getCompraModel(@PathVariable int id, @RequestBody Compra compra){
		return compraService.findById(compra.getIdCompra());
	}
	*/
	
	
	@PostMapping("/compra")
	public String createCompra(@RequestBody Compra compra, @RequestPart Pedido pedido) {
	
			if(compraService.findById(compra.getIdCompra())==null) {
				
				if(compra.getCostoTotalCompra()>0) {
					compraService.createCompra(compra);
					return "Se almaceno la compra : " + compra.getIdCompra();
				}else {
					return "El costo de la compra no puede justifcarse con valores negativos";
				}
				
			}else {
				return "No se puede realizar la compra : " + compra.getIdCompra();
			}
		
	}
	
	
	@PutMapping("/compra")
	public String updateCompra(@RequestBody Compra compra) {
		if(compraService.findById(compra.getIdCompra())!=null) {
			compraService.updateCompra(compra);
			return "Se actualizo la infromacion del id : "+ compra.getIdCompra();	
		}
		return "No se puede actualizar, no existe el id escrito";
		
	}
	
	@DeleteMapping("/deletecompra/{id}")
	public String deletePedido(@PathVariable int id) {
		compraService.deleteIdCompra(id);
		return "Se elemino la compra : "+ id;
	}
	
	
}
