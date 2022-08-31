package teste;

import elementos.Elementos;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import metodos.Metodos;
import pages.Cadastrar;
import pages.Home;
import runner.Executa;

public class Steps extends Executa{
	Metodos metodos = new Metodos();
	Elementos el= new Elementos();
	Home hm = new Home();
	Cadastrar cadastrar = new Cadastrar();
	
	

	@Dado("que eu selecione bootstrap v4")
	public void queEuSelecioneBootstrapV4() {
		hm.selectVersion(null);
		
	}

	@Dado("clico em add customer")
	public void clicoEmAddCustomer() {
		metodos.clicar(el.add);

		
	}

	@Quando("preencho informacoes")
	public void preenchoInformacoes() {
		cadastrar.preencher(null, null, null, null, null, null, null, null, null, null, null);
		
		
	}

	@Entao("visualizo mensagem de sucesso")
	public void visualizoMensagemDeSucesso() {
		metodos.clicar(el.button);
		metodos.esperarElemento(el.msg);
		metodos.validarTexto(el.msg, "Your data has been successfully stored into the database. ");
	}

}
