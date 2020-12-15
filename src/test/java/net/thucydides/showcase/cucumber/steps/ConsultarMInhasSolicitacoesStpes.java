package net.thucydides.showcase.cucumber.steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import net.thucydides.showcase.cucumber.pages.BasePage;
import net.thucydides.showcase.cucumber.pages.ConsultarMinhasSolicitacoesPage;
import net.thucydides.showcase.cucumber.pages.HomePage;
import net.thucydides.showcase.cucumber.pages.LoginPage;

public class ConsultarMInhasSolicitacoesStpes {
	LoginPage login = new LoginPage();
	HomePage home;
	ConsultarMinhasSolicitacoesPage consultar;
	BasePage base;
	String idSolicitacao;

//	@Dado("^realiza login$")
//	public void realiza_login() {
//		login.fazerLogin();
//	}

	@Dado("^seleciona menu Solicitação de Minhas Solicitacoes$")
	public void seleciona_menu_Solicitação_de_Minhas_Solicitacoes() {
		home.clicarMenuMinhasSolicitacoes();
	}

	@Quando("^preenche ID da Solicitacao '(.*)'$")
	public void preenche_ID_da_Solicitacao(String idSolicitacao) {
		consultar.preencherIdSolicitacao(idSolicitacao);
	}

	@Quando("^preenche CNPJMinhasSolicitacoes '(.*)'$")
	public void preenche_CNPJ(String cnpj) {
		consultar.preencherCNPJ(cnpj);
	}

	@Quando("^preenche CPF '(.*)'$")
	public void preenche_CPF(String cpf) {
		consultar.preencherCPF(cpf);
	}

	@Quando("^preenche Razao Social do Cliente ou Nome '(.*)'$")
	public void preenche_Razao_Social_do_Cliente_ou_Nome(String razaoSocialNome) {
		consultar.preencherRazaoSocialNome(razaoSocialNome);
	}

	@Quando("^seleciona Aprovador '(.*)'$")
	public void seleciona_Aprovador_ter(String aprovador) {
		consultar.selecionarAprovador(aprovador);
	}

	@Quando("^seleciona Status '(.*)'$")
	public void seleciona_Status(String status) {
		consultar.selecionarStatus(status);
	}

	@Quando("^seleciona Tipo de ServicoMinhas '(.*)'$")
	public void seleciona_Tipo_de_Servico(String tipoServico) {
		consultar.selecionarTipoServico(tipoServico);
	}

	@Quando("^clica em PesquisarMinhaSolicitacoes$")
	public void clica_em_Pesquisar() {
		consultar.clicarPesquisar();
	}

	@Quando("^clica em Limpar$")
	public void clica_em_Limpar() {
		consultar.clicarLimpar();
		consultar.ValidarCamposVazios();
	}

	@Quando("^clica em Visualizar Solicitacao$")
	public String clica_em_Visualizar_Solicitacao() {
		consultar.clicarVisualizarSolicitacao();
		idSolicitacao = consultar.pegarIdSolicitacaoDetalhamento();
		return idSolicitacao;
	}

	@Então("^Valida a solicitacao$")
	public void valida_a_solicitacao() {
		if (consultar.pegarStatusDetalhamento().equals("Aguardando Aprovação")) {
			base.validarVerdadeiro(consultar.existeBotaoCancelarSolicitacao());
		} else {
			base.validarFalso(consultar.existeBotaoCancelarSolicitacao());
		}
		consultar.clicarFecharSolicitacao();
	}

	@Quando("^clica em Cancelar Solicitacao$")
	public void clica_em_Cancelar_Solicitacao() {
		consultar.clicarCancelarSolcitacao();
		consultar.clicarConfirmar();
	}

	@Então("^sistema Cancela Solicitacao$")
	public void sistema_Cancela_Solicitacao() {
		base.esperarTempo();
		consultar.preencherIdSolicitacao(idSolicitacao);
		consultar.clicarPesquisar();
		consultar.clicarVisualizarSolicitacao();

		base.validarTexto("Cancelado Pelo Solicitante", consultar.pegarStatusDetalhamento());
	}
}
