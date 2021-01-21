package compras.modelos;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "pedidos")
public class PedidoModel {

	@Id
	private int id;
	private String idProveedor;
	private String idProductos;
	private long recargo;
	private long descuento;
	private long costoFinal;
	private String fechaPedido;
	private String estado;
	
	
	public PedidoModel() {
		super();
		// TODO Auto-generated constructor stub
	} 
	
	public PedidoModel(int id,String idProveedor, String idProductos, long recargo, long descuento, long costoFinal,
			String fechaPedido, String estado) {
		super();
	
		this.id = id;
		this.idProveedor = idProveedor;
		this.idProductos = idProductos;
		this.recargo = recargo;
		this.descuento = descuento;
		this.costoFinal = costoFinal;
		this.fechaPedido = fechaPedido;
		this.estado = estado;
	}

	
	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIdProveedor() {
		return idProveedor;
	}

	public void setIdProveedor(String idProveedor) {
		this.idProveedor = idProveedor;
	}

	public String getIdProductos() {
		return idProductos;
	}

	public void setIdProductos(String idProductos) {
		this.idProductos = idProductos;
	}

	public long getRecargo() {
		return recargo;
	}

	public void setRecargo(long recargo) {
		this.recargo = recargo;
	}

	public long getDescuento() {
		return descuento;
	}

	public void setDescuento(long descuento) {
		this.descuento = descuento;
	}

	public long getCostoFinal() {
		return costoFinal;
	}

	public void setCostoFinal(long costoFinal) {
		this.costoFinal = costoFinal;
	}

	public String getFechaPedido() {
		return fechaPedido;
	}

	public void setFechaPedido(String fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}
