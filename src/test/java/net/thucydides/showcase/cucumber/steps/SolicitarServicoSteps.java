package net.thucydides.showcase.cucumber.steps;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;


import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import net.thucydides.showcase.cucumber.pages.DatePickPage;
import net.thucydides.showcase.cucumber.pages.HomePage;
import net.thucydides.showcase.cucumber.pages.LoginPage;
import net.thucydides.showcase.cucumber.pages.SolicitarServicoComercialPage;

public class SolicitarServicoSteps {

	LoginPage login;
	HomePage home;
	DatePickPage data;
	SolicitarServicoComercialPage solicitacao;
	String vAnexo;

	@Dado("^realiza login")
	public void realiza_login() {
		login.fazerLogin();
	}
	
	@Então("^sair do sistema$")
	public void sair_do_sistema() {
     home.clicarMenuSolicitacaoServicosComerciaisManutencao();
	 login.clicarSairSistema();
	}


	// -------------------------------- ADICIONA
	// --------------------------------------------
	@Quando("^adiciona Aprovador '(.*)'$")
	public void adiciona_Aprovador(String aprovador) {
		solicitacao.selecionarAprovador(aprovador);
		solicitacao.clicarAdicionarAprovador();
	}

	// -------------------------------- CLICA
	// --------------------------------------------
	@Quando("^clica no botao Salvar$")
	public void clica_no__Salvar() {
		solicitacao.clicarSalvar();
	}

	@Quando("^clica no botao Confirmar Dialog$")
	public void clica_no_botao_Confirmar_Dialog() {
		solicitacao.esperarTempo(2000);
		solicitacao.clicarConfirmar();
	}

	@Quando("^clica no botao Adicionar Novo$")
	public void clica_no_botao_Adicionar_Novo() {
		solicitacao.clicarAdicionarNovo();
	}

	// -------------------------------- PREENCHE
	// --------------------------------------------

	@Quando("^preenche Bairro '(.*)'$")
	public void preenche_Bairro(String bairro) {
		solicitacao.preencherBairro(bairro);
	}

	@Quando("^preenche CEP '(.*)'$")
	public void preenche_CEP(String cep) {
		solicitacao.preencherCEP(cep);
	}

	@Quando("^preenche Cidade '(.*)'$")
	public void preenche_Cidade(String cidade) {
		solicitacao.preencherCidade(cidade);
	}

	@Quando("^preenche CNPJ '(.*)'$")
	public void preenche_CNPJ(String cnpj) {
		solicitacao.preencherCnpjCpf(cnpj);
	}

	@Quando("^preenche CPNJ ou CPF '(.*)'$")
	public void preenche_CPNJ_ou_CPF(String cnpjCPF) {

		//preenche_CNPJ(cnpjCPF);
		solicitacao.preencherCnpjCpf(cnpjCPF);
	}

	@Quando("^preenche CPFSolicitar '(.*)'$")
	public void preenche_CPF(String cpf) {
		solicitacao.preencherCpf(cpf);
	}

	@Quando("^preenche Codigo do Cliente '(.*)'$")
	public void preenche_Codigo_do_Cliente(String codigoCliente) {
	
		solicitacao.preencheCodigoCliente(codigoCliente);
	}

	@Quando("^preenche Codigo do Item '(.*)'$")
	public void preenche_Codigo_do_Item(String codigoItem) {
		solicitacao.preencheCodigoItem(codigoItem);
	}

	@Quando("^preenche Codigo do Representante '(.*)'$")
	public void preenche_Codigo_do_Representante(String codigoRepresentante) {
		solicitacao.preencherCodigoRepresentante(codigoRepresentante);
	}

	@Quando("^preenche Condicao de Pagamento '(.*)'$")
	public void preenche_Condicao_de_Pagamento(String condicaoPagamento) {
		solicitacao.preencherCondicaoPagamento(condicaoPagamento);
	}

	@Quando("^preenche Descricao da Alteracao do Cadastro '(.*)'$")
	public void preenche_Descricao_da_Alteracao_do_Cadastro(String descricaoAltCadastro) {
		solicitacao.preencherDescricaoAltCadastrao(descricaoAltCadastro);
	}

	@Quando("^preenche Descricao da Solicitacao '(.*)'$")
	public void preenche_Descricao_da_Solicitacao(String descricaoSolicitacao) {
		solicitacao.preencherDescricaoSolicitacao(descricaoSolicitacao);
	}

