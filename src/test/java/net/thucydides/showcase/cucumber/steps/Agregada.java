package net.thucydides.showcase.cucumber.steps;

import java.sql.SQLException;

import org.junit.Assert;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;

public class Agregada {

	TabelaAgregada agregada = new TabelaAgregada();

	@Dado("^que esteja conectado ao OBIDEV(\\d+)G$")
	public void que_esteja_conectado_ao_OBIDEV_G(int arg1) throws SQLException {
		agregada.AbrirConexao();
	}

	@Quando("^informa o pedido para validar a Data Sincronismo Pedido \"([^\"]*)\"  a data recebida e \"([^\"]*)\"$")
	public void informa_o_pedido_para_validar_a_Data_Sincronismo_Pedido_a_data_recebida_e(String pedido, String data)
			throws SQLException {
		Assert.assertEquals(data, agregada._001_ValidandoDataSincronismo(pedido));
	}

	@Quando("^informa o pedido para validar a Data Previsao entrega \"([^\"]*)\" a data recebida e \"([^\"]*)\"$")
	public void informa_o_pedido_para_validar_a_Data_Previsao_entrega_a_data_recebida_e(String pedido, String data)
			throws SQLException {
		Assert.assertEquals(data, agregada._002_ValidandoDataPrevisaoEntrega(pedido));
	}

	@Quando("^informa o pedido para validar Data Previsao Faturamento   \"([^\"]*)\" a data recebida e \"([^\"]*)\"$")
	public void informa_o_pedido_para_validar_Data_Previsao_Faturamento_a_data_recebida_e(String pedido, String data)
			throws SQLException {
		Assert.assertEquals(data, agregada._003_ValidandoDataPrevisaoFaturamento(pedido));
	}

	@Quando("^informa o pedido para validar Data do Cancelamento   \"([^\"]*)\" a data recebida e \"([^\"]*)\"$")
	public void informa_o_pedido_para_validar_Data_do_Cancelamento_a_data_recebida_e(String pedido, String data)
			throws SQLException {
		Assert.assertEquals(data, agregada._004_ValidandoDataCancelamento(pedido));
	}

	@Quando("^informa o pedido  \"([^\"]*)\" para validar Data da Ultima Entrega a data recebida e \"([^\"]*)\"$")
	public void informa_o_pedido_para_validar_Data_da_Ultima_Entrega_a_data_recebida_e(String pedido, String data)
			throws SQLException {
		Assert.assertEquals(data, agregada._005_ValidandoDataUltimaEntrega(pedido));
	}

	@Quando("^informa o pedido  \"([^\"]*)\" para validar Data da Ultimo Faturamento a data recebida e \"([^\"]*)\"$")
	public void informa_o_pedido_para_validar_Data_da_Ultimo_Faturamento_a_data_recebida_e(String pedido, String data)
			throws SQLException {
		Assert.assertEquals(data, agregada._006_ValidandoDtUltimoFatumento(pedido));
	}

	@Quando("^informa o pedido  \"([^\"]*)\" para validar Qtd Entregue Prevista o valor recebido e \"([^\"]*)\"$")
	public void informa_o_pedido_para_validar_Qtd_Entregue_Prevista_o_valor_recebido_e(String pedido, String data)
			throws SQLException {
		Assert.assertEquals(data, agregada._007_ValidandoQtdEntregaPrevistaKg(pedido));
	}

	@Quando("^informa o pedido  \"([^\"]*)\" para validar Qtd Entregue Prevista em ton recebido e \"([^\"]*)\"$")
	public void informa_o_pedido_para_validar_Qtd_Entregue_Prevista_em_ton_recebido_e(String pedido, String data)
			throws SQLException {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(data, agregada._008_ValidandoQtdEntregaPrevistaTon(pedido));
	}

	@Quando("^informa o pedido  \"([^\"]*)\" o valor total previsto recebido e (\\d+)$")
	public void informa_o_pedido_o_valor_total_previsto_recebido_e(String pedido, int valor) throws SQLException {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(valor, agregada._009_ValidandoValorTotalPrevisto(pedido));
	}

