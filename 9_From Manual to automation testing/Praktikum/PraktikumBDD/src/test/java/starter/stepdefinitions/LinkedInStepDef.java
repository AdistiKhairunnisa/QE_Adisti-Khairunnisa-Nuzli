package starter.stepdefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.Managed;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class LinkedInStepDef extends UIInteractions {
    @Managed(driver = "chrome")
    WebDriver driver;

    @Given("User is on LinkedIn login page")
    public void user_Is_On_LinkedIn_LoginPage() {
       driver.navigate().to( "https://linkedin.com" );
        String title = driver.getTitle();
        Assert.assertEquals("LinkedIn: Log In or Sign Up", title);
    }

    @When("User input email to field email")
    public void userInputEmailToFieldEmail() {
        WebElement usernamefield = driver.findElement( By.id( "session_key" ) );
        usernamefield.sendKeys( "fulanah" );
    }

    @And("User input password to field password")
    public void userInputPasswordToFieldPassword() {
       // WebElement usernamefield = driver.findElement( By.id( "session_password" ) );
        //usernamefield.sendKeys( "fulanah" );
    }

    @And("User click login")
    public void user_Click_Login() {
        //WebElement buttonLogin = driver.findElement( By.xpath( "// button[contains(text(), 'Sign In')]" ) );
        //buttonLogin.click();
    }

    @Then("User is on homepage")
    public void user_Is_On_Homepage() {
    }

    @Given("user is on login page")
    public void userIsOnLoginPage() {
    }

    @And("user input correct username")
    public void userInputCorrectUsername() {
    }

    @And("user input correct password")
    public void userInputCorrectPassword() {
    }

    @And("user click login")
    public void userClickLogin() {
    }

    @Then("user is on homepage")
    public void userIsOnHomepage() {
    }

    @And("user input post")
    public void userInputPost() {
    }

    @And("user click post")
    public void userClickPost() {
    }

    @Then("user see their post in their feeds")
    public void userSeeTheirPostInTheirFeeds() {
    }

    @And("user input blank post")
    public void userInputBlankPost() {
    }

    @Then("user can't click button post")
    public void userCanTClickButtonPost() {
    }

    @Given("user is on LinkedIn login page")
    public void userIsOnLinkedInLoginPage() {
    }

    @And("user click send post")
    public void userClickSendPost() {
    }

    @And("user click comment button")
    public void userClickCommentButton() {
    }

    @And("user input comment")
    public void userInputComment() {
    }

    @And("user click send comment")
    public void userClickSendComment() {
    }

    @And("user input blank comment")
    public void userInputBlankComment() {
    }

    @And("user click button like")
    public void userClickButtonLike() {
    }

    @And("user choose emoticon like")
    public void userChooseEmoticonLike() {
    }

    @Then("user can like and see her reaction")
    public void userCanLikeAndSeeHerReaction() {
    }
}
