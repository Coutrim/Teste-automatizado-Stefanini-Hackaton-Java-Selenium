$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Compras.feature");
formatter.feature({
  "name": "Realizar compras",
  "description": "Eu como standard_user do site\nQuero logar na aplicacao\nPara fazer a compra de 3 ou mais itens",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "name": "Falha no login",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@FalhaLogin"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que eu esteja tentando acessar o sistema",
  "keyword": "Dado "
});
formatter.match({
  "location": "FalhaLoginSteps.queEuEstejaTentandoAcessarOSistema()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu preencher o campo usuario \"admin\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "FalhaLoginSteps.euPreencherOCampoUsuario(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencher o campo senha \"admin123\"",
  "keyword": "E "
});
formatter.match({
  "location": "FalhaLoginSteps.preencherOCampoSenha(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar em login",
  "keyword": "E "
});
formatter.match({
  "location": "FalhaLoginSteps.clicarEmLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema exibe mensagem de erro de login",
  "keyword": "Entao "
});
formatter.match({
  "location": "FalhaLoginSteps.oSistemaExibeMensagemDeErroDeLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Realizar login no sistema",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@LoginSucesso"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que eu queira fazer login",
  "keyword": "Dado "
});
formatter.match({
  "location": "LoginSteps.queEuQueiraFazerLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu preencher o campo username \"standard_user\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "LoginSteps.euPreencherOCampoUsername(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencher o campo password \"secret_sauce\"",
  "keyword": "E "
});
formatter.match({
  "location": "LoginSteps.preencherOCampoPassword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no botao login",
  "keyword": "E "
});
formatter.match({
  "location": "LoginSteps.clicarNoBotaoLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema exibe a tela de login",
  "keyword": "Entao "
});
formatter.match({
  "location": "LoginSteps.oSistemaExibeATelaDeLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png", null);
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Filtrar os precos do mais baixo para o mais alto",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@filtrar"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que eu esteja logado",
  "keyword": "Dado "
});
formatter.match({
  "location": "ProdutosFiltradosSteps.queEuEstejaLogado()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu clicar no seletor de filtros",
  "keyword": "Quando "
});
formatter.match({
  "location": "ProdutosFiltradosSteps.euClicarNoSeletorDeFiltros()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecionar o filtro desejado",
  "keyword": "E "
});
formatter.match({
  "location": "ProdutosFiltradosSteps.selecionarOFiltroDesejado()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema exibe os produtos com o filtro desejado",
  "keyword": "Entao "
});
formatter.match({
  "location": "ProdutosFiltradosSteps.oSistemaExibeOsProdutosComOFiltroDesejado()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded2.png", null);
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Remover itens do carrinho",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@RemoverItens"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que eu esteja logado",
  "keyword": "Dado "
});
formatter.match({
  "location": "ProdutosFiltradosSteps.queEuEstejaLogado()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu adicionar os produtos ao carrinho",
  "keyword": "Quando "
});
formatter.match({
  "location": "RemocaoItensSteps.euAdicionarOsProdutosAoCarrinho()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "prosseguir para o carrinho",
  "keyword": "E "
});
formatter.match({
  "location": "RemocaoItensSteps.prossigaParaOCarrinho()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "remova itens do carrinho",
  "keyword": "E "
});
formatter.match({
  "location": "RemocaoItensSteps.removaItensDoCarrinho()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema exibe o carrinho sem os itens que foram removidos",
  "keyword": "Entao "
});
formatter.match({
  "location": "RemocaoItensSteps.oSistemaExibeOCarrinhoSemOsItensQueForamRemovidos()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded3.png", null);
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Cancelando compra",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@CancelandoCompra"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que eu esteja logado no sistema",
  "keyword": "Dado "
});
formatter.match({
  "location": "CancelandoCompraSteps.queEuEstejaLogadoNoSistema()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu adicionar os produtos desejados ao carrinho",
  "keyword": "Quando "
});
formatter.match({
  "location": "CancelandoCompraSteps.euAdicionarOsProdutosDesejadosAoCarrinho()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu prosseguir para o carrinho",
  "keyword": "Quando "
});
formatter.match({
  "location": "CancelandoCompraSteps.euProsseguirParaOCarrinho()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ir para o checkout",
  "keyword": "E "
});
formatter.match({
  "location": "CancelandoCompraSteps.irParaOCheckout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar meus dados \"Henrique\" \"Coutrim\" \"72979000\"",
  "keyword": "E "
});
formatter.match({
  "location": "CancelandoCompraSteps.informarMeusDados(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar em cancel",
  "keyword": "E "
});
formatter.match({
  "location": "CancelandoCompraSteps.clicarEmCancel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema apresenta a tela de produtos novamente",
  "keyword": "Entao "
});
formatter.match({
  "location": "CancelandoCompraSteps.oSistemaApresentaATelaDeProdutosNovamente()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded4.png", null);
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Compra realizada com sucesso",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@CompraRealizadaSucesso"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que eu esteja logado",
  "keyword": "Dado "
});
formatter.match({
  "location": "ProdutosFiltradosSteps.queEuEstejaLogado()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu adicionar os produtos desejados ao carrinho",
  "keyword": "Quando "
});
formatter.match({
  "location": "CancelandoCompraSteps.euAdicionarOsProdutosDesejadosAoCarrinho()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu prosseguir para o carrinho",
  "keyword": "Quando "
});
formatter.match({
  "location": "CancelandoCompraSteps.euProsseguirParaOCarrinho()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ir para o checkout",
  "keyword": "E "
});
formatter.match({
  "location": "CancelandoCompraSteps.irParaOCheckout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar meus dados \"Henrique\" \"Coutrim\" \"72979000\"",
  "keyword": "E "
});
formatter.match({
  "location": "CancelandoCompraSteps.informarMeusDados(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar em finish",
  "keyword": "E "
});
formatter.match({
  "location": "CompraRealizadaSteps.clicarEmFinish()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema exibe que a compra foi realizada",
  "keyword": "Entao "
});
formatter.match({
  "location": "CompraRealizadaSteps.oSistemaExibeQueACompraFoiRealizada()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded5.png", null);
formatter.after({
  "status": "passed"
});
});