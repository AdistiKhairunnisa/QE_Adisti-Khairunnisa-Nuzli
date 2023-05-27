package starter.helper;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class DoActionSepulsa {
    public static Performable fillUsername(String username){
        return Task.where("{0} fill username field" + username,
                Enter.theValue(username).into( starter.helpers.SepulsaPage.USERNAME_FIELD));
    }

    public static Performable fillPassword(String password){
        return Task.where("{0} fill username field" + password,
                Enter.theValue(password).into( starter.helpers.SepulsaPage.PASSWORD_FIELD));
    }

    public static Performable clickLoginButton(){
        return Task.where("{0} click login button",
                Click.on( starter.helpers.SepulsaPage.LOGIN_BUTTON));
    }

    public static Performable clickPulsaButton(){
        return Task.where("{0} click pulsa button",
                Click.on( starter.helpers.SepulsaPage.PULSA_BUTTON));
    }

    public static Performable fillNumber(String number){
        return Task.where("{0} fill number field" + number,
                Enter.theValue(number).into( starter.helpers.SepulsaPage.FIELD_NUMBER));
    }

    public static Performable clickPulsa5000(){
        return Task.where("{0} click pulsa 5000",
                Click.on( starter.helpers.SepulsaPage.PULSA_5000));
    }

    public static Performable clickDana(){
        return Task.where("{0} click dana ",
                Click.on( starter.helpers.SepulsaPage.DANA_PAYMENT_METHOD));
    }

    public static Performable paymentButton(){
        return Task.where("{0} click payment button ",
                Click.on( starter.helpers.SepulsaPage.PAYMENT_BUTTON));
    }

}