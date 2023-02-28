package elementos;

import org.openqa.selenium.By;

public class Elementos {
	
	// LOGIN INVALIDO
			public By userName = By.xpath("//input[@id='user-name']");
			public By password = By.xpath("//input[@id='password']");
			public By btnLogin = By.id("login-button");


		// LOGIN VALIDO
		public By nome = By.xpath("//input[@id='user-name']");
			public By senha = By.xpath("//input[@id='password']");
			public By Login = By.id("login-button");

			
		
		
		// ADICIONAR PRODUTO AO CARRINHO
			public By mochila = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
		public 	By blusa = By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']");

		//CARRINHO DE COMPRAS
		public 	By carrinho = By.xpath("//a[@class='shopping_cart_link']");

		// REMOVE BLUSA
			public By RemoveBlusa = By.xpath("//button[@id='remove-sauce-labs-bolt-t-shirt']");

		//CONTINUE NO SHOPPING
		public By ContinueNoShopping = By.xpath("//button[@id='continue-shopping']");

		// ADICIONAR ITEM MAIS CARO
		public By ProdutoCaro = By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']");

		//CARRINHO DE COMPRAS
			public By carrinhoDeCompras = By.xpath("//a[@class='shopping_cart_link']");

		// CHECKOUT
			public By Checkout = By.xpath("//button[@id='checkout']");

		//DADOS CHECKOUT
			public By FirstName = By.xpath("//input[@id='first-name']");
			public By LastName = By.xpath("//input[@id='last-name']");
			public By PostalCode = By.xpath("//input[@id='postal-code']");
			public By Continue = By.xpath("//input[@id='continue']");


			// FINISH
			public By Finish = By.cssSelector("#finish");

			// BACK HOME
			public By BackHome = By.id("back-to-products");


	}


