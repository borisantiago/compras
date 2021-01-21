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

import compras.modelos.ProductosPedido;
import compras.repository.ProductosPedidoRepository;

@RestController
public class ProductosPedidoController {
	
	@Autowired
	private ProductosPedidoRepository propediRepository;
	
	@GetMapping("/productospedido")
	public List<ProductosPedido> getProdcutosPedido(){
		return propediRepository.findAll();
	}
	
	@GetMapping("/productospedido/{id}")
	public Optional<ProductosPedido> getProductosPedido(@PathVariable int id){
		return propediRepository.findById(id);
	}
	
	@PostMapping("/productosPedido")
	public String createProductosPedido(@RequestBody ProductosPedido productosPedido) {
		propediRepository.save(productosPedido);
		return "Se guardo los productos del pedido : " + productosPedido.getId();
	}
	
	@DeleteMapping("/deleteid/{id}")
	public String deleteProductosPedido(@PathVariable int id) {
		propediRepository.deleteById(id);
		return "Se elimino los productos del pedido" + id;
	}

}
