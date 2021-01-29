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

import compras.modelos.ArticulosPedido;
import compras.modelos.Gasto;
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
		
		if(productosPedido.getCantidadArticuloPedido()>0 && productosPedido.getPrecioArticuloPedido()>0) {
			propediRepository.save(productosPedido);
			return "Se guardo los articulos del pedido : " + productosPedido.getIdPedido();
		}else {
			return "La cantidad de articulos y su costo debe justificar mayor a 0 ";
		}
	}
	
	@PutMapping("/productospedido")
	public String updateGasto(@RequestBody ArticulosPedido productosPedido) {
		if(propediRepository.findById(productosPedido.getIdPedido()) != null ) {
			
			if(productosPedido.getCantidadArticuloPedido()>0 && productosPedido.getPrecioArticuloPedido()>0) {
			propediRepository.save(productosPedido);
			return "Se actualizo el gasto : " + productosPedido.getIdPedido();
			}else {
				return "La cantidad de articulos y su costo debe justificar mayor a 0 ";
			}
		}else
		return "No se actualizo el gasto, no esta el id registrado : " + productosPedido.getIdPedido();
	}
	
	@DeleteMapping("/deleteid/{id}")
	public String deleteProductosPedido(@PathVariable int id) {
		propediRepository.deleteById(id);
		return "Se elimino los artículos del pedido : " + id;
	}

}
