package compras.modelos;

import org.springframework.data.mongodb.core.mapping.Document;

import nonapi.io.github.classgraph.json.Id;


@Document(collection = "gasto")
public class Gasto {

	@Id
	private int idGastos;
	private String descripcionGasto;
	private Double valorTotalGasto;
	private String idProveedor;
	
	public Gasto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gasto(int idGastos, String descripcionGasto, Double valorTotalGasto, String idProveedor) {
		super();
		this.idGastos = idGastos;
		this.descripcionGasto = descripcionGasto;
		this.valorTotalGasto = valorTotalGasto;
		this.idProveedor = idProveedor;
	}

	public int getIdGastos() {
		return idGastos;
	}

	public void setIdGastos(int idGastos) {
		this.idGastos = idGastos;
	}

	public String getDescripcionGasto() {
		return descripcionGasto;
	}

	public void setDescripcionGasto(String descripcionGasto) {
		this.descripcionGasto = descripcionGasto;
	}

	public Double getValorTotalGasto() {
		return valorTotalGasto;
	}

	public void setValorTotalGasto(Double valorTotalGasto) {
		this.valorTotalGasto = valorTotalGasto;
	}

	public String getIdProveedor() {
		return idProveedor;
	}

	public void setIdProveedor(String idProveedor) {
		this.idProveedor = idProveedor;
	}


	
}
