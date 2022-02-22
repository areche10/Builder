package modelo;

public class tiendaComputador {
	
	private computadoresbuilder builder;
	
	public void setBuilder(computadoresbuilder builder) {
		this.builder = builder;
	}

	public computador getComputador() {
		return builder.getComputador();
	}
	
	public void construirComputador() {
		builder.crearComputador();
		builder.buildMarca();
		builder.buildProcesador();
		builder.buildRam();
	}
	
}
