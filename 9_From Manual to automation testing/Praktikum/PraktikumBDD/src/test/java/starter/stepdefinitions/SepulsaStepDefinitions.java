package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SepulsaStepDefinitions {
    @Given("User is on sepulsa login page")
    public void userIsOnSepulsaLoginPage() {
        System.out.println("user is at login page sepulsa");
    }

    @When("User input correct email to field email")
    public void userInputCorrectEmailToFieldEmail() {
        System.out.println("user input correct email");
    }

    @And("User input correct password to field password")
    public void userInputCorrectPasswordToFieldPassword() {
        System.out.println("user input correct password");
    }

    @And("User input incorrect email to field email")
    public void userInputIncorrectEmailToFieldEmail() {
        System.out.println("user input incorrect email");
    }

    @Then("User cannot login and still on login page")
    public void userCannotLoginAndStillOnLoginPage() {
        System.out.println("user cannot login and still in login page");
    }

    @And("User input incorrect password to field password")
    public void userInputIncorrectPasswordToFieldPassword() {
        System.out.println("user input incorrect password");
    }

    @Given("user is on sepulsa login page")
    public void user_Is_On_Sepulsa_LoginPage() {
    }

    @Then("user is on sepulsa home page")
    public void userIsOnSepulsaHomePage() {
    }

    @And("user choose the product")
    public void userChooseTheProduct() {
    }

    @And("user fill the required data")
    public void userFillTheRequiredData() {
    }

    @Then("user can continue to pay the bill")
    public void userCanContinueToPayTheBill() {
    }

    @And("user choose the paying method")
    public void userChooseThePayingMethod() {
    }

    @And("user click pay button")
    public void userClickPayButton() {
    }

    @Then("user successfully pay the product")
    public void userSuccessfullyPayTheProduct() {
    }

    @And("user fill blank the required data")
    public void userFillBlankTheRequiredData() {
    }

    @Then("user cannot choose paying method")
    public void userCannotChoosePayingMethod() {
    }

    @And("user did not choose the paying method")
    public void userDidNotChooseThePayingMethod() {
    }

    @Then("user cannot pay the product")
    public void userCannotPayTheProduct() {
    }

    @Then("user cannot continue to pay the bill")
    public void userCannotContinueToPayTheBill() {
    }
}