	@Quando("^preenche Descricao da Solucao '(.*)'$")
	public void preenche_Descricao_da_Solucao(String descricaoSolucao) {
		solicitacao.preencheDescricaoSolucao(descricaoSolucao);
	}

	@Quando("^preenche Endereco '(.*)'$")
	public void preenche_Endereco(String endereco) {
		solicitacao.preencherEndereco(endereco);
	}

	@Quando("^preenche Email '(.*)'$")
	public void preenche_Email(String email) {
		solicitacao.preencherEmail(email);
	}

	@Quando("^preenche Estado '(.*)'$")
	public void preenche_Estado(String estado) {
		solicitacao.preencherEstado(estado);
	}

	@Quando("^preenche Faturamento Medio Mensal '(.*)'$")
	public void preenche_Faturamento_Medio_Mensal(String faturamentoMedioMensal) {
		solicitacao.preencherFaturamentoMedioMensal(faturamentoMedioMensal);
	}

	@Quando("^preenche Inscricao Estadual '(.*)'$")
	public void preenche_Inscricao_Estadual(String inscricaoEstadual) {
		solicitacao.preencherInscricaoEstadual(inscricaoEstadual);
	}

	@Dado("^preenche Inscricao Estadual teste \"([^\"]*)\"$")
	public void preenche_Inscricao_Estadual_teste(String inscricaoEstadual) {
		solicitacao.preencherInscricaoEstadual(inscricaoEstadual);
	}

	@Quando("^preenche Justificativa '(.*)'$")
	public void preenche_Justificativa(String justificativa) {
		solicitacao.preencherJustificativa(justificativa);
	}

	@Quando("^preenche Lista de Preco '(.*)'$")
	public void preenche_Lista_de_Preco(String listaPreco) {
		solicitacao.preencherListaPreco(listaPreco);
	}

	@Quando("^preenche Nome do Contato '(.*)'$")
	public void preenche_Nome_do_Contato(String nomeContato) {
		solicitacao.preencherNomeContato(nomeContato);
	}

	@Quando("^preenche Nome '(.*)'$")
	public void preenche_Nome(String nome) {
		solicitacao.preencherNome(nome);
	}

	@Quando("^preenche Nome ou Razao Social '(.*)'$")
	public void preenche_Nome_ou_Razao_Social(String nomeOuRazaoSocial) {
		//solicitacao.esperarTempo();
		try {
			preenche_Nome(nomeOuRazaoSocial);
		} catch (Exception e) {
			preenche_Razao_Social(nomeOuRazaoSocial);
		}
	}

	@Quando("^preenche Numero '(.*)'$")
	public void preenche_Numero(String numero) {
		solicitacao.preencherNumero(numero);
	}

	@Quando("^preenche Numero da Ordem da Compra '(.*)'$")
	public void preenche_Numero_da_Ordem_da_Compra(String numeroOrdemCompra) {
		solicitacao.preencherNumeroOrdemCompra(numeroOrdemCompra);
	}

	@Quando("^preenche Numero do Pedido '(.*)'$")
	public void preenche_Numero_do_Pedido(String numeroPedido) {
		solicitacao.preencherNumeroPedido(numeroPedido);
	}

	@Quando("^preenche Numero do Titulo '(.*)'$")
	public void preenche_Numero_do_Titulo(String numeroTitulo) {
		solicitacao.preencherNumeroTitulo(numeroTitulo);
	}

	@Quando("^preenche Operacao Fiscal '(.*)'$")
	public void preenche_Operacao_Fiscal(String operacaoFiscal) {
		solicitacao.preencheOperacaoFiscal(operacaoFiscal);
	}

	@Quando("^preenche Pais '(.*)'$")
	public void preenche_Pais(String pais) {
		solicitacao.preencherPais(pais);
	}

	@Quando("^preenche Preco Liquido Unitario '(.*)'$")
	public void preenche_Preco_Liquido_Unitario_R$(String precoLiquidoUnitario) {
		solicitacao.preencherPrecoLiquidoUnitario(precoLiquidoUnitario);
	}

	@Quando("^preenche Razao Social '(.*)'$")
	public void preenche_Razao_Social(String razaoSocial) {
		solicitacao.preencherRazaoSocial(razaoSocial);
	}

