package controller;

public class InverteCaractere {

	public InverteCaractere() {
		super();
	}
	
	public String inverteCadeia(String caractere, int tamanhoCadeia) {
			
		//Condição de parada = Se o tamanho da cadeia for 0 retornar "" vazio
		if (tamanhoCadeia == 0) {
			return " ";
		}else {
			return caractere.substring(tamanhoCadeia -1, tamanhoCadeia) + inverteCadeia(caractere, tamanhoCadeia -1);
			
			//retorno da caractere invertida com o substring
			// utilizei o substring para pegar a ultima posição do caractere com a relação do -1 (tamanhoCadeia - 1)
			// com o substring vou empilhando a caractere com escrita normal
			// depois utilizo a função para inverter esse empilhamento utilizando a palavra e a tamanhoCadeia -1, percorrendo e a revertendo
		}
	}
}
