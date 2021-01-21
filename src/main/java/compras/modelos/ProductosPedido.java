package compras.modelos;

import org.springframework.data.mongodb.core.mapping.Document;

import nonapi.io.github.classgraph.json.Id;

@Document(collection="productos_pedido")
public class ProductosPedido {
	
	@Id
	private int id;
	private String codigoProducto;
	private int cantidadProductos;
	private float precioProductos;
	private float ivaProducto;
	
	public ProductosPedido() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductosPedido(int id, String codigoProducto, int cantidadPRoductos, float precioProductos, float ivaProducto) {
		super();
		this.id = id;
		this.codigoProducto = codigoProducto;
		this.cantidadProductos = cantidadPRoductos;
		this.precioProductos = precioProductos;
		this.ivaProducto = ivaProducto;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(String codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public int getCantidadPRoductos() {
		return cantidadProductos;
	}

	public void setCantidadPRoductos(int cantidadPRoductos) {
		this.cantidadProductos = cantidadPRoductos;
	}

	public float getPrecioProductos() {
		return precioProductos;
	}

	public void setPrecioProductos(float precioProductos) {
		this.precioProductos = precioProductos;
	}

	public float getIvaProducto() {
		return ivaProducto;
	}

	public void setIvaProducto(float ivaProducto) {
		this.ivaProducto = ivaProducto;
	}
	
	
	
	

}