	@Quando("^preenche Sugestao Limite Credito '(.*)'$")
	public void preenche_Sugestao_Limite_Credito(String sugestaoLimiteCredito) {
		solicitacao.preencherSugestaoLimiteCredito(sugestaoLimiteCredito);
	}

	@Quando("^preenche Qtd Itens '(.*)'$")
	public void preenche_Qtd_Itens(String qtdItens) {
		solicitacao.preencherQtdItens(qtdItens);
	}

	@Quando("^preenche Telefone de Contato '(.*)'$")
	public void preenche_Telefone_de_Contato(String telefoneContato) {
		solicitacao.preencherTelefoneContato(telefoneContato);
	}

	@Quando("^preenche Valor do Abatimento '(.*)'$")
	public void preenche_Valor_do_Abatimento(String valorAbatimento) {
		solicitacao.preencherValorAbatimento(valorAbatimento);
	}

	@Quando("^preenche Valor Total do Pedido '(.*)'$")
	public void preenche_Valor_Total_do_Pedido(String valorTotalPedido) {
		solicitacao.preencherValorTotalPedido(valorTotalPedido);
	}

	@Quando("^preenche Vencimento Prorrogado '(.*)'$")
	public void preenche_Vencimento_Prorrogado(String vencimentoProrrogado) {
		if (!vencimentoProrrogado.isEmpty()) {
			solicitacao.clicarVencimentoProrrogado();
			data.selecionarData(vencimentoProrrogado);
		}
	}

	// -------------------------------- SELECIONA
	// --------------------------------------------
	@Quando("^seleciona anexo '(.*)'$")
	public void seleciona_anexo(String nomeArquivo) {
		vAnexo = nomeArquivo.trim();
		solicitacao.selecionarAnexo(nomeArquivo);
		// String texto = solicitacao.pegarMensagemErroAnexo();
		// System.out.println(texto);
		// Assert.assertTrue(texto.contains("Extensão não permitida."));
	}

	@Quando("^seleciona anexo dez vezes '(.*)'$")
	public void seleciona_anexo_dez_vezes(String nomeArquivo) {
		vAnexo = nomeArquivo.trim();
		for (int i = 0; i < 10; i++) {
			solicitacao.selecionarAnexo(nomeArquivo);
		}
	}

	@Quando("^seleciona Canal do Cliente '(.*)'$")
	public void seleciona_Canal_do_Cliente(String canalCliente) {
		solicitacao.selecionarCanalCliente(canalCliente);
	}

	@Dado("^seleciona menu Solicitação de Serviços Comerciais$")
	public void seleciona_menu_Solicitação_de_Serviços_Comerciais() {
		home.clicarMenuSolicitacaoServicosComerciaisManutencao();
	}

	@Quando("^seleciona Motivo de Cancelamento '(.*)'$")
	public void seleciona_Motivo_de_Cancelamento(String motivoCancelamento) {
		solicitacao.selecionarMotivoCancelamento(motivoCancelamento);
	}

	@Quando("^seleciona Tipo '(.*)'$")
	public void seleciona_Tipo(String tipo) {
		solicitacao.selecionarTipo(tipo);
	}

	@Quando("^seleciona Tipo de Abatimento '(.*)'$")
	public void seleciona_Tipo_de_Abatimento(String tipoAbatimento) {
		solicitacao.selecionarTipoAbatimento(tipoAbatimento);
	}

	@Quando("^seleciona Tipo de Cadastro '(.*)'$")
	public void seleciona_Tipo_de_Cadastro(String tipoCadastro) {
		solicitacao.selecionarTipoCadastro(tipoCadastro);
	}

	@Quando("^seleciona Tipo de Pessoa '(.*)'$")
	public void seleciona_Tipo_de_Pessoa(String tipoPessoa) {
		solicitacao.selecionarTipoPessoa(tipoPessoa);
		solicitacao.moverParaInicioPagina();
	}

	@Quando("^seleciona Tipo de Prorrogacao '(.*)'$")
	public void seleciona_Tipo_de_Prorrogacao(String tipoProrrogacao) {
		solicitacao.selecionarTipoProrrogacao(tipoProrrogacao);
	}

	@Quando("^seleciona Tipo de Regra '(.*)'$")
	public void seleciona_Tipo_de_Regra(String tipoRegra) {
		solicitacao.selecionarTipoRegra(tipoRegra);
	}

	@Dado("^seleciona Tipo de Servico '(.*)'$")
	public void seleciona_Tipo_de_Servico_Abatimentos_de_Títulos(String tipoServico) {
		solicitacao.selecionarTipoServico(tipoServico);
	}

