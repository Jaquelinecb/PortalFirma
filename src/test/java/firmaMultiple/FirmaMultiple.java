package firmaMultiple;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonMethods.variablesGlobales;
import driverSetup.DriverSetup;
public class FirmaMultiple {
	WebDriver driver = DriverSetup.setupDriver();
	
	
	@BeforeTest
	public void starWebDriver() throws InterruptedException {
		driver.get(variablesGlobales.HOME_PAGE);
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		
	}
  @Test(priority=1)
  public void cargaMasivaTresDocumentos() throws InterruptedException {
	driver.findElement(By.id("loginForm_user_login")).click();
	driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario1");
	driver.findElement(By.id("btnLogin")).click();
	driver.findElement(By.id("loginForm_user_password")).click();
	driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
	driver.findElement(By.id("btnLogin")).click();
	Thread.sleep(1000);
	//driver.findElement(By.cssSelector(".ui-dialog-buttonset > button")).click();
	driver.findElement(By.cssSelector("li > a > .selected")).click();
	driver.findElement(By.id("signAction_uploadDocument_uploadDoc")).sendKeys("C:\\\\Users\\\\cuaht\\\\.eclipse\\\\PortalFirma\\\\src\\\\test\\\\java\\\\Archivos\\\\PIE DE PÁGINA.pdf");
	Thread.sleep(2000);
	
	driver.findElement(By.cssSelector(".addDocument > .label")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector(".tableFileDocuments:nth-child(2) #signAction_uploadDocument_uploadDoc")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\PIE DE PÁGINA.pdf");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".tableFileDocuments:nth-child(2) .estilo > .label")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".tableFileDocuments:nth-child(3) #signAction_uploadDocument_uploadDoc")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\Hoja de respuestas - Examen Ximena.pdf");
    Thread.sleep(2000);
    driver.findElement(By.id("btnAceptar")).click(); 
    
    //Validar estas lineas*
    driver.findElement(By.cssSelector(".ui-button-text")).click();
	Thread.sleep(3000);
	
	
	driver.findElement(By.id("signAction_uploadDocument_uploadDoc")).sendKeys("C:\\\\Users\\\\cuaht\\\\.eclipse\\\\PortalFirma\\\\src\\\\test\\\\java\\\\Archivos\\\\PIE DE PÁGINA.pdf");
	Thread.sleep(2000);
	
	driver.findElement(By.id("idSignerName")).click();
    driver.findElement(By.id("idSignerName")).sendKeys("Usuario1");
    driver.findElement(By.cssSelector("#btnSearch > #iniciar")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("jqg_gridSearchSigner_1")).click();
    driver.findElement(By.cssSelector("#btnAdd > #iniciar")).click();
    driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).click();
	driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).sendKeys("2");
    driver.findElement(By.cssSelector(".ui-button:nth-child(2) > .ui-button-text")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".ui-button-text")).click();


    driver.findElement(By.id("idSignerName")).click();
    driver.findElement(By.id("idSignerName")).sendKeys("Usuario1");
    driver.findElement(By.cssSelector("#btnSearch > #iniciar")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("jqg_gridSearchSigner_1")).click();
    driver.findElement(By.cssSelector("#btnAdd > #iniciar")).click();
    driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).click();
	driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).sendKeys("1");
    driver.findElement(By.cssSelector(".ui-button:nth-child(2) > .ui-button-text")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".ui-button-text")).click();
    
	
	
	
	driver.findElement(By.cssSelector("li:nth-child(3) .selected")).click();   
    Thread.sleep(3000);
	driver.findElement(By.cssSelector(".toggle")).click();
	driver.findElement(By.cssSelector(".negative > .label")).click();
}

@AfterTest
 public void closeDriver() {
	 driver.close();	
 }
}	