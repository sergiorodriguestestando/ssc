package net.thucydides.showcase.cucumber.steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import net.thucydides.showcase.cucumber.pages.AprovarSolicitacoesPage;
import net.thucydides.showcase.cucumber.pages.BasePage;
import net.thucydides.showcase.cucumber.pages.HomePage;
import net.thucydides.showcase.cucumber.pages.LoginPage;

public class AprovarSolicitacoesSteps {

	LoginPage login;
	HomePage home;
	AprovarSolicitacoesPage aprovar;
	BasePage base;
	String idSolicitacao;
	
	
	@Dado("^seleciona menu Aprovacao$")
	public void seleciona_menu_Solicitação_de_Serviços_Comerciais() {
		home.clicarMenuAprovarSolicitacoes();
	}

	@Quando("^clica em Aprovar$")
	public void clica_em_Aprovar() {
		aprovar.clicarAprovar();
	}

	@Quando("^clica em ConfirmarTESTE$")
	public void clica_em_Confirmar() {
		aprovar.clicarConfirmar();
		aprovar.clicarConfirmarDialog();
	}

	@Quando("^clica em NegarTESTE$")
	public void clica_em_Negar() {
		aprovar.clicarNegar();
	}

	@Quando("^clica em PesquisarAprovacoes$")
	public void clica_em_Pesquisar() {
		aprovar.clicarPesquisar();
	}

	@Quando("^clica em Visualizar SolicitacaoTESTE$")
	public String clica_em_Visualizar_Solicitacao() {
		aprovar.clicarVisualizarSolicitacao();
		idSolicitacao = aprovar.pegarIdSolicitacaoDetalhamento();
		return idSolicitacao;
	}

	// @Dado("^realiza login")
	// public void realiza_login() {
	// login.fazerLogin();
	// }

	@Quando("^preenche CNPJTESTE '(.*)'$")
	public void preenche_CNPJ(String cnpj) {
		aprovar.preencherCNPJ(cnpj);
	}

	@Quando("^preenche ComentarioTESTE '(.*)'$")
	public void preenche_Comentario(String comentario) {
		aprovar.preencherComentario(comentario);
	}

	@Quando("^preenche CPFTESTE '(.*)'$")
	public void preenche_CPF(String cpf) {
		aprovar.preencherCPF(cpf);
	}

	@Quando("^preenche ID da SolicitacaoAprovacao '(.*)'$")
	public void preenche_ID_da_Solicitacao(String idSolicitacao) {
		aprovar.preencherIdSolicitacao(idSolicitacao);
	}

	@Quando("^preenche Motivo da Recusa '(.*)'$")
	public void preenche_Motivo_da_Recusao(String motivoRecusa) {
		aprovar.preencherMotivoRecusa(motivoRecusa);
	}

	@Quando("^preenche Razao Social do Cliente ou NomeAprovacao '(.*)'$")
	public void preenche_Razao_Social_do_Cliente_ou_Nome(String razaoSocialNome) {
		aprovar.preencherRazaoSocialNome(razaoSocialNome);
	}

	@Dado("^seleciona menu Aprovacoes$")
	public void seleciona_menu_Aprovacoes() {
		home.clicarMenuAproavacoes();
	}

	@Quando("^seleciona StatusAprovacao '(.*)'$")
	public void seleciona_Status(String status) {
		aprovar.selecionarStatus(status);
	}

	@Quando("^seleciona Tipo de ServicoTESTE '(.*)'$")
	public void seleciona_Tipo_de_Servico(String tipoServico) {
		aprovar.selecionarTipoServico(tipoServico);
	}

	@Então("^sistema muda o Status '(.*)'$")
	public void sistema_muda_o_Status(String status) {
		base.esperarTempo();
		aprovar.preencherIdSolicitacao(idSolicitacao);
		aprovar.selecionarStatus(status);
		aprovar.clicarPesquisar();
		aprovar.clicarVisualizarSolicitacao();

		base.validarTexto(status, aprovar.pegarStatusDetalhamento());
		aprovar.clicarFecharSolicitacao();
	}

	@Então("^sistema verifica que solicitação não é aprovavel")
	public void sistema_verifica_que_solicitação_não_é_aprovavel() {
		base.moverParaFimPagina();
		base.validarFalso(aprovar.existeBotaoAprovar());
		base.validarFalso(aprovar.existeBotaoNegar());
	}
}