	@Quando("^seleciona Unidade de Faturamento '(.*)'$")
	public void seleciona_Unidade_de_Faturamento(String unidade) {
		solicitacao.selecionarUnidadeFaturamento(unidade);
	}

	@Quando("^seleciona Vigencia '(.*)'$")
	public void seleciona_Vigencia(String vigencia) {
		if (!vigencia.isEmpty()) {
			solicitacao.clicarVigencia();
			data.selecionarData(vigencia);
		}
	}

	// -------------------------------- VALIDAÇAO
	// --------------------------------------------

	@Entao("^exibe mensagem de sucesso$")
	public void exibe_mensagem_de_sucesso() {
		String esperado = "Salvo com Sucesso!";
		solicitacao.esperarMensagemEstarVisivel();
		solicitacao.validarTexto(esperado, solicitacao.pegarValorMensagemSalvoComSucesso());
	}

	@Quando("^preenche automaticamente Bairro '(.*)'$")
	public void preenche_automaticamente_Bairro(String bairro) {
		solicitacao.validarTexto(bairro, solicitacao.pegarBairro());
	}

	@Quando("^preenche automaticamente Cidade '(.*)'$")
	public void preenche_automaticamente_Cidade(String cidade) {
		solicitacao.validarTexto(cidade, solicitacao.pegarCidade());
	}

	@Quando("^preenche automaticamente CEP '(.*)'$")
	public void preenche_automaticamente_CEP(String cep) {
		String cepEsperado = cep.replaceAll("-", "");
		String cepAtual = solicitacao.pegarCep().replaceAll("-", "");
		solicitacao.validarTexto(cepEsperado, cepAtual);
	}

	@Quando("^preenche automaticamente Descricao do Item '(.*)'$")
	public void preenche_automaticamente_Descricao_do_Item(String descricaoItem) {
		solicitacao.esperarTempo();
		solicitacao.validarTexto(descricaoItem, solicitacao.pegarDescricaoItem());
	}

	@Quando("^preenche automaticamente Email '(.*)'$")
	public void preenche_automaticamente_Email(String email) {
		solicitacao.validarTexto(email, solicitacao.pegarEmail());
	}

	@Quando("^preenche automaticamente Estado '(.*)'$")
	public void preenche_automaticamente_Estado(String estado) {
		solicitacao.validarTexto(estado, solicitacao.pegarEstado());
	}

	@Quando("^preenche automaticamente Endereco '(.*)'$")
	public void preenche_automaticamente_Endereco(String endereco) {
		solicitacao.validarTexto(endereco, solicitacao.pegarEndereco());
	}

	@Quando("^preenche automaticamente Inscricao Estadual '(.*)'$")
	public void preenche_automaticamente_Inscricao_Estadual(String inscricaoEstadual) {
		if (!inscricaoEstadual.isEmpty()) {
			solicitacao.validarTexto(inscricaoEstadual, solicitacao.pegarInscricaoEstadual());
		}
	}

	@Quando("^preenche automaticamente Nome '(.*)'$")
	public void preenche_automaticamente_Nome(String nome) {
		solicitacao.esperarTempo();
		solicitacao.validarTexto(nome, solicitacao.pegarNome());
	}

	@Quando("^preenche automaticamente Numero '(.*)'$")
	public void preenche_automaticamente_Numero(String numero) {
		solicitacao.validarTexto(numero, solicitacao.pegarNumero());
	}

	@Quando("^preenche automaticamente Razao Social '(.*)'$")
	public void preenche_automaticamente_Razao_Social(String razaoSocial) {
		solicitacao.esperarTempo();
		solicitacao.validarTexto(razaoSocial, solicitacao.pegarRazaoSocial());
	}

	@Quando("^preenche automaticamente Nome ou Razao Social '(.*)'$")
	public void preenche_automaticamente_Nome_ou_Razao_Social(String nomeRazaoSocial) {
		if (!nomeRazaoSocial.isEmpty()) {
			try {
				preenche_automaticamente_Nome(nomeRazaoSocial);
			} catch (Exception e) {
				preenche_automaticamente_Razao_Social(nomeRazaoSocial);
			}
		}
	}

