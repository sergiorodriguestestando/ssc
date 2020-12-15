package net.thucydides.showcase.cucumber.pages;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.WebElementFacade;

public class ManutencaoFilaPage extends BasePage {

	String xpathListaForcaVendaDetalhes = "//div[label[text() = 'Força de Venda']]/input";

	@FindBy(xpath = "//button[span[text() = 'Editar']]")
	WebElementFacade botaoEditar;

	@FindBy(xpath = "//div[div[text() = 'Detalhes da Fila de Atendimento']]/button[1]")
	WebElementFacade botaoFecharDetalhes;

	@FindBy(xpath = "//button[span[text() = 'Inativar']]")
	WebElementFacade botaoInativar;

	@FindBy(xpath = "//button[span[contains(text(), 'Nova Fila de Atendimento')]]")
	WebElementFacade botaoNovaFilaAtendimento;

	@FindBy(xpath = "//button[span[contains(text(), 'Pesquisar')]]")
	WebElementFacade botaoPesquisar;

	@FindBy(xpath = "//tbody/tr[1]//button[@class = 'v-icon notranslate mr-2 v-icon--link material-icons theme--light']")
	WebElementFacade botaoVisualizarFila; //pega o primeiro

	@FindBy(xpath = "//input[@id = 'FILA_ATENDIMENTO_PESQUISA']")
	WebElementFacade campoFiltroFilaAtendimento;

	@FindBy(xpath = "//div[@class = 'elevation-12 v-card v-sheet theme--light']")
	WebElementFacade popUpDetalhesFilaAtendimento;
	
	@FindBy(xpath = "//tbody/tr[1]/td[2]")
	WebElementFacade textoSituacao;

	public void clicarEditar() {
		clicar(botaoEditar);
	}

	public void clicarFecharDetalhes() {
		clicar(botaoFecharDetalhes);
	}

	public void clicarInativar() {
		clicar(botaoInativar);
	}

	public void clicarNovaFilaAtendimento() {
		clicar(botaoNovaFilaAtendimento);
	}

	public void clicarPesquisar() {
		clicar(botaoPesquisar);
	}

	public void clicarVisualizarFila() {
		clicar(botaoVisualizarFila);
	}

	public void esperarpopUpDetalhesFilaAtendimentoNaoEstarVisivel() {
		esperarElementoNaoEstarVisivel(popUpDetalhesFilaAtendimento);
	}
	
	public boolean existeBotaoEditar() {
		return botaoEditar.isVisible();
	}

	public boolean existeBotaoInativar() {
		return botaoInativar.isVisible();
	}

	public String[] pegarForcaVendaDetalhes() {
		return obterTextoInputLista(xpathListaForcaVendaDetalhes);
	}

	public String pegarSituacao() {
		return obterTexto(textoSituacao);
	}

	public void preencherFiltroFilaAtendimento(String filaAtendimento) {
		escrever(campoFiltroFilaAtendimento, filaAtendimento);
	}

	

}
