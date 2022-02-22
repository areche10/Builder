package modelo;

public class computador {
	
	private String marca;
	private String procesador;
	private int ram;
	
	public computador() {
		
	}
	
	public computador(String marca, String procesador, int ram) {
		
		this.marca = marca;
		this.procesador = procesador;
		this.ram = ram;
		
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getProcesador() {
		return procesador;
	}
	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}
	
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	

	public String toString() {
		return "computador{" + "marca=" + marca + ",\nprocesador=" + procesador + ",\nram=" + ram + '}' + "\n\n";
	}
	
}
