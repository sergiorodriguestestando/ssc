package net.thucydides.showcase.cucumber.pages;

import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class HomePage extends BasePage {

	@FindBy(xpath = "//button[@class = 'v-btn v-btn--flat v-btn--icon v-btn--round theme--dark v-size--default']")
	WebElementFacade botaoLogout;

	@FindBy(xpath = "//div[text()= 'Aprovações']")
	WebElementFacade menuAprovacoes;

	@FindBy(xpath = "//div[text()= 'Delegação de aprovação']")
	WebElementFacade menuDelegacaoAprovacao;
	
	@FindBy(xpath = "//div[@class='v-toolbar__content']/button")
	WebElementFacade menuExpandir;
	
	@FindBy(xpath = "//div[text()= 'Fila de Atendimento']")
	WebElementFacade menuFilaAtendimento;
	
	@FindBy(xpath = "//div[text()= 'Início']")
	WebElementFacade menuInicio;

	@FindBy(xpath = "//div[text()= 'Manutenção da Fila']")
	WebElementFacade menuManutencaoFila;
	
	@FindBy(xpath = "//div[text()= 'Minhas Solicitações']")
	WebElementFacade menuMinhasSolicitacoes;

	@FindBy(xpath = "//div[text()= 'Solicitação de Serviços Comerciais']")
	WebElementFacade menuSolicitacaoServicosComerciais;
	
	@FindBy(xpath = "//div[@class = 'row']/div/p[@class = 'pa-0 ma-0']")
	WebElementFacade textoNomeUsuario;

	public void clicarBotaoLogout() {
		clicar(botaoLogout);
	}

	public void clicarExpandirMenu() {
		clicar(menuExpandir);
	}
	
	public void clicarMenuAproavacoes() {
		clicarMenu(menuAprovacoes, menuExpandir);
	}
	
	public void clicarMenuDelegacaoAprovacao() {
		clicarMenu(menuDelegacaoAprovacao, menuExpandir);
		
	}
	
	public void clicarMenuFilaAtendimento() {
		clicarMenu(menuFilaAtendimento, menuExpandir);
	}
	
	public void clicarMenuInicio() {
		menuInicio.click();
	}
	
	public void clicarMenuManutencaoFila() {
		clicarMenu(menuManutencaoFila, menuExpandir);
	}

	public void clicarMenuMinhasSolicitacoes() {
		clicarMenu(menuMinhasSolicitacoes, menuExpandir);
	}

//	public void clicarMenuSolicitacaoServicosComerciais() {
//		clicarMenu(menuSolicitacaoServicosComerciais, menuExpandir);
//	}
	//Sérgio Rodrigues*****
	public void clicarMenuSolicitacaoServicosComerciaisManutencao() {
		esperarTempo();
		mudarUrl("https://ssc-devdigital.mdb.com.br/solicitacoes-servicos-comerciais/cadastrar");
	}
	
	public void clicarMenuAprovarSolicitacoes() {
		
		esperarTempo();
		mudarUrl("https://ssc-devdigital.mdb.com.br/aprovacoes");
	}
	
	public void clicarMenuFilaAtendimentos() {
		
		esperarTempo();
		mudarUrl("https://ssc-devdigital.mdb.com.br/atender-solicitacao");
	}


	public String pegarNomeUsuario() {
		return obterTexto(textoNomeUsuario);
	}

	public boolean existeNomeUsuario() {
		return textoNomeUsuario.isVisible();
	}

}
