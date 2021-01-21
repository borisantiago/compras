package compras.modelos;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("compra")
public class Compra {
	
	@Id
	private Long idCompra;
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
	public Compra(Long idCompra, Long idPedido, Long idDocCompra, Date fechaCompra, Double recargoCompra,
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
	public Long getIdCompra() {
		return idCompra;
	}
	public void setIdCompra(Long idCompra) {
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
