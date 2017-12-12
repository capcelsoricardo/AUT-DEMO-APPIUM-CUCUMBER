package openshopio.steps;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import openshopio.setup.SetUp;
import openshopio.pages.PageBemVindo;
import openshopio.pages.PageInicio;

public class OpenShopIOSteps extends SetUp {			
	
	@Before
	public static void openShopIODriver() {
		pageBemVindo = new PageBemVindo(driver);
		pageInicio = new PageInicio(driver);
	}
	
	public static PageBemVindo pageBemVindo;
	public static PageInicio pageInicio;	
	
	@Given("^Que o sistema esta na tela de categoria Men$")
	public void que_o_sistema_est_na_tela_de_categoria_Men() throws Throwable {	        		
		pageBemVindo.clickButtonSkip();	
		pageInicio.desceScroll();
		pageInicio.clickMen();
		
	}

	@When("^Seleciono a opcao Men s Watches$")
	public void seleciono_a_opcao_Men_s_Watches() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Clico em um produto$")
	public void clico_em_um_produto() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Clico no botao Buy$")
	public void clico_no_botao_Buy() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Clico no carrinho$")
	public void clico_no_carrinho() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}		
}
