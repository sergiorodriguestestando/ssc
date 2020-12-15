package net.thucydides.showcase.cucumber.pages;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.WebElementFacade;

public class FilaAtendimentoPage extends BasePage{
	
	@FindBy(xpath = "//div[div[contains(text(), 'Informações dos Aprovadores')]]//table")
	WebElementFacade tableAprovadores;

	@FindBy(xpath = "//div[@class = 'row mt-5']/div[@class = 'col col-12'][2]")
	WebElementFacade divBotoesFinalPagina;
	
	@FindBy(xpath = "//div[@class = 'text-left col-md-8 col-12']//button[@id = 'BTN_ADICIONAR_APROVADORES']")
	WebElementFacade botaoAdicionarAprovador;
	
	@FindBy(xpath = "//div[div[@class = 'v-card__subtitle']]//div[button/span[contains(text(), 'Adicionar Aprovador')]]/button[1]")
	WebElementFacade botaoAdicionarAprovadorInformacoesAprovadores;
	
	@FindBy(xpath = "//div[@class = 'text-left col-md-8 col-12']//button[@id = 'BTN_ALTERAR_STATUS_SOLICITACAO']")
	WebElementFacade botaoAlterarStatusSolicitacao;

	@FindBy(xpath = "//div[@class = 'text-left col-md-8 col-12']//button[@id = 'BTN_ATRIBUIR_SOLICITACAO']")
	WebElementFacade botaoAtribuirAtendimento;

	@FindBy(xpath = "//button[@id='BTN_CONFIRMAR']")
	WebElementFacade botaoConfirmar;

	@FindBy(xpath = "//button[@id='BTN_SALVAR_APROVADORES']")
	WebElementFacade botaoConfirmarAdicaoAprovador;

	@FindBy(xpath = "//div[div[text() = 'Detalhes da Solicitação']]/button")
	WebElementFacade botaoFecharSolicitacao;

	@FindBy(xpath = "//div[@class = 'text-right col-md-4 col-12']//button[@id = 'BTN_APROVAR']")
	WebElementFacade botaoFinalizar;

	@FindBy(xpath = "//div[@class = 'text-right col-md-4 col-12']//button[@id = 'BTN_RECUSAR']")
	WebElementFacade botaoNegar;

	@FindBy(xpath = "//div[input[@id='STATUS_PESQUISA']]//button[1]")
	WebElementFacade botaoLimparFiltroStatus;

	@FindBy(xpath = "//button[span[contains(text(), 'Pesquisar')]]")
	WebElementFacade botaoPesquisar;

	@FindBy(xpath = "//tbody/tr[1]//button[@class = 'v-icon notranslate mr-2 v-icon--link material-icons theme--light']")
	WebElementFacade botaoVisualizarSolicitacao; //pega o primeiro

	@FindBy(xpath = "//div[div[@class = 'v-card__subtitle']]//div[label[text() = 'Aprovador']]/input[1]")
	WebElementFacade campoAprovador;
	
	@FindBy(xpath = "//div[label[text() = 'Comentário']]/textarea[1]")
	WebElementFacade  campoComentario;

	@FindBy(xpath = "//input[@id='ID_CADASTRO']")
	WebElementFacade campoIdSolicitacaoDetalhamento;

	@FindBy(xpath = "//input[@id='ID_SOLICITACAO_PESQUISA']")
	WebElementFacade campoIdSolicitacaoFiltro;

	@FindBy(xpath = "//div[label[text() = 'Motivo da Recusa']]/textarea[1]")
	WebElementFacade  campoMotivoRecusa;

	@FindBy(xpath = "//input[@id='STATUS_PESQUISA']")
	WebElementFacade campoStatusFiltro;

	@FindBy(xpath = "//div[label[text() = 'Tipo de Aprovador']]/input[1]")
	WebElementFacade campoTipoAprovador;

	@FindBy(xpath = "//div[header//div[text() = 'Informações do Atendimento']]//tbody/tr[1]/td[1]")
	WebElementFacade textoAtendenteDetalhamentoInformacoesAtendimento;

	@FindBy(xpath = "//div[@class  = 'v-input__control'][div//label[text() = 'Aprovador']]//div[@class = 'v-messages__message message-transition-enter-to']")
	WebElementFacade textoAlertaCampoAprovador;
	
	@FindBy(xpath = "//div[header//div[text() = 'Informações do Atendimento']]//tbody/tr[1]/td[4]")
	WebElementFacade textoComentarioDetalhamentoInformacoesAtendimento;
	
	@FindBy(xpath = "//div[@id = 'NOVO_APROVADORES_CADASTRO']//div[contains(text(), 'Não é permitido uma operação com tipos de aprovadores diferentes.')]")
	WebElementFacade textoMensaagemTipoAprovadorDiferente;
	
	@FindBy(xpath = "//div[header//div[text() = 'Informações do Atendimento']]//tbody/tr[1]/td[2]")
	WebElementFacade textoStatusDetalhamentoInformacoesAtendimento;

	public void clicarAdicionarAprovadorInformacoesAprovadores() {
		clicar(botaoAdicionarAprovadorInformacoesAprovadores);
	}
	
	public void clicarAdicionarAprovador() {
		clicar(botaoAdicionarAprovador);
	}

	public void clicarAlterarStatusSolicitacao() {
		clicar(botaoAlterarStatusSolicitacao);
	}

	public void clicarAtribuirAtendimento() {
		clicar(botaoAtribuirAtendimento);
	}

	public void clicarConfirmar() {
		clicar(botaoConfirmar);
	}

	public void clicarConfirmarAdicaoAprovador() {
		clicar(botaoConfirmarAdicaoAprovador);
	}
	
	public void clicarDivBotoesFinalPagina() {
		clicar(divBotoesFinalPagina);
	}
	
	public void clicarFecharSolicitacao() {
		clicar(botaoFecharSolicitacao);
	}

	public void clicarFinalizar() {
		clicar(botaoFinalizar);
	}

	public void clicarLimparFiltroStatus() {
		clicar(botaoLimparFiltroStatus);
	}

	public void clicarNegar() {
		clicar(botaoNegar);
	}

	public void clicarPesquisar() {
		clicar(botaoPesquisar);
	}
	
	public void clicarRemoverAprovador(String aprovador) {
		String xpath = "//div[@class = 'v-data-table__wrapper']//tr[td[contains(text(), '" + aprovador.toUpperCase() + "')]]/td[3]/button[1]";
		obterElementoXpathDinamico(xpath).click();
	}

	public void clicarVisualizarSolicitacao() {
		clicar(botaoVisualizarSolicitacao);
	}

	public boolean existeBotaoAdicionarAprovador() {
		return botaoAtribuirAtendimento.isPresent();
	}

	public boolean existeBotaoAtribuirAtendimento() {
		return botaoAdicionarAprovador.isPresent();
	}

	public boolean existeBotaoAlterarStatusSolicitacao() {
		return botaoAlterarStatusSolicitacao.isPresent();
	}

	public boolean existeBotaoFinalizar() {
		return botaoFinalizar.isPresent();
	}

	public boolean existeBotaoNegar() {
		return botaoNegar.isPresent();
	}
	
	public String pegarAprovadoresAdicionados() {
		return obterTexto(tableAprovadores);
	}

	public String pegarAlertaAprovadorRepetido() {
		return obterTexto(textoAlertaCampoAprovador);
	}
	
	public String pegarIdSolicitacaoDetalhamento() {
		return obterTextoInput(campoIdSolicitacaoDetalhamento);
	}

	public String pegarComentarioDetalhamentoInformacoesAtendimento() {
		return obterTexto(textoComentarioDetalhamentoInformacoesAtendimento);
	}

	public String pegarMensagemTipoAprovadorDiferente() {
		return obterTexto(textoMensaagemTipoAprovadorDiferente);
	}
	
	public String pegarNomeAtendenteDetalhamentoInformacoesAtendimento() {
		return obterTexto(textoAtendenteDetalhamentoInformacoesAtendimento);
	}

	public boolean pegarStatusBotaoConfirmar() {
		return obterStatusElemento(botaoConfirmar);
	}

	public String pegarStatusDetalhamentoInformacoesAtendimento() {
		return obterTexto(textoStatusDetalhamentoInformacoesAtendimento);
	}

	public void preencherComentario(String comentario) {
		escrever(campoComentario, comentario);
	}

	public void preencherIdSolicitacaoFiltro(String idSolicitacao) {
		escrever(campoIdSolicitacaoFiltro, idSolicitacao);
	}

	public void preencherMotivorecusa(String motivoRecusa) {
		escrever(campoMotivoRecusa, motivoRecusa);
	}

	public void selecionarAprovador(String aprovador) {
		selecionarLista(campoAprovador, aprovador);		
	}

	public void selecionarStatusFiltro(String status) {
		selecionarLista(campoStatusFiltro, status);
	}

	public void selecionarTipoAprovador(String tipoAprovador) {
		limpar(campoTipoAprovador);
		selecionarLista(campoTipoAprovador, tipoAprovador);
	}
}
