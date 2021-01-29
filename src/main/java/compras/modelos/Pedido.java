package compras.modelos;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.data.annotation.Id;

//import nonapi.io.github.classgraph.json.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "pedidos")
public class Pedido {

	@Id
	private int idPedido;
	private Date fechaPedido;
	private Double costoTotalPedido;
	private String estadoPedido;
	private Double ivaTotalArticulo;
	

		
	public Pedido() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pedido(int idPedido, Date fechaPedido, Double costoTotalPedido, String estadoPedido,
			Double ivaTotalArticulo) {
		super();
		this.idPedido = idPedido;
		this.fechaPedido = fechaPedido;
		this.costoTotalPedido = costoTotalPedido;
		this.estadoPedido = estadoPedido;
		this.ivaTotalArticulo = ivaTotalArticulo;
	}

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public Date getFechaPedido() {
		return fechaPedido;
	}

	public void setFechaPedido(Date fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	public Double getCostoTotalPedido() {
		return costoTotalPedido;
	}

	public void setCostoTotalPedido(Double costoTotalPedido) {
		this.costoTotalPedido = costoTotalPedido;
	}

	public String getEstadoPedido() {
		return estadoPedido;
	}

	public void setEstadoPedido(String estadoPedido) {
		this.estadoPedido = estadoPedido;
	}

	public Double getIvaTotalArticulo() {
		return ivaTotalArticulo;
	}

	public void setIvaTotalArticulo(Double ivaTotalArticulo) {
		this.ivaTotalArticulo = ivaTotalArticulo;
	} 
	
}
