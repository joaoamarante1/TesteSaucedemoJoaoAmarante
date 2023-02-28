@test
Feature: Login
        Como usuario
        Quero realizar login
        Para acessar a conta
        
@test
Scenario: Login invalido
Given que esteja na tela de login
But nao informe dados validos de login
When clicar no botao "LOGIN"
Then mensagem de erro "EPIC SADFACE:USERNAME AND PASSWORD DO NOT MATCH ANY USER IN THIS SERVICE"

Scenario: Login valido
Given que esteja na home
And informe dados de login validos
When clicar no botao “LOGIN”
Then login realizado com sucesso!

Scenario: Adicionar produtos ao carrinho de compras
Given que encontre produtos solicitados 
And click no botao “ADD TO CART”
When clicar no carrinho de compras
Then produto adicionado com sucesso!


Scenario: Remover blusa do carrinho
Given que esteja no carrinho de compras 
When  escolher produto para ser removido 
And clicar no botao “REMOVE”
Then produto removido com sucesso

Scenario: Adicionar produto mais caro 
Given que escolha produto mais caro 
And selecione o botao "ADD TO CART"
When clicar no  icone do carrinho de compras
Then produto adicionado no carrinho com sucesso!


Scenario: Checkout
Given que esteja no carrinho de compras 
When clicar no botao “CHECKOUT”
And preencher os campos solicitados 
And clicar no botao “CONTINUE”
Then checkout finalizado com sucesso



Scenario: Finalizar pedido
Given que esteja na tela na tela "CHECKOUT OVERVIEW"
When clicar no botao "FINISH"
Then pedido finalizado com sucesso

Scenario: Retornar a back home
Given que esteja na tela "CHECKOUT COMPLETE"
When clicar no botao "BACK HOME"
Then sistema direciona para tela de produtos

