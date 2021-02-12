package compras.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


import compras.modelos.Pedido;
import compras.repository.PedidoRepository;
import compras.service.PedidoService;

@RestController
@CrossOrigin(origins = "*")
public class PedidoController {

	@Autowired
	PedidoService pedidoService; 
	
	@GetMapping("/pedidos")
	public List<Pedido> getAllPedidos(){
		return pedidoService.findAll();
	}
	
	/*	
 	@GetMapping("/pedidos2/{id}")
		public Optional<Pedido> getPedidosModel(@PathVariable int id, @RequestBody Pedido pedido){
			return pedidoService.findByIdPedido(id)
	}
	*/
	
	@PostMapping("/pedido")
	public String createPedido(@RequestBody Pedido pedido){
		
		if(pedidoService.findByIdPedido(pedido) == null){
			
			if(pedido.getIvaTotalArticulo()>0 && pedido.getCostoTotalPedido()>0) {
				pedidoService.createPedido(pedido);
				return "pedido creado : " + pedido.getIdPedido();
			}else {
				return "El IVA y COSTO TOTAL no puede ser negativo";
			}
		}else {
			return "NEGADO, El id del pedido ya esta regsitrado id: " + pedido.getIdPedido();
		}
		
	}
	
/*	
  
  @PostMapping("/pedido")
	public String createPedido(@RequestBody Pedido pedido){
		
		if(pedidoService.findByIdPedido(pedido) == null){
			pedidoService.createPedido(pedido);
		return "pedido creado : " + pedido.getIdPedido();
		}else {
			return "NEGADO, El id del pedido ya esta regsitrado id: " + pedido.getIdPedido();
		}
		
	}
	*/
	
	@PutMapping("/pedido")
	public String updateGasto(@RequestBody Pedido pedido) {
		if(pedidoService.findById(pedido.getIdPedido()) != null ) {
			pedidoService.updatePedido(pedido);
		return "Se actualizo el gasto : " + pedido.getIdPedido();
		}else
		return "No se actualizo el gasto, no esta el id registrado : " + pedido.getIdPedido();
	}
	
	@DeleteMapping("/delete/{id}")
	public String deletePedido (@PathVariable int id) {
		pedidoService.deletePedido(id);
		return "Se elimino el pedido : " +id;
	}

}
