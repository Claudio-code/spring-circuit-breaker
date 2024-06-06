package com.circuit.breaker;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@CucumberContextConfiguration
public class ZipCodeControllerStepDefs extends IntegrationTests {

    @When("the client calls GET zipcode")
    public void theClientCallsHello() {
    }

    @Then("the client receives status code of {int}")
    public void theClientReceivesStatusCodeOf(int arg0) throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/address").queryParam("zip", "21312"))
                .andExpect(MockMvcResultMatchers.status().isOk());

    }

    @And("the client receives server version hello")
    public void theClientReceivesServerVersionHello() {
    }
}
