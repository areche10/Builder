package modelo;

public class computadorAMDbuilder extends computadoresbuilder{

	@Override
	public void buildMarca() {
		computador.setMarca("AMD");	
	}

	@Override
	public void buildProcesador() {
		computador.setProcesador("B12-700C");
	}

	@Override
	public void buildRam() {
		computador.setRam(16);
	}
	

}
