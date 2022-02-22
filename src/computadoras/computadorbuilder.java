package computadoras;
import javax.swing.JOptionPane;

import modelo.computadorAMDbuilder;
import modelo.computadorINTELbuilder;
import modelo.tiendaComputador;

public class computadorbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		tiendaComputador t = new tiendaComputador();
		t.setBuilder(new computadorAMDbuilder());
		t.construirComputador();
		JOptionPane.showMessageDialog(null, t.getComputador());
		
		t.setBuilder(new computadorINTELbuilder());
		t.construirComputador();
		JOptionPane.showMessageDialog(null, t.getComputador());
		

	}

}
