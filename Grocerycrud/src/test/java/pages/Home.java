package pages;

import elementos.Elementos;
import metodos.Metodos;

public class Home {
	Metodos metodos = new Metodos();
	Elementos el = new Elementos();
	
	
	
	public void selectVersion(String versao) {
		metodos.escrever(el.v4, "Bootstrap V4 Theme");
		
		
		
	}
		
}



