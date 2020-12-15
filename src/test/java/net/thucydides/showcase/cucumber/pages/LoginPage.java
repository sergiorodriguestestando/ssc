package net.thucydides.showcase.cucumber.pages;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends BasePage {
	String login = "ter01277";
	String senha = "261219Br";

	@FindBy(id = "LOGIN")
	WebElementFacade campoLogin;

	@FindBy(id = "SENHA")
	WebElementFacade campoSenha;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElementFacade botaoLogin;
	
	@FindBy(xpath = "//i[text()='logout']")
	WebElementFacade botaoSair;
	
	public void clicarEfeturaLogin() {
		//clicar(botaoLogin);
		clicarManutencao(botaoLogin);
	}
	
	public void clicarSairSistema() {
		
		clicarManutencao(botaoSair);
	}


	public void preencherLogin(String login) {
		//escrever(campoLogin, login);		
		escreverManutencao(campoLogin, login);
	}
	
	public void preencherSenha(String senha) {
		//escrever(campoSenha, senha);	
		escreverManutencao(campoSenha, senha);
	}
	
	public boolean existeLogin() {
		return campoLogin.isVisible();
	}
		
	public void fazerLogin() {
		acessar();
		preencherLogin(login);
		preencherSenha(senha);
		clicarEfeturaLogin();
	}

}
