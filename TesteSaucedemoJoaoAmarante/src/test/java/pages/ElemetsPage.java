package pages;

import elementos.Elementos;
import metodos.Metodos;

public class ElemetsPage {
	
	Metodos metodos = new Metodos();
	Elementos el = new Elementos();
	
	public void acessarMenu(String menu) {
		metodos.clicarPorTexto("button", menu );
	}

}
