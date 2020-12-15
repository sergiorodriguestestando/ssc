package net.thucydides.showcase.cucumber.steps;

import org.junit.Assert;

import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class SomarSteps {
	
	int n1, n2, soma;
	
	
	
	@Quando("^informar um numero (\\d+)$")
	public void informar_um_numero(int arg1) {
	   n1 = arg1;
	}


	@Quando("^informar o numero (\\d+)$")
	public void informar_o_numero(int arg1) {
		 n2 = arg1;
	}

	@Então("^o resultado é (\\d+)$")
	public void o_resultado_é(int arg1) {
	  Assert.assertEquals(n1+n2, 4);
	}

	

}
