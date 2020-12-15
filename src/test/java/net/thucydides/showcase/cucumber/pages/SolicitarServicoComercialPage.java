package net.thucydides.showcase.cucumber.pages;

import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class SolicitarServicoComercialPage extends BasePage {

	@FindBy(xpath = "//button[span[contains(text(), 'Adicionar Aprovador')]]")
	WebElementFacade botaoAdicionarAprovador;

	@FindBy(xpath = "//button[span[contains(text(), 'Adicionar Novo')]]")
	WebElementFacade botaoAdicionarNovo;

	// @FindBy(xpath = "//button[@class = 'v-btn v-btn--flat v-btn--text theme--dark
	// v-size--default green--text']")
	@FindBy(xpath = "//I[text()='check' and @class='v-icon notranslate v-icon--left material-icons theme--dark']")
	WebElementFacade botaoConfirmar;

	@FindBy(xpath = "//input[@id='CODIGO_REPRESENTANTE_CADASTRO']")
	WebElementFacade campoCodigoRepresentante;

	@FindBy(xpath = "//button[@id = 'BNT_SALVAR']")
	WebElementFacade botaoSalvar;

	@FindBy(xpath = "//input[@id='arquivo_temporario']")
	WebElementFacade campoAnexarArquivos;

	@FindBy(xpath = "//div[label[text() = 'Aprovador']]/input[1]")
	WebElementFacade campoAprovador;

	@FindBy(xpath = "//input[@id='BAIRRO_CADASTRO']")
	WebElementFacade campoBairro;

	@FindBy(xpath = "//input[@id='CEP_CADASTRO']")
	WebElementFacade campoCEP;

	@FindBy(xpath = "//input[@id='CANAL_CLIENTE_CADASTRO']")
	WebElementFacade campoCanalCliente;

	@FindBy(xpath = "//input[@id='CIDADE_CADASTRO']")
	WebElementFacade campoCidade;

	@FindBy(xpath = "//div[label[text() = 'CNPJ']]/input[1]")
	WebElementFacade campoCNPJ;

	@FindBy(xpath = "//input[@id='CPF_CADASTRO']")
	WebElementFacade campoCPF;

	@FindBy(xpath = "//input[@id='CODIGO_CLIENTE']")
	WebElementFacade campoCodigoCliente;

	@FindBy(xpath = "//div[label[text() = 'Código do Item']]/input[1]")
	WebElementFacade campoCodigoItem;

	@FindBy(xpath = "//input[@id='CONDICAO_PAGAMENTO_CADASTRO']")
	WebElementFacade campoCondicaoPagamento;

	@FindBy(xpath = "//div[label[text() = 'Descrição da alteração do cadastro']]/textarea[1]")
	WebElementFacade campoDescricaoAltCadastro;

	@FindBy(xpath = "//div[label[text() = 'Descrição do Item']]/input[1]")
	WebElementFacade campoDescricaoItem;

	@FindBy(xpath = "//label[text()='Descrição da Solicitação']/..//textarea")
	WebElementFacade campoDescricaoSolicitacao;

	@FindBy(xpath = "//div[label[text() = 'Descrição da Solução']]/textarea[1]")
	WebElementFacade campoDescricaoSolucao;

	@FindBy(xpath = "//input[@id='EMAIL_CADASTRO']")
	WebElementFacade campoEmail;

	@FindBy(xpath = "//input[@id='ENDERECO_CADASTRO']")
	WebElementFacade campoEndereco;

	@FindBy(xpath = "//input[@id='ESTADO_CADASTRO']")
	WebElementFacade campoEstado;

	@FindBy(xpath = "//input[@id='FATURAMENTO_MEDIO_MENSAL_CADASTRO']")
	WebElementFacade campoFaturamentoMedioMensal;

	@FindBy(xpath = "//input[@id='INSCRICAO_ESTADUAL_CADASTRO']")
	WebElementFacade campoInscricaoEstadual;

	@FindBy(xpath = "//textarea[@id='JUSTIFICATIVA_CADASTRO']")
	WebElementFacade campoJustificativa;

	@FindBy(xpath = "//input[@id='LISTA_PRECOS_CADASTRO']")
	WebElementFacade campoListaPreco;

	@FindBy(xpath = "//input[@id='NOME_CADASTRO']")
	WebElementFacade campoNome;

	@FindBy(xpath = "//input[@id='MOTIVO_CANCELAMENTO_0_CADASTRO']")
	WebElementFacade campoMotivoCancelamento;

	@FindBy(xpath = "//input[@id='CONTATO_CADASTRO']")
	WebElementFacade campoNomeContato;

	@FindBy(xpath = "//input[@id='NUMERO_CADASTRO']")
	WebElementFacade campoNumero;

	@FindBy(xpath = "//input[@id='ORDEM_COMPRA_CADASTRO']")
	WebElementFacade campoNumeroOrdemCompra;

	@FindBy(xpath = "//input[@id='NUMERO_PEDIDO_0_CADASTRO']")
	WebElementFacade campoNumeroPedido;

	@FindBy(xpath = "//input[@id='NUMERO_TITULO_0_CADASTRO']")
	WebElementFacade campoNumeroTitulo;

	@FindBy(xpath = "//input[@id='OPERACAO_FISCAL_CADASTRO']")
	WebElementFacade campoOperacaoFiscal;

	@FindBy(xpath = "//input[@id='PAIS_CADASTRO']")
	WebElementFacade campoPais;

	@FindBy(xpath = "//input[@id='PRECO_LIQUIDO_0_CADASTRO']")
	WebElementFacade campoPrecoLiquidoUnitario;

	@FindBy(xpath = "//input[@id='QUANTIDADE_ITEM_0_CADASTRO']")
	WebElementFacade campoQtdItens;

	@FindBy(xpath = "//div[label[contains(text(), 'Razão Social')]]/input[1]")
	// @FindBy(id = "RAZAO_SOCIAL_CADASTRO")
	WebElementFacade campoRazaoSocial;

	@FindBy(xpath = "//input[@id='SUGESTAO_LIMITE_CREDITO_CADASTRO']")
	WebElementFacade campoSugestaoLimiteCredito;

	@FindBy(xpath = "//input[@id='TELEFONE_CADASTRO']")
	WebElementFacade campoTelefoneContato;

	@FindBy(xpath = "//input[@id='TIPO_ABATIMENTO_CADASTRO']")
	WebElementFacade campoTipoAbatimento;

	@FindBy(xpath = "//div[label[text() = 'Tipo']]/input[1]")
	WebElementFacade campoTipo;

	@FindBy(xpath = "//input[@id='TIPO_CADASTRO_CADASTRO']")
	WebElementFacade campoTipoCadastro;

	@FindBy(xpath = "//input[@id='TIPO_PESSOA_CADASTRO']")
	WebElementFacade campoTipoPessoa;

	@FindBy(xpath = "//input[@id='TIPO_REGRA_0_CADASTRO']")
	WebElementFacade campoTipoRegra;

	@FindBy(xpath = "//input[@id='TIPO_SERVICO_CADASTRO']")
	WebElementFacade campoTipoServico;

	@FindBy(xpath = "//div[label[contains(text(), 'Unidade de Faturamento')]]/input[1]")
	WebElementFacade campoUnidadeFaturamento;

	@FindBy(xpath = "//input[@id='VALOR_ABATIMENTO_0_CADASTRO']")
	WebElementFacade campoValorAbatimento;

	@FindBy(xpath = "//div[label[text() = 'Valor Total do Pedido']]/input[1]")
	WebElementFacade campoValorTotalPedido;

	@FindBy(xpath = "//input[@id='TIPO_PRORROGACAO_CADASTRO']")
	WebElementFacade campoTipoProrrogacao;

	@FindBy(xpath = "//input[@id='VIGENCIA_0_CADASTRO']")
	WebElementFacade campoVigencia;

	@FindBy(xpath = "//input[@id='VENCIMENTO_PRORROGADO_0_CADASTRO']")
	WebElementFacade campoVencimentoProrrogado;

	@FindBy(xpath = "//div[div[h4[text() = 'Arquivos Anexados']]]/div[2]//div[@class = 'v-list-item v-list-item--link theme--light']")
	WebElementFacade textoItensAnexados;

	@FindBy(xpath = "//div[contains(text(), 'Extensão não permitida.')]")
	WebElementFacade textoMensagemExtensaoNaoPermitida;

	@FindBy(xpath = "//div[contains(text(), 'Limite de 10 arquivos por solicitação.')]")
	WebElementFacade textoMensagemLimiteAnexos;

	@FindBy(xpath = "//div[contains(text(), 'Salvo com Sucesso!')]")
	WebElementFacade textoMensagemSalvoComSucesso;

	// =============== CAMPOS OBRIGATORIOS ==============

	@FindBy(xpath = "//div[div[div[label[contains(text(), 'Aprovador')]]]]//div[@class = 'v-messages__message']")
	WebElementFacade textoCampoObrigatorioAprovador;

	@FindBy(xpath = "//div[div[div[label[contains(text(), 'Bairro')]]]]//div[@class = 'v-messages__message']")
	WebElementFacade textoCampoObrigatorioBairro;

	@FindBy(xpath = "//div[div[div[label[contains(text(), 'Canal do Cliente')]]]]//div[@class = 'v-messages__message']")
	WebElementFacade textoCampoObrigatorioCanalCliente;

	@FindBy(xpath = "//div[div[div[label[contains(text(), 'CEP')]]]]//div[@class = 'v-messages__message']")
	WebElementFacade textoCampoObrigatorioCep;

	@FindBy(xpath = "//div[div[div[label[contains(text(), 'Cidade')]]]]//div[@class = 'v-messages__message']")
	WebElementFacade textoCampoObrigatorioCidade;

	@FindBy(xpath = "//div[div[div[label[contains(text(), 'CNPJ')]]]]//div[@class = 'v-messages__message']")
	WebElementFacade textoCampoObrigatorioCnpj;

	@FindBy(xpath = "//div[div[div[label[text() ='Código do Representante']]]]//div[@class = 'v-messages__message']")
	WebElementFacade textoCampoObrigatorioCodigoRepresentante;

	@FindBy(xpath = "//div[div[div[label[text() = 'Condição de pagamento']]]]//div[@class = 'v-messages__message']")
	WebElementFacade textoCampoObrigatorioCondicaoPagamento;

	@FindBy(xpath = "//div[div[div[label[contains(text(), 'CPF')]]]]//div[@class = 'v-messages__message']")
	WebElementFacade textoCampoObrigatorioCpf;

	@FindBy(xpath = "//div[div[div[label[contains(text(), 'Descrição')]]]]//div[@class = 'v-messages__message']")
	WebElementFacade textoCampoObrigatorioDescricao;

	@FindBy(xpath = "//div[div[div[label[contains(text(), 'Email')]]]]//div[@class = 'v-messages__message']")
	WebElementFacade textoCampoObrigatorioEmail;

	@FindBy(xpath = "//div[div[div[label[contains(text(), 'Endereço')]]]]//div[@class = 'v-messages__message']")
	WebElementFacade textoCampoObrigatorioEndereco;

	@FindBy(xpath = "//div[div[div[label[contains(text(), 'Estado')]]]]//div[@class = 'v-messages__message']")
	WebElementFacade textoCampoObrigatorioEstado;

	@FindBy(xpath = "//div[div[div[label[text() = 'Faturamento médio mensal']]]]//div[@class = 'v-messages__message message-transition-enter-to']")
	WebElementFacade textoCampoObrigatorioFaturamentoMedioMensal;

	@FindBy(xpath = "//div[div[div[label[contains(text(), 'Justificativa')]]]]//div[@class = 'v-messages__message']")
	WebElementFacade textoCampoObrigatorioJustificativa;

	@FindBy(xpath = "//div[div[div[label[contains(text(), 'Lista de Preço')]]]]//div[@class = 'v-messages__message']")
	WebElementFacade textoCampoObrigatorioListaPreco;

	@FindBy(xpath = "//div[div[div[label[text() = 'Nome']]]]//div[@class = 'v-messages__message']")
	WebElementFacade textoCampoObrigatorioNome;

	@FindBy(xpath = "//div[div[div[label[text() = 'Nome do Contato']]]]//div[@class = 'v-messages__message']")
	WebElementFacade textoCampoObrigatorioNomeContato;

	@FindBy(xpath = "//div[div[div[label[contains(text(), 'Número')]]]]//div[@class = 'v-messages__message']")
	WebElementFacade textoCampoObrigatorioNumero;

	@FindBy(xpath = "//div[div[div[label[text() = 'Operação Fiscal']]]]//div[@class = 'v-messages__message']")
	WebElementFacade textoCampoObrigatorioOperacaoFiscal;

	@FindBy(xpath = "//div[div[div[label[contains(text(), 'País')]]]]//div[@class = 'v-messages__message']")
	WebElementFacade textoCampoObrigatorioPais;

	@FindBy(xpath = "//div[div[div[label[contains(text(), 'Sugestão de limite de crédito')]]]]//div[@class = 'v-messages__message message-transition-enter-to']")
	WebElementFacade textoCampoObrigatorioSugestaoLimiteCredito;

	@FindBy(xpath = "//div[div[div[label[contains(text(), 'Razão Social')]]]]//div[@class = 'v-messages__message']")
	WebElementFacade textoCampoObrigatorioRazaoSocial;

	@FindBy(xpath = "//div[div[div[label[contains(text(), 'Telefone')]]]]//div[@class = 'v-messages__message']")
	WebElementFacade textoCampoObrigatorioTelefone;

	@FindBy(xpath = "//div[div[div[label[text() ='Tipo']]]]//div[@class = 'v-messages__message']")
	WebElementFacade textoCampoObrigatorioTipo;

	@FindBy(xpath = "//div[div[div[label[text() = 'Tipo de Abatimento']]]]//div[@class = 'v-messages__message']")
	WebElementFacade textoCampoObrigatorioTipoAbatimento;

	@FindBy(xpath = "//div[div[div[label[text() = 'Tipo de Cadastro']]]]//div[@class = 'v-messages__message']")
	WebElementFacade textoCampoObrigatorioTipoCadastro;

	@FindBy(xpath = "//div[div[div[label[text() = 'Tipo de Pessoa']]]]//div[@class = 'v-messages__message']")
	WebElementFacade textoCampoObrigatorioTipoPessoa;

	@FindBy(xpath = "//div[div[div[label[text() = 'Tipo de Prorrogação']]]]//div[@class = 'v-messages__message']")
	WebElementFacade textoCampoObrigatorioTipoProrrogacao;

	@FindBy(xpath = "//div[div[div[label[contains(text(), 'Unidade de Faturamento')]]]]//div[@class = 'v-messages__message']")
	WebElementFacade textoCampoObrigatorioUnidadeFaturamento;

	@FindBy(xpath = "//div[div[div[label[contains(text(), 'Valor Total do Pedido')]]]]//div[@class = 'v-messages__message message-transition-enter-to']")
	WebElementFacade textoCampoObrigatorioValorTotalPedido;

	// ================= CLICAR =========================

	public void clicarAdicionarAprovador() {
		clicar(botaoAdicionarAprovador);
	}

	public void clicarAdicionarNovo() {
		clicar(botaoAdicionarNovo);
		esperarTempo();
	}

	public void clicarConfirmar() {

		clicar(botaoConfirmar);
	}

	public void clicarSalvar() {
		moverParaFimPagina();
		clicar(botaoSalvar);
	}

	public void clicarVigencia() {
		clicar(campoVigencia);
	}

	public void clicarVencimentoProrrogado() {
		clicar(campoVencimentoProrrogado);
	}

	// ================= ESPERAR =========================

	public void esperarMensagemEstarVisivel() {
		esperarElementoEstarVisivel(textoMensagemSalvoComSucesso);
	}

	// ================= EXISTE =========================

	public boolean existeArquivosAnexados() {
		return textoItensAnexados.isVisible();
	}

	public boolean existeCnpj() {
		return campoCNPJ.isVisible();
	}

	public boolean existeCpf() {
		return campoCPF.isVisible();
	}

	public boolean existeCodigoCliente() {
		return campoCodigoCliente.isVisible();
	}

	public Boolean existeMensagemExtensaoNaoPermitida() {
		return textoMensagemExtensaoNaoPermitida.isVisible();
	}

	public Boolean existeMensagemLimiteAnexos() {
		return textoMensagemLimiteAnexos.isVisible();
	}

	public boolean existeNome() {
		return campoNome.isVisible();
	}

	public boolean existeRazaoSocial() {
		return campoRazaoSocial.isVisible();
	}

	public Boolean existeVigencia() {
		return campoVigencia.isVisible();
	}

	// ================= PEGAR =========================

	public String pegarBairro() {
		return obterTextoInput(campoBairro);
	}

	public String pegarMensagemErroAnexo() {
		return obterTexto(textoMensagemExtensaoNaoPermitida);
	}

	public String pegarCep() {
		return obterTextoInput(campoCEP);
	}

	public String pegarCidade() {
		return obterTextoInput(campoCidade);
	}

	public String pegarDescricaoItem() {
		return obterTextoInput(campoDescricaoItem);
	}

	public String pegarEmail() {
		return obterTextoInput(campoEmail);
	}

	public String pegarEndereco() {
		return obterTextoInput(campoEndereco);
	}

	public String pegarEstado() {
		return obterTextoInput(campoEstado);
	}

	public String pegarInscricaoEstadual() {
		return obterTextoInput(campoInscricaoEstadual);
	}

	public String pegarMensagemCampoObrigatorioAprovador() {
		return obterTexto(textoCampoObrigatorioAprovador);
	}

	public String pegarMensagemCampoObrigatorioBairro() {
		return obterTexto(textoCampoObrigatorioBairro);
	}

	public String pegarMensagemCampoObrigatorioCanalCliente() {
		return obterTexto(textoCampoObrigatorioCanalCliente);
	}

	public String pegarMensagemCampoObrigatorioCep() {
		return obterTexto(textoCampoObrigatorioCep);
	}

	public String pegarMensagemCampoObrigatorioCidade() {
		return obterTexto(textoCampoObrigatorioCidade);
	}

	public String pegarMensagemCampoObrigatorioCondicaoPagamento() {
		return obterTexto(textoCampoObrigatorioCondicaoPagamento);
	}

	public String pegarMensagemCampoObrigatorioCodigoRepresentante() {
		return obterTexto(textoCampoObrigatorioCodigoRepresentante);
	}

	public String pegarMensagemCampoObrigatorioCpf() {
		return obterTexto(textoCampoObrigatorioCpf);
	}

	public String pegarMensagemCampoObrigatorioCpnj() {
		return obterTexto(textoCampoObrigatorioCnpj);
	}

	public String pegarMensagemCampoObrigatorioDescricao() {
		return obterTexto(textoCampoObrigatorioDescricao);
	}

	public String pegarMensagemCampoObrigatorioEmail() {
		return obterTexto(textoCampoObrigatorioEmail);
	}

	public String pegarMensagemCampoObrigatorioEndereco() {
		return obterTexto(textoCampoObrigatorioEndereco);
	}

	public String pegarMensagemCampoObrigatorioEstado() {
		return obterTexto(textoCampoObrigatorioEstado);
	}

	public String pegarMensagemCampoObrigatorioFaturamentoMedioMensal() {
		return obterTexto(textoCampoObrigatorioFaturamentoMedioMensal);
	}

	public String pegarMensagemCampoObrigatorioJustificativa() {
		return obterTexto(textoCampoObrigatorioJustificativa);
	}

	public String pegarMensagemCampoObrigatorioListaPreco() {
		return obterTexto(textoCampoObrigatorioListaPreco);
	}

	public String pegarMensagemCampoObrigatorioNome() {
		return obterTexto(textoCampoObrigatorioNome);
	}

	public String pegarMensagemCampoObrigatorioNomeContato() {
		return obterTexto(textoCampoObrigatorioNomeContato);
	}

	public String pegarMensagemCampoObrigatorioNumero() {
		return obterTexto(textoCampoObrigatorioNumero);
	}

	public String pegarMensagemCampoObrigatorioOperacaoFiscal() {
		return obterTexto(textoCampoObrigatorioOperacaoFiscal);
	}

	public String pegarMensagemCampoObrigatorioPais() {
		return obterTexto(textoCampoObrigatorioPais);
	}

	public String pegarMensagemCampoObrigatorioSugestaoLimiteCredito() {
		return obterTexto(textoCampoObrigatorioSugestaoLimiteCredito);
	}

	public String pegarMensagemCampoObrigatorioRazaoSocial() {
		return obterTexto(textoCampoObrigatorioRazaoSocial);
	}

	public String pegarMensagemCampoObrigatorioTelefone() {
		return obterTexto(textoCampoObrigatorioTelefone);
	}

	public String pegarMensagemCampoObrigatorioTipo() {
		return obterTexto(textoCampoObrigatorioTipo);
	}

	public String pegarMensagemCampoObrigatorioTipoAbatimento() {
		return obterTexto(textoCampoObrigatorioTipoAbatimento);
	}

	public String pegarMensagemCampoObrigatorioTipoCadastro() {
		return obterTexto(textoCampoObrigatorioTipoCadastro);
	}

	public String pegarMensagemCampoObrigatorioTipoPessoa() {
		return obterTexto(textoCampoObrigatorioTipoPessoa);
	}

	public String pegarMensagemCampoObrigatorioTipoProrrogacao() {
		return obterTexto(textoCampoObrigatorioTipoProrrogacao);
	}

	public String pegarMensagemCampoObrigatorioUnidadeFaturamento() {
		return obterTexto(textoCampoObrigatorioUnidadeFaturamento);
	}

	public String pegarMensagemCampoObrigatorioValorTotalPedido() {
		return obterTexto(textoCampoObrigatorioValorTotalPedido);
	}

	public String pegarNome() {
		return obterTextoInput(campoNome);
	}

	public String pegarNumero() {
		return obterTextoInput(campoNumero);
	}

	public String pegarRazaoSocial() {
		String texto = obterTextoInputReadOny(campoRazaoSocial);
		return texto;
	}

	public String pegarListaItensAnexados() {
		return obterTexto(textoItensAnexados);
	}

	public String pegarValorMensagemSalvoComSucesso() {
		return obterTexto(textoMensagemSalvoComSucesso).trim();
	}

	// ================= PREENCHER =========================

	public void preencherBairro(String bairro) {
		escrever(campoBairro, bairro);
	}

	public void preencherCEP(String cep) {
		escrever(campoCEP, cep);
	}

	public void preencherCidade(String cidade) {
		escrever(campoCidade, cidade);
	}

	public void preencherCnpjCpf(String valor) {
		String encontrouResultado = verificarResultadoNome(campoCPF,campoCNPJ);
		if (encontrouResultado.equals("CPF")) {
			escrever(campoCPF, valor);

		} else if (encontrouResultado.equals("CNPJ")) {
			escrever(campoCNPJ, valor);
		}

	}

	public void preencheCodigoCliente(String codigoCliente) {
		boolean encontrouResultado = verificarResultado(campoCodigoCliente);
		if (encontrouResultado) {
			escreverCompassado(campoCodigoCliente, codigoCliente);
		}

	}

	public void preencheCodigoItem(String codigoItem) {
		escrever(campoCodigoItem, codigoItem);
	}

	public void preencherCodigoRepresentante(String codigoRepresentante) {
		escrever(campoCodigoRepresentante, codigoRepresentante);
	}

	public void preencherCondicaoPagamento(String condicaoPagamento) {
		escrever(campoCondicaoPagamento, condicaoPagamento);
	}

	public void preencherCpf(String cpf) {

		escrever(campoCPF, cpf);
		esperarTempo();
	}

	public void preencherDescricaoAltCadastrao(String descricaoAltCadastro) {
		escrever(campoDescricaoAltCadastro, descricaoAltCadastro);
	}

	public void preencherDescricaoSolicitacao(String descricaoSolicitacao) {
		escrever(campoDescricaoSolicitacao, descricaoSolicitacao);
	}

	public void preencheDescricaoSolucao(String descricaoSolucao) {
		escrever(campoDescricaoSolucao, descricaoSolucao);
	}

	public void preencherEmail(String email) {
		escrever(campoEmail, email);
	}

	public void preencherEndereco(String endereco) {
		escrever(campoEndereco, endereco);
	}

	public void preencherEstado(String estado) {
		escrever(campoEstado, estado);
	}

	public void preencherFaturamentoMedioMensal(String faturamentoMedioMensal) {
		escrever(campoFaturamentoMedioMensal, faturamentoMedioMensal);
	}

	public void preencherInscricaoEstadual(String inscricaoEstadual) {

		Boolean encontrouElemento = verificarResultado(campoInscricaoEstadual);
		if (encontrouElemento) {
			escrever(campoInscricaoEstadual, inscricaoEstadual);
		}

	}

	public void preencherJustificativa(String justificativa) {
		escrever(campoJustificativa, justificativa);
	}

	public void preencherListaPreco(String listaPreco) {
		escrever(campoListaPreco, listaPreco);
	}

	public void preencherNome(String nome) {
		escrever(campoNome, nome);
	}

	public void preencherNomeContato(String nomeContato) {
		escrever(campoNomeContato, nomeContato);
	}

	public void preencherNumero(String numero) {
		escrever(campoNumero, numero);
	}

	public void preencherNumeroTitulo(String numeroTitulo) {
		escrever(campoNumeroTitulo, numeroTitulo);
	}

	public void preencherPais(String pais) {
		escrever(campoPais, pais);
	}

	public void preencherNumeroOrdemCompra(String numeroOrdemCompra) {
		escrever(campoNumeroOrdemCompra, numeroOrdemCompra);
	}

	public void preencherNumeroPedido(String numeroPedido) {
		escrever(campoNumeroPedido, numeroPedido);
	}

	public void preencheOperacaoFiscal(String operacaoFiscal) {
		escrever(campoOperacaoFiscal, operacaoFiscal);
	}

	public void preencherPrecoLiquidoUnitario(String precoLiquidoUnitario) {
		escrever(campoPrecoLiquidoUnitario, precoLiquidoUnitario);
	}

	public void preencherRazaoSocial(String razaoSocial) {
		escrever(campoRazaoSocial, razaoSocial);
	}

	public void preencherSugestaoLimiteCredito(String sugestaoLimiteCredito) {
		escrever(campoSugestaoLimiteCredito, sugestaoLimiteCredito);
	}

	public void preencherQtdItens(String qtdItens) {
		escrever(campoQtdItens, qtdItens);
	}

	public void preencherTelefoneContato(String telefoneContato) {
		escrever(campoTelefoneContato, telefoneContato);
	}

	// ================= SELECIONAR =========================

	public void selecionarTipoAbatimento(String tipoAbatimento) {
		selecionarLista(campoTipoAbatimento, tipoAbatimento);
	}

	public void preencherValorAbatimento(String valorAbatimento) {
		escrever(campoValorAbatimento, valorAbatimento);
	}

	public void preencherValorTotalPedido(String valorTotalPedido) {
		escrever(campoValorTotalPedido, valorTotalPedido);
	}

	public void selecionarAnexo(String nomeArquivo) {
		rolagemParaBaixo();
		rolagemParaBaixo();
		rolagemParaBaixo();
		uploadArquivo(campoAnexarArquivos, nomeArquivo);
		// System.out.println(pegarMensagemErroAnexo());
	}

	public void rolagemParaBaixo() {

		evaluateJavascript("scrollBy(0,500)", "");

	}

	public void rolagemParaCima() {

		evaluateJavascript("scrollBy(0,-250)", "");

	}

	public void selecionarAprovador(String aprovador) {
		selecionarLista(campoAprovador, aprovador);
	}

	public void selecionarCanalCliente(String canalCliente) {
		selecionarLista(campoCanalCliente, canalCliente);
	}

	public void selecionarMotivoCancelamento(String motivoCancelamento) {
		selecionarLista(campoMotivoCancelamento, motivoCancelamento);
	}

	public void selecionarTipo(String tipo) {
		selecionarLista(campoTipo, tipo);
	}

	public void selecionarTipoCadastro(String tipoCadastro) {
		selecionarLista(campoTipoCadastro, tipoCadastro);
		esperarTempo();
	}

	public void selecionarTipoPessoa(String tipoPessoa) {
		selecionarLista(campoTipoPessoa, tipoPessoa);
		esperarTempo();
	}

	public void selecionarTipoProrrogacao(String tipoProrrogacao) {
		selecionarLista(campoTipoProrrogacao, tipoProrrogacao);

	}

	public void selecionarTipoRegra(String tipoRegra) {

		selecionarLista(campoTipoRegra, tipoRegra);
	}

	public void selecionarTipoServico(String tipoServico) {
		selecionarLista(campoTipoServico, tipoServico);
	}

	public void selecionarUnidadeFaturamento(String unidade) {
		selecionarLista(campoUnidadeFaturamento, unidade);
	}
}
