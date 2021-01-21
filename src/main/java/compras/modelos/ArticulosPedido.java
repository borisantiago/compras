package compras.modelos;

import org.springframework.data.mongodb.core.mapping.Document;

import nonapi.io.github.classgraph.json.Id;

@Document(collection="productos_pedido")
public class ArticulosPedido {
	
	@Id
	private String idPedido;
	private String codigoArticuloPedido;
	private long cantidadArticuloPedido;
	private Double precioArticuloPedido;
	private String nombreArticuloPedido;
	private Boolean tieneIva;
	private String idProveedor;
	
	public ArticulosPedido() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ArticulosPedido(String idPedido, String codigoArticuloPedido, long cantidadArticuloPedido,
			Double precioArticuloPedido, String nombreArticuloPedido, Boolean tieneIva, String idProveedor) {
		super();
		this.idPedido = idPedido;
		this.codigoArticuloPedido = codigoArticuloPedido;
		this.cantidadArticuloPedido = cantidadArticuloPedido;
		this.precioArticuloPedido = precioArticuloPedido;
		this.nombreArticuloPedido = nombreArticuloPedido;
		this.tieneIva = tieneIva;
		this.idProveedor = idProveedor;
	}

	public String getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(String idPedido) {
		this.idPedido = idPedido;
	}

	public String getCodigoArticuloPedido() {
		return codigoArticuloPedido;
	}

	public void setCodigoArticuloPedido(String codigoArticuloPedido) {
		this.codigoArticuloPedido = codigoArticuloPedido;
	}

	public long getCantidadArticuloPedido() {
		return cantidadArticuloPedido;
	}

	public void setCantidadArticuloPedido(long cantidadArticuloPedido) {
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


}