package net.thucydides.showcase.cucumber.pages;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.WebElementFacade;

public class CadastrarEditarManutencaoFilaPage extends BasePage {

	String xpathListaCampoForcavenda = "//div[@class = 'v-card__text py-2']//div[label[text() = 'Força de Venda']]/input[@type = 'text']";
	String xpathListaBotaoRemoverForcaVenda = "//div[@class = 'ma-2 v-card v-sheet theme--light']/div/button[span/i[text() = 'clear']]";
	
	@FindBy(xpath = "//button[span[contains(text(), 'Adicionar Força de Venda')]]")
	WebElementFacade botaoAdicionarForcaVenda;

	@FindBy(xpath = "//button[span[contains(text(), 'Salvar')]]")
	WebElementFacade botaoSalvar;

	@FindBy(xpath = "//input[@id = 'FILA_ATENDIMENTO_CADASTRO']")
	WebElementFacade campoFilaAtendimento;
	
	@FindBy(xpath = "//div[@class = 'v-input__control'][div//input[@id ='FILA_ATENDIMENTO_CADASTRO']]//div[@class = 'v-messages__message']")
	WebElementFacade textoCampoObrigatorioFilaAtendimento;
	
	@FindBy(xpath = "//div[@class = 'v-input__control'][div//label[text() = 'Força de Venda']]//div[@class = 'v-messages__message']")
	WebElementFacade textoCampoObrigatorioForcavenda;
	
	public void clicarAdicionarForcaVenda() {
		clicar(botaoAdicionarForcaVenda);
	}
	
	public void clicarRemoverForcavenda() {
		//remove a última Força de Venda adicionado
		int tamanhoLista = buscarListaElementosGenerica(xpathListaBotaoRemoverForcaVenda).size() - 1;
		clicar(buscarListaElementosGenerica(xpathListaBotaoRemoverForcaVenda).get(tamanhoLista));
	}
	
	public void clicarSalvar() {
		clicar(botaoSalvar);
	}
	
	public String pegarTextoCampoObrigatorioFilaAtendimento() {
		return obterTexto(textoCampoObrigatorioFilaAtendimento);
	}
	
	public String pegarTextoCampoObrigatorioForcavenda() {
		return obterTexto(botaoAdicionarForcaVenda);
	}
	
	public void preencherFilaAtendimento(String filaAtendimento) {
		escrever(campoFilaAtendimento, filaAtendimento);
	}
	
	public void selecionarForcaVenda(String forcaVenda) {
		//insere no último campo de Força de Venda adicionado
		int tamanhoLista = buscarListaElementosGenerica(xpathListaCampoForcavenda).size() - 1;
		selecionarLista(buscarListaElementosGenerica(xpathListaCampoForcavenda).get(tamanhoLista), forcaVenda);
	}
}
