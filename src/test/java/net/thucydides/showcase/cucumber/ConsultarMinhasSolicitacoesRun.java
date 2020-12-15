package net.thucydides.showcase.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
				 features = "src/test/resources/features/consultar/ECDU002_Consultar_Minhas_Solicitacoes_de_Servicos_ComerciaisNOVO.feature" 
				,plugin = {"pretty", "html:target/site"}
				,monochrome = true
				,dryRun = false
				,glue = "net.thucydides.showcase.cucumber.steps"
			//	,tags = {"not @ignore"}
				)
public class ConsultarMinhasSolicitacoesRun {

}
