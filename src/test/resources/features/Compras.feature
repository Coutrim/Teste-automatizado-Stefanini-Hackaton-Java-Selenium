#language: pt
#encoding: UTF-8

Funcionalidade: Realizar compras
Eu como standard_user do site
Quero logar na aplicacao
Para fazer a compra de 3 ou mais itens

@FalhaLogin
Cenario: Falha no login
Dado que eu esteja tentando acessar o sistema
Quando eu preencher o campo usuario "admin"
E preencher o campo senha "admin123"
E clicar em login
Entao o sistema exibe mensagem de erro de login

@LoginSucesso
Cenario: Realizar login no sistema
Dado que eu queira fazer login
Quando eu preencher o campo username "standard_user"
E preencher o campo password "secret_sauce"
E clicar no botao login
Entao o sistema exibe a tela de login

@filtrar
Cenario: Filtrar os precos do mais baixo para o mais alto
Dado que eu esteja logado
Quando eu clicar no seletor de filtros
E selecionar o filtro desejado
Entao o sistema exibe os produtos com o filtro desejado

@RemoverItens
Cenario: Remover itens do carrinho 
Dado que eu esteja logado
Quando eu adicionar os produtos ao carrinho
E prosseguir para o carrinho
E remova itens do carrinho
Entao o sistema exibe o carrinho sem os itens que foram removidos

@CancelandoCompra
Cenario: Cancelando compra
Dado que eu esteja logado no sistema
Quando eu adicionar os produtos desejados ao carrinho
Quando eu prosseguir para o carrinho
E ir para o checkout
E informar meus dados "Henrique" "Coutrim" "72979000"
E clicar em cancel
Entao o sistema apresenta a tela de produtos novamente

@CompraRealizadaSucesso
Cenario: Compra realizada com sucesso
Dado que eu esteja logado
Quando eu adicionar os produtos desejados ao carrinho
Quando eu prosseguir para o carrinho
E ir para o checkout
E informar meus dados "Henrique" "Coutrim" "72979000"
E clicar em finish
Entao o sistema exibe que a compra foi realizada