	@Quando("^informa o pedido  \"([^\"]*)\" para validar Qtd Entregue em quilos o valor recebido e \"([^\"]*)\"$")
	public void informa_o_pedido_para_validar_Qtd_Entregue_em_quilos_o_valor_recebido_e(String pedido, String valor)
			throws SQLException {
		Assert.assertEquals(valor, agregada._010_ValidandoQtdEntregueKG(pedido));
	}

	@Quando("^informa o pedido  \"([^\"]*)\" a  Qtd Entregue em toneladas e \"([^\"]*)\"$")
	public void informa_o_pedido_a_Qtd_Entregue_em_toneladas_e(String pedido, String valor) throws SQLException {
		String valorTon = agregada._011_ValidandoQtdEntregueTon(pedido);
		Assert.assertEquals(valor, valorTon);

	}

	@Quando("^informa o pedido  \"([^\"]*)\" a Qtd Entregue em quilos ate a data prevista  e \"([^\"]*)\"$")
	public void informa_o_pedido_a_Qtd_Entregue_em_quilos_ate_a_data_prevista_e(String pedido, String valor)
			throws SQLException {
		Assert.assertEquals(valor, agregada._012_ValidandoQtdEntregueDtPrevista(pedido));
	}

	@Quando("^informa o pedido  \"([^\"]*)\" a Qtd Entregue em ton ate a data prevista  e \"([^\"]*)\"$")
	public void informa_o_pedido_a_Qtd_Entregue_em_ton_ate_a_data_prevista_e(String pedido, String valor)
			throws SQLException {
		Assert.assertEquals(valor, agregada._013_ValidandoQtdEntregueDtPrevistaTon(pedido));
	}

	@Quando("^informa o pedido  \"([^\"]*)\" o valor total entregue e \"([^\"]*)\"$")
	public void informa_o_pedido_o_valor_total_entregue_e(String pedido, String valor) throws SQLException {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(valor, agregada._014_ValidandoValorTotalEntregue(pedido));
	}

	@Quando("^informa o pedido  \"([^\"]*)\" o valor total Entregue ate a data prevista  e \"([^\"]*)\"$")
	public void informa_o_pedido_o_valor_total_Entregue_ate_a_data_prevista_e(String pedido, String valor)
			throws SQLException {

		Assert.assertEquals(valor, agregada._015_ValidandoValorTotalEntregueDtPrevista(pedido));

	}

	@Quando("^informa o pedido  \"([^\"]*)\" a quantidade canceladas em quilos   e \"([^\"]*)\"$")
	public void informa_o_pedido_a_quantidade_canceladas_em_quilos_e(String pedido, String qtd) throws SQLException {

		Assert.assertEquals(qtd, agregada._016_ValidandoQtdCanceladaKg(pedido));
	}

	@Quando("^informa o pedido  \"([^\"]*)\" a quantidade canceladas em toneladas   e \"([^\"]*)\"$")
	public void informa_o_pedido_a_quantidade_canceladas_em_toneladas_e(String pedido, String qtd) throws SQLException {
		Assert.assertEquals(qtd, agregada._017_ValidandoQtdCanceladaTon(pedido));
	}

	@Quando("^informa o pedido  \"([^\"]*)\"  quantidade cancelada até data prevista do faturamento   e \"([^\"]*)\"$")
	public void informa_o_pedido_quantidade_cancelada_até_data_prevista_do_faturamento_e(String pedido, String qtd)
			throws SQLException {
		Assert.assertEquals(qtd, agregada._018_ValidandoQtdCanceladaPrevFat(pedido));
	}

	@Quando("^informa o pedido  \"([^\"]*)\"  quantidade cancelada em toneladas até data prevista do faturamento   e \"([^\"]*)\"$")
	public void informa_o_pedido_quantidade_cancelada_em_toneladas_até_data_prevista_do_faturamento_e(String pedido,
			String qtd) throws SQLException {
		Assert.assertEquals(qtd, agregada._019_ValidandoQtdCanceladaPrevFatTon(pedido));
	}

	@Quando("^informa o pedido  \"([^\"]*)\"  quantidade cancelada até data prevista de Entrega   e \"([^\"]*)\"$")
	public void informa_o_pedido_quantidade_cancelada_até_data_prevista_de_Entrega_e(String pedido, String qtd)
			throws SQLException {
		Assert.assertEquals(qtd, agregada._020_ValidandoQtdCanceladaPrevEntr(pedido));
	}

