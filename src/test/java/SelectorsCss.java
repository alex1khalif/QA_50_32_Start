import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class SelectorsCss {
     WebDriver driver = new ChromeDriver();



     @Test
    public void phoneBookTest()
     {
         driver.manage().window().maximize();
         driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // driver.get("https://telranedu.web.app/home"); // если хотим на новую страницу то get
         driver.navigate().to("https://telranedu.web.app/home"); // если на страницу на которой уже были то навигатор
         pause(3);
         WebElement btnAbout = driver.findElement(By.cssSelector("a[href='/about']"));
         btnAbout.click();
         //WebElement divRoot = driver.findElement(By.cssSelector("div[id='root']"));
         //WebElement divRoot = driver.findElement(By.id("root"));
         //WebElement divRoot = driver.findElement(By.cssSelector("#root"));
         //WebElement divRoot = driver.findElement(By.cssSelector("*[id='root']")); // * означает любой элемент
         //WebElement divRootClass = driver.findElement(By.cssSelector("*[class='container']"));
         //WebElement divRootClass = driver.findElement(By.cssSelector(".container")); . - сокращение названия класса
         //WebElement divRootClass = driver.findElement(By.className("container"));
         WebElement divRootClass = driver.findElement(By.cssSelector("div[class='container']"));
         System.out.println(divRootClass.getAttribute("id"));
         pause(3);
         driver.navigate().refresh();
         pause(3);
         driver.navigate().to("https://telranedu.web.app/login");
         pause(3);
         driver.navigate().back();
         //driver.close();
         driver.quit();
     }
     static void pause(int time)
     {
         try {
             Thread.sleep(time * 1000L);
         } catch (InterruptedException e) {
             throw new RuntimeException(e);
         }
     }

     @Test
    public void iLcarroTest()
    {
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://ilcarro.web.app/login?url=%2Fsearch");
        pause(3);

        WebElement btnSearch = driver.findElement(By.cssSelector("a[href='/search']"));
        btnSearch.click();
        pause(3);
        WebElement btnTermsOfUse = driver.findElement(By.id("2"));
        btnTermsOfUse.click();
        pause(3);
        WebElement btnSignUp = driver.findElement(By.linkText("Sign up"));
        System.out.println("Class of Sign Up - " + btnSignUp.getAttribute("class"));
        btnSignUp.click();
        pause(3);
        driver.navigate().back();
        pause(3);
        driver.quit();


    }

    @Test
    public void iLcarroTest2()
    {
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://ilcarro.web.app/search");
        pause(3);
        WebElement logoHeader = driver.findElement(By.cssSelector("img[alt='logo']"));
        logoHeader.click();
        pause(3);
        // .navigation-link
        // a[class='navigation-link']
        // a.navigation-link
        // *[class='navigation-link']
        // [class='navigation-link']
        WebElement btnSearch = driver.findElement(By.className("navigation-link"));
        btnSearch.click();
        pause(3);
        // a[id='1']
        // [id='1']
        //WebElement btnLetTheCarWork = driver.findElement(By.id("1"));
        //WebElement btnLetTheCarWork = driver.findElement(By.linkText("Let the car work"));
        WebElement btnLetTheCarWork = driver.findElement(By.partialLinkText("work"));
        btnLetTheCarWork.click();
        pause(3);
        //a[href*='/of-use'] * включает
        //a[href^='/terms'] ^ начинается
        //a[href$='/-use'] $ заканчивается
        //a.navigation-link[href='/terms-of-use']
        WebElement btnTermsOfUse = driver.findElement(By.cssSelector("[href='/terms-of-use']"));
        btnTermsOfUse.click();
        pause(3);
        WebElement btnSignUp = driver.findElement(By.cssSelector("div.header a.navigation-link:nth-child(5)"));
        btnSignUp.click();
        pause(3);
        WebElement btnLogIn = driver.findElement(By.cssSelector("div.header a.navigation-link:last-child"));
        btnLogIn.click();
        pause(3);

        driver.navigate().to("https://ilcarro.web.app/search");
        pause(2);
        driver.quit();



    }


}