	@Então("^sistema emite mensagem de extensao nao permitida$")
	public void sistema_emite_mensagem_de_extensao_nao_permitida() {
		// solicitacao.validarVerdadeiro(solicitacao.existeMensagemExtensaoNaoPermitida());
		String texto = solicitacao.pegarMensagemErroAnexo();
		System.out.println(texto);
		Assert.assertTrue(texto.contains("Extensão não permitida."));
	}

	@Então("^sistema emite mensagem de limite de anexos$")
	public void sistema_emite_mensagem_de_limite_de_anexos() {
		solicitacao.validarVerdadeiro(solicitacao.existeMensagemLimiteAnexos());

	}

	@Então("^sistema exibe alerta de campos obrigatorios '(.*)'$")
	public void sistema_exibe_alerta_de_campos_obrigatorios(String tipoServico) {
		String esperadoGeral = "Campo Obrigatório!";
		String esperadoAprovador = "Adicione pelo menos um aprovador";
		String esperadoValor = "Informe um valor maior que 0";

		solicitacao.moverParaInicioPagina();
		switch (tipoServico) {
		case "Abatimento de Títulos":
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioUnidadeFaturamento());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioCpnj());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioRazaoSocial());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioJustificativa());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioTipoAbatimento());
			solicitacao.validarTexto(esperadoAprovador, solicitacao.pegarMensagemCampoObrigatorioAprovador());
			break;

		case "Alterações de Limite de crédito":
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioCpnj());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioRazaoSocial());
			solicitacao.validarTexto(esperadoValor, solicitacao.pegarMensagemCampoObrigatorioSugestaoLimiteCredito());
			solicitacao.validarTexto(esperadoValor, solicitacao.pegarMensagemCampoObrigatorioFaturamentoMedioMensal());
			solicitacao.validarTexto(esperadoAprovador, solicitacao.pegarMensagemCampoObrigatorioAprovador());
			break;
		case "Análise de Multas":
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioDescricao());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioTelefone());
			break;
		case "Cadastro de Cliente para Exportação":
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioRazaoSocial());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioCanalCliente());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioEndereco());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioBairro());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioCidade());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioEstado());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioPais());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioEmail());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioTelefone());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioNomeContato());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioListaPreco());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioCodigoRepresentante());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioUnidadeFaturamento());
			break;
		case "Cadastro de Clientes para Doação":
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioTipoPessoa());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioCodigoRepresentante());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioCep());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioEndereco());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioNumero());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioBairro());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioCidade());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioEstado());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioTelefone());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioEmail());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioNomeContato());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioUnidadeFaturamento());
			break;
		case "Cadastro de Clientes(Trade, Trade Execução e Marketing)":
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioTipoPessoa());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioCodigoRepresentante());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioCep());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioEndereco());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioNumero());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioBairro());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioCidade());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioEstado());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioTelefone());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioEmail());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioNomeContato());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioUnidadeFaturamento());
			break;
		case "Cadastro de Colaborador como Cliente":
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioUnidadeFaturamento());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioCpf());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioNome());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioTelefone());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioEmail());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioCep());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioEndereco());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioNumero());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioBairro());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioCidade());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioEstado());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioNomeContato());
			break;
		case "Cadastro de Fornecedor como Cliente":
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioUnidadeFaturamento());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioTipoPessoa());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioTelefone());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioEmail());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioCep());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioEndereco());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioNumero());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioBairro());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioCidade());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioEstado());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioNomeContato());
			break;
		case "Cancelamento de itens":
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioDescricao());
			break;
		case "Dúvidas, Sugestões ou Reclamações":
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioTipo());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioDescricao());
			break;
		case "Geração de relatórios":
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioDescricao());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioTelefone());
			break;
		case "Tratativa de pedidos (Uso exclusivo pela Gestão de Pedidos)":
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioCpnj());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioRazaoSocial());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioDescricao());
			break;
		case "Manutenção de Cadastro de Clientes":
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioUnidadeFaturamento());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioTipoPessoa());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioTipoCadastro());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioDescricao());
			break;
		case "Parametrização de agendamento":
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioTipo());
			solicitacao.validarTexto(esperadoAprovador, solicitacao.pegarMensagemCampoObrigatorioAprovador());
			break;
		case "Parametrização de pedido mínimo":
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioUnidadeFaturamento());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioCanalCliente());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioJustificativa());
			solicitacao.validarTexto(esperadoAprovador, solicitacao.pegarMensagemCampoObrigatorioAprovador());
			break;
		case "Pedidos de amostras":
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioUnidadeFaturamento());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioCodigoRepresentante());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioCpnj());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioRazaoSocial());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioOperacaoFiscal());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioCondicaoPagamento());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioListaPreco());
			solicitacao.validarTexto(esperadoValor, solicitacao.pegarMensagemCampoObrigatorioValorTotalPedido());
			solicitacao.validarTexto(esperadoAprovador, solicitacao.pegarMensagemCampoObrigatorioAprovador());
			break;
		case "Prorrogação de Títulos":
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioUnidadeFaturamento());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioCpnj());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioRazaoSocial());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioTipoProrrogacao());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioJustificativa());
			solicitacao.validarTexto(esperadoAprovador, solicitacao.pegarMensagemCampoObrigatorioAprovador());
			break;
		case "Recolocação de pedidos":
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioUnidadeFaturamento());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioCpnj());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioRazaoSocial());
			solicitacao.validarTexto(esperadoGeral, solicitacao.pegarMensagemCampoObrigatorioJustificativa());
			solicitacao.validarTexto(esperadoAprovador, solicitacao.pegarMensagemCampoObrigatorioAprovador());
			break;

		}
	}

	@Então("^sistema nao adiciona o anexo$")
	public void sistema_nao_adiciona_o_anexo() {
		solicitacao.moverParaFimPagina();
		if (solicitacao.existeArquivosAnexados()) {
			solicitacao.validarNaoTextoContem(vAnexo, solicitacao.pegarListaItensAnexados());
		} else {
			solicitacao.validarFalso(solicitacao.existeArquivosAnexados());
		}
	}

	@Quando("^sistema valida relacao pessoa x cadastro '(.*)' '(.*)'$")
	public void sistema_valida_relacao_pessoa_x_cadastro(String tipoPessoa, String tipoCadastro) {

		if (tipoPessoa.equalsIgnoreCase("Pessoa Física")) {
			solicitacao.validarVerdadeiro(solicitacao.existeCpf());
			solicitacao.validarVerdadeiro(solicitacao.existeNome());
			solicitacao.validarFalso(solicitacao.existeCnpj());
			solicitacao.validarFalso(solicitacao.existeRazaoSocial());
			solicitacao.validarFalso(solicitacao.existeCodigoCliente());
		} else if (tipoPessoa.equalsIgnoreCase("Pessoa Jurídica")
				& tipoCadastro.equalsIgnoreCase("Cliente Colaborador")) {
			solicitacao.validarFalso(solicitacao.existeCpf());
			solicitacao.validarFalso(solicitacao.existeNome());
			solicitacao.validarFalso(solicitacao.existeCnpj());
			solicitacao.validarFalso(solicitacao.existeRazaoSocial());
			solicitacao.validarFalso(solicitacao.existeCodigoCliente());
		} else if (tipoPessoa.equalsIgnoreCase("Pessoa Jurídica")
				& tipoCadastro.equalsIgnoreCase("Cliente Exportação")) {
			solicitacao.validarFalso(solicitacao.existeCpf());
			solicitacao.validarFalso(solicitacao.existeNome());
			solicitacao.validarFalso(solicitacao.existeCnpj());
			solicitacao.validarVerdadeiro(solicitacao.existeRazaoSocial());
			solicitacao.validarVerdadeiro(solicitacao.existeCodigoCliente());
		} else if (tipoPessoa.equalsIgnoreCase("Pessoa Jurídica")) {
			solicitacao.validarFalso(solicitacao.existeCpf());
			solicitacao.validarFalso(solicitacao.existeNome());
			solicitacao.validarVerdadeiro(solicitacao.existeCnpj());
			solicitacao.validarVerdadeiro(solicitacao.existeRazaoSocial());
			solicitacao.validarFalso(solicitacao.existeCodigoCliente());
		}
	}

	@Quando("^sistema valida relacao Tipo de Regra x Vigencia '(.*)'$")
	public void sistema_valida_relacao_Tipo_de_Regra_x_Vigencia(String tipoRegra) {
		if (tipoRegra.equalsIgnoreCase("Temporária")) {
			solicitacao.validarVerdadeiro(solicitacao.existeVigencia());
		}
	}
}
