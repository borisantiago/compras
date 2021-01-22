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

import compras.modelos.ArticulosPedido;
import compras.repository.ArticulosPedidoRepository;

@RestController
public class ArticulosPedidoController {
	
	@Autowired
	private ArticulosPedidoRepository propediRepository;
	
	@GetMapping("/productospedido")
	public List<ArticulosPedido> getProdcutosPedido(){
		return propediRepository.findAll();
	}
	
	@GetMapping("/productospedido/{id}")
	public Optional<ArticulosPedido> getProductosPedido(@PathVariable int id){
		return propediRepository.findById(id);
	}
	
	@PostMapping("/productosPedido")
	public String createProductosPedido(@RequestBody ArticulosPedido productosPedido) {
		propediRepository.save(productosPedido);
		return "Se guardo los articulos del pedido : " + productosPedido.getIdPedido();
	}
	
	@DeleteMapping("/deleteid/{id}")
	public String deleteProductosPedido(@PathVariable int id) {
		propediRepository.deleteById(id);
		return "Se elimino los artículos del pedido" + id;
	}

}
