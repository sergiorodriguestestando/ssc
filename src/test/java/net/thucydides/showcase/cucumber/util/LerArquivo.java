package net.thucydides.showcase.cucumber.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Random;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class LerArquivo {

	private String primeiroNome;
	private String sobreNome;
	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	private String logradouro;
	private String bairro;
	private String cidade;
	private String time;
	private String empregador;
	private static Random random = new Random();

	public String getEmpregador() {
		return empregador;
	}

	public void setEmpregador(String empregador) {
		this.empregador = empregador;
	}

	public String getNome() {
		return primeiroNome;
	}

	public void setNome(String nome) {
		this.primeiroNome = nome;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public void Ler() throws IOException {
		File arquivoE = new File("src\\test\\resources\\Parametros\\Parametros.xls");
		String arquivoUsuarioSenha = arquivoE.getAbsolutePath();
		FileInputStream arquivo = null;

		try {
			arquivo = new FileInputStream(new File(arquivoUsuarioSenha));

			HSSFWorkbook workbook = new HSSFWorkbook(arquivo);

			HSSFSheet sheetMassa = workbook.getSheetAt(0);

			Iterator<Row> rowIterator = sheetMassa.iterator();

			while (rowIterator.hasNext()) {
				Row row = rowIterator.next();
				Iterator<Cell> cellIterator = row.cellIterator();

				// Descantando a primeira linha com o header
				if (row.getRowNum() == 0) {
					continue;
				}

				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();
					switch (cell.getColumnIndex()) {
					case 0:
						setNome(cell.getStringCellValue());
						// System.out.println(getNome());
						break;
					case 1:
						setLogradouro(cell.getStringCellValue());
						// System.out.println(getLogradouro());
						break;
					case 2:
						setBairro(cell.getStringCellValue());
						// System.out.println(getBairro());
						break;
					case 3:
						setCidade(cell.getStringCellValue());
						// System.out.println(getCidade());
						break;
					case 4:
						setTime(cell.getStringCellValue());
						// System.out.println(getTime());
						break;
					case 5:
						setEmpregador(cell.getStringCellValue());
						// System.out.println(getTime());
						break;
						
					case 6:
						setSobreNome(cell.getStringCellValue());
						// System.out.println(getTime());
						break;
					}
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Arquivo Excel não encontrado!");
		} finally {
			try {
				if (arquivo != null)
					arquivo.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

	}

	public static int numeroQualquer() {
		int nrInicial = 0;
		int nrFinal = 1000000;
		int sorteio = random.nextInt(nrFinal - nrInicial); // Tamanho do intervalo
		return sorteio + nrInicial;
	}

}
