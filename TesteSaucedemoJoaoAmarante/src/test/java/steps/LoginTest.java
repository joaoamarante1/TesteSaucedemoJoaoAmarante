package steps;

import Executa.Executa;
import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import pages.ElemetsPage;
import utils.MassaDeDados;

public class LoginTest {

	Metodos metodos = new Metodos();
	Elementos el = new Elementos();
	MassaDeDados massa = new MassaDeDados();
	ElemetsPage elements = new ElemetsPage();

//Login Invalido

	@Given("que esteja na tela de login")
	public void queEstejaNaTelaDeLogin() {
		Executa.abrirNavegador();

	}

	@Given("nao informe dados validos de login")
	public void naoInformeDadosValidosDeLogin() {
		metodos.escrever(el.userName, massa.userName);
		metodos.escrever(el.password, massa.password);

	}

	@When("clicar no botao {string}")
	public void clicarNoBotao(String string) {
		metodos.clicar(el.btnLogin);

	}

	@Then("mensagem de erro {string}")
	public void mensagemDeErro(String string) {
metodos.currentUrl("https://www.saucedemo.com/");
	}

	// Login Valido

	@Given("que esteja na home")
	public void queEstejaNaHome() {
		Executa.abrirNavegador();
	}

	@Given("informe dados de login validos")
	public void informeDadosDeLoginValidos() {
		metodos.escrever(el.nome, massa.nome);
		metodos.escrever(el.senha, massa.senha);
	}

	@When("clicar no botao “LOGIN”")
	public void clicarNoBotaoLOGIN() {
		metodos.clicar(el.btnLogin);

	}

	@Then("login realizado com sucesso!")
	public void loginRealizadoComSucesso() {
		metodos.currentUrl("https://www.saucedemo.com/inventory.html");

	}

	// ADICIONAR PRODUTOS AO CARRINHO DE COMPRAS

	@Given("que encontre produtos solicitados")
	public void queEncontreProdutosSolicitados() {

	}

	@Given("click no botao “ADD TO CART”")
	public void clickNoBotaoADDTOCART() {
		metodos.clicar(el.mochila);
		metodos.clicar(el.blusa);

	}

	@When("clicar no carrinho de compras")
	public void clicarNoCarrinhoDeCompras() {
		metodos.clicar(el.carrinhoDeCompras);
	}

	@Then("produto adicionado com sucesso!")
	public void produtoAdicionadoComSucesso() {

	}

	// REMOVER BLUSA DO CARRINHO

	@Given("que esteja no carrinho de compras")
	public void queEstejaNoCarrinhoDeCompras() {
metodos.currentUrl("https://www.saucedemo.com/cart.html");
	}

	@When("escolher produto para ser removido")
	public void escolherProdutoParaSerRemovido() {

	}

	@When("clicar no botao “REMOVE”")
	public void clicarNoBotaoREMOVE() {
		metodos.clicar(el.RemoveBlusa);
	}

	@Then("produto removido com sucesso")
	public void produtoRemovidoComSucesso() {

	}

	// ADICIONAR PRODUTO CARO AO CARRINHO DE COMPRAS

	@Given("que escolha produto mais caro")
	public void queEscolhaProdutoMaisCaro() {
		metodos.clicar(el.ContinueNoShopping);

	}

	@Given("selecione o botao {string}")
	public void selecioneOBotao(String string) {
		metodos.clicar(el.ProdutoCaro);
	}

	@When("clicar no  icone do carrinho de compras")
	public void clicarNoIconeDoCarrinhoDeCompras() {
		metodos.clicar(el.carrinhoDeCompras);
	}

	@Then("produto adicionado no carrinho com sucesso!")
	public void produtoAdicionadoNoCarrinhoComSucesso() {
		metodos.currentUrl("https://www.saucedemo.com/cart.html");
	}

	// CHECKOUT

	@When("clicar no botao “CHECKOUT”")
	public void clicarNoBotaoCHECKOUT() {
		metodos.clicar(el.Checkout);
		
	}

	@When("preencher os campos solicitados")
	public void preencherOsCamposSolicitados() {
		metodos.escrever(el.FirstName, massa.firstName);
		metodos.escrever(el.LastName, massa.lastName);
		metodos.escrever(el.PostalCode, massa.postalCode);

	}

	@When("clicar no botao “CONTINUE”")
	public void clicarNoBotaoCONTINUE() {
		metodos.clicar(el.Continue);
	
	}

	@Then("checkout finalizado com sucesso")
	public void checkoutFinalizadoComSucesso() {
		metodos.currentUrl("https://www.saucedemo.com/checkout-step-two.html");

	}

	// FINALIZAR PEDIDO

	@Given("que esteja na tela na tela {string}")
	public void queEstejaNaTelaNaTela(String string) {
		elements.acessarMenu("Finish");
		
	}

	@When("e clicar no botão {string}")
	public void eClicarNoBotão(String string) {
		metodos.scroll(0, 250);
		metodos.clicar(el.Finish);
	}

	@Then("pedido finalizado com sucesso")
	public void pedidoFinalizadoComSucesso() {
		metodos.currentUrl("https://www.saucedemo.com/checkout-complete.html");
	}

	// BACK HOME

	@Given("que esteja na tela {string}")
	public void queEstejaNaTela(String string) {
		elements.acessarMenu("Back Home");
		
	}

	@When("selecionar no botao {string}")
	public void selecionarNoBotao(String string) {
		metodos.clicar(el.BackHome);
	}

	@Then("sistema direciona para tela de produtos")
	public void sistemaDirecionaParaTelaDeProdutos() {
		metodos.currentUrl("https://www.saucedemo.com/inventory.html");
	}

}
