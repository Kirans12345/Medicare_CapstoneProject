
Feature: To automating the Medicare API 


  Scenario: Retrieve the list of all products in the store
		Given User Enters Medicare base URL for list of products
    When User executes HTTP get method to retrive all products
    Then Validate the response status code of products scenario
    	
	Scenario: Retrieve the list of all registered users
		Given User Enters Medicare base URL of Retrieving users
    When User executes HTTP get method to retrive all users
    Then Validate the response status codeof users scenario
    
	Scenario: Add the product
		Given User Enters Medicare base URL of Adding the product
    When User executes HTTP post method to add the product
    Then Validate the response status code of add product scenario
	
	
	Scenario: Update the product
		Given User Enters Medicare base URL of updating the product
    When User executes HTTP put method for updating the product
    Then Validate the response status code
	
	Scenario: Update the product status
		Given User Enters Medicare base URL to update the product status
    When User executes HTTP put methodfor updating prod status
    Then Validate the response status code of product status
    
   Scenario: Delete the product
		Given User Enters Medicare base URL of deleting the product
    When User executes HTTP delete method to delete product
    Then Validate the response status code of delete
	


