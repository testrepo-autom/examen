package Examen;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestExamen {

    private WebDriver driver;

    @Before
    public void SetUp()
    {
        System.setProperty("webdriver.chrome.driver","src/main/resources/Drivers/ChromeDriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com.mx/");
    }

    @Test
    public void Examen() throws InterruptedException
    {
        WebElement inputLogin = driver.findElement(By.xpath("//input[@name='q']"));
        inputLogin.click();
        inputLogin.clear();
        inputLogin.sendKeys("Alexas");
        inputLogin.submit();
        Thread.sleep(3000);

    }

    @After
    public void tearDown()
    {
        //Cierra la instancia del navegador
        driver.quit();

        //actualiza 25/06/2021
        
    }
}
