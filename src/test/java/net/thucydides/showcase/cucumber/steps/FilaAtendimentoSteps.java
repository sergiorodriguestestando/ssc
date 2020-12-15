package net.thucydides.showcase.cucumber.steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import net.thucydides.showcase.cucumber.pages.FilaAtendimentoPage;
import net.thucydides.showcase.cucumber.pages.HomePage;
import net.thucydides.showcase.cucumber.pages.LoginPage;

public class FilaAtendimentoSteps {
	LoginPage login;
	HomePage home;
	FilaAtendimentoPage atender;
	String vIdSolicitacao, vComentarios, vUsuario, vStatus;
	boolean vExibeBotao;

	@Quando("^adiciona Aprovador '(.*)' '(.*)'$")
	public void adiciona_Aprovador(String tipoAprovador, String aprovador) {

		atender.selecionarTipoAprovador(tipoAprovador);
		atender.selecionarAprovador(aprovador);

		if(!tipoAprovador.isEmpty() || !aprovador.isEmpty()) {
			atender.clicarAdicionarAprovadorInformacoesAprovadores();
		}
	}

	@Quando("^clica em Adicionar Aprovador$")
	public void clica_em_Adicionar_Aprovador() {
		atender.clicarAdicionarAprovador();
	}

	@Quando("^clica em Alterar Status da Solicitacao$")
	public void clica_em_Alterar_Status_da_Solicitacao() {
		atender.clicarAlterarStatusSolicitacao();
		atender.confirmarDialog();
		vExibeBotao = true;
	}

	@Quando("^clica em Atribuir Atendimento$")
	public void clica_em_Atribuir_Atenddimento() {
		atender.clicarAtribuirAtendimento();
		atender.confirmarDialog();
		vExibeBotao = true;
	}

	@Quando("^clica em Confirmar$")
	public void clica_em_Confirmar() {
		atender.clicarConfirmar();
		atender.confirmarDialog();
	}

	@Quando("^clica em Confirmar Aprovador$")
	public void clica_em_Confirmar_Aprovador() {
		atender.clicarConfirmarAdicaoAprovador();
		atender.confirmarDialog();
	}

	@Quando("^clica em Finalizar$")
	public void clica_em_Finalizar() {
		atender.clicarFinalizar();
	}

	@Quando("^clica em Negar$")
	public void clica_em_Negar() {
		atender.clicarNegar();
	}

	@Quando("^clica em PesquisarFilaAtendimento$")
	public void clica_em_Pesquisar() {
		atender.clicarPesquisar();
	}

	@Quando("^clica em Visualizar SolicitacaoFila$")
	public void clica_em_Visualizar_Solicitacao() {
		atender.clicarVisualizarSolicitacao();
		vIdSolicitacao = atender.pegarIdSolicitacaoDetalhamento();
	}

	@Quando("^preenche Comentario '(.*)'$")
	public void preenche_Comentario(String comentario) {
		vComentarios = comentario;
		atender.preencherComentario(comentario);
	}

	@Quando("^preenche Motivo da RecusaTESTE '(.*)'$")
	public void preenche_Motivo_da_Recusa(String motivoRecusa) {
		vComentarios = motivoRecusa;
		atender.preencherMotivorecusa(motivoRecusa);
	}

//	@Dado("^realiza login '(.*)' '(.*)'$")
//	public void realiza_login(String usuario, String senha) {
//		login.fazerLogin();
//	}

	@Quando("^remove Aprovador '(.*)'$")
	public void remove_Aprovador(String aprovador) {
		atender.clicarRemoverAprovador(aprovador);
	}

	@Dado("^seleciona menu Fila de Atendimento$")
	public void seleciona_menu_Fila_de_Atendimento() {
		vIdSolicitacao = ""; 
		vComentarios = "";
		vUsuario = ""; 
		vStatus = "";
		vExibeBotao = false;

		home.clicarMenuFilaAtendimentos();
	}

	@Quando("^sistema exibe botao Confirmar inativo$")
	public void sistema_exibe_botao_Confirmar_inativo() {
		atender.validarVerdadeiro(atender.pegarStatusBotaoConfirmar());
	}

	@Então("^valida atendimento '(.*)'$")
	public void valida_atendimento(String statusAtendimento) {
		atender.esperarTempo();
		home.clicarMenuFilaAtendimento();
		atender.preencherIdSolicitacaoFiltro(vIdSolicitacao);
		atender.clicarLimparFiltroStatus();
		atender.clicarPesquisar();
		vUsuario = home.pegarNomeUsuario();
		atender.clicarVisualizarSolicitacao();

		//valida interações
		atender.validarTextoContem(vUsuario, atender.pegarNomeAtendenteDetalhamentoInformacoesAtendimento());
		atender.validarTexto(statusAtendimento, atender.pegarStatusDetalhamentoInformacoesAtendimento());
		if(statusAtendimento.equals("Finalizado") || statusAtendimento.equals("Cancelado")) {
			atender.validarTexto(vComentarios, atender.pegarComentarioDetalhamentoInformacoesAtendimento());
		}

		//valida botoes ao fim
		atender.clicarDivBotoesFinalPagina();
		if(vExibeBotao) {
			atender.validarVerdadeiro(atender.existeBotaoAdicionarAprovador());
			atender.validarVerdadeiro(atender.existeBotaoAlterarStatusSolicitacao());
			atender.validarVerdadeiro(atender.existeBotaoAtribuirAtendimento());
			atender.validarVerdadeiro(atender.existeBotaoFinalizar());
			atender.validarVerdadeiro(atender.existeBotaoNegar());
		}else {
			atender.validarFalso(atender.existeBotaoAdicionarAprovador());
			atender.validarFalso(atender.existeBotaoAlterarStatusSolicitacao());
			atender.validarFalso(atender.existeBotaoAtribuirAtendimento());
			atender.validarFalso(atender.existeBotaoFinalizar());
			atender.validarFalso(atender.existeBotaoNegar());
		}
		atender.clicarFecharSolicitacao();
	}


	@Então("^sistema exibe mensagem negando a adicao de tipos de aprovadores distintos$")
	public void sistema_exibe_mensagem_negando_a_adicao_de_tipos_de_aprovadores_distintos() {
		String msg = "Não é permitido uma operação com tipos de aprovadores diferentes.";

		atender.validarTexto(msg, atender.pegarMensagemTipoAprovadorDiferente());
	}

	@Quando("^sistema valida Aprovador ja adicionado$")
	public void sistema_valida_Aprovador_ja_adicionado() {
		String msg = "Este aprovador já foi adicionado";
		atender.validarTexto(msg, atender.pegarAlertaAprovadorRepetido());
	}

	@Então("^valida nao adicao de Aprovador '(.*)'$")
	public void valida_nao_adicao_de_Aprovador(String aprovador) {
		atender.validarNaoTextoContem(aprovador, atender.pegarAprovadoresAdicionados());
	}

}
