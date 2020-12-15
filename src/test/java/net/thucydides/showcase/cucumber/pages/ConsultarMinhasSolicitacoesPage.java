package net.thucydides.showcase.cucumber.pages;

import org.junit.Assert;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.WebElementFacade;

public class ConsultarMinhasSolicitacoesPage extends BasePage{
		
	@FindBy(xpath = "//div[@class = 'text-right col-md-4 col-12']")
	WebElementFacade barraFinal;
	
	@FindBy(xpath = "//div[@class = 'row d-none d-sm-flex d-xs-flex']//button[@id = 'BNT_CANCELAR_SOLICITACAO']")
	WebElementFacade botaoCancelarSolicitacao;
	
	@FindBy(xpath = "//button[@class = 'v-btn v-btn--flat v-btn--text theme--dark v-size--default green--text']")
	WebElementFacade botaoConfirmar;

	@FindBy(xpath = "//div[div[text() = 'Solicitação de Serviço Comercial']]/button")
	WebElementFacade botaoFecharSolicitacao;
	
	@FindBy(xpath = "//button[span[contains(text(), 'Pesquisar')]]")
	WebElementFacade botaoFiltroPesquisar;

	@FindBy(xpath = "//button[span[contains(text(), 'Limpar')]]")
	WebElementFacade botaoFiltroLimpar;

	@FindBy(xpath = "//tbody/tr[1]//button[@class = 'v-icon notranslate mr-2 v-icon--link material-icons theme--light']")
	WebElementFacade botaoVisualizarSolicitacao; //pega o primeiro
	
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
	
	@FindBy(xpath = "//span[@class = 'v-list-item__mask']")
	WebElementFacade itemResultadoLista;
	
	@FindBy(xpath = "//input[@id='STATUS_PESQUISA']")
	WebElementFacade campoFiltroStatus;
	
	@FindBy(xpath = "//input[@id='TIPO_SERVICO_PESQUISA']")
	WebElementFacade campoFiltroTipoServico;
	
	@FindBy(xpath = "//div[contains(text(), 'Solicitação Cancelada!')]")
	WebElementFacade textoMensagemSolicitacaoCancelada;
	
	@FindBy(xpath = "//input[@id='ID_CADASTRO']")
	WebElementFacade textoIdSolicitacaoDetalhamento;
	
	@FindBy(xpath = "//form//div[label[text() = 'Status']]/input[1]")
	WebElementFacade textoStatusDetalhamento;
	
	public void clicarCancelarSolcitacao() {
		moverParaElemento(barraFinal);
		clicar(botaoCancelarSolicitacao);
	}
	
	public void clicarConfirmar() {
		clicar(botaoConfirmar);
	}
	
	public void clicarFecharSolicitacao() {
		clicar(botaoFecharSolicitacao);
	}
	
	public void clicarPesquisar() {
		clicar(botaoFiltroPesquisar);
		esperarTempo();
	}
	
	public void clicarLimpar() {
		clicar(botaoFiltroLimpar);
	}
	
	public void clicarVisualizarSolicitacao() {
		clicar(botaoVisualizarSolicitacao);
	}
	
	public boolean existeBotaoCancelarSolicitacao() {
		moverParaElemento(barraFinal);
		return botaoCancelarSolicitacao.isPresent();
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
	
	public void preencherCPF(String cpf){
		escrever(campoFiltroCPF,  cpf);
	}
	
	public void preencherIdSolicitacao(String idSolicitacao){
		escrever(campoFiltroIdSolicitacao,  idSolicitacao);
	}
	
	public void preencherRazaoSocialNome(String razaoSocialNome){
		escrever(campoFiltroRazaoSocialNome,  razaoSocialNome);
	}
	
	public void selecionarAprovador(String aprovador) {
		selecionarLista(campoFiltroAprovador, aprovador);
	}
	
	public void selecionarStatus(String status) {
		selecionarLista(campoFiltroStatus, status);
	}
	
	public void selecionarTipoServico(String tipoServico) {
		selecionarLista(campoFiltroTipoServico, tipoServico);
	}
	
	public void ValidarCamposVazios() {
		String id = obterTexto(campoFiltroIdSolicitacao) ;
		Assert.assertEquals("", id);
		
		String cnpj = obterTexto(campoFiltroCNPJ) ;
		Assert.assertEquals("", cnpj);
				
		String cpf = obterTexto(campoFiltroCNPJ) ;
		Assert.assertEquals("", cpf);
		
		String aprovador = obterTexto(campoFiltroAprovador) ;
		Assert.assertEquals("", aprovador);
		
		String razaoSocial = obterTexto(campoFiltroRazaoSocialNome) ;
		Assert.assertEquals("", razaoSocial);
		
		String status = obterTexto(campoFiltroStatus) ;
		Assert.assertEquals("", status);
		
		String tpServico = obterTexto(campoFiltroTipoServico) ;
		Assert.assertEquals("", tpServico);
		
		
		
	}
	
	
}
