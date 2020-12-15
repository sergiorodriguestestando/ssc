package net.thucydides.showcase.cucumber.steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import net.thucydides.showcase.cucumber.pages.CriarEditarDelegacaoAprovacaoPage;
import net.thucydides.showcase.cucumber.pages.DatePickPage;
import net.thucydides.showcase.cucumber.pages.DelegacaoAprovacaoPage;
import net.thucydides.showcase.cucumber.pages.HomePage;
import net.thucydides.showcase.cucumber.pages.LoginPage;

public class DelegacaoAprovacaoSteps {

	HomePage home;
	LoginPage login;
	DelegacaoAprovacaoPage delegar;
	CriarEditarDelegacaoAprovacaoPage criar;
	DatePickPage data;

	String vNomeRegra, vDelegadoA, vDataInicio, vDataFim, vId;


	@Quando("^clica em Confirmar no dialog$")
	public void clica_em_Confirmar_no_dialog() {
		criar.confirmarDialog();
	}

	@Quando("^clica em Editar$")
	public void clica_em_Editar() {
		delegar.clicarEditar();
	}

	@Quando("^clica em Excluir$")
	public void clica_em_Excluir() {
		delegar.clicarExcluir();
	}

	@Quando("^clica em Nova Delegacao$")
	public void clica_em_Nova_Delegacao() {
		delegar.clicarNovaDelegacao();
	}

	@Quando("^clica em Pesquisar$")
	public void clica_em_Pesquisar() {
		delegar.clicarPesquisar();
	}

	@Quando("^clica em Salvar$")
	public void clica_em_Salvar() {
		criar.clicarSalvar();
	}

	@Quando("^clica em Visualizar Delegacao$")
	public void clica_em_Visualizar_Delegacao() {
		vId = delegar.pegarIdDelegacao();
		delegar.clicarVisualizarDelegacao();
	}

	@Quando("^preenche Nome da Regra '(.*)'$")
	public void preenche_Nome_da_Regra(String nomeRegra) {
		criar.preencherNomeRegra(nomeRegra);
		vNomeRegra = nomeRegra;
	}

//	@Dado("^realiza login '(.*)' '(.*)'$")
//	public void realiza_login(String usuario, String senha) {
//		login.fazerLogin();
//	}

	@Quando("^seleciona Data Fim '(.*)'$")
	public void seleciona_Data_Fim(String dataFim) {
		criar.clicarDataFim();
		data.selecionarData(dataFim);
		vDataFim = dataFim;
	}

	@Quando("^seleciona Data Inicio '(.*)'$")
	public void seleciona_Data_Inicio(String dataInicio) {
		criar.clicarDataInicio();
		data.selecionarData(dataInicio);
		vDataInicio = dataInicio;
	}

	@Quando("^seleciona filtro Data Inicio '(.*)'$")
	public void seleciona_filtro_Data_Inicio(String dataInicio) {
		delegar.clicarDataInicioFiltro();
		data.selecionarData(dataInicio);
	}

	@Quando("^seleciona filtro Data Fim '(.*)'$")
	public void seleciona_filtro_Data_Fim(String dataInicio) {
		delegar.clicarDataFimFiltro();
		data.selecionarData(dataInicio);
	}

	@Dado("^seleciona menu Delegacao de aprovacao$")
	public void seleciona_menu_Delegacao_de_aprovacao() {
		home.clicarMenuDelegacaoAprovacao();
	}

	@Quando("^seleciona Delegado A '(.*)'$")
	public void seleciona_Delegado_A(String delegadoA) {
		criar.selecionarDelegadoA(delegadoA);
		vDelegadoA = delegadoA;
	}

	@Então("^sistema emite mensagem de erro de periodo$")
	public void sistema_emite_mensagem_de_erro_de_periodo() {
		String esperado = "Não é possível criar uma regra de delegação de aprovação para um período que já exista.";
		criar.validarTexto(esperado, criar.pegarMensagemErro());
	}

	@Então("^sistema nao exibe botao Excluir$")
	public void sistema_nao_exibe_botao_Excluir() {
		delegar.validarFalso(delegar.existeBotaoExcluir());
	}

	@Quando("^sistema valida campos obrigatorios$")
	public void sistema_valida_campos_obrigatorios() {
		String esperado = "Campo Obrigatório!";

		criar.validarTexto(esperado, criar.pegarTextoCampoObrigatorioNomeRegra());
		criar.validarTexto(esperado, criar.pegarTextoCampoObrigatorioDelegadoA());
		criar.validarTexto(esperado, criar.pegarTextoCampoObrigatorioDataInicio());
	}

	@Então("^valida Delegacao$")
	public void valida_Delegacao() {
		delegar.esperarTempo();
		delegar.selecionarDelegadoAFiltro(vDelegadoA);
		delegar.clicarDataInicioFiltro();
		data.selecionarData(vDataInicio);
		delegar.clicarDataFimFiltro();
		data.selecionarData(vDataFim);
		delegar.clicarPesquisar();
		delegar.clicarVisualizarDelegacao();

		delegar.validarTexto(vNomeRegra, delegar.pegarNomeRegraDetalhes());
		delegar.validarTexto(vDelegadoA, delegar.pegarDelegadoADetalhes());
		delegar.validarTexto(vDataInicio, delegar.pegarDataInicioDetalhes());
		delegar.validarTexto(vDataFim, delegar.pegarDataFimDetalhes());

		delegar.clicarFecharDetalhes();
	}


	@Então("^valida exclusao de Delegacao$")
	public void valida_exclusao_de_Delegacao() {
		delegar.clicarDataInicioFiltro();
		data.selecionarData("sysdate");
		delegar.clicarPesquisar();

		delegar.validarFalso(delegar.existeDelegacao(vId));
	}
}
