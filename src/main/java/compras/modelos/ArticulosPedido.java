package compras.modelos;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import compras.service.ArticulosPedidoService;

//import nonapi.io.github.classgraph.json.Id;

@Document(collection="articulosPedido")
public class ArticulosPedido {
	
	//ArticulosPedidoService articulosPedidoService; 
	
	@Id
	private int idArticulo;
	private int idPedido;
	private String codigoArticuloPedido;
	private int cantidadArticuloPedido;
	private Double precioArticuloPedido;
	private String nombreArticuloPedido;
	private Boolean tieneIva;
	private String idProveedor;
	
	private Double precioTotal;
	
	public ArticulosPedido() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ArticulosPedido(int idArticulo, int idPedido, String codigoArticuloPedido, int cantidadArticuloPedido,
			Double precioArticuloPedido, String nombreArticuloPedido, Boolean tieneIva, String idProveedor, 
			Double precioTotal) {
		super();
		this.idArticulo = idArticulo;
		this.idPedido = idPedido;
		this.codigoArticuloPedido = codigoArticuloPedido;
		this.cantidadArticuloPedido = cantidadArticuloPedido;
		this.precioArticuloPedido = precioArticuloPedido;
		this.nombreArticuloPedido = nombreArticuloPedido;
		this.tieneIva = tieneIva;
		this.idProveedor = idProveedor;
		
		this.precioTotal = precioTotal;
	}
	
	public int getIdArticulo() {
		return idArticulo;
	}

	public void setIdArticulo(int idArticulo) {
		this.idArticulo = idArticulo;
	}

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public String getCodigoArticuloPedido() {
		return codigoArticuloPedido;
	}

	public void setCodigoArticuloPedido(String codigoArticuloPedido) {
		this.codigoArticuloPedido = codigoArticuloPedido;
	}

	public int getCantidadArticuloPedido() {
		return cantidadArticuloPedido;
	}

	public void setCantidadArticuloPedido(int cantidadArticuloPedido) {
		this.cantidadArticuloPedido = cantidadArticuloPedido;
	}

	public Double getPrecioArticuloPedido() {
		return precioArticuloPedido;
	}

	public void setPrecioArticuloPedido(Double precioArticuloPedido) {
		this.precioArticuloPedido = precioArticuloPedido;
	}

	public String getNombreArticuloPedido() {
		return nombreArticuloPedido;
	}

	public void setNombreArticuloPedido(String nombreArticuloPedido) {
		this.nombreArticuloPedido = nombreArticuloPedido;
	}

	public Boolean getTieneIva() {
		return tieneIva;
	}

	public void setTieneIva(Boolean tieneIva) {
		this.tieneIva = tieneIva;
	}

	public String getIdProveedor() {
		return idProveedor;
	}

	public void setIdProveedor(String idProveedor) {
		this.idProveedor = idProveedor;
	}

	public Double getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(Double precioTotal) {
		this.precioTotal = precioTotal;
	}
	 
	


}
