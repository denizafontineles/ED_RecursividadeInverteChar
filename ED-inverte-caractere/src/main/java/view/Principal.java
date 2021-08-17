package view;
import controller.InverteCaractere;

public class Principal {
	
	public static void main(String[] args) {
		
		
		// declara palavra para poder inverter
		String caractere = "viajar";
		
		InverteCaractere op = new InverteCaractere();
		
		String res = op.inverteCadeia(caractere, caractere.length());
		
		System.out.println(res);
	}

}
