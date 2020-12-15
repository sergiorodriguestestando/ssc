package net.thucydides.showcase.cucumber.pages;


import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class DatePickPage extends BasePage{
	
	String xpathListaAnos = "//div[@class = 'v-dialog v-dialog--active']//ul[1]/li";
	String xpathListaMeses = "//div[@class = 'v-dialog v-dialog--active']//table//button";
	String xpathListaDias = "//div[@class = 'v-dialog v-dialog--active']//tbody//button";

	@FindBy(xpath = "//div[@class = 'v-dialog v-dialog--active']//div[@class = 'v-picker__title__btn v-date-picker-title__year']")
	WebElementFacade botaoSelecaoAno;
	

	public void selecionarData(String data) {
		if(data.trim().equals("sysdate")) {
			data = obterDataAtual();
		}
		String[] dataF = data.split("/");	
		System.out.println(dataF[2]);
		System.out.println(converterMes(dataF[1]));
		System.out.println(removerZeroDia(dataF[0]));

		clicar(botaoSelecaoAno);
		clicarListaElemento(xpathListaAnos, dataF[2]);
		clicarListaElemento(xpathListaMeses, converterMes(dataF[1]));
		clicarListaElemento(xpathListaDias, removerZeroDia(dataF[0]));
	}

	public String removerZeroDia(String dia) {
		if(Integer.valueOf(dia) < 10) {
			dia = dia.replace("0", "");
		}
		return dia;
	}
	public String converterMes(String mes) {
		String mesExtenso = null;
		switch (mes) {
		case "01":
			mesExtenso = "JAN.";
			break;
		case "02":
			mesExtenso = "FEV.";
			break;
		case "03":
			mesExtenso = "MAR.";
			break;
		case "04":
			mesExtenso = "ABR.";
			break;
		case "05":
			mesExtenso = "MAI.";
			break;
		case "06":
			mesExtenso = "JUN.";
			break;
		case "07":
			mesExtenso = "JUL.";
			break;
		case "08":
			mesExtenso = "AGO.";
			break;
		case "09":
			mesExtenso = "SET.";
			break;
		case "10":
			mesExtenso = "OUT.";
			break;
		case "11":
			mesExtenso = "NOV.";
			break;
		case "12":
			mesExtenso = "DEZ.";
			break;
		}
		return mesExtenso;
	}
}
