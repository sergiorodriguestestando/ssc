package net.thucydides.showcase.cucumber.steps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConexaoOracle {

	static Connection conexao = null;
	//PEDIDOS PARA TESTES
	static String _001_ValidandoDataSincronismo = "'27140065'";
	static String _002_ValidandoDataPrevisaoEntrega = "'27140065'";
	static String _003_ValidandoDataPrevisaoFaturamento = "'75465198'";
	static String _004_ValidandoDataPrevisaoFaturamento = "'86245542'";
	static String _005_ValidandoDataUltimaEntrega = "'66166551'";
	
	
	public static Connection ObterConexao() {

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

			conexao = DriverManager.getConnection("jdbc:oracle:thin:@10.0.61.11:1522:obidev", "mdb_oditemp",
					"mdb_oditemp_dev");

		} catch (ClassNotFoundException e) {

			e.printStackTrace();

		} catch (SQLException e) {

			e.printStackTrace();

		}

		return conexao;

	}

	public void FecharConexao() throws SQLException {
		conexao.close();
	}

	public String converteDataParaStringCompleta(Date date) {

		if (date != null) {
			SimpleDateFormat out = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");
			String result = out.format(date);
			return result;

		} else {
			return "DATA NULA";
		}

	}

	public String converteDataParaString(Date date) {

		if (date != null) {
			SimpleDateFormat out = new SimpleDateFormat("dd/MM/YYYY");
			String result = out.format(date);
			return result;

		} else {
			return "DATA NULA";
		}

	}
	
	
	
	
	public double validarOtPositivo(double total, double metrica) {
		double valor = (metrica * 100) / total;
		return valor;
	}
	
	
	
	public String converteDoubleString(double valor) {
		DecimalFormat fmt = new DecimalFormat("0.00");
		String string = fmt.format(valor);
		String[] part = string.split("[,]");
		String porc = part[0] + "." + part[1];
		
		return porc;
	}

}
