package com.tcs.service.test.cucumbertest

import Store
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import org.assertj.core.api.Assertions

/**
 * This is the basic step definations against the scenarios.feature
 */
class BasicStepDef : CucumberIntegrationTest() {

    private var headers = mutableMapOf<String, String>()

    @Given("^I call (.*)\$")
    @Throws(Throwable::class)
    fun getOfferTest(uri: String) {
        baseUri = baseUri + uri
    }

    @Given("^I set (.*) header to (.*)\$")
    fun settingHeader(headerName: String, headerValue: String) {
        headers[headerName] = headerValue
    }

    @When("Send a GET HTTP request")
    fun send_a_get_http_request() {
        executeGet(baseUri)
    }

    @Then("response code should be {int}")
    fun checkResponseCode(statusCode: Int?) {
        val currentStatusCode: Int = latestResponse.getStatusCodeValue()
        Assertions.assertThat(currentStatusCode).isEqualTo(statusCode)
    }

    @Then("^cluster is (.*)\$")
    fun checkDescription(value: Int) {
        val mapper = jacksonObjectMapper()
        mapper.registerKotlinModule()
        val result: Store = mapper.convertValue(latestResponse.body?.response, Store::class.java)
        Assertions.assertThat(result.cluster == value)
    }
}