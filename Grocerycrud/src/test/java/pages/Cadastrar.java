package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import elementos.Elementos;
import metodos.Metodos;
import web.DriversFactory;

public class Cadastrar extends DriversFactory{

	Metodos metodos = new Metodos();
	Elementos el = new Elementos();

	public By nome = By.id("field-customerName");
	public By sobre = By.id("field-contactLastName");
	public By contato = By.id("field-contactFirstName");
	public By tel = By.id("field-phone");
	public By add = By.id("field-addressLine1");
	public By addd = By.id("field-addressLine2");
	public By ct = By.id("field-city");
	public By st = By.id("field-state");
	public By pais = By.id("field-country");
	public By ps = By.id("field-postalCode");
	public By cd = By.id("field-creditLimit");

	public void preencher(String Name, String last, String contact, String phone, String add1, String add2, String city,
			String state, String postal, String country, String credit) {

		metodos.clicar(nome);
		metodos.escrever(nome, "fabio");
		metodos.clicar(sobre);
		metodos.escrever(sobre, "silva");
		metodos.clicar(contato);
		metodos.escrever(contato, "123456");
		metodos.clicar(tel);
		metodos.escrever(tel, "654321");
		metodos.clicar(add);
		metodos.escrever(add, "39461808");
		metodos.clicar(addd);
		metodos.escrever(addd, "654134644");
		metodos.clicar(ct);
		metodos.escrever(ct, "São Paulo");
		metodos.clicar(st);
		metodos.escrever(st, "Santos");
		metodos.clicar(ps);
		metodos.escrever(ps, "11314");
		metodos.clicar(pais);
		metodos.escrever(pais, "Brazil");
		metodos.clicar(cd);
		metodos.escrever(cd, "3500,00");
		
		
	}

public void selectFrom(Integer f) {
	Select selectfrom = new Select(driver.findElement(null));
	selectfrom.selectByIndex(f);
	
}


}
