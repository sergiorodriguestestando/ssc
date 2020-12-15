package net.thucydides.showcase.cucumber.steps;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.util.Date;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TabelaAgregada extends ConexaoOracle {
	Connection conexao;
	Statement statement;
	ResultSet resultSet;

	public void AbrirConexao() throws SQLException {
		conexao = ObterConexao();
		statement = conexao.createStatement();

	}

	public String _001_ValidandoDataSincronismo(String pedido) throws SQLException {
		String dataConvertida = "";
		String sql = "SELECT C.DAT_SINCRONISMO_PEDIDO FROM MDB_BI.MDB_D_PEDIDO_COMERCIAL C WHERE C.NUM_PEDIDO_COMERCIAL ="
				+ pedido;
		resultSet = statement.executeQuery(sql);
		if (resultSet.next()) {
			Timestamp dataSincronismoPedido = resultSet.getTimestamp("DAT_SINCRONISMO_PEDIDO");
			dataConvertida = converteDataParaStringCompleta(dataSincronismoPedido);

		}

		return dataConvertida;
	}

	@Test
	public String _002_ValidandoDataPrevisaoEntrega(String pedido) throws SQLException {
		String dataConvertida = "";
		String sql = "SELECT C.Dat_Previsao_Entrega FROM MDB_BI.MDB_D_PEDIDO_COMERCIAL C WHERE C.NUM_PEDIDO_COMERCIAL ="
				+ pedido;
		resultSet = statement.executeQuery(sql);

		if (resultSet.next()) {
			Date data = resultSet.getDate("Dat_Previsao_Entrega");
			dataConvertida = converteDataParaString(data);

		}

		return dataConvertida;

	}

	public String _003_ValidandoDataPrevisaoFaturamento(String pedido) throws SQLException {
		String sql = "SELECT C.DAT_CORTE_PREVISTO FROM MDB_BI.MDB_D_PEDIDO_COMERCIAL C WHERE C.NUM_PEDIDO_COMERCIAL	 ="
				+ pedido;
		String dataConvertida = "";
		resultSet = statement.executeQuery(sql);

		if (resultSet.next()) {
			Date data = resultSet.getDate("DAT_CORTE_PREVISTO");
			dataConvertida = converteDataParaString(data);

		}
		return dataConvertida;
	}

	@Test
	public String _004_ValidandoDataCancelamento(String pedido) throws SQLException {
		String sql = "SELECT A1.DAT_CANCELAMENTO FROM  MDB_BI.MDB_F_CICLO_PEDIDO_AGG_1 A1 WHERE 1=1 and A1.DAT_CANCELAMENTO IS NOT 	 NULL AND A1.NUM_PEDIDO_COMERCIAL ="
				+ pedido;
		String dataConvertida = "";
		resultSet = statement.executeQuery(sql);
		while (resultSet.next()) {
			Date data = resultSet.getDate("DAT_CANCELAMENTO");
			dataConvertida = converteDataParaString(data);
			Assert.assertEquals("10/09/2019", dataConvertida);
		}
		return dataConvertida;
	}

	//
	@Test
	public String _005_ValidandoDataUltimaEntrega(String pedido) throws SQLException {
		String sql = "SELECT C.DAT_ULT_ENTREGA FROM  MDB_BI.MDB_D_PEDIDO_COMERCIAL C WHERE C.NUM_PEDIDO_COMERCIAL ="
				+ pedido;
		String dataConvertida = "";
		resultSet = statement.executeQuery(sql);
		if (resultSet.next()) {
			Timestamp data = resultSet.getTimestamp("DAT_ULT_ENTREGA");
			dataConvertida = converteDataParaStringCompleta(data);
			Assert.assertEquals("18/10/2019 13:29:02", dataConvertida);
		}
		return dataConvertida;
	}

	//

	@Test
	public String _006_ValidandoDtUltimoFatumento(String pedido) throws SQLException {
		String dataConvertida = "";
		String sql = "SELECT C.Dat_Ult_Faturamento FROM MDB_BI.MDB_D_PEDIDO_COMERCIAL C\r\n"
				+ "WHERE C.NUM_PEDIDO_COMERCIAL =" + pedido;
		resultSet = statement.executeQuery(sql);
		if (resultSet.next()) {
			Timestamp data = resultSet.getTimestamp("Dat_Ult_Faturamento");
			dataConvertida = converteDataParaStringCompleta(data);
		}
		return dataConvertida;
	}

	@Test
	public String _007_ValidandoQtdEntregaPrevistaKg(String pedido) throws SQLException {
		String valor = "";
		String sql = "SELECT \r\n" + "A1.QTD_PREVISTA_ENTREGA_KG	 \r\n"
				+ "FROM MDB_BI.MDB_F_CICLO_PEDIDO_AGG_1 A1\r\n" + "WHERE 1=1\r\n"
				+ "and a1.qtd_prevista_entrega_kg is not null\r\n" + "and  a1.num_pedido_comercial =" + pedido;
		resultSet = statement.executeQuery(sql);
		if (resultSet.next()) {
			valor = resultSet.getString("QTD_PREVISTA_ENTREGA_KG");
			Assert.assertEquals("2400", valor);
		}
		return valor;
	}

	//
	@Test
	public String _008_ValidandoQtdEntregaPrevistaTon(String pedido) throws SQLException {
		String valor = "";
		String sql = "SELECT \r\n" + "A1.QTD_PREVISTA_ENTREGA_TON \r\n" + "FROM MDB_BI.MDB_F_CICLO_PEDIDO_AGG_1 A1\r\n"
				+ "WHERE 1=1\r\n" + "and a1.qtd_prevista_entrega_kg is not null\r\n"
				+ "and 	 a1.num_pedido_comercial =" + pedido;
		resultSet = statement.executeQuery(sql);
		if (resultSet.next()) {
			valor = resultSet.getString("QTD_PREVISTA_ENTREGA_TON");
		}
		return valor;
	}

	//
	@Test
	public int _009_ValidandoValorTotalPrevisto(String pedido) throws SQLException {
		int valor = 0;
		String sql = "SELECT \r\n" + "A1.Val_Total_Previsto\r\n" + "FROM MDB_BI.MDB_F_CICLO_PEDIDO_AGG_1 A1\r\n"
				+ "WHERE 1=1 \r\n" + "AND A1.VAL_TOTAL_PREVISTO IS NOT NULL\r\n" + "AND A1.NUM_PEDIDO_COMERCIAL 	 ="
				+ pedido;
		resultSet = statement.executeQuery(sql);
		if (resultSet.next()) {
			valor = resultSet.getInt("Val_Total_Previsto");
			Assert.assertEquals(15540, valor);
		}
		return valor;
	}

	//
	@Test
	public String _010_ValidandoQtdEntregueKG(String pedido) throws SQLException {

		String valor = "";
		String sql = "SELECT \r\n" + "A1.NUM_PEDIDO_COMERCIAL ,A1.Qtd_Entregue_Kg\r\n"
				+ "FROM MDB_BI.MDB_F_CICLO_PEDIDO_AGG_1 A1\r\n" + "WHERE 1 =1 \r\n"
				+ "AND A1.QTD_ENTREGUE_KG IS NOT NULL\r\n" + "AND A1.NUM_PEDIDO_COMERCIAL =" + pedido;
		resultSet = statement.executeQuery(sql);
		if (resultSet.next()) {
			valor = resultSet.getString("Qtd_Entregue_Kg");

		}

		return valor;
	}

	public String _011_ValidandoQtdEntregueTon(String pedido) throws SQLException {

		double valor = 0.0;
		String sql = "SELECT \r\n" + "A1.NUM_PEDIDO_COMERCIAL ,A1.Qtd_Entregue_ton\r\n"
				+ "FROM MDB_BI.MDB_F_CICLO_PEDIDO_AGG_1 A1\r\n" + "WHERE 1 =1 \r\n"
				+ "AND A1.QTD_ENTREGUE_KG IS NOT NULL\r\n" + "AND A1.NUM_PEDIDO_COMERCIAL =" + pedido;
		resultSet = statement.executeQuery(sql);
		if (resultSet.next()) {
			valor = resultSet.getDouble("Qtd_Entregue_ton");

		}
		String retorno = "" + valor;

		return retorno;
	}

	@Test
	public String _012_ValidandoQtdEntregueDtPrevista(String pedido) throws SQLException {

		String valor = "";
		String sql = "SELECT \r\n" + "A.NUM_PEDIDO_COMERCIAL,\r\n"
				+ "SUM(A.QTD_ENTREGUE_DT_PREV_KG) as total_entregue\r\n" + "FROM MDB_BI.MDB_F_CICLO_PEDIDO_AGG_1 A\r\n"
				+ "WHERE 1 = 1\r\n" + "AND A.NUM_PEDIDO_COMERCIAL =" + pedido
				+ "and a.cod_etapa_ciclo IN ('ENTREGA')\r\n" + "GROUP BY A.NUM_PEDIDO_COMERCIAL";
		resultSet = statement.executeQuery(sql);
		if (resultSet.next()) {
			valor = resultSet.getString("total_entregue");

		}

		return valor;
	}

	@Test
	public String _013_ValidandoQtdEntregueDtPrevistaTon(String pedido) throws SQLException {

		String valor = "";
		String sql = "SELECT \r\n" + "A.NUM_PEDIDO_COMERCIAL,\r\n"
				+ "SUM(A.QTD_ENTREGUE_DT_PREV_TON) as total_entregue_ton\r\n"
				+ "FROM MDB_BI.MDB_F_CICLO_PEDIDO_AGG_1 A\r\n" + "WHERE 1 = 1\r\n" + "AND A.NUM_PEDIDO_COMERCIAL ="
				+ pedido + "and a.cod_etapa_ciclo IN ('ENTREGA')\r\n" + "GROUP BY A.NUM_PEDIDO_COMERCIAL";
		resultSet = statement.executeQuery(sql);
		if (resultSet.next()) {
			valor = resultSet.getString("total_entregue_ton");

		}

		return valor;
	}

	@Test
	public String _014_ValidandoValorTotalEntregue(String pedido) throws SQLException {

		String valor = "";
		String sql = "select SUM(A1.VAL_TOTAL_ENTREGUE) as v_total_entregue, A1.NUM_PEDIDO_COMERCIAL \r\n"
				+ "from MDB_BI.MDB_F_CICLO_PEDIDO_AGG_1 A1 \r\n" + "WHERE A1.NUM_PEDIDO_COMERCIAL = " + pedido
				+ "GROUP BY A1.NUM_PEDIDO_COMERCIAL";
		resultSet = statement.executeQuery(sql);
		if (resultSet.next()) {
			valor = resultSet.getString("v_total_entregue");

		}

		return valor;
	}

	@Test
	public String _015_ValidandoValorTotalEntregueDtPrevista(String pedido) throws SQLException {

		String valor = "";
		String sql = "SELECT A.NUM_PEDIDO_COMERCIAL,\r\n"
				+ "SUM(A.VAL_TOTAL_ENTREGUE_DT_PREV) as v_total_entregue_prev "
				+ "FROM MDB_BI.MDB_F_CICLO_PEDIDO_AGG_1 A\r\n" + "WHERE 1 = 1\r\n" + "AND A.NUM_PEDIDO_COMERCIAL = "
				+ pedido + "and a.cod_etapa_ciclo IN ('ENTREGA')\r\n" + "GROUP BY A.NUM_PEDIDO_COMERCIAL\r\n" + "";
		resultSet = statement.executeQuery(sql);
		if (resultSet.next()) {
			valor = resultSet.getString("v_total_entregue_prev");

		}

		return valor;
	}

	@Test
	public String _016_ValidandoQtdCanceladaKg(String pedido) throws SQLException {

		String valor = "";
		String sql = "SELECT \r\n" + "distinct\r\n"
				+ "A1.NUM_PEDIDO_COMERCIAL ,sum(A1.Qtd_Cancelada_Kg) as qtd_cancelada\r\n"
				+ "FROM MDB_BI.MDB_F_CICLO_PEDIDO_AGG_2 A1\r\n" + "WHERE 1 = 1 \r\n" + "and A1.Num_Pedido_Comercial ="
				+ pedido + "group by a1.num_pedido_comercial\r\n" + "having sum(A1.Qtd_Cancelada_Kg) > 0\r\n";
		resultSet = statement.executeQuery(sql);
		if (resultSet.next()) {
			valor = resultSet.getString("qtd_cancelada");

		}

		return valor;
	}

	@Test
	public String _017_ValidandoQtdCanceladaTon(String pedido) throws SQLException {

		String valor = "";
		String sql = "SELECT \r\n" + "distinct\r\n"
				+ "A1.NUM_PEDIDO_COMERCIAL ,sum(A1.Qtd_Cancelada_ton) as qtd_cancelada_ton\r\n"
				+ "FROM MDB_BI.MDB_F_CICLO_PEDIDO_AGG_2 A1\r\n" + "WHERE 1 = 1 \r\n" + "and A1.Num_Pedido_Comercial ="
				+ pedido + "group by a1.num_pedido_comercial\r\n" + "having sum(A1.Qtd_Cancelada_Kg) > 0\r\n";
		resultSet = statement.executeQuery(sql);
		if (resultSet.next()) {
			valor = resultSet.getString("qtd_cancelada_ton");

		}

		return valor;
	}

	@Test
	public String _018_ValidandoQtdCanceladaPrevFat(String pedido) throws SQLException {

		String valor = "";
		String sql = "SELECT \r\n" + "distinct\r\n"
				+ "A1.NUM_PEDIDO_COMERCIAL ,sum(A1.Qtd_Cancelada_Dt_Prev_f_Kg) as qtd_prev_fat\r\n"
				+ "FROM MDB_BI.MDB_F_CICLO_PEDIDO_AGG_2 A1\r\n" + "where 1=1\r\n"
				+ "and a1.num_pedido_comercial = '3947614'\r\n" + "group by a1.num_pedido_comercial\r\n"
				+ "having sum(A1.Qtd_Cancelada_Dt_Prev_f_Kg) > 0";
		resultSet = statement.executeQuery(sql);
		if (resultSet.next()) {
			valor = resultSet.getString("qtd_prev_fat");

		}

		return valor;
	}

	@Test
	public String _019_ValidandoQtdCanceladaPrevFatTon(String pedido) throws SQLException {

		String valor = "";
		String sql = "SELECT \r\n" + "distinct\r\n"
				+ "A1.NUM_PEDIDO_COMERCIAL ,sum(A1.Qtd_Cancelada_Dt_Prev_f_ton) as qtd_prev_fat_ton\r\n"
				+ "FROM MDB_BI.MDB_F_CICLO_PEDIDO_AGG_2 A1\r\n" + "where 1=1\r\n"
				+ "and a1.num_pedido_comercial = '3947614'\r\n" + "group by a1.num_pedido_comercial\r\n"
				+ "having sum(A1.Qtd_Cancelada_Dt_Prev_f_ton) > 0";
		resultSet = statement.executeQuery(sql);
		if (resultSet.next()) {
			valor = resultSet.getString("qtd_prev_fat_ton");

		}

		return valor;
	}

	@Test
	public String _020_ValidandoQtdCanceladaPrevEntr(String pedido) throws SQLException {

		String valor = "";
		String sql = "SELECT \r\n" + "distinct\r\n"
				+ "A1.NUM_PEDIDO_COMERCIAL ,sum(A1.Qtd_Cancelada_Dt_Prev_e_Kg) as qtd_prev_ent\r\n"
				+ "FROM MDB_BI.MDB_F_CICLO_PEDIDO_AGG_2 A1\r\n" + "where 1=1\r\n"
				+ "and a1.num_pedido_comercial = '3947614'\r\n" + "group by a1.num_pedido_comercial\r\n"
				+ "having sum(A1.Qtd_Cancelada_Dt_Prev_e_Kg) > 0";
		resultSet = statement.executeQuery(sql);
		if (resultSet.next()) {
			valor = resultSet.getString("qtd_prev_ent");

		}

		return valor;
	}

	public String _021_ValidandoQtdCanceladaPrevEntTon(String pedido) throws SQLException {

		String valor = "";
		String sql = "SELECT \r\n" + "distinct\r\n"
				+ "A1.NUM_PEDIDO_COMERCIAL ,sum(A1.Qtd_Cancelada_Dt_Prev_e_ton) as qtd_prev_ent_ton\r\n"
				+ "FROM MDB_BI.MDB_F_CICLO_PEDIDO_AGG_2 A1\r\n" + "where 1=1\r\n"
				+ "and a1.num_pedido_comercial = '3947614'\r\n" + "group by a1.num_pedido_comercial\r\n"
				+ "having sum(A1.Qtd_Cancelada_Dt_Prev_e_ton) > 0";
		resultSet = statement.executeQuery(sql);
		if (resultSet.next()) {
			valor = resultSet.getString("qtd_prev_ent_ton");

		}

		return valor;
	}

	public int _022_ValidandoValorTotalCancelado(String pedido) throws SQLException {

		int valor = 0;
		String sql = "SELECT \r\n" + "distinct\r\n"
				+ "A1.NUM_PEDIDO_COMERCIAL ,sum(A1.Val_Total_Cancelado) as valor_cancelado "
				+ "FROM MDB_BI.MDB_F_CICLO_PEDIDO_AGG_2 A1\r\n" + "where 1=1\r\n" + "and a1.num_pedido_comercial ="
				+ pedido + " group by a1.num_pedido_comercial\r\n" + " having sum(A1.Val_Total_Cancelado) > 0";
		resultSet = statement.executeQuery(sql);
		if (resultSet.next()) {
			valor = resultSet.getInt("valor_cancelado");

		}

		return valor;
	}

	public int _023_ValidandoValorTotalCanceladoDtPrevFatur(String pedido) throws SQLException {

		int valor = 0;
		String sql = "SELECT \r\n" + "distinct\r\n"
				+ "A1.NUM_PEDIDO_COMERCIAL ,sum(A1.Val_Total_Cancelado_Dt_Prev_f) as val_total_cancel_dt_prev_f\r\n "
				+ "FROM MDB_BI.MDB_F_CICLO_PEDIDO_AGG_2 A1\r\n" + "where 1=1\r\n" + "and a1.num_pedido_comercial = "
				+ pedido + " group by a1.num_pedido_comercial\r\n"
				+ " having sum(A1.Val_Total_Cancelado_Dt_Prev_f) > 0";
		resultSet = statement.executeQuery(sql);
		if (resultSet.next()) {
			valor = resultSet.getInt("val_total_cancel_dt_prev_f");

		}

		return valor;
	}

	public int _024_ValidandoValorTotalCanceladoDtPrevEntre(String pedido) throws SQLException {

		int valor = 0;
		String sql = "SELECT \r\n" + "distinct\r\n"
				+ "A1.NUM_PEDIDO_COMERCIAL ,sum(A1.Val_Total_Cancelado_Dt_Prev_e) as val_total_cancel_dt_prev_e\r\n "
				+ "FROM MDB_BI.MDB_F_CICLO_PEDIDO_AGG_2 A1\r\n" + "where 1=1\r\n" + "and a1.num_pedido_comercial = "
				+ pedido + " group by a1.num_pedido_comercial\r\n"
				+ " having sum(A1.Val_Total_Cancelado_Dt_Prev_e) > 0";
		resultSet = statement.executeQuery(sql);
		if (resultSet.next()) {
			valor = resultSet.getInt("val_total_cancel_dt_prev_e");

		}

		return valor;
	}

	public int _025_ValidandoOCTHoras(String pedido) throws SQLException {

		int valor = 0;
		String sql = "SELECT\r\n" + "OUT.SITUACAO,\r\n" + "OUT.NUM_COMERCIAL,\r\n"
				+ "OUT.DATA_INICIO AS DATA_INICIO,\r\n" + "OUT.DATA_FIM  AS   DATA_FIM, \r\n"
				+ "ROUND((OUT.DATA_FIM - OUT.DATA_INICIO)*24,0) as HORAS\r\n" + "FROM\r\n" + "(\r\n"
				+ "SELECT SINC.COD_ETAPA_CICLO,\r\n" + "       SINC.QTD_SOLICITADA ,\r\n"
				+ "       ENTR.COD_ETAPA_CICLO,\r\n" + "       ENTR.QTD_ENTREGUE_KG,\r\n"
				+ "       SINC.DKY_PEDIDO_COMERCIAL,\r\n" + "       SINC.NUM_PEDIDO_COMERCIAL AS NUM_COMERCIAL,\r\n"
				+ "       SINC.DT_INICIO AS DATA_INICIO,\r\n" + "       ENTR.DT_FIM AS DATA_FIM,\r\n"
				+ "       CASE WHEN SINC.QTD_SOLICITADA <> ENTR.QTD_ENTREGUE_KG THEN 'OCT' ELSE 'FORA' END SITUACAO\r\n"
				+ "       \r\n" + " FROM(\r\n" + "SELECT F.COD_ETAPA_CICLO , \r\n"
				+ "SUM(F.QTD_SOLICITADA_KG) AS QTD_SOLICITADA,\r\n" + "F.DKY_PEDIDO_COMERCIAL,\r\n"
				+ "F.NUM_PEDIDO_COMERCIAL,\r\n" + "F.DAT_INICIO_ETAPA AS DT_INICIO\r\n"
				+ "FROM MDB_BI.MDB_F_CICLO_PEDIDO F\r\n" + "WHERE  F.COD_ETAPA_CICLO = 'SINCRONISMO'\r\n"
				+ "--AND F.DKY_PEDIDO_COMERCIAL = '4711652'\r\n"
				+ "GROUP BY F.COD_ETAPA_CICLO,F.DKY_PEDIDO_COMERCIAL,F.NUM_PEDIDO_COMERCIAL,F.DAT_INICIO_ETAPA) SINC,\r\n"
				+ "(\r\n" + "SELECT F.COD_ETAPA_CICLO , \r\n" + "SUM(F.QTD_ENTREGUE_KG)AS QTD_ENTREGUE_KG,\r\n"
				+ "F.DKY_PEDIDO_COMERCIAL,\r\n" + "F.NUM_PEDIDO_COMERCIAL,\r\n" + "F.DAT_FIM_ETAPA AS DT_FIM\r\n"
				+ "FROM MDB_BI.MDB_F_CICLO_PEDIDO F\r\n" + "WHERE  F.COD_ETAPA_CICLO = 'ENTREGA'\r\n"
				+ "--AND F.DKY_PEDIDO_COMERCIAL = '4711652'\r\n"
				+ "GROUP BY F.COD_ETAPA_CICLO,F.DKY_PEDIDO_COMERCIAL,F.NUM_PEDIDO_COMERCIAL,F.DAT_FIM_ETAPA) ENTR\r\n"
				+ "WHERE SINC.DKY_PEDIDO_COMERCIAL = ENTR.DKY_PEDIDO_COMERCIAL\r\n" + ")OUT\r\n"
				+ "WHERE SITUACAO = 'OCT'\r\n" + "AND NUM_COMERCIAL IN \r\n" + "(\r\n"
				+ "SELECT OC.NUM_PEDIDO_COMERCIAL FROM MDB_ODS.MDB_O_PEDIDO_CANCELAMENTO OC\r\n" + ")\r\n"
				+ "AND NUM_COMERCIAL =" + pedido;
		resultSet = statement.executeQuery(sql);
		if (resultSet.next()) {
			valor = resultSet.getInt("HORAS");

		}

		return valor;
	}

	public int _026_ValidandoOCTDias(String pedido) throws SQLException {

		int valor = 0;
		String sql = "SELECT\r\n" + "OUT.SITUACAO,\r\n" + "OUT.NUM_COMERCIAL,\r\n"
				+ "ROUND( OUT.DATA_FIM - OUT.DATA_INICIO ) AS DIAS \r\n" + "FROM\r\n" + "(\r\n"
				+ "SELECT SINC.COD_ETAPA_CICLO,\r\n" + "       SINC.QTD_SOLICITADA ,\r\n"
				+ "       ENTR.COD_ETAPA_CICLO,\r\n" + "       ENTR.QTD_ENTREGUE_KG,\r\n"
				+ "       SINC.DKY_PEDIDO_COMERCIAL,\r\n" + "       SINC.NUM_PEDIDO_COMERCIAL AS NUM_COMERCIAL,\r\n"
				+ "       SINC.DT_INICIO AS DATA_INICIO,\r\n" + "       ENTR.DT_FIM AS DATA_FIM,\r\n"
				+ "       CASE WHEN SINC.QTD_SOLICITADA = ENTR.QTD_ENTREGUE_KG THEN 'OCT' ELSE 'FORA' END SITUACAO\r\n"
				+ "       \r\n" + " FROM(\r\n" + "SELECT F.COD_ETAPA_CICLO , \r\n"
				+ "SUM(F.QTD_SOLICITADA_KG) AS QTD_SOLICITADA,\r\n" + "F.DKY_PEDIDO_COMERCIAL,\r\n"
				+ "F.NUM_PEDIDO_COMERCIAL,\r\n" + "F.DAT_INICIO_ETAPA AS DT_INICIO\r\n"
				+ "FROM MDB_BI.MDB_F_CICLO_PEDIDO F\r\n" + "WHERE  F.COD_ETAPA_CICLO = 'SINCRONISMO'\r\n"
				+ "--AND F.DKY_PEDIDO_COMERCIAL = '4711652'\r\n"
				+ "GROUP BY F.COD_ETAPA_CICLO,F.DKY_PEDIDO_COMERCIAL,F.NUM_PEDIDO_COMERCIAL,F.DAT_INICIO_ETAPA) SINC,\r\n"
				+ "(\r\n" + "SELECT F.COD_ETAPA_CICLO , \r\n" + "SUM(F.QTD_ENTREGUE_KG)AS QTD_ENTREGUE_KG,\r\n"
				+ "F.DKY_PEDIDO_COMERCIAL,\r\n" + "F.NUM_PEDIDO_COMERCIAL,\r\n" + "F.DAT_FIM_ETAPA AS DT_FIM\r\n"
				+ "FROM MDB_BI.MDB_F_CICLO_PEDIDO F\r\n" + "WHERE  F.COD_ETAPA_CICLO = 'ENTREGA'\r\n"
				+ "--AND F.DKY_PEDIDO_COMERCIAL = '4711652'\r\n"
				+ "GROUP BY F.COD_ETAPA_CICLO,F.DKY_PEDIDO_COMERCIAL,F.NUM_PEDIDO_COMERCIAL,F.DAT_FIM_ETAPA) ENTR\r\n"
				+ "WHERE SINC.DKY_PEDIDO_COMERCIAL = ENTR.DKY_PEDIDO_COMERCIAL\r\n" + ")OUT\r\n"
				+ "WHERE SITUACAO = 'OCT'\r\n" + "AND   NUM_COMERCIAL =" + pedido;
		resultSet = statement.executeQuery(sql);
		if (resultSet.next()) {
			valor = resultSet.getInt("DIAS");

		}

		return valor;
	}

	@Test
	public String _29_ValidandoPedidoOT(String pedido) throws SQLException {

		String otif = "";
		String sql = "SELECT\r\n" + "OUT.COMERCIAL,\r\n" + "OUT.OT as OT\r\n" + "FROM\r\n" + "(\r\n" + "SELECT\r\n"
				+ "N_COMERCIAL AS COMERCIAL,\r\n" + "CASE\r\n" + "WHEN \r\n"
				+ "  DAT_ULT_ENTREGA <= DAT_PREVISAO_ENTREGA \r\n" + "  THEN 'S'   ELSE 'N' \r\n" + "    END OT \r\n"
				+ "FROM\r\n" + "(\r\n" + "SELECT \r\n" + " C.NUM_PEDIDO_COMERCIAL AS N_COMERCIAL,\r\n"
				+ " C.DAT_ULT_ENTREGA AS DAT_ULT_ENTREGA,\r\n" + " C.DAT_PREVISAO_ENTREGA AS  DAT_PREVISAO_ENTREGA \r\n"
				+ "FROM MDB_BI.MDB_D_PEDIDO_COMERCIAL C \r\n" + ")\r\n" + ")OUT\r\n" + "WHERE OUT.OT = 'S'\r\n"
				+ "AND   OUT.COMERCIAL =" + pedido;
		resultSet = statement.executeQuery(sql);
		if (resultSet.next()) {
			otif = resultSet.getString("OT");

		}
		return otif;
	}

	//
	@Test
	public String _030_ValidandoPedidoInfull(String pedido) throws SQLException {
		String infull = "";
		String sql = "SELECT\r\n" + "OUT.NUM_COMERCIAL,\r\n" + "OUT.Infull\r\n" + "FROM\r\n" + "(\r\n"
				+ "SELECT SINC.COD_ETAPA_CICLO,\r\n" + " SINC.QTD_SOLICITADA ,\r\n" + " ENTR.COD_ETAPA_CICLO,\r\n"
				+ " ENTR.QTD_ENTREGUE_KG,\r\n" + " SINC.DKY_PEDIDO_COMERCIAL,\r\n"
				+ " SINC.NUM_PEDIDO_COMERCIAL AS 	 NUM_COMERCIAL,\r\n" + " SINC.DT_INICIO AS DATA_INICIO,\r\n"
				+ " ENTR.DT_FIM AS DATA_FIM,\r\n"
				+ " CASE WHEN SINC.QTD_SOLICITADA = ENTR.QTD_ENTREGUE_KG THEN 'S' ELSE 'N' 	 END Infull\r\n" + " \r\n"
				+ " FROM(\r\n" + "SELECT F.COD_ETAPA_CICLO , \r\n" + "SUM(F.QTD_SOLICITADA_KG) AS QTD_SOLICITADA,\r\n"
				+ "F.DKY_PEDIDO_COMERCIAL,\r\n" + "F.NUM_PEDIDO_COMERCIAL,\r\n" + "F.DAT_INICIO_ETAPA AS DT_INICIO\r\n"
				+ "FROM MDB_BI.MDB_F_CICLO_PEDIDO F\r\n" + "WHERE F.COD_ETAPA_CICLO = 	 'SINCRONISMO'\r\n"
				+ "GROUP BY  F.COD_ETAPA_CICLO,F.DKY_PEDIDO_COMERCIAL,F.NUM_PEDIDO_COMERCIAL,F.DAT_INICIO_ETAPA) 	 SINC,\r\n"
				+ "(\r\n" + "SELECT F.COD_ETAPA_CICLO , \r\n" + "SUM(F.QTD_ENTREGUE_KG)AS	 QTD_ENTREGUE_KG,\r\n"
				+ "F.DKY_PEDIDO_COMERCIAL,\r\n" + "F.NUM_PEDIDO_COMERCIAL,\r\n" + "F.DAT_FIM_ETAPA AS DT_FIM\r\n"
				+ "FROM MDB_BI.MDB_F_CICLO_PEDIDO F\r\n" + "WHERE F.COD_ETAPA_CICLO = 	 'ENTREGA'\r\n"
				+ "GROUP BY	 F.COD_ETAPA_CICLO,F.DKY_PEDIDO_COMERCIAL,F.NUM_PEDIDO_COMERCIAL,F.DAT_FIM_ETAPA) 	 ENTR\r\n"
				+ "WHERE SINC.DKY_PEDIDO_COMERCIAL = ENTR.DKY_PEDIDO_COMERCIAL\r\n" + ")OUT\r\n"
				+ "WHERE Infull = 'S'\r\n" + "AND NUM_COMERCIAL =" + pedido;
		resultSet = statement.executeQuery(sql);
		if (resultSet.next()) {
			infull = resultSet.getString("INFULL");
			Assert.assertEquals("S", infull);
		}
		return infull;
	}

	@Test
	public String _031_ValidandoPedidoOtif(String pedido) throws SQLException {

		String otif = "";
		String sql = "SELECT\r\n" + "OUT.NUM_COMERCIAL,\r\n" + "OUT.OT,\r\n" + "OUT.InFull,\r\n" + "CASE \r\n"
				+ " WHEN OUT.OT = 'S' AND OUT.INFULL = 'S' \r\n" + " THEN 'S'	 \r\n" + " ELSE 'N' \r\n"
				+ " END OTIF\r\n" + "FROM\r\n" + "(\r\n" + "SELECT SINC.COD_ETAPA_CICLO,\r\n"
				+ " SINC.QTD_SOLICITADA ,\r\n" + " ENTR.COD_ETAPA_CICLO,\r\n" + " ENTR.QTD_ENTREGUE_KG,\r\n"
				+ " SINC.DKY_PEDIDO_COMERCIAL,\r\n" + " SINC.NUM_PEDIDO_COMERCIAL AS	 NUM_COMERCIAL,\r\n"
				+ " CASE \r\n" + " WHEN SINC.QTD_SOLICITADA = ENTR.QTD_ENTREGUE_KG\r\n" + " THEN 'S' \r\n"
				+ " ELSE 'N' \r\n" + " END INFULL,\r\n" + " CASE \r\n"
				+ " WHEN OT.DAT_ULT_ENTREGA <= OT.DAT_PREVISAO_ENTREGA \r\n" + " THEN 'S' \r\n" + " ELSE 'N' \r\n"
				+ " END OT\r\n" + " \r\n" + " FROM\r\n" + " (\r\n" + " SELECT \r\n"
				+ " C.NUM_PEDIDO_COMERCIAL AS N_COMERCIAL,\r\n" + " C.DAT_ULT_ENTREGA AS 	 DAT_ULT_ENTREGA,\r\n"
				+ " C.DKY_PEDIDO_COMERCIAL AS PD_COMERCIAL,\r\n"
				+ " C.DAT_PREVISAO_ENTREGA AS DAT_PREVISAO_ENTREGA \r\n"
				+ "FROM 	 MDB_BI.MDB_D_PEDIDO_COMERCIAL C \r\n" + "\r\n" + " )\r\n" + " OT,\r\n" + " (\r\n"
				+ "SELECT F.COD_ETAPA_CICLO ,	 \r\n" + "SUM(F.QTD_SOLICITADA_KG) AS QTD_SOLICITADA,\r\n"
				+ "F.DKY_PEDIDO_COMERCIAL AS DKY_PEDIDO_COMERCIAL,\r\n" + "F.NUM_PEDIDO_COMERCIAL\r\n"
				+ "FROM MDB_BI.MDB_F_CICLO_PEDIDO F\r\n" + "WHERE F.COD_ETAPA_CICLO =	 'SINCRONISMO'\r\n"
				+ "GROUP BY	 F.COD_ETAPA_CICLO,F.DKY_PEDIDO_COMERCIAL,F.NUM_PEDIDO_COMERCIAL)\r\n" + "	 SINC,\r\n"
				+ "(\r\n" + "SELECT F.COD_ETAPA_CICLO , \r\n" + "SUM(F.QTD_ENTREGUE_KG)AS	 QTD_ENTREGUE_KG,\r\n"
				+ "F.DKY_PEDIDO_COMERCIAL,\r\n" + "F.NUM_PEDIDO_COMERCIAL\r\n"
				+ "FROM 	 MDB_BI.MDB_F_CICLO_PEDIDO F\r\n" + "WHERE F.COD_ETAPA_CICLO = 'ENTREGA'\r\n"
				+ "GROUP BY F.COD_ETAPA_CICLO,F.DKY_PEDIDO_COMERCIAL,F.NUM_PEDIDO_COMERCIAL)	 ENTR\r\n"
				+ "WHERE SINC.DKY_PEDIDO_COMERCIAL = ENTR.DKY_PEDIDO_COMERCIAL\r\n"
				+ "AND OT.PD_COMERCIAL = ENTR.DKY_PEDIDO_COMERCIAL\r\n" + ")OUT\r\n" + "WHERE	 OUT.NUM_COMERCIAL ="
				+ pedido;
		resultSet = statement.executeQuery(sql);
		if (resultSet.next()) {
			otif = resultSet.getString("OTIF");

		}
		return otif;
	}

	@Test
	public int _32_ValidandoQtdPedidoOTPositivo(String data) throws SQLException {

		int qtd = 0;
		String sql = "SELECT\r\n" + "COUNT(OUT.OT) OT,\r\n" + "OUT.DT_PREV_ENTR\r\n" + "FROM\r\n" + "(\r\n"
				+ "SELECT\r\n" + "N_COMERCIAL AS COMERCIAL,\r\n" + "CASE\r\n" + "WHEN \r\n"
				+ "  DAT_ULT_ENTREGA <= DAT_PREVISAO_ENTREGA \r\n" + "  THEN 'S'   ELSE 'N' \r\n" + "    END OT ,\r\n"
				+ "   DAT_PREVISAO_ENTREGA AS DT_PREV_ENTR\r\n" + "FROM\r\n" + "(\r\n" + "SELECT \r\n"
				+ " C.NUM_PEDIDO_COMERCIAL AS N_COMERCIAL,\r\n" + " C.DAT_ULT_ENTREGA AS DAT_ULT_ENTREGA,\r\n"
				+ " C.DAT_PREVISAO_ENTREGA AS  DAT_PREVISAO_ENTREGA \r\n" + "FROM MDB_BI.MDB_D_PEDIDO_COMERCIAL C \r\n"
				+ ")\r\n" + ")OUT\r\n" + "WHERE OUT.OT = 'S'\r\n" + "AND   OUT.DT_PREV_ENTR = " + data
				+ " GROUP BY OUT.DT_PREV_ENTR";
		resultSet = statement.executeQuery(sql);
		if (resultSet.next()) {
			qtd = resultSet.getInt("OT");

		}
		return qtd;
	}

	@Test
	public int _33_ValidandoQtdPedidoINFULLPositivo(String data) throws SQLException {

		int qtd = 0;
		String sql = "SELECT\r\n" + "COUNT(OUT.NUM_COMERCIAL)AS QTD_INFULL_POSI,\r\n" + "OUT.DATA_EMISSAO \r\n"
				+ " FROM\r\n" + "(\r\n" + "SELECT SINC.COD_ETAPA_CICLO,\r\n" + "       SINC.QTD_SOLICITADA ,\r\n"
				+ "       ENTR.COD_ETAPA_CICLO,\r\n" + "       ENTR.QTD_ENTREGUE_KG,\r\n"
				+ "       SINC.DKY_PEDIDO_COMERCIAL,\r\n" + "       SINC.NUM_PEDIDO_COMERCIAL AS NUM_COMERCIAL,\r\n"
				+ "       SINC.DT_INICIO AS DATA_INICIO,\r\n" + "       ENTR.DT_FIM AS DATA_FIM,\r\n"
				+ "       SINC.DT_E_PED AS DATA_EMISSAO,\r\n"
				+ "       CASE WHEN SINC.QTD_SOLICITADA = ENTR.QTD_ENTREGUE_KG THEN 'S' ELSE 'N' END Infull\r\n"
				+ "       \r\n" + "  FROM(\r\n" + "SELECT F.COD_ETAPA_CICLO , \r\n"
				+ "SUM(F.QTD_SOLICITADA_KG) AS QTD_SOLICITADA,\r\n" + "F.DKY_PEDIDO_COMERCIAL,\r\n"
				+ "F.NUM_PEDIDO_COMERCIAL,\r\n" + "F.DAT_INICIO_ETAPA AS DT_INICIO,\r\n"
				+ "F.DAT_EMISSAO_PEDIDO AS DT_E_PED\r\n" + "FROM MDB_BI.MDB_F_CICLO_PEDIDO F\r\n"
				+ "WHERE  F.COD_ETAPA_CICLO = 'SINCRONISMO'\r\n"
				+ " GROUP BY F.COD_ETAPA_CICLO,F.DKY_PEDIDO_COMERCIAL,F.NUM_PEDIDO_COMERCIAL,F.DAT_INICIO_ETAPA,F.DAT_EMISSAO_PEDIDO) SINC,\r\n"
				+ "(\r\n" + "SELECT F.COD_ETAPA_CICLO , \r\n" + "SUM(F.QTD_ENTREGUE_KG)AS QTD_ENTREGUE_KG,\r\n"
				+ "F.DKY_PEDIDO_COMERCIAL,\r\n" + "F.NUM_PEDIDO_COMERCIAL,\r\n" + "F.DAT_FIM_ETAPA AS DT_FIM\r\n"
				+ " FROM MDB_BI.MDB_F_CICLO_PEDIDO F\r\n" + "WHERE  F.COD_ETAPA_CICLO = 'ENTREGA'\r\n"
				+ "GROUP BY F.COD_ETAPA_CICLO,F.DKY_PEDIDO_COMERCIAL,F.NUM_PEDIDO_COMERCIAL,F.DAT_FIM_ETAPA) ENTR\r\n"
				+ "WHERE SINC.DKY_PEDIDO_COMERCIAL = ENTR.DKY_PEDIDO_COMERCIAL\r\n" + ")OUT\r\n"
				+ "WHERE Infull = 'S'\r\n" + "AND  OUT.DATA_EMISSAO=" + data + "  GROUP BY OUT.DATA_EMISSAO";
		resultSet = statement.executeQuery(sql);
		if (resultSet.next()) {
			qtd = resultSet.getInt("QTD_INFULL_POSI");

		}
		return qtd;
	}

	@Test
	public int _34_ValidandoQtdPedidoOTIFFPositivo(String data) throws SQLException {

		int qtd = 0;
		String sql = "SELECT\r\n" + "COUNT(OUT.OTIF) AS QTD_OTIFF,\r\n" + "OUT.DT_PREV_ENTR\r\n" + "OUT\r\n"
				+ "FROM\r\n" + "(\r\n" + "SELECT SINC.COD_ETAPA_CICLO,\r\n" + "       SINC.QTD_SOLICITADA ,\r\n"
				+ "       ENTR.COD_ETAPA_CICLO,\r\n" + "       ENTR.QTD_ENTREGUE_KG,\r\n"
				+ "       SINC.DKY_PEDIDO_COMERCIAL,\r\n" + "       OT.DAT_PREVISAO_ENTREGA AS DT_PREV_ENTR,\r\n"
				+ "       SINC.NUM_PEDIDO_COMERCIAL AS NUM_COMERCIAL,\r\n" + "       CASE \r\n"
				+ "         WHEN SINC.QTD_SOLICITADA = ENTR.QTD_ENTREGUE_KG\r\n" + "            THEN 'S' \r\n"
				+ "              ELSE 'N' \r\n" + "                END INFULL,\r\n" + "       CASE \r\n"
				+ "         WHEN OT.DAT_ULT_ENTREGA <= OT.DAT_PREVISAO_ENTREGA   THEN 'S' \r\n"
				+ "             ELSE 'N' \r\n" + "               END OT,\r\n" + "        case when ( CASE \r\n"
				+ "         WHEN OT.DAT_ULT_ENTREGA <= OT.DAT_PREVISAO_ENTREGA   THEN 'S' \r\n"
				+ "             ELSE 'N' \r\n" + "               END) = 'S'AND ( CASE \r\n"
				+ "         WHEN SINC.QTD_SOLICITADA = ENTR.QTD_ENTREGUE_KG\r\n" + "            THEN 'S' \r\n"
				+ "              ELSE 'N' \r\n" + "                END) = 'S' THEN 'S' ELSE 'N'  END OTIF   \r\n"
				+ "       \r\n" + " FROM\r\n" + " ( SELECT \r\n" + " C.NUM_PEDIDO_COMERCIAL AS N_COMERCIAL,\r\n"
				+ " C.DAT_ULT_ENTREGA AS DAT_ULT_ENTREGA,\r\n" + " C.DKY_PEDIDO_COMERCIAL AS PD_COMERCIAL,\r\n"
				+ " C.DAT_PREVISAO_ENTREGA AS  DAT_PREVISAO_ENTREGA \r\n" + "FROM MDB_BI.MDB_D_PEDIDO_COMERCIAL C \r\n"
				+ ") OT,\r\n" + "(SELECT F.COD_ETAPA_CICLO , \r\n" + "SUM(F.QTD_SOLICITADA_KG) AS QTD_SOLICITADA,\r\n"
				+ "F.DKY_PEDIDO_COMERCIAL  AS DKY_PEDIDO_COMERCIAL,\r\n" + "F.NUM_PEDIDO_COMERCIAL\r\n"
				+ "FROM MDB_BI.MDB_F_CICLO_PEDIDO F\r\n" + "WHERE  F.COD_ETAPA_CICLO = 'SINCRONISMO'\r\n"
				+ "--AND NUM_PEDIDO_COMERCIAL = '3947614'\r\n"
				+ "GROUP BY F.COD_ETAPA_CICLO,F.DKY_PEDIDO_COMERCIAL,F.NUM_PEDIDO_COMERCIAL)\r\n" + "SINC,\r\n"
				+ "(\r\n" + "SELECT F.COD_ETAPA_CICLO , \r\n" + "SUM(F.QTD_ENTREGUE_KG)AS QTD_ENTREGUE_KG,\r\n"
				+ "F.DKY_PEDIDO_COMERCIAL,\r\n" + "F.NUM_PEDIDO_COMERCIAL\r\n" + "FROM MDB_BI.MDB_F_CICLO_PEDIDO F\r\n"
				+ "WHERE  F.COD_ETAPA_CICLO = 'ENTREGA'\r\n"
				+ "GROUP BY F.COD_ETAPA_CICLO,F.DKY_PEDIDO_COMERCIAL,F.NUM_PEDIDO_COMERCIAL) ENTR\r\n"
				+ "WHERE SINC.DKY_PEDIDO_COMERCIAL = ENTR.DKY_PEDIDO_COMERCIAL(+)\r\n"
				+ "AND   OT.PD_COMERCIAL = SINC.DKY_PEDIDO_COMERCIAL\r\n"
				+ "--AND   SINC.NUM_PEDIDO_COMERCIAL = '3947614'\r\n" + ") OUT\r\n" + "WHERE 1=1\r\n"
				+ "AND OUT.DT_PREV_ENTR = " + data + "  GROUP BY OUT.DT_PREV_ENTR";
		resultSet = statement.executeQuery(sql);
		if (resultSet.next()) {
			qtd = resultSet.getInt("QTD_OTIFF");

		}
		return qtd;
	}

	@Test
	public String _35_ValidandoPorcePedidosOTPositivo(String data) throws SQLException {

		int metrica = 0;
		int total = 0;
		double porcentagem = 0;
		String valor_final = "";
		String sql = "SELECT\r\n" + "(\r\n" + "   SELECT COUNT(PC.NUM_PEDIDO_COMERCIAL) AS TOTAL\r\n"
				+ "   FROM MDB_BI.MDB_D_PEDIDO_COMERCIAL PC \r\n" + "   WHERE PC.DAT_EMISSAO_PEDIDO =" + data
				+ ") AS TOTAL" + " ,     COUNT(OUT.OT) OT,\r\n" + "    ROUND((COUNT(OUT.OT)*100)/\r\n"
				+ "  ( SELECT COUNT(PC.NUM_PEDIDO_COMERCIAL) AS TOTAL\r\n"
				+ "    FROM MDB_BI.MDB_D_PEDIDO_COMERCIAL PC \r\n" + "   WHERE PC.DAT_EMISSAO_PEDIDO =" + data
				+ "),2) AS PORCENTAGEM,\r\n" + " \r\n" + "   OUT.DATA_EMISSAO\r\n" + " FROM\r\n" + "(\r\n"
				+ "SELECT\r\n" + "N_COMERCIAL AS COMERCIAL,\r\n" + "DT_EMISSAO AS  DATA_EMISSAO,\r\n" + "CASE\r\n"
				+ "WHEN \r\n" + "  DAT_ULT_ENTREGA <= DAT_PREVISAO_ENTREGA \r\n" + "  THEN 'S'   ELSE 'N' \r\n"
				+ "    END OT ,\r\n" + "   DAT_PREVISAO_ENTREGA AS DT_PREV_ENTR\r\n" + " FROM\r\n" + "(\r\n"
				+ "SELECT \r\n" + " C.NUM_PEDIDO_COMERCIAL AS N_COMERCIAL,\r\n"
				+ " C.DAT_ULT_ENTREGA AS DAT_ULT_ENTREGA,\r\n" + " C.DAT_PREVISAO_ENTREGA AS  DAT_PREVISAO_ENTREGA,\r\n"
				+ " C.DAT_EMISSAO_PEDIDO AS DT_EMISSAO\r\n" + " FROM MDB_BI.MDB_D_PEDIDO_COMERCIAL C \r\n" + ")\r\n"
				+ ")OUT\r\n" + "WHERE OUT.OT = 'S'\r\n" + "AND   OUT.DATA_EMISSAO = " + data
				+ " GROUP BY OUT.DATA_EMISSAO\r\n";
		resultSet = statement.executeQuery(sql);
		if (resultSet.next()) {
			metrica = resultSet.getInt("ot");
			total = resultSet.getInt("total");
			porcentagem = validarOtPositivo(total, metrica);
		}
		valor_final = converteDoubleString(porcentagem);
		return valor_final;
	}

	@Test
	public String _36_ValidandoPorcePedidosInfullPositivo(String data) throws SQLException {

		int metrica = 0;
		int total = 0;
		double porcentagem = 0;
		String valor_final = "";
		String sql = "SELECT\r\n" + "OUT.DATA_EMISSAO,\r\n" + "ROUND(( SELECT COUNT(PC.NUM_PEDIDO_COMERCIAL) \r\n"
				+ "    FROM MDB_BI.MDB_D_PEDIDO_COMERCIAL PC \r\n"
				+ "   WHERE PC.DAT_EMISSAO_PEDIDO = OUT.DATA_EMISSAO),2) as total,\r\n"
				+ "COUNT(OUT.INFULL) as infull,\r\n"
				+ "ROUND((COUNT(OUT.INFULL)*100)/ROUND(( SELECT COUNT(PC.NUM_PEDIDO_COMERCIAL) \r\n"
				+ "    FROM MDB_BI.MDB_D_PEDIDO_COMERCIAL PC \r\n"
				+ "   WHERE PC.DAT_EMISSAO_PEDIDO = OUT.DATA_EMISSAO),2),2) as porc\r\n" + "FROM\r\n" + "(\r\n"
				+ "SELECT SINC.COD_ETAPA_CICLO,\r\n" + "       SINC.DT_EMISSAO AS DATA_EMISSAO,\r\n" + "      \r\n"
				+ "       CASE \r\n" + "         WHEN SINC.QTD_SOLICITADA = ENTR.QTD_ENTREGUE_KG\r\n"
				+ "            THEN 'S' \r\n" + "              ELSE 'N' \r\n" + "                END INFULL\r\n"
				+ "       \r\n" + " FROM\r\n" + "(SELECT F.COD_ETAPA_CICLO , \r\n"
				+ "SUM(F.QTD_SOLICITADA_KG) AS QTD_SOLICITADA,\r\n"
				+ "F.DKY_PEDIDO_COMERCIAL  AS DKY_PEDIDO_COMERCIAL,\r\n" + "F.NUM_PEDIDO_COMERCIAL,\r\n"
				+ "F.DAT_EMISSAO_PEDIDO AS DT_EMISSAO\r\n" + "FROM MDB_BI.MDB_F_CICLO_PEDIDO F\r\n"
				+ "WHERE  F.COD_ETAPA_CICLO = 'SINCRONISMO'\r\n"
				+ "GROUP BY F.COD_ETAPA_CICLO,F.DKY_PEDIDO_COMERCIAL,F.NUM_PEDIDO_COMERCIAL,F.DAT_EMISSAO_PEDIDO)\r\n"
				+ "SINC,\r\n" + "(\r\n" + "SELECT F.COD_ETAPA_CICLO , \r\n"
				+ "SUM(F.QTD_ENTREGUE_KG)AS QTD_ENTREGUE_KG,\r\n" + "F.DKY_PEDIDO_COMERCIAL,\r\n"
				+ "F.NUM_PEDIDO_COMERCIAL\r\n" + "FROM MDB_BI.MDB_F_CICLO_PEDIDO F\r\n"
				+ "WHERE  F.COD_ETAPA_CICLO = 'ENTREGA'\r\n"
				+ "GROUP BY F.COD_ETAPA_CICLO,F.DKY_PEDIDO_COMERCIAL,F.NUM_PEDIDO_COMERCIAL) ENTR\r\n"
				+ "WHERE SINC.DKY_PEDIDO_COMERCIAL = ENTR.DKY_PEDIDO_COMERCIAL\r\n" + ")OUT\r\n"
				+ "WHERE OUT.INFULL  = 'S'\r\n" + "AND OUT.DATA_EMISSAO =" + data + " GROUP BY OUT.DATA_EMISSAO\r\n";
		resultSet = statement.executeQuery(sql);
		if (resultSet.next()) {
			metrica = resultSet.getInt("infull");
			total = resultSet.getInt("total");
			porcentagem = validarOtPositivo(total, metrica);
		}
		valor_final = converteDoubleString(porcentagem);
		return valor_final;
	}

	@Test
	public String _37_ValidandoPorcePedidosOTIFFPositivo(String data) throws SQLException {

		int metrica = 0;
		int total = 0;
		double porcentagem = 0;
		String valor_final = "";
		String sql = "SELECT\r\n" + "ROUND(( SELECT COUNT(PC.NUM_PEDIDO_COMERCIAL) \r\n"
				+ "    FROM MDB_BI.MDB_D_PEDIDO_COMERCIAL PC \r\n"
				+ "   WHERE PC.DAT_EMISSAO_PEDIDO = OUT.DATA_EMISSAO),2) as total,\r\n" + "COUNT(OUT.OTIF) AS OTIF,\r\n"
				+ "OUT.DATA_EMISSAO,\r\n"
				+ "round((COUNT(OUT.OTIF)*100)/ ROUND(( SELECT COUNT(PC.NUM_PEDIDO_COMERCIAL) \r\n"
				+ "    FROM MDB_BI.MDB_D_PEDIDO_COMERCIAL PC \r\n"
				+ "   WHERE PC.DAT_EMISSAO_PEDIDO = OUT.DATA_EMISSAO),2),2) as porc\r\n" + "\r\n" + "FROM\r\n" + "(\r\n"
				+ "SELECT SINC.COD_ETAPA_CICLO,\r\n" + "       SINC.QTD_SOLICITADA ,\r\n"
				+ "       ENTR.COD_ETAPA_CICLO,\r\n" + "       ENTR.QTD_ENTREGUE_KG,\r\n"
				+ "       SINC.DKY_PEDIDO_COMERCIAL,\r\n" + "       SINC.NUM_PEDIDO_COMERCIAL AS NUM_COMERCIAL,\r\n"
				+ "       SINC.DT_EMISSAO AS DATA_EMISSAO,\r\n" + "       CASE \r\n"
				+ "         WHEN SINC.QTD_SOLICITADA = ENTR.QTD_ENTREGUE_KG\r\n" + "            THEN 'S' \r\n"
				+ "              ELSE 'N' \r\n" + "                END INFULL,\r\n" + "       CASE \r\n"
				+ "         WHEN OT.DAT_ULT_ENTREGA <= OT.DAT_PREVISAO_ENTREGA   THEN 'S' \r\n"
				+ "             ELSE 'N' \r\n" + "               END OT,\r\n" + "        case when ( CASE \r\n"
				+ "         WHEN OT.DAT_ULT_ENTREGA <= OT.DAT_PREVISAO_ENTREGA   THEN 'S' \r\n"
				+ "             ELSE 'N' \r\n" + "               END) = 'S'AND ( CASE \r\n"
				+ "         WHEN SINC.QTD_SOLICITADA = ENTR.QTD_ENTREGUE_KG\r\n" + "            THEN 'S' \r\n"
				+ "              ELSE 'N' \r\n" + "                END) = 'S' THEN 'S' ELSE 'N'  END OTIF   \r\n"
				+ "       \r\n" + " FROM\r\n" + " ( SELECT \r\n" + " C.NUM_PEDIDO_COMERCIAL AS N_COMERCIAL,\r\n"
				+ " C.DAT_ULT_ENTREGA AS DAT_ULT_ENTREGA,\r\n" + " C.DKY_PEDIDO_COMERCIAL AS PD_COMERCIAL,\r\n"
				+ " C.DAT_PREVISAO_ENTREGA AS  DAT_PREVISAO_ENTREGA \r\n" + "FROM MDB_BI.MDB_D_PEDIDO_COMERCIAL C \r\n"
				+ ") OT,\r\n" + "(SELECT F.COD_ETAPA_CICLO , \r\n" + "SUM(F.QTD_SOLICITADA_KG) AS QTD_SOLICITADA,\r\n"
				+ "F.DKY_PEDIDO_COMERCIAL  AS DKY_PEDIDO_COMERCIAL,\r\n" + "F.NUM_PEDIDO_COMERCIAL,\r\n"
				+ "F.DAT_EMISSAO_PEDIDO AS DT_EMISSAO\r\n" + "FROM MDB_BI.MDB_F_CICLO_PEDIDO F\r\n"
				+ "WHERE  F.COD_ETAPA_CICLO = 'SINCRONISMO'\r\n"
				+ "GROUP BY F.COD_ETAPA_CICLO,F.DKY_PEDIDO_COMERCIAL,F.NUM_PEDIDO_COMERCIAL,F.DAT_EMISSAO_PEDIDO)\r\n"
				+ "SINC,\r\n" + "(\r\n" + "SELECT F.COD_ETAPA_CICLO , \r\n"
				+ "SUM(F.QTD_ENTREGUE_KG)AS QTD_ENTREGUE_KG,\r\n" + "F.DKY_PEDIDO_COMERCIAL,\r\n"
				+ "F.NUM_PEDIDO_COMERCIAL\r\n" + "FROM MDB_BI.MDB_F_CICLO_PEDIDO F\r\n"
				+ "WHERE  F.COD_ETAPA_CICLO = 'ENTREGA'\r\n"
				+ "GROUP BY F.COD_ETAPA_CICLO,F.DKY_PEDIDO_COMERCIAL,F.NUM_PEDIDO_COMERCIAL) ENTR\r\n"
				+ "WHERE SINC.DKY_PEDIDO_COMERCIAL = ENTR.DKY_PEDIDO_COMERCIAL(+)\r\n"
				+ "AND   OT.PD_COMERCIAL = SINC.DKY_PEDIDO_COMERCIAL\r\n" + "\r\n" + ") OUT\r\n"
				+ "WHERE OUT.DATA_EMISSAO =" + data + " AND   OUT.OTIF = 'S'\r\n" + "GROUP BY \r\n"
				+ "OUT.DATA_EMISSAO";
		resultSet = statement.executeQuery(sql);
		if (resultSet.next()) {
			metrica = resultSet.getInt("OTIF");
			total = resultSet.getInt("total");
			porcentagem = validarOtPositivo(total, metrica);
		}
		valor_final = converteDoubleString(porcentagem);
		return valor_final;
	}

	@Test
	public int _39_ValidandoQtdFaturadaKg(String pedido) throws SQLException {

		int qtd = 0;
		String sql = "SELECT \r\n" + "A.NUM_PEDIDO_COMERCIAL, \r\n" + "SUM(A.QTD_FATURADA_KG) as qtd_fat_kg\r\n"
				+ "FROM MDB_BI.MDB_F_CICLO_PEDIDO_AGG_1 A\r\n" + "WHERE 1=1\r\n" + "AND   A.NUM_PEDIDO_COMERCIAL = "
				+ pedido + " GROUP BY A.NUM_PEDIDO_COMERCIAL";
		resultSet = statement.executeQuery(sql);
		if (resultSet.next()) {
			qtd = resultSet.getInt("qtd_fat_kg");

		}
		return qtd;
	}

	@Test
	public String _40_ValidandoQtdFaturadaTon(String pedido) throws SQLException {

		double qtd = 0.0;
		String sql = "SELECT \r\n" + "A.NUM_PEDIDO_COMERCIAL, \r\n" + "SUM(A.QTD_FATURADA_TON) as qtd_fat_ton\r\n"
				+ "FROM MDB_BI.MDB_F_CICLO_PEDIDO_AGG_1 A\r\n" + "WHERE 1=1\r\n" + "AND   A.NUM_PEDIDO_COMERCIAL = "
				+ pedido + " GROUP BY A.NUM_PEDIDO_COMERCIAL";
		resultSet = statement.executeQuery(sql);
		if (resultSet.next()) {
			qtd = resultSet.getDouble("qtd_fat_ton");

		}
		String retorno = "" + qtd;

		return retorno;

	}

	@Test
	public int _41_ValidandoQtdFaturadaKgDtPrevista(String pedido) throws SQLException {

		int qtd = 0;
		String sql = "SELECT \r\n" + "A.NUM_PEDIDO_COMERCIAL, \r\n"
				+ "SUM(A.Qtd_Faturada_Dt_Prev_kg) as qtd_fat_kg_prev\r\n" + "FROM MDB_BI.MDB_F_CICLO_PEDIDO_AGG_1 A\r\n"
				+ "WHERE 1=1\r\n" + "AND   A.NUM_PEDIDO_COMERCIAL = " + pedido + " GROUP BY A.NUM_PEDIDO_COMERCIAL";
		resultSet = statement.executeQuery(sql);
		if (resultSet.next()) {
			qtd = resultSet.getInt("qtd_fat_kg_prev");

		}
		return qtd;
	}

	@Test
	public String _42_ValidandoQtdFaturadaTonDtPrevista(String pedido) throws SQLException {

		double qtd = 0.0;
		String sql = "SELECT A.NUM_PEDIDO_COMERCIAL, \r\n"
				+ "SUM(A.Qtd_Faturada_Dt_Prev_ton) as qtd_fat_ton_dt_prev \r\n"
				+ "FROM MDB_BI.MDB_F_CICLO_PEDIDO_AGG_1 A\r\n" + "WHERE 1=1\r\n" + "AND   A.NUM_PEDIDO_COMERCIAL = "
				+ pedido + " GROUP BY A.NUM_PEDIDO_COMERCIAL";
		resultSet = statement.executeQuery(sql);
		if (resultSet.next()) {
			qtd = resultSet.getDouble("qtd_fat_ton_dt_prev");

		}
		String retorno = "" + qtd;

		return retorno;
	}

	public int _043_ValidandoValorTotalFaturado(String pedido) throws SQLException {

		int valor = 0;
		String sql = "SELECT \r\n" + "A.NUM_PEDIDO_COMERCIAL,\r\n"
				+ "round( SUM(A.Val_Total_Faturada),0) as valor_faturado \r\n"
				+ "FROM MDB_BI.MDB_F_CICLO_PEDIDO_AGG_1 A\r\n" + "WHERE 1 = 1\r\n"
				+ "AND   A.NUM_PEDIDO_COMERCIAL ="+pedido 
				+ " GROUP BY A.NUM_PEDIDO_COMERCIAL";
		resultSet = statement.executeQuery(sql);
		if (resultSet.next()) {
			valor = resultSet.getInt("valor_faturado");

		}

		return valor;

	}
	
	
	public int _044_ValidandoValorTotalFaturadoDtPrevista(String pedido) throws SQLException {

		int valor = 0;
		String sql = "SELECT \r\n" + "A.NUM_PEDIDO_COMERCIAL,\r\n"
				+ "round( SUM(A.Val_Total_Faturada),0) as valor_faturado_prev \r\n"
				+ "FROM MDB_BI.MDB_F_CICLO_PEDIDO_AGG_1 A\r\n" + "WHERE 1 = 1\r\n"
				+ "AND   A.NUM_PEDIDO_COMERCIAL ="+pedido 
				+ " GROUP BY A.NUM_PEDIDO_COMERCIAL";
		resultSet = statement.executeQuery(sql);
		if (resultSet.next()) {
			valor = resultSet.getInt("valor_faturado_prev");

		}

		return valor;

	}

	public void FecharConexao() throws SQLException {

		statement.close();
		conexao.close();

	}

}
