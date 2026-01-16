import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class SelectorsXpath {
    WebDriver driver = new ChromeDriver();


    @Test
    public void phonebookTest()
    {
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://telranedu.web.app/home");
        pause(2);
        //WebElement btnAbout = driver.findElement(By.cssSelector("a[href='/about']"));
        WebElement btnAbout = driver.findElement(By.xpath("//a[@href='/about']"));
        // //*[@href='/about']
        // //*[text()='ABOUT']
        btnAbout.click();
        pause(2);
        WebElement btnLogin = driver.findElement(By.xpath("//*[text()='LOGIN']"));
        btnLogin.click();
        pause(2);
        WebElement fieldEmail = driver.findElement(By.xpath("//input[@placeholder='Email']"));
        int i = new Random().nextInt(1000);
        fieldEmail.sendKeys("alexkhalifafa" + i + "@gmail.com");
        pause(2);
        WebElement fieldPassword = driver.findElement(By.xpath("//*[@name='password']"));
        fieldPassword.sendKeys("Password123!");
        pause(2);
        WebElement btnRegistration = driver.findElement(By.xpath("//*[@name='registration']"));
        btnRegistration.click();
        pause(2);
        WebElement btnSignOut = driver.findElement(By.xpath("//button[text()='Sign Out']"));
        btnSignOut.click();
        pause(2);


        List<WebElement> buttons = driver.findElements(By.xpath("//button"));
        System.out.println(buttons);
        System.out.println(buttons.get(1).getText());
        driver.quit();
    }

    @Test
    public void iLcarroXpathTest()
    {
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://ilcarro.web.app/search ");
        pause(2);
        WebElement btnLogIn = driver.findElement(By.xpath("//*[text()='Log in']"));
        btnLogIn.click();
        pause(2);
        WebElement fieldEmail = driver.findElement(By.xpath("//input[@id='email']"));
        fieldEmail.sendKeys("alex1khalif999@gmail.com");
        pause(2);
        WebElement fieldPassword = driver.findElement(By.xpath("//*[@ng-reflect-name='password']"));
        // //form/div[last()]/input  вниз
        fieldPassword.sendKeys("Qwerty12345!");
        pause(2);
        WebElement btnYalla = driver.findElement(By.xpath("//button[@type='submit']"));
        // //button[start-with(text(), 'Y’a')]
        btnYalla.click();
        pause(2);
        WebElement btnOk = driver.findElement(By.xpath("//button[@class='positive-button" +
                " ng-star-inserted']"));
        btnOk.click();
        pause(2);
        WebElement btnLogOut = driver.findElement(By.xpath("//a[@ng-reflect-router-link='logout']"));
        btnLogOut.click();
        pause(2);
        driver.get("https://ilcarro.web.app/search");
        driver.quit();
        // //input[@id='password']/../..    - .. это движение вверх по дереву







    }

    static void pause(int time)
    {
        try {
            Thread.sleep(time * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