	@Quando("^informa o pedido  \"([^\"]*)\"  quantidade cancelada em toneladas até data prevista de Entrega   e \"([^\"]*)\"$")
	public void informa_o_pedido_quantidade_cancelada_em_toneladas_até_data_prevista_de_Entrega_e(String pedido,
			String qtd) throws SQLException {
		Assert.assertEquals(qtd, agregada._021_ValidandoQtdCanceladaPrevEntTon(pedido));

	}

	@Quando("^informa o pedido  \"([^\"]*)\"   o valor total cancelando e (\\d+)$")
	public void informa_o_pedido_o_valor_total_cancelando_e(String pedido, int valor) throws SQLException {
		Assert.assertEquals(valor, agregada._022_ValidandoValorTotalCancelado(pedido));
	}

	@Quando("^informa o pedido  \"([^\"]*)\"   o Valor Total Cancelado até a Data Prevista de Faturamento e (\\d+)$")
	public void informa_o_pedido_o_Valor_Total_Cancelado_até_a_Data_Prevista_de_Faturamento_e(String pedido, int valor)
			throws SQLException {
		Assert.assertEquals(valor, agregada._023_ValidandoValorTotalCanceladoDtPrevFatur(pedido));
	}

	@Quando("^informa o pedido  \"([^\"]*)\"   o Valor Total Cancelado até a Data Prevista de Entrega e (\\d+)$")
	public void informa_o_pedido_o_Valor_Total_Cancelado_até_a_Data_Prevista_de_Entrega_e(String pedido, int valor)
			throws SQLException {
		Assert.assertEquals(valor, agregada._024_ValidandoValorTotalCanceladoDtPrevEntre(pedido));
	}

	@Quando("^informa o pedido  \"([^\"]*)\"   o Calculo LeadTime \\(OCT\\) em  Horas e (\\d+)$")
	public void informa_o_pedido_o_Calculo_LeadTime_OCT_em_Horas_e(String pedido, int horas) throws SQLException {
		Assert.assertEquals(horas, agregada._025_ValidandoOCTHoras(pedido));
	}

	@Quando("^informa o pedido  \"([^\"]*)\"   o Calculo LeadTime \\(OCT\\) em  Dias e (\\d+)$")
	public void informa_o_pedido_o_Calculo_LeadTime_OCT_em_Dias_e(String pedido, int dias) throws SQLException {
		Assert.assertEquals(dias, agregada._026_ValidandoOCTDias(pedido));
	}

	@Quando("^informa o pedido  \"([^\"]*)\"   o On Time Pedido Comercial \\(OT\\) e \"([^\"]*)\"$")
	public void informa_o_pedido_o_On_Time_Pedido_Comercial_OT_e(String pedido, String status) throws SQLException {
		Assert.assertEquals(status, agregada._29_ValidandoPedidoOT(pedido));
	}

	@Quando("^informa o pedido  \"([^\"]*)\"  o status infull e \"([^\"]*)\"$")
	public void informa_o_pedido_o_status_infull_e(String pedido, String status) throws SQLException {
		Assert.assertEquals(status, agregada._030_ValidandoPedidoInfull(pedido));
	}

	@Quando("^informa o pedido  \"([^\"]*)\"  o status recebido e \"([^\"]*)\"$")
	public void informa_o_pedido_o_status_recebido_e(String pedido, String status) throws SQLException {
		Assert.assertEquals(status, agregada._031_ValidandoPedidoOtif(pedido));
	}

	@Quando("^informa uma data \"([^\"]*)\"  a Quantidade de Pedidos OT Positivo e (\\d+)$")
	public void informa_uma_data_a_Quantidade_de_Pedidos_OT_Positivo_e(String Data, int qtd) throws SQLException {
		Assert.assertEquals(qtd, agregada._32_ValidandoQtdPedidoOTPositivo(Data));

	}

	@Quando("^informa uma data \"([^\"]*)\"  a Validar Quantidade de Pedidos INFULL Positivo e (\\d+)$")
	public void informa_uma_data_a_Validar_Quantidade_de_Pedidos_INFULL_Positivo_e(String Data, int qtd)
			throws SQLException {
		Assert.assertEquals(qtd, agregada._33_ValidandoQtdPedidoINFULLPositivo(Data));
	}

