package cucmber_Capstone_MedicareSteps;

import org.json.JSONObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Medicare_Steps_Definition {
	

	
	@Given("User Enters Medicare base URL for list of products")
	public void user_enters_medicare_base_url_for_list_of_products() {
		RestAssured
		.given()
		.baseUri("http://localhost:9010")
		.basePath("/get-products")
		.when().get();
	}

	@When("User executes HTTP get method to retrive all products")
	public void user_executes_http_get_method_to_retrive_all_products() {
		RestAssured
		.given()
		.baseUri("http://localhost:9010")
		.basePath("/get-products")
		.when().get()
		.then()
		.log().all();
	}

	@Then("Validate the response status code of products scenario")
	public void validate_the_response_status_code_of_products_scenario() {
		RestAssured
		.given()
		.baseUri("http://localhost:9010")
		.basePath("/get-products")
		.when().get()
		.then()
		.statusCode(200);
	}

	@Given("User Enters Medicare base URL of Retrieving users")
	public void user_enters_medicare_base_url_of_retrieving_users() {
		RestAssured
		.given()
		.baseUri("http://localhost:9010")
		.when().get();
		}

	@When("User executes HTTP get method to retrive all users")
	public void user_executes_http_get_method_to_retrive_all_users() {
		RestAssured
		.given()
		.baseUri("http://localhost:9010")
		.basePath("/get-products")
		.when().get()
		.then()
		.log().all();
	}

	@Then("Validate the response status codeof users scenario")
	public void validate_the_response_status_codeof_users_scenario() {
		RestAssured
		.given()
		.baseUri("http://localhost:9010")
		.basePath("/get-products")
		.when().get()
		.then()
		.statusCode(200);
	}

	@Given("User Enters Medicare base URL of Adding the product")
	public void user_enters_medicare_base_url_of_adding_the_product() {
		RestAssured
		.given()
		.baseUri("http://localhost:9010")
		.when().get();
	}

	@When("User executes HTTP post method to add the product")
	public void user_executes_http_post_method_to_add_the_product() {
		JSONObject objbody=new JSONObject();
		objbody.put("id", 999);
		objbody.put("image", "1.png");
		objbody.put("name", "Disprin");
		objbody.put("category", "medicine");
		objbody.put("brand", "BZ Medico");
		objbody.put("status", 1);
		objbody.put("price", 100);
		RestAssured
		.given()
		.baseUri("http://localhost:9010")
		.basePath("/add-product")
		.contentType(ContentType.JSON)
		.body(objbody)
		.when().post()
		.then()
		.log().all();
	}

	@Then("Validate the response status code of add product scenario")
	public void validate_the_response_status_code_of_add_product_scenario() {
		JSONObject objbody=new JSONObject();
		objbody.put("id", 999);
		objbody.put("image", "1.png");
		objbody.put("name", "Disprin");
		objbody.put("category", "medicine");
		objbody.put("brand", "BZ Medico");
		objbody.put("status", 1);
		objbody.put("price", 100);
		
		RestAssured
		.given()
		.baseUri("http://localhost:9010")
		.basePath("/add-product")
		.contentType(ContentType.JSON)
		.body(objbody)
		.when().post()
		.then()
		.statusCode(200);
	}

	@Given("User Enters Medicare base URL of updating the product")
	public void user_enters_medicare_base_url_of_updating_the_product() {
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.when().get();
	}

	@When("User executes HTTP put method for updating the product")
	public void user_executes_http_put_method_for_updating_the_product() {
		JSONObject objbody=new JSONObject();
		objbody.put("id", 999);
		objbody.put("image", "2.png");
		objbody.put("name", "Disprin+");
		objbody.put("category", "medicine");
		objbody.put("brand", "BZ Medico");
		objbody.put("status", 1);
		objbody.put("price", 120);
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/update-product")
		.contentType(ContentType.JSON)
		.body(objbody)
		.when().put()
		.then().log().all();
	}

	@Then("Validate the response status code")
	public void validate_the_response_status_code() {

		JSONObject objbody=new JSONObject();
		objbody.put("id", 999);
		objbody.put("image", "2.png");
		objbody.put("name", "Disprin+");
		objbody.put("category", "medicine");
		objbody.put("brand", "BZ Medico");
		objbody.put("status", 1);
		objbody.put("price", 120);
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/update-product")
		.contentType(ContentType.JSON)
		.body(objbody)
		.when().put()
		.then()
		.statusCode(200);
	}

	@Given("User Enters Medicare base URL to update the product status")
	public void user_enters_medicare_base_url_to_update_the_product_status() {
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.when().get();
	}

	@When("User executes HTTP put methodfor updating prod status")
	public void user_executes_http_put_methodfor_updating_prod_status() {
		JSONObject objbody=new JSONObject();
		objbody.put("id", 999);
		objbody.put("image", "2.png");
		objbody.put("name", "Disprin+");
		objbody.put("category", "medicine");
		objbody.put("brand", "BZ Medico");
		objbody.put("status", 0);
		objbody.put("price", 120);
		RestAssured
		.given()
		.baseUri("http://localhost:9010")
		.basePath("/update-product-status")
		.contentType(ContentType.JSON)
		.body(objbody)
		.when().put()
		.then().log().all();
	}

	@Then("Validate the response status code of product status")
	public void validate_the_response_status_code_of_product_status() {
		JSONObject objbody=new JSONObject();
		objbody.put("id", 999);
		objbody.put("image", "2.png");
		objbody.put("name", "Disprin+");
		objbody.put("category", "medicine");
		objbody.put("brand", "BZ Medico");
		objbody.put("status", 0);
		objbody.put("price", 120);
		RestAssured
		.given()
		.baseUri("http://localhost:9010")
		.basePath("/update-product-status")
		.contentType(ContentType.JSON)
		.body(objbody)
		.when().put()
		.then()
		.statusCode(200);
	}

	@Given("User Enters Medicare base URL of deleting the product")
	public void user_enters_medicare_base_url_of_deleting_the_product() {
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.when().get();
	}

	@When("User executes HTTP delete method to delete product")
	public void user_executes_http_delete_method_to_delete_product() {
		RestAssured
		.given()
		.baseUri("http://localhost:9010")
		.basePath("/delete-product")
		.queryParam("id", 101)
		.when().delete()
		.then()
		.log().all();
	}

	@Then("Validate the response status code of delete")
	public void validate_the_response_status_code_of_delete() {
		RestAssured
		.given()
		.baseUri("http://localhost:9010")
		.basePath("/delete-product")
		.queryParam("id", 101)
		.when().delete()
		.then()
		.statusCode(200);
	}

}
