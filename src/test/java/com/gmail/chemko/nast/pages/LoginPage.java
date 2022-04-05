package com.gmail.chemko.nast.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private SelenideElement

            loginPage = $(".navbar-pc__icon--profile"),
            phoneInput = $(".input-item"),
            requestCodeButton = $("#requestCode"),
            captchaImage = $(".form-block__captcha-img");


    @Step("Click on the icon 'Войти'")
    public LoginPage  goToLoginPage() {
        loginPage.click();

        return this;
    }

    @Step("Enter the phone number in the input field")
    public LoginPage inputPhoneNumber() {
        phoneInput.click();
        phoneInput.sendKeys("123456789");

        return this;
    }

    @Step("Click on the button 'Получить код'")
    public LoginPage clickOnRequestCodeButton() {
        requestCodeButton.click();

        return this;
    }

    @Step("Check that captcha has appeared")
    public LoginPage checkThatCaptchaAppeared() {
        captchaImage.shouldBe(visible);

        return this;
    }
}
