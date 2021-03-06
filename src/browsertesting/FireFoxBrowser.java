package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowser {
    public static void main(String[] args) {
        String baseUrl="https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        //Launch the URL
        driver.get(baseUrl);

        //Maximise window
        driver.manage().window().maximize();

        //Get and print the title of the page
        String getTitle= driver.getTitle();
        System.out.println(getTitle);

        //Get Current URL
        System.out.println("Current URL =" + driver.getCurrentUrl());


        //Find the email field element
        WebElement emailField = driver.findElement(By.id("Email"));
        //Sending email to email field element
        emailField.sendKeys("umipatel14@gmail.com");

        //Find the password field element
        WebElement passwordField = driver.findElement(By.name("Password"));
        //Sending password to password field element
        passwordField.sendKeys("umi123");

        //Close the browser
        driver . close();

    }
}
