package compras.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import compras.modelos.Pedido;
import compras.repository.PedidoRepository;


@RestController
public class PedidoController {

	@Autowired
	private PedidoRepository pedidosRepository; 
	
	@GetMapping("/pedidos")
	public List<Pedido> getAllPedidos(){
		return pedidosRepository.findAll();
	}
	
	@GetMapping("/pedidos2/{id}")
	public Optional<Pedido> getPedidosModel(@PathVariable int id){
		return pedidosRepository.findById(id);
	}
	
	@PostMapping("/pedido")
	public String createPedido(@RequestBody Pedido pedidosModel){
		pedidosRepository.save(pedidosModel);
		//PedidosModel insertPedidosModel	= pedidosRepository.insert(pedidosModel);
		return "pedido creado : " + pedidosModel.getIdPedido();
	}
	
	@PutMapping("/pedido")
	public String updateGasto(@RequestBody Pedido pedido) {
		if(pedidosRepository.findById(pedido.getIdPedido()) != null ) {
			pedidosRepository.save(pedido);
		return "Se actualizo el gasto : " + pedido.getIdPedido();
		}else
		return "No se actualizo el gasto, no esta el id registrado : " + pedido.getIdPedido();
	}
	
	@DeleteMapping("/delete/{id}")
	public String deletePedido (@PathVariable int id) {
		pedidosRepository.deleteById(id);
		return "Se elimino el pedido : " +id;
	}

}
