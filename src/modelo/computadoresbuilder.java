package modelo;

public abstract class computadoresbuilder {
	
	protected computador computador;
	
	public computador getComputador() {
		return computador;
	}
	
	public void crearComputador() {
		computador = new computador();
		
	}
	
	public abstract void buildMarca();
	public abstract void buildProcesador();
	public abstract void buildRam();
	
}
