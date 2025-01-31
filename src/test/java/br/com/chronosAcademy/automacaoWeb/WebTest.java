package br.com.chronosAcademy.automacaoWeb;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.*;

public class WebTest {
    public WebDriver driver;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.chronosacademy.com.br");
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void primeiroTeste(){
        String xpathTitulo = "//section[2]//h4";
        WebElement txtTitulo = driver.findElement(By.xpath(xpathTitulo));
        String titulo = txtTitulo.getText();
        assertEquals("Porque Tempo É Conhecimento.", titulo);
    }

    @Test
    public void segundoTeste(){
        String xpathLinkCursos = "//div[3]/div/div/div[2]//a";
        WebElement linkCursos = driver.findElement(By.xpath(xpathLinkCursos));
        linkCursos.click();
        String titulo = driver.getTitle();
        assertEquals("Cursos ChronosAcademy", titulo);
    }
    
}