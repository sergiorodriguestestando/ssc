package net.thucydides.showcase.cucumber.pages;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.WebElementFacade;

public class AprovarSolicitacoesPage extends BasePage{
	
	@FindBy(xpath = "//button[span[contains(text(), 'Aprovar')]][ @class='v-btn v-btn--contained theme--dark v-size--small green']")
	WebElementFacade  botaoAprovar;

	@FindBy(xpath = "//button[@id='BTN_CANCELAR']")
	WebElementFacade botaoCancelar;
	
	@FindBy(xpath = "//button[@id='BTN_CONFIRMAR']")
	WebElementFacade botaoConfirmar;
	
	@FindBy(xpath = "//button[@class = 'v-btn v-btn--flat v-btn--text theme--dark v-size--default green--text']")
	WebElementFacade botaoConfirmarDialog;

	@FindBy(xpath = "//div[div[text() = 'Solicitação de Serviço Comercial']]/button")
	WebElementFacade botaoFecharSolicitacao;

	@FindBy(xpath = "//button[span[contains(text(), 'Limpar')]]")
	WebElementFacade botaoFiltroLimpar;

	@FindBy(xpath = "//button[span[contains(text(), 'Pesquisar')]]")
	WebElementFacade botaoFiltroPesquisar;

	@FindBy(xpath = "//button[span[contains(text(), 'Negar')]][ @class='v-btn v-btn--contained theme--dark v-size--small red']")
	WebElementFacade  botaoNegar;

	@FindBy(xpath = "//tbody/tr[1]//button[@class = 'v-icon notranslate mr-2 v-icon--link material-icons theme--light']")
	WebElementFacade botaoVisualizarSolicitacao; //pega o primeiro

	@FindBy(xpath = "//div[label[text() = 'Comentário']]/textarea[1]")
	WebElementFacade  campoComentario;

	@FindBy(xpath = "//div[label[text() = 'Aprovador']]/input[1]")
	WebElementFacade campoFiltroAprovador;

	@FindBy(xpath = "//input[@id='CNPJ_PESQUISA']")
	WebElementFacade campoFiltroCNPJ;

	@FindBy(xpath = "//input[@id='CPF_PESQUISA']")
	WebElementFacade campoFiltroCPF;

	@FindBy(xpath = "//input[@id='ID_SOLICITACAO_PESQUISA']")
	WebElementFacade campoFiltroIdSolicitacao;

	@FindBy(xpath = "//input[@id='RAZAO_SOCIAL_NOME_PESQUISA']")
	WebElementFacade campoFiltroRazaoSocialNome;

	@FindBy(xpath = "//input[@id='STATUS_PESQUISA']")
	WebElementFacade campoFiltroStatus;

	@FindBy(xpath = "//input[@id='TIPO_SERVICO_PESQUISA']")
	WebElementFacade campoFiltroTipoServico;

	@FindBy(xpath = "//div[label[text() = 'Motivo da Recusa']]/textarea[1]")
	WebElementFacade  campoMotivoRecusa;
	
	@FindBy(xpath = "//div[@class='v-list v-select-list v-sheet theme--light v-list--dense theme--light']/div[1]")
	WebElementFacade itemResultadoLista;

	@FindBy(xpath = "//div[contains(text(), 'Solicitação Aprovada!')]")
	WebElementFacade textoMensagemSolicitacaoAprovada;

	@FindBy(xpath = "//div[contains(text(), 'Solicitação Cancelada!')]")
	WebElementFacade textoMensagemSolicitacaoReprovada;

	@FindBy(xpath = "//input[@id='ID_CADASTRO']")
	WebElementFacade textoIdSolicitacaoDetalhamento;

	@FindBy(xpath = "//form//div[label[text() = 'Status']]/input[1]")
	WebElementFacade textoStatusDetalhamento;

	public void clicarAprovar() {
		clicar(botaoAprovar);
	}
	
	public void clicarConfirmar() {
		clicar(botaoConfirmar);
	}
	
	public void clicarConfirmarDialog() {
		clicar(botaoConfirmarDialog);
	}

	public void clicarFecharSolicitacao() {
		clicar(botaoFecharSolicitacao);
	}

	public void clicarLimpar() {
		clicar(botaoFiltroLimpar);
	}
	
	public void clicarNegar() {
		clicar(botaoNegar);		
	}
	
	public void clicarPesquisar() {
		clicar(botaoFiltroPesquisar);
	}

	public void clicarVisualizarSolicitacao() {
		clicar(botaoVisualizarSolicitacao);
	}

	public boolean existeBotaoAprovar() {
		return botaoAprovar.isPresent();
	}

	public boolean existeBotaoNegar() {
		return botaoNegar.isPresent();
	}
	
	public String pegarIdSolicitacaoDetalhamento() {
		return obterTextoInput(textoIdSolicitacaoDetalhamento);
	}
	
	public String pegarStatusDetalhamento() {
		return obterTextoInput(textoStatusDetalhamento);
	}

	public void preencherCNPJ(String cnpj){
		escrever(campoFiltroCNPJ,  cnpj);
	}

	public void preencherComentario(String comentario) {
		escrever(campoComentario, comentario);
	}
	
	public void preencherCPF(String cpf){
		escrever(campoFiltroCPF,  cpf);
	}

	public void preencherIdSolicitacao(String idSolicitacao){
		escrever(campoFiltroIdSolicitacao,  idSolicitacao);
	}
	
	public void preencherMotivoRecusa(String motivoRecusa) {
		escrever(campoMotivoRecusa,  motivoRecusa);
	}

	public void preencherRazaoSocialNome(String razaoSocialNome){
		escrever(campoFiltroRazaoSocialNome,  razaoSocialNome);
	}

	public void selecionarStatus(String status) {
		selecionarLista(campoFiltroStatus, status);
	}

	public void selecionarTipoServico(String tipoServico) {
		selecionarLista(campoFiltroTipoServico, tipoServico);
	}
}
