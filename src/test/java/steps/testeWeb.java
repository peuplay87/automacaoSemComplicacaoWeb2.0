package br.com.chrosacademy.autamacaoWeb;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;


public class TesteWeb {
    ChromeDriver driver;

    @Before
    public void inicializaTeste(){
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://planoscelular.claro.com.br/claro/pt/");

    }

    @Test
    public void primeiroTeste(){

        String xpathTitulo = "//div[2]/div/div/div[1]/h3";


        WebElement txtTitulo = driver.findElement(By.xpath(xpathTitulo));
        String titulo = txtTitulo.getText();
        assertEquals("O básico para o dia a dia", titulo);
    }

    @After
    public void finalizaTeste(){
        driver.quit();

    }

}

