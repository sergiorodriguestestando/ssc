package net.thucydides.showcase.cucumber.pages;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.math3.exception.util.ExceptionContext;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class BasePage extends PageObject {
	long medio = 1000;

	private final String url = "https://ssc-devdigital.mdb.com.br/";
	public WebElementFacade webElement;

	@FindBy(xpath = "//div[@class = 'v-dialog v-dialog--active v-dialog--persistent']//button[2]")
	WebElementFacade confirmarDialog;

	@FindBy(xpath = "//div[div[text() = 'Concluir Solicitação?']]//button[1]")
	WebElementFacade cancelarDialog;

	@FindBy(xpath = "//div[@class='v-list v-select-list v-sheet theme--light v-list--dense theme--light']/div[1]")
	WebElementFacade itemResultadoLista;

	@FindBy(xpath = "//div[@class = 'v-dialog v-dialog--active v-dialog--persistent']//p[@class = 'word-break']")
	WebElementFacade textoDialog;

	@FindBy(xpath = "//div[@class = 'v-snack__wrapper v-sheet theme--dark warning']")
	WebElementFacade textoMensagemErroAnexo;

	// ---------- Elementos comuns

	public void cancelarDialog() {
		clicar(cancelarDialog);
	}

	public void confirmarDialog() {
		clicar(confirmarDialog);
	}

	public String obterTextoDialog() {
		return obterTexto(textoDialog);
	}

	// ---------- Metodos Auxiliares

	public void acessar() {
;
		getDriver().manage().window().maximize();
		getDriver().get(url);
	}

	public void mudarUrl(String link) {
		getDriver().get(link);
	}

	public WebElementFacade elementoEstaNaPagina(WebElementFacade webElementFacade) {
		try {

			Thread.sleep(medio);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return webElementFacade.waitUntilVisible();

	}

	public void clicar(WebElementFacade webElementFacade) {
	
		try {
			moverParaElemento(webElementFacade);
			webElementFacade.click();
		} catch (Exception e) {
			moverParaElemento(webElementFacade);
			moverUmSextoDaPagina();
			evaluateJavascript("arguments[0].click();", webElementFacade);
		}
	}
	//

	public void clicarManutencao(WebElementFacade webElementFacade) {
		esperarElementoEstarPreparado(webElementFacade);
		webElementFacade.click();

	}

	public void clicarListaElemento(String xpathLista, String texto) {
		for (int i = 0; i < buscarListaElementosGenerica(xpathLista).size(); i++) {
			WebElementFacade a = buscarListaElementosGenerica(xpathLista).get(i);
			if (obterTexto(a).equals(texto.trim())) {
				clicar(a);
				break;
			}
		}
		esperarTempo();
	}

	public void clicarMenu(WebElementFacade menu, WebElementFacade exapandirMenu) {
		if (!exapandirMenu.isDisplayed() && !exapandirMenu.isEnabled()) {
			acessar();
		}
		try {
			clicar(menu);
		} catch (Exception e) {
			clicar(exapandirMenu);
			clicar(menu);
		}
	}

	public void escrever(WebElementFacade webElementFacade, String texto) {
		webElementFacade.waitUntilVisible();
		webElementFacade.hasFocus();
		 clicar(webElementFacade);
		 webElementFacade.clear();
		webElementFacade.sendKeys(texto);

	}
	
	
	
	public Boolean verificarResultado(WebElementFacade webElementFacade) {
		//webElementFacade.waitUntilVisible();

		try {
			webElementFacade.getText();
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}
	
	
	public String verificarResultadoNome(WebElementFacade cpf,WebElementFacade cnpj)  {
	
		if(!cpf.isVisible() && !cnpj.isVisible() ) {
			return "null";
		}else {
			try {
				cpf.getText();
				return "CPF";
			} catch (Exception e) {
				cnpj.getText();
				return "CNPJ";
			}
			
			
		}
      
		
	}
	
	
	
	
	

	public void escreverManutencao(WebElementFacade webElementFacade, String texto) {
		webElementFacade.waitUntilVisible();
		webElementFacade.sendKeys(texto);

	}

	public void escreverCompassado(WebElementFacade webElementFacade, String texto) {
		if (!texto.trim().isEmpty()) {
			clicar(webElementFacade);
			webElementFacade.clear();
			for (int i = 0; i < texto.length(); i++) {
				String letra = String.valueOf(texto.charAt(i));
				webElementFacade.sendKeys(letra);
			}
		}
	}

	public void esperarElementoEstarVisivel(WebElementFacade webElementFacade) {

	//	withTimeoutOf(Duration.ofSeconds(30)).find(webElementFacade.getText()).click();

	}
	


	public void esperarElementoNaoEstarVisivel(WebElementFacade webElementFacade) {
		webElementFacade.waitUntilNotVisible();
	}

	public void esperarElementoEstarPreparado(WebElementFacade webElementFacade) {
		webElementFacade.waitUntilPresent();
		webElementFacade.waitUntilEnabled();
		webElementFacade.waitUntilClickable();
	}

	public void esperarTempo() {
		waitABit(1000);
	}

	public void esperarTempo(int tempoEmMilisegundos) {
		waitABit(tempoEmMilisegundos);
	}

	public boolean existeElementoLista(String xpathLista, String texto) {
		boolean existe = false;
		for (int i = 0; i < buscarListaElementosGenerica(xpathLista).size(); i++) {
			WebElementFacade a = buscarListaElementosGenerica(xpathLista).get(i);
			if (obterTexto(a).equals(texto.trim())) {
				existe = true;
				break;
			}
		}
		return existe;
	}

	public void moverParaFimPagina() {
		evaluateJavascript("window.scrollTo(0,document.body.scrollHeight);");
		esperarTempo();
	}

	public void limpar(WebElementFacade webElementFacade) {
		webElementFacade.waitUntilVisible();
		webElementFacade.clear();
	}

	public List<WebElementFacade> buscarListaElementosGenerica(String xpath) {
		List<WebElementFacade> elementos = findAll(xpath);
		return elementos;
	}

	public void moverParaElemento(WebElementFacade webElementFacade) {
		evaluateJavascript("arguments[0].scrollIntoView(true);", webElementFacade);
	}

	public void moverParaInicioPagina() {
		evaluateJavascript("window.scrollTo(0, 0);");
		esperarTempo();
	}

	public void moverUmSextoDaPagina() {
		evaluateJavascript("window.scrollBy(0, window.screen.width/6);");
	}

	public void moverUmQuintoDaPagina() {
		evaluateJavascript("window.scrollBy(0, window.screen.width/5);");
	}

	public void pressionarEnter(WebElementFacade webElementFacade) {
		webElementFacade.waitUntilPresent();
		webElementFacade.sendKeys(Keys.ENTER);

	}

	public void pressionarSetaParaBaixo(WebElementFacade webElementFacade) {
		webElementFacade.waitUntilPresent();
		webElementFacade.sendKeys(Keys.ARROW_DOWN);
	}

	public String obterDataAtual() {
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		return formatter.format(date);
	}

	public WebElement obterElementoXpathDinamico(String xpath) {
		WebElement webElement = getDriver().findElement(By.xpath(xpath));
		return webElement;
	}

	public boolean obterStatusElemento(WebElementFacade webElementFacade) {
		// retorna true se o elemento estiver desabilitado
		return Boolean.valueOf(webElementFacade.getAttribute("disabled"));
	}

	public String obterTexto(WebElementFacade webElementFacade) {
	
		try {
			return webElementFacade.getText().trim();
		} catch (Exception e) {
			// moverAteAcharElemento(webElementFacade);
			moverParaElemento(webElementFacade);
			return webElementFacade.getText().trim();
		}
	}

	public String obterTextoInput(WebElementFacade webElementFacade) {
		esperarElementoEstarVisivel(webElementFacade);
		return webElementFacade.getValue().trim();
	}

	public String obterTextoInputReadOny(WebElementFacade webElementFacade) {
		esperarElementoEstarVisivel(webElementFacade);
		return webElementFacade.getValue().trim();
	}

	public String[] obterTextoInputLista(String xpathLista) {
		List<String> lista = new ArrayList<String>();
		for (int i = 0; i < buscarListaElementosGenerica(xpathLista).size(); i++) {
			lista.add(obterTextoInput(buscarListaElementosGenerica(xpathLista).get(i)));
		}
		String[] l = (String[]) lista.toArray(new String[0]);
		return l;
	}

	public String obterUrlAtual() {
		return getDriver().getCurrentUrl();
	}

	public void selecionarLista(WebElementFacade webElementFacade, String texto) {
		esperarElementoEstarPreparado(webElementFacade);
		if (!texto.trim().isEmpty()) {
			esperarTempo();
			escrever(webElementFacade, texto);
			esperarTempo();
			pressionarSetaParaBaixo(webElementFacade);
			pressionarEnter(webElementFacade);
		}
	}

	public void uploadArquivo(WebElementFacade campoUpload, String nomeArquivo) {
		/*
		 * é preciso remover a classe "v-file-input" da composição da calsse do elemento
		 * de upload para que o serenity consiga manipular o elemento e realizar o
		 * upload após o upload do arquivo o proprio framework atualiza o componente e
		 * ele volta ao estado anterior
		 */
		// evaluateJavascript("document.getElementsByClassName('v-input v-input--dense
		// theme--light v-text-field v-text-field--is-booted
		// v-file-input')[0].setAttribute('class', 'v-input v-input--dense theme--light
		// v-text-field v-text-field--is-booted');");
		// esperarTempo();
		String filename = "src\\test\\resources\\Anexos\\" + nomeArquivo;
		upload(filename).to(campoUpload);
		esperarTempo(1000);
	}

	public void validarFalso(Boolean condicaoFalsa) {
		Assert.assertFalse(condicaoFalsa);
	}

	public void validarVerdadeiro(Boolean condicaoVerdadeira) {
		Assert.assertTrue(condicaoVerdadeira);
	}

	public void validarTexto(String esperado, String atual) {
		if (!esperado.isEmpty()) {
			esperarTempo();
		}
		Assert.assertEquals(esperado.toUpperCase().trim(), atual.toUpperCase().trim());
	}

	public void validarTextoContem(String textoEsperado, String textoAtual) {
		if (!textoEsperado.isEmpty()) {
			esperarTempo();
		}
		validarVerdadeiro(textoAtual.toUpperCase().contains(textoEsperado.toUpperCase().trim()));
	}

	public void validarNaoTextoContem(String textoEsperado, String textoAtual) {
		if (!textoEsperado.isEmpty()) {
			esperarTempo();
		}
		validarFalso(textoAtual.toUpperCase().contains(textoEsperado.toUpperCase().trim()));
	}
}