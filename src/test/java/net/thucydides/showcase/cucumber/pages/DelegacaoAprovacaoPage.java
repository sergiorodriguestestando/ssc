package net.thucydides.showcase.cucumber.pages;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.WebElementFacade;

public class DelegacaoAprovacaoPage extends BasePage {


	String xpathIdDelegacaoLista = "//tbody/tr[td//button[@class = 'v-icon notranslate mr-2 v-icon--link material-icons theme--light']]/td[1]";
	
	@FindBy(xpath = "//button[span[text() = 'Editar']]")
	WebElementFacade botaoEditar;
	
	@FindBy(xpath = "//button[span[text() = 'Excluir']]")
	WebElementFacade botaoExcluir;
	
	@FindBy(xpath = "//div[div[text() = 'Detalhes da Delegação de Aprovação']]/button[1]")
	WebElementFacade botaoFecharDetalhes;
	
	@FindBy(xpath = "//button[span[contains(text(), 'Nova Delegação')]]")
	WebElementFacade botaoNovaDelegacao;
	
	@FindBy(xpath = "//button[span[contains(text(),'Pesquisar')]]")
	WebElementFacade botaoPesquisar;

	@FindBy(xpath = "//tbody/tr[1]//button[@class = 'v-icon notranslate mr-2 v-icon--link material-icons theme--light']")
	WebElementFacade botaoVisualizarSolicitacao; //pega o primeiro

	@FindBy(xpath = "//input[@id = 'DATA_FIM_VISUALIZAR']")
	WebElementFacade campoDataFimDetalhes;
	
	@FindBy(xpath = "//div[label[text() = 'Data Fim']]/input")
	WebElementFacade campoDataFimFiltro;
	
	@FindBy(xpath = "//input[@id = 'DATA_INICIO_VISUALIZAR']")
	WebElementFacade campoDataInicioDetalhes;

	@FindBy(xpath = "//div[label[text() = 'Data Início']]/input")
	WebElementFacade campoDataInicioFiltro;
	
	@FindBy(xpath = "//input[@id ='USUARIO_BUSCAR']")
	WebElementFacade campoDelegadoAFiltro;
	
	@FindBy(xpath = "//input[@id = 'USUARIO_VISUALIZAR']")
	WebElementFacade campoDelegadoADetalhes;
	
	@FindBy(xpath = "//input[@id = 'NOME_REGRA_VISUALIZAR']")
	WebElementFacade campoNomeRegraDetalhes;
	
	@FindBy(xpath = "//tbody/tr[td//button[@class = 'v-icon notranslate mr-2 v-icon--link material-icons theme--light']][1]/td[1]")
	WebElementFacade textoIdDelegacao; //pega o primeiro
	
	public void clicarEditar() {
		clicar(botaoEditar);
	}
	
	public void clicarExcluir() {
		clicar(botaoExcluir);
	}

	public void clicarDataFimFiltro() {
		clicar(campoDataFimFiltro);
	}
	
	public void clicarDataInicioFiltro() {
		clicar(campoDataInicioFiltro);
	}
	
	public void clicarFecharDetalhes() {
		clicar(botaoFecharDetalhes);
	}
	
	public void clicarNovaDelegacao() {
		clicar(botaoNovaDelegacao);
	}
	
	public void clicarPesquisar() {
		clicar(botaoPesquisar);
	}
	
	public void clicarVisualizarDelegacao() {
		clicar(botaoVisualizarSolicitacao);
	}
	
	public boolean existeDelegacao(String idDelegacao) {
		return existeElementoLista(xpathIdDelegacaoLista, idDelegacao);
	}
	
	public boolean existeBotaoExcluir() {
		return botaoExcluir.isVisible();
	}
	
	public String pegarDataFimDetalhes() {
		return obterTextoInput(campoDataFimDetalhes);
	}

	public String pegarDataInicioDetalhes() {
		return obterTextoInput(campoDataInicioDetalhes);
	}

	public String pegarDelegadoADetalhes() {
		return obterTextoInput(campoDelegadoADetalhes);
	}

	public String pegarIdDelegacao() {
		return obterTexto(textoIdDelegacao);
	}
	
	public String pegarNomeRegraDetalhes() {
		return obterTextoInput(campoNomeRegraDetalhes);
	}

	public void selecionarDelegadoAFiltro(String delegadoA) {
	selecionarLista(campoDelegadoAFiltro, delegadoA);
	}
}
