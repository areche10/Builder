package modelo;

public class computadorINTELbuilder extends computadoresbuilder {

	@Override
	public void buildMarca() {
		computador.setMarca("INTEL");	
	}

	@Override
	public void buildProcesador() {
		computador.setProcesador("I8-G0013P");
	}

	@Override
	public void buildRam() {
		computador.setRam(32);
	}
	
	
}
