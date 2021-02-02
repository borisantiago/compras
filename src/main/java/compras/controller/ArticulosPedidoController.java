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

import compras.repository.ArticulosPedidoRepository;
import compras.service.ArticulosPedidoService;

@RestController
public class ArticulosPedidoController {
	
	@Autowired
	ArticulosPedidoService APService;
	
	@GetMapping("/productospedido")
	public List<ArticulosPedido> getProdcutosPedido(){
		return APService.findAll();
	}
	
	/*
	@GetMapping("/productospedido/{id}")
	public Optional<ArticulosPedido> getProductosPedido(@PathVariable int id){
		return APService.findByIdPedido(id);
	}
	*/
	
	@PostMapping("/productosPedido")
	public String createProductosPedido(@RequestBody ArticulosPedido productosPedido) {
		
		if(APService.findById(productosPedido.getIdArticulo()) == null) {
			if(productosPedido.getCantidadArticuloPedido()>0 && productosPedido.getPrecioArticuloPedido()>0) {
				APService.createArticulosPedido(productosPedido);
				return "Se guardo los articulos del pedido : " + productosPedido.getIdPedido();
			}else {
				return "La cantidad de articulos y su costo debe justificar mayor a 0 ";
			}
		}else {
			return "El id del articulo ya esta regsitrado : " + productosPedido.getIdArticulo();
		}
		
	}
	
	@PutMapping("/productospedido")
	public String updateGasto(@RequestBody ArticulosPedido productosPedido) {
		if(APService.findById(productosPedido.getIdPedido()) != null ) {
			
			if(productosPedido.getCantidadArticuloPedido()>0 && productosPedido.getPrecioArticuloPedido()>0) {
				APService.createArticulosPedido(productosPedido);
			return "Se actualizo el gasto : " + productosPedido.getIdPedido();
			}else {
				return "La cantidad de articulos y su costo debe justificar mayor a 0 ";
			}
		}else
		return "No se actualizo el gasto, no esta el id registrado : " + productosPedido.getIdPedido();
	}
	
	@DeleteMapping("/deleteid/{id}")
	public String deleteProductosPedido(@PathVariable int id) {
		APService.deleteById(id);
		return "Se elimino los artículos del pedido : " + id;
	}

}
