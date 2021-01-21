package compras.modelos;

import org.springframework.data.mongodb.core.mapping.Document;

import nonapi.io.github.classgraph.json.Id;


@Document(collection = "gasto")
public class GastoModel {

	@Id
	private int id;
	private float pagoProveedor;
	private String servicioBasico;
	private float valorTotal;
	
	public GastoModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GastoModel(int id, float pagoProveedor, String servicioBasico, float valorTotal) {
		super();
		this.id = id;
		this.pagoProveedor = pagoProveedor;
		this.servicioBasico = servicioBasico;
		this.valorTotal = valorTotal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getPagoProveedor() {
		return pagoProveedor;
	}

	public void setPagoProveedor(float pagoProveedor) {
		this.pagoProveedor = pagoProveedor;
	}

	public String getServicioBasico() {
		return servicioBasico;
	}

	public void setServicioBasico(String servicioBasico) {
		this.servicioBasico = servicioBasico;
	}

	public float getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	
	
	
	
	
	
}
