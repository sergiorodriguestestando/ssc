package net.thucydides.showcase.cucumber.pages;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.WebElementFacade;

public class CriarEditarDelegacaoAprovacaoPage extends BasePage {


	@FindBy(xpath = "//button[@id = 'BNT_SALVAR']")
	WebElementFacade botaoSalvar;
	
	@FindBy(xpath = "//input[@id = 'DATA_FIM_CADASTRO']")
	WebElementFacade campoDataFim;

	@FindBy(xpath = "//input[@id = 'DATA_INICIO_CADASTRO']")
	WebElementFacade campoDataInicio;
	
	@FindBy(xpath = "//input[@id = 'USUARIO_CADASTRO']")
	WebElementFacade campoDelegadoA;
	
	@FindBy(xpath = "//input[@id = 'NOME_REGRA_CADASTRO']")
	WebElementFacade campoNomeRegra;
	
	@FindBy(xpath = "//div[div/div/input[@id = 'DATA_INICIO_CADASTRO']]//div[@class = 'v-messages__message']")
	WebElementFacade textoCampoObrigatorioDataInicio;
	
	@FindBy(xpath = "//div[div/div/input[@id = 'USUARIO_CADASTRO']]//div[@class = 'v-messages__message']")
	WebElementFacade  textoCampoObrigatorioDelegadoA;
	
	@FindBy(xpath = "//div[div/div/input[@id = 'NOME_REGRA_CADASTRO']]//div[@class = 'v-messages__message']")
	WebElementFacade  textoCampoObrigatorioNomeRegra;
	
	@FindBy(xpath = "//div[@class = 'v-alert__content']")
	WebElementFacade  textoMensagemErro;
	
	public void clicarSalvar() {
		clicar(botaoSalvar);
	}
	
	public void clicarDataFim() {
		clicar(campoDataFim);
	}
	
	public void clicarDataInicio() {
		clicar(campoDataInicio);
	}
	
	public void preencherNomeRegra(String nomeRegra) {
		escrever(campoNomeRegra, nomeRegra);
	}
	
	public void selecionarDelegadoA(String delegadoA) {
		selecionarLista(campoDelegadoA, delegadoA);
	}
	
	public String pegarTextoCampoObrigatorioDataInicio() {
		return obterTexto(textoCampoObrigatorioDataInicio);
	}
	
	public String pegarTextoCampoObrigatorioDelegadoA() {
		return obterTexto(textoCampoObrigatorioDelegadoA);
	}
	
	public String pegarTextoCampoObrigatorioNomeRegra() {
		return obterTexto(textoCampoObrigatorioNomeRegra);
	}
	
	public String pegarMensagemErro() {
		return obterTexto(textoMensagemErro);
	}
}
