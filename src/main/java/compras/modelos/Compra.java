package compras.modelos;

import java.util.Date;

import org.springframework.data.annotation.Id;
//import nonapi.io.github.classgraph.json.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "compra")
public class Compra {
	
	@Id
	private int idCompra;
	private Long IdPedido;
	private Long idDocCompra;
	private Date fechaCompra;
	private Double recargoCompra;
	private Double descuentoCompra;
	private Long costoTotalCompra;
	
	public Compra() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Compra(int idCompra, Long idPedido, Long idDocCompra, Date fechaCompra, Double recargoCompra,
			Double descuentoCompra, Long costoTotalCompra) {
		super();
		this.idCompra = idCompra;
		IdPedido = idPedido;
		this.idDocCompra = idDocCompra;
		this.fechaCompra = fechaCompra;
		this.recargoCompra = recargoCompra;
		this.descuentoCompra = descuentoCompra;
		this.costoTotalCompra = costoTotalCompra;
	}
	public int getIdCompra() {
		return idCompra;
	}
	public void setIdCompra(int idCompra) {
		this.idCompra = idCompra;
	}
	public Long getIdPedido() {
		return IdPedido;
	}
	public void setIdPedido(Long idPedido) {
		IdPedido = idPedido;
	}
	public Long getIdDocCompra() {
		return idDocCompra;
	}
	public void setIdDocCompra(Long idDocCompra) {
		this.idDocCompra = idDocCompra;
	}
	public Date getFechaCompra() {
		return fechaCompra;
	}
	public void setFechaCompra(Date fechaCompra) {
		this.fechaCompra = fechaCompra;
	}
	public Double getRecargoCompra() {
		return recargoCompra;
	}
	public void setRecargoCompra(Double recargoCompra) {
		this.recargoCompra = recargoCompra;
	}
	public Double getDescuentoCompra() {
		return descuentoCompra;
	}
	public void setDescuentoCompra(Double descuentoCompra) {
		this.descuentoCompra = descuentoCompra;
	}
	public Long getCostoTotalCompra() {
		return costoTotalCompra;
	}
	public void setCostoTotalCompra(Long costoTotalCompra) {
		this.costoTotalCompra = costoTotalCompra;
	}
	
}