	@Quando("^informa uma data \"([^\"]*)\"  a Validar Quantidade de Pedidos OTIFF Positivo e (\\d+)$")
	public void informa_uma_data_a_Validar_Quantidade_de_Pedidos_OTIFF_Positivo_e(String data, int qtd)
			throws SQLException {
		Assert.assertEquals(qtd, agregada._34_ValidandoQtdPedidoOTIFFPositivo(data));
	}

	@Quando("^informa uma data de emissao \"([^\"]*)\"  a porcentagem de pedidos OT Positivo e \"([^\"]*)\"$")
	public void informa_uma_data_de_emissao_a_porcentagem_de_pedidos_OT_Positivo_e(String data, String porcentagem)
			throws SQLException {
		Assert.assertEquals(porcentagem, agregada._35_ValidandoPorcePedidosOTPositivo(data));
	}

	@Quando("^informa uma data de emissao \"([^\"]*)\"  a porcentagem de pedidos INFULL Positivo e \"([^\"]*)\"$")
	public void informa_uma_data_de_emissao_a_porcentagem_de_pedidos_INFULL_Positivo_e(String data, String porc)
			throws SQLException {
		Assert.assertEquals(porc, agregada._36_ValidandoPorcePedidosInfullPositivo(data));
	}

	@Quando("^informa uma data de emissao \"([^\"]*)\"  a porcentagem de pedidos OTIFF Positivo e \"([^\"]*)\"$")
	public void informa_uma_data_de_emissao_a_porcentagem_de_pedidos_OTIFF_Positivo_e(String data, String porc)
			throws SQLException {
		Assert.assertEquals(porc, agregada._37_ValidandoPorcePedidosOTIFFPositivo(data));
	}

	@Quando("^informa um pedido comercial \"([^\"]*)\"  a quantidade faturada em kg  e (\\d+)$")
	public void informa_um_pedido_comercial_a_quantidade_faturada_em_kg_e(String pedido, int qtd) throws SQLException {
		Assert.assertEquals(qtd, agregada._39_ValidandoQtdFaturadaKg(pedido));
	}

	@Quando("^informa um pedido comercial \"([^\"]*)\"  a quantidade faturada em ton  e \"([^\"]*)\"$")
	public void informa_um_pedido_comercial_a_quantidade_faturada_em_ton_e(String pedido, String qtd)
			throws SQLException {
		Assert.assertEquals(qtd, agregada._40_ValidandoQtdFaturadaTon(pedido));

	}

	@Quando("^informa um pedido comercial \"([^\"]*)\"  a quantidade faturada em kg até data prevista  e (\\d+)$")
	public void informa_um_pedido_comercial_a_quantidade_faturada_em_kg_até_data_prevista_e(String pedido, int qtd)
			throws SQLException {
		Assert.assertEquals(qtd, agregada._41_ValidandoQtdFaturadaKgDtPrevista(pedido));
	}

	@Quando("^informa um pedido comercial \"([^\"]*)\"  a quantidade faturada em ton até data prevista e \"([^\"]*)\"$")
	public void informa_um_pedido_comercial_a_quantidade_faturada_em_ton_até_data_prevista_e(String pedido, String qtd)
			throws SQLException {
		Assert.assertEquals(qtd, agregada._42_ValidandoQtdFaturadaTonDtPrevista(pedido));
	}

	@Quando("^informa o pedido  \"([^\"]*)\"   o Valor Total Faturado e (\\d+)$")
	public void informa_o_pedido_o_Valor_Total_Faturado_e(String pedido, int valor) throws SQLException {
		Assert.assertEquals(valor, agregada._043_ValidandoValorTotalFaturado(pedido));

	}

	@Quando("^informa o pedido  \"([^\"]*)\"   o Valor Total Faturado até Data prevista e (\\d+)$")
	public void informa_o_pedido_o_Valor_Total_Faturado_até_Data_prevista_e(String pedido, int valor)
			throws SQLException {
		Assert.assertEquals(valor, agregada._044_ValidandoValorTotalFaturadoDtPrevista(pedido));
	}

	@Quando("^Exexutar a conexao sera fechada$")
	public void exexutar_a_conexao_sera_fechada() throws SQLException {
		agregada.FecharConexao();
	}

}