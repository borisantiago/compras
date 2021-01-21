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

import compras.modelos.PedidoModel;
import compras.repository.PedidosRepository;


@RestController
public class PedidosController {

	@Autowired
	private PedidosRepository pedidosRepository; 
	
	
	@GetMapping("/pedidos")
	public List<PedidoModel> getAllPedidos(){
		return pedidosRepository.findAll();
	}
	
	@GetMapping("/pedidos2/{id}")
	public Optional<PedidoModel> getPedidosModel(@PathVariable int id){
		return pedidosRepository.findById(id);
	}
	
	@PostMapping("/pedido")
	public String createPedido(@RequestBody PedidoModel pedidosModel){
		pedidosRepository.save(pedidosModel);
		//PedidosModel insertPedidosModel	= pedidosRepository.insert(pedidosModel);
		return "pedido creado" + pedidosModel.getId();
	}
	
	@DeleteMapping("/delete/{id}")
	public String deletePedido (@PathVariable int id) {
		pedidosRepository.deleteById(id);
		return "Se elimino el pedido : " +id;
	}

}
