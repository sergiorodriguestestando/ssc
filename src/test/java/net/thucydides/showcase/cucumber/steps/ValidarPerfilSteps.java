package net.thucydides.showcase.cucumber.steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import net.thucydides.showcase.cucumber.pages.HomePage;
import net.thucydides.showcase.cucumber.pages.LoginPage;

public class ValidarPerfilSteps {
	
	LoginPage login;
	HomePage home;
	

	@Dado("^realiza login '(.*)' '(.*)' '(.*)'")
	public void realiza_login(String nome, String usuario, String senha) {
		if(!home.existeNomeUsuario()) {
			login.fazerLogin();
		}
		else if(!home.pegarNomeUsuario().equalsIgnoreCase(nome.trim())) {
			home.clicarBotaoLogout();
			home.esperarTempo();
			login.fazerLogin();
		}
	}

	@Quando("^acessa o link '(.*)'$")
	public void acessa_o_link(String link) {
		home.mudarUrl(link);
	}

	@Então("^sistema redireciona para a home$")
	public void sistema_redireciona_para_a_home() {
		String urlEsperada = "https://ssc-devdigital.mdb.com.br/home";
		String urlAtual = home.obterUrlAtual();
		
		if(urlAtual.equals("https://ssc-devdigital.mdb.com.br/")) {
			urlEsperada = "https://ssc-devdigital.mdb.com.br/";
		}
		
		home.validarTexto(urlEsperada, urlAtual);
	}


}
