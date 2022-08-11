package steps;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public class Customer {

    WebDriver driver;


    @Given("Customer already in a home page")
    public void customer_already_in_a_home_page() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.amazon.in/");
        Thread.sleep(1000);
    }
    @When("Customer try to click hamburger menu")
    public void customer_try_to_click_hamburger_menu() {
        driver.findElement(By.cssSelector("a[id='nav-hamburger-menu']")).click();
    }
    @Then("Customer able to open hamburger menu")
    public void customer_able_to_open_hamburger_menu() {
    }
    @When("Customer try to click TV, Appliances, Electronics option")
    public void Customer_try_to_click_TV_Appliances_Electronics_option() throws InterruptedException {

        driver.findElement(By.partialLinkText("TV, Appliances, Electronics")).click();
        Thread.sleep(3000);
    }
    @Then("Customer success to click TV, Appliances, Electronics option")
        public void Customer_success_to_click_TV_Appliances_Electronics_option(){
    }

    @When("Customer try to click Televisions")
    public void Customer_try_to_click_Televisions(){
        driver.findElement(By.partialLinkText("Televisions")).click();
    }
    @Then("Customer able to click Televisions")
    public void Customer_able_to_click_Televisions(){
    }
    @When("Customer try to select brand Samsung")
    public void Customer_try_to_select_brand_Samsung(){
        JavascriptExecutor jse=(JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0, 2500);");
       // Thread.sleep(3000);
        driver.findElement(By.linkText("Samsung")).click();
    }
    @Then("Customer able to select brand Samsung")
    public void Customer_abl_to_select_brand_Samsung(){
    }
    @When("Customer try to click feature")
    public void Customer_try_to_click_feature (){
        driver.findElement(By.xpath("//span[@id='a-autoid-0-announce']")).click();
    }
    @Then("Customer able to click feature")
    public void Customer_able_to_click_feature(){
    }

    @When("Customer try to select price high to low")
    public void customer_try_to_select_price_high_to_low() throws InterruptedException {
        driver.findElement(By.linkText("Price: High to Low")).click();
        //driver.findElement(By.xpath("//a[@id='s-result-sort-select_2']")).click();

        Thread.sleep(3000);
    }
    @Then("Customer able to select price high to low")
    public void Customer_able_to_select_price_high_to_low(){
    }
    @When("Customer try to click on the second highest priced item")
    public void customer_try_to_click_on_the_second_highest_priced_item(){
        driver.findElement(By.linkText("Samsung 214 cm (85 inches) 4K Ultra HD Smart Neo QLED TV QA85QN90BAKXXL (Titan Black)")).click();
    }
    @Then("Customer able to click on the second highest priced item")
    public void Customer_able_to_click_on_the_second_highest_priced_item (){
    }

    @When("Customer want to check about this item")
    public void Customer_want_to_check_about_this_item() throws InterruptedException {
        driver.findElement(By.linkText("Samsung 214 cm (85 inches) 4K Ultra HD Smart Neo QLED TV QA85QN90BAKXXL (Titan Black)")).click();
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 900);");
        Thread.sleep(3000);
    }
    @Then ("Customer able to check about this item")
    public void Customer_able_to_check_about_this_item(){
    }
}



//  driver.findElement(By.linkText("Samsung 214 cm (85 inches) 4K Ultra HD Smart Neo QLED TV QA85QN90BAKXXL (Titan Black)")).click();
//        String MainWindow = driver.getWindowHandle();
//        Set<String> s1 = driver.getWindowHandles();
//        Iterator<String> i1 = s1.iterator();
//
//        while (i1.hasNext()) {
//            String ChildWindow = i1.next();
//            if (!MainWindow.equalsIgnoreCase(ChildWindow)) {
//                driver.switchTo().window(ChildWindow);
//                Thread.sleep(2000);
//            }
//        }



