$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/consultar/ECDU002_Consultar_Minhas_Solicitacoes_de_Servicos_ComerciaisNOVO.feature");
formatter.feature({
  "name": "Minhas Solicitações",
  "description": "",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "name": "Realiza login",
  "description": "",
  "keyword": "Cenário"
});
formatter.step({
  "name": "realiza login",
  "keyword": "Dado "
});
formatter.match({
  "location": "SolicitarServicoSteps.realiza_login()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Formulário Alterações de Limite de crédito",
  "description": "",
  "keyword": "Esquema do Cenário"
});
formatter.step({
  "name": "seleciona menu Solicitação de Serviços Comerciais",
  "keyword": "Dado "
});
formatter.step({
  "name": "seleciona Tipo de Servico \u0027\u003cTipo de Servico\u003e\u0027",
  "keyword": "E "
});
formatter.step({
  "name": "clica no botao Salvar",
  "keyword": "Quando "
});
formatter.step({
  "name": "sistema exibe alerta de campos obrigatorios \u0027\u003cTipo de Servico\u003e\u0027",
  "keyword": "E "
});
formatter.step({
  "name": "preenche CNPJ \u0027\u003cCNPJ\u003e\u0027",
  "keyword": "E "
});
formatter.step({
  "name": "preenche automaticamente Razao Social \u0027\u003cRazao Social\u003e\u0027",
  "keyword": "E "
});
formatter.step({
  "name": "preenche Sugestao Limite Credito \u0027\u003cSugestao Limite Credito\u003e\u0027",
  "keyword": "E "
});
formatter.step({
  "name": "preenche Faturamento Medio Mensal \u0027\u003cFaturamento Medio Mensal\u003e\u0027",
  "keyword": "E "
});
formatter.step({
  "name": "adiciona Aprovador \u0027\u003cAprovador\u003e\u0027",
  "keyword": "E "
});
formatter.step({
  "name": "seleciona anexo \u0027\u003cAnexo\u003e\u0027",
  "keyword": "E "
});
formatter.step({
  "name": "clica no botao Salvar",
  "keyword": "Então "
});
formatter.step({
  "name": "clica no botao Confirmar Dialog",
  "keyword": "E "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Exemplos",
  "rows": [
    {
      "cells": [
        "Tipo de Servico",
        "CNPJ",
        "Razao Social",
        "Sugestao Limite Credito",
        "Faturamento Medio Mensal",
        "Aprovador",
        "Anexo"
      ]
    },
    {
      "cells": [
        "Alterações de Limite de crédito",
        "00.000.000/0000-00",
        "ABU-GOSCH Y CIA LTDA",
        "R$ 999.999.999,00",
        "R$ 999.999.999,00",
        "ter01277",
        "teste.doc"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Formulário Alterações de Limite de crédito",
  "description": "",
  "keyword": "Esquema do Cenário"
});
formatter.step({
  "name": "seleciona menu Solicitação de Serviços Comerciais",
  "keyword": "Dado "
});
formatter.match({
  "location": "SolicitarServicoSteps.seleciona_menu_Solicitação_de_Serviços_Comerciais()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleciona Tipo de Servico \u0027Alterações de Limite de crédito\u0027",
  "keyword": "E "
});
formatter.match({
  "location": "SolicitarServicoSteps.seleciona_Tipo_de_Servico_Abatimentos_de_Títulos(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clica no botao Salvar",
  "keyword": "Quando "
});
formatter.match({
  "location": "SolicitarServicoSteps.clica_no__Salvar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "sistema exibe alerta de campos obrigatorios \u0027Alterações de Limite de crédito\u0027",
  "keyword": "E "
});
formatter.match({
  "location": "SolicitarServicoSteps.sistema_exibe_alerta_de_campos_obrigatorios(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preenche CNPJ \u002700.000.000/0000-00\u0027",
  "keyword": "E "
});
formatter.match({
  "location": "SolicitarServicoSteps.preenche_CNPJ(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preenche automaticamente Razao Social \u0027ABU-GOSCH Y CIA LTDA\u0027",
  "keyword": "E "
});
formatter.match({
  "location": "SolicitarServicoSteps.preenche_automaticamente_Razao_Social(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preenche Sugestao Limite Credito \u0027R$ 999.999.999,00\u0027",
  "keyword": "E "
});
formatter.match({
  "location": "SolicitarServicoSteps.preenche_Sugestao_Limite_Credito(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preenche Faturamento Medio Mensal \u0027R$ 999.999.999,00\u0027",
  "keyword": "E "
});
formatter.match({
  "location": "SolicitarServicoSteps.preenche_Faturamento_Medio_Mensal(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "adiciona Aprovador \u0027ter01277\u0027",
  "keyword": "E "
});
formatter.match({
  "location": "SolicitarServicoSteps.adiciona_Aprovador(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleciona anexo \u0027teste.doc\u0027",
  "keyword": "E "
});
formatter.match({
  "location": "SolicitarServicoSteps.seleciona_anexo(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clica no botao Salvar",
  "keyword": "Então "
});
formatter.match({
  "location": "SolicitarServicoSteps.clica_no__Salvar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clica no botao Confirmar Dialog",
  "keyword": "E "
});
formatter.match({
  "location": "SolicitarServicoSteps.clica_no_botao_Confirmar_Dialog()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Validar Botão Limpar Campos",
  "description": "",
  "keyword": "Esquema do Cenário"
});
formatter.step({
  "name": "seleciona menu Solicitação de Minhas Solicitacoes",
  "keyword": "Dado "
});
formatter.step({
  "name": "preenche ID da Solicitacao \u0027\u003cID\u003e\u0027",
  "keyword": "Quando "
});
formatter.step({
  "name": "preenche CNPJ \u0027\u003cCNPJ\u003e\u0027",
  "keyword": "E "
});
formatter.step({
  "name": "preenche CPF \u0027\u003cCPF\u003e\u0027",
  "keyword": "E "
});
formatter.step({
  "name": "preenche Razao Social do Cliente ou Nome \u0027\u003cRazao Social ou Nome\u003e\u0027",
  "keyword": "E "
});
formatter.step({
  "name": "seleciona Aprovador \u0027\u003cAprovador\u003e\u0027",
  "keyword": "E "
});
formatter.step({
  "name": "seleciona Status \u0027\u003cStatus\u003e\u0027",
  "keyword": "E "
});
formatter.step({
  "name": "seleciona Tipo de ServicoMinhas \u0027\u003cTipo de Servico\u003e\u0027",
  "keyword": "E "
});
formatter.step({
  "name": "clica em Limpar",
  "keyword": "E "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Exemplos",
  "rows": [
    {
      "cells": [
        "ID",
        "CNPJ",
        "CPF",
        "Razao Social ou Nome",
        "Aprovador",
        "Status",
        "Tipo de Servico"
      ]
    },
    {
      "cells": [
        "01",
        "0000",
        "43",
        "teste",
        "SERGIO",
        "Aguardando Aprovação",
        "Alterações de Limite de crédito"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validar Botão Limpar Campos",
  "description": "",
  "keyword": "Esquema do Cenário"
});
formatter.step({
  "name": "seleciona menu Solicitação de Minhas Solicitacoes",
  "keyword": "Dado "
});
formatter.match({
  "location": "ConsultarMInhasSolicitacoesStpes.seleciona_menu_Solicitação_de_Minhas_Solicitacoes()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preenche ID da Solicitacao \u002701\u0027",
  "keyword": "Quando "
});
formatter.match({
  "location": "ConsultarMInhasSolicitacoesStpes.preenche_ID_da_Solicitacao(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preenche CNPJ \u00270000\u0027",
  "keyword": "E "
});
formatter.match({
  "location": "SolicitarServicoSteps.preenche_CNPJ(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preenche CPF \u002743\u0027",
  "keyword": "E "
});
formatter.match({
  "location": "ConsultarMInhasSolicitacoesStpes.preenche_CPF(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preenche Razao Social do Cliente ou Nome \u0027teste\u0027",
  "keyword": "E "
});
formatter.match({
  "location": "ConsultarMInhasSolicitacoesStpes.preenche_Razao_Social_do_Cliente_ou_Nome(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleciona Aprovador \u0027SERGIO\u0027",
  "keyword": "E "
});
formatter.match({
  "location": "ConsultarMInhasSolicitacoesStpes.seleciona_Aprovador_ter(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleciona Status \u0027Aguardando Aprovação\u0027",
  "keyword": "E "
});
formatter.match({
  "location": "ConsultarMInhasSolicitacoesStpes.seleciona_Status(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleciona Tipo de ServicoMinhas \u0027Alterações de Limite de crédito\u0027",
  "keyword": "E "
});
formatter.match({
  "location": "ConsultarMInhasSolicitacoesStpes.seleciona_Tipo_de_Servico(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clica em Limpar",
  "keyword": "E "
});
formatter.match({
  "location": "ConsultarMInhasSolicitacoesStpes.clica_em_Limpar()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Buscar Solicitação",
  "description": "",
  "keyword": "Esquema do Cenário"
});
formatter.step({
  "name": "seleciona menu Solicitação de Minhas Solicitacoes",
  "keyword": "Dado "
});
formatter.step({
  "name": "seleciona Tipo de ServicoMinhas \u0027\u003cTipo de Servico\u003e\u0027",
  "keyword": "E "
});
formatter.step({
  "name": "clica em PesquisarMinhaSolicitacoes",
  "keyword": "E "
});
formatter.step({
  "name": "clica em Visualizar Solicitacao",
  "keyword": "E "
});
formatter.step({
  "name": "Valida a solicitacao",
  "keyword": "Então "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Exemplos",
  "rows": [
    {
      "cells": [
        "Tipo de Servico"
      ]
    },
    {
      "cells": [
        "Alterações de Limite de crédito"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Buscar Solicitação",
  "description": "",
  "keyword": "Esquema do Cenário"
});
formatter.step({
  "name": "seleciona menu Solicitação de Minhas Solicitacoes",
  "keyword": "Dado "
});
formatter.match({
  "location": "ConsultarMInhasSolicitacoesStpes.seleciona_menu_Solicitação_de_Minhas_Solicitacoes()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleciona Tipo de ServicoMinhas \u0027Alterações de Limite de crédito\u0027",
  "keyword": "E "
});
formatter.match({
  "location": "ConsultarMInhasSolicitacoesStpes.seleciona_Tipo_de_Servico(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clica em PesquisarMinhaSolicitacoes",
  "keyword": "E "
});
formatter.match({
  "location": "ConsultarMInhasSolicitacoesStpes.clica_em_Pesquisar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clica em Visualizar Solicitacao",
  "keyword": "E "
});
formatter.match({
  "location": "ConsultarMInhasSolicitacoesStpes.clica_em_Visualizar_Solicitacao()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Valida a solicitacao",
  "keyword": "Então "
});
formatter.match({
  "location": "ConsultarMInhasSolicitacoesStpes.valida_a_solicitacao()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Cancelar Solicitação",
  "description": "",
  "keyword": "Cenário"
});
formatter.step({
  "name": "seleciona menu Solicitação de Minhas Solicitacoes",
  "keyword": "Dado "
});
formatter.match({
  "location": "ConsultarMInhasSolicitacoesStpes.seleciona_menu_Solicitação_de_Minhas_Solicitacoes()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleciona Status \u0027Aguardando Aprovação\u0027",
  "keyword": "Quando "
});
formatter.match({
  "location": "ConsultarMInhasSolicitacoesStpes.seleciona_Status(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clica em PesquisarMinhaSolicitacoes",
  "keyword": "E "
});
formatter.match({
  "location": "ConsultarMInhasSolicitacoesStpes.clica_em_Pesquisar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clica em Visualizar Solicitacao",
  "keyword": "E "
});
formatter.match({
  "location": "ConsultarMInhasSolicitacoesStpes.clica_em_Visualizar_Solicitacao()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clica em Cancelar Solicitacao",
  "keyword": "E "
});
formatter.match({
  "location": "ConsultarMInhasSolicitacoesStpes.clica_em_Cancelar_Solicitacao()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "sistema Cancela Solicitacao",
  "keyword": "Então "
});
formatter.match({
  "location": "ConsultarMInhasSolicitacoesStpes.sistema_Cancela_Solicitacao()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "sair do sistema",
  "keyword": "E "
});
formatter.match({
  "location": "SolicitarServicoSteps.sair_do_sistema()"
});
formatter.result({
  "status": "passed"
});
});