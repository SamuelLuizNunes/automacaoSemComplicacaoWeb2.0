package br.com.chronosAcademy.automacaoWeb;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.*;

public class WebTest {

    @Test
    public void primeiroTeste(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.chronosacademy.com.br");
        String xpathTitulo = "/html/body/div/div/div/section[2]/div[3]/div/div/div[1]/div/h4";
        WebElement txtTitulo = driver.findElement(By.xpath(xpathTitulo));
        String titulo = txtTitulo.getText();
        assertEquals("Porque Tempo É Conhecimento.", titulo);

        driver.quit();
    }

    @Test
    public void segundoTeste(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.chronosacademy.com.br");
        String xpathLinkCursos = "/html/body/div/div/div/section[2]/div[3]/div/div/div[2]/div/div/a";
        WebElement linkCursos = driver.findElement(By.xpath(xpathLinkCursos));
        linkCursos.click();
        String titulo = driver.getTitle();
        assertEquals("Cursos ChronosAcademy", titulo);

        driver.quit();
    }
    
}
