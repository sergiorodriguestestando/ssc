package net.thucydides.showcase.cucumber.steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import net.thucydides.showcase.cucumber.pages.CadastrarEditarManutencaoFilaPage;
import net.thucydides.showcase.cucumber.pages.HomePage;
import net.thucydides.showcase.cucumber.pages.LoginPage;
import net.thucydides.showcase.cucumber.pages.ManutencaoFilaPage;

public class ManutencaoFilaSteps {

	HomePage home;
	LoginPage login;
	ManutencaoFilaPage fila;
	CadastrarEditarManutencaoFilaPage cadastrar;

	String vFilaAtendimento;
	String[] vForcaVenda;

	@Quando("^adiciona Forca de Venda '(.*)'$")
	public void adiciona_Forca_de_Venda(String forcaVenda) {
		vForcaVenda = forcaVenda.split(",");

		for (int i = 0; i < vForcaVenda.length; i++) {
			cadastrar.clicarAdicionarForcaVenda();
			cadastrar.selecionarForcaVenda(vForcaVenda[i]);
		}
	}

	@Quando("^clica em Confirmar no Dialog$")
	public void clica_em_Confirmar_no_Dialog() {
		cadastrar.confirmarDialog();
	}

	@Quando("^clica em EditarManutencao$")
	public void clica_em_Editar() {
		fila.clicarEditar();
	}

	@Quando("^clica em Inativar$")
	public void clica_em_Inativar() {
		fila.clicarInativar();
	}

	@Quando("^clica em Nova Fila de Atendimento$")
	public void clica_em_Nova_Fila_de_Atendimento() {
		fila.clicarNovaFilaAtendimento();
	}

	@Quando("^clica em PesquisarManutencao$")
	public void clica_em_Pesquisar() {
		fila.clicarPesquisar();
	}

	@Quando("^clica Remover Forca de Venda$")
	public void clica_Remover_Forca_de_Venda() {
		cadastrar.clicarRemoverForcavenda();
	}

	@Quando("^clica em SalvarManutencao$")
	public void clica_em_Salvar() {
		cadastrar.clicarSalvar();
	}

	@Quando("^clica em Visualizar Fila de Atendimento$")
	public void clica_em_Visualizar_Fila_de_Atendimento() {
		fila.clicarVisualizarFila();
	}

	@Quando("^preenche Fila de Atendimento '(.*)'$")
	public void preenche_Fila_de_Atendimento_Teste(String filaAtendimento) {
		cadastrar.preencherFilaAtendimento(filaAtendimento);
		vFilaAtendimento = filaAtendimento;
	}

	@Quando("^preenche Filtro Fila de Atendimento '(.*)'$")
	public void preenche_Filtro_Fila_de_Atendimento(String filaAtendimento) {
		fila.preencherFiltroFilaAtendimento(filaAtendimento);
		vFilaAtendimento = filaAtendimento;
		System.out.println("NA PESQUISA " + vFilaAtendimento);
	}

//	@Dado("^realiza login")
//	public void realiza_login() {
//		login.fazerLogin();
//	}

	@Quando("^seleciona Forca de Venda '(.*)'$")
	public void seleciona_Forca_de_Venda(String forcaVenda) {
		cadastrar.selecionarForcaVenda(forcaVenda);	
	}

	@Dado("^seleciona menu Manutencao de Fila$")
	public void seleciona_menu_Manutencao_de_Fila() {
		home.clicarMenuManutencaoFila();
	}

	@Quando("^sistema exibe alerta de campos obrigatorios$")
	public void sistema_exibe_alerta_de_campos_obrigatorios() {
		String esperado = "Campo Obrigatório!";
		cadastrar.validarTexto(esperado, cadastrar.pegarTextoCampoObrigatorioFilaAtendimento());
	}

	@Então("^valida fila de atendimento$")
	public void valida_fila_de_atendimento() {
		fila.preencherFiltroFilaAtendimento(vFilaAtendimento);
		fila.clicarPesquisar();
		fila.clicarVisualizarFila();
		String[] l = fila.pegarForcaVendaDetalhes();

		for (int i = 0; i < l.length; i++) {
			fila.validarTexto(l[i], vForcaVenda[i]);
		}
		fila.clicarFecharDetalhes();
	}

	@Então("^valida fila de atendimento como inativo$")
	public void valida_fila_de_atendimento_como_inativo() {
		fila.esperarpopUpDetalhesFilaAtendimentoNaoEstarVisivel();
		fila.esperarTempo();
		System.out.println("NA VALIDACAO " + vFilaAtendimento);
		fila.preencherFiltroFilaAtendimento(vFilaAtendimento);
		fila.clicarPesquisar();
		String situacaoEsperada = "Inativo";
		String situacaoAtual = fila.pegarSituacao();
		fila.clicarVisualizarFila();
		
		fila.validarTexto(situacaoEsperada, situacaoAtual);
		fila.validarFalso(fila.existeBotaoEditar());
		fila.validarFalso(fila.existeBotaoInativar());

		fila.clicarFecharDetalhes();
	}
}
