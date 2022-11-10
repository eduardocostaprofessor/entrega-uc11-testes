package teste.senai;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteNavegabilidade {
	
	ChromeDriver driver;// driver do Google Chrome
	
	
	//pré teste
	@Before
	public void PreTeste() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver\\chromedriver.exe");
		
//		driver = new ChromeDriver();//abrir o navegador
//		driver.manage().window().maximize();
//		driver.get("https://informatica.sp.senai.br/");
		
		driver = new ChromeDriver();//abrir o navegador
		driver.manage().window().maximize();
		driver.get("https://informatica.sp.senai.br/");
		
	}
	
	//teste
	@Test
	public void TesteNagegacao() {
		driver.findElement(By.id("Busca1_txtFiltro")).sendKeys("Excel");
		driver.findElement(By.id("Busca1_txtFiltro")).sendKeys(Keys.ENTER);
		//driver.findElement(By.id("Busca1_btnBusca")).click();
	}
	
	//pós teste
	//@After
//	public void PosTeste() {
//		driver.quit();
//	}
}