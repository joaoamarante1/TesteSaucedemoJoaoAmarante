package Executa;

import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

import driver.Drivers;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "src/test/resources/features",
		glue = "steps",
		tags = "@test",
		dryRun = false,
		monochrome = true,
		plugin = {
				"pretty", "html:target/report-cucumber.html" }, 
		snippets = SnippetType.CAMELCASE

)

public class Executa extends Drivers {

	public static void abrirNavegador() {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("https://www.saucedemo.com/");
		  driver.manage().window().maximize();
		 
	}

	}

