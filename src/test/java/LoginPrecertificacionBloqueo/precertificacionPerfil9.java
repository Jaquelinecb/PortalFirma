package LoginPrecertificacionBloqueo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonMethods.variablesGlobales;
import driverSetup.DriverSetup;
import navPages.userPrecertificacion9;
public class precertificacionPerfil9 {
	WebDriver driver = DriverSetup.setupDriver();
	userPrecertificacion9 login = new userPrecertificacion9(driver);
	
	
	@BeforeTest
	public void starWebDriver() {
		driver.get(variablesGlobales.HOME_PAGE);
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
	}
	
	//@Test(enabled=false)
	@Test(priority=7)
		public void precertificacion9HP() throws InterruptedException {
		driver.get(variablesGlobales.HOME_PAGE);
		login.login(variablesGlobales.USER_LOGIN_PRE_9);
	    driver.findElement(By.id("idShowPassword")).click();
	    driver.findElement(By.id("idPasswordOld")).click();
	    driver.findElement(By.id("idPasswordOld")).sendKeys("12121212Qw.");
	    driver.findElement(By.id("idPassword")).click();
	    driver.findElement(By.cssSelector(".rowPass:nth-child(6)")).click();
	    driver.findElement(By.id("idPassword")).sendKeys("12121212Qw.");
	    driver.findElement(By.id("idPasswordVerify")).click();
	    driver.findElement(By.id("idPasswordVerify")).sendKeys("12121212Qw.");
	    driver.findElement(By.xpath("//div[2]/input[2]")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\LoginPrecertificacionBloqueo\\Javier.cer");
	    /*driver.findElement(By.id("iniciar")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector(".toggle")).click();
	    driver.findElement(By.cssSelector(".negative > .label")).click();
	   Thread.sleep(3000);
	   */
	 }
	
	@Test(priority=1)
	public void dejarCamposVacios() throws InterruptedException {
    driver.get(variablesGlobales.HOME_PAGE);
	login.login(variablesGlobales.USER_LOGIN_PRE_9);
    driver.findElement(By.id("idShowPassword")).click();
    driver.findElement(By.id("idPasswordOld")).click();
    driver.findElement(By.id("idPassword")).click();
    driver.findElement(By.id("idPasswordVerify")).click();
    driver.findElement(By.id("iniciar")).click();
    Thread.sleep(3000);
    driver.findElement(By.cssSelector(".ui-dialog-buttonset > button")).click();
    Thread.sleep(2000);
 }
	
	@Test(priority=2)
	public void clavesNuevasDiferentes() throws InterruptedException {
	driver.get(variablesGlobales.HOME_PAGE);
	login.login(variablesGlobales.USER_LOGIN_PRE_9);
    driver.findElement(By.id("idShowPassword")).click();
    driver.findElement(By.id("idPasswordOld")).click();
    driver.findElement(By.id("idPasswordOld")).sendKeys("12121212Qw.");
    driver.findElement(By.id("idPassword")).click();
    driver.findElement(By.cssSelector(".rowPass:nth-child(6)")).click();
    driver.findElement(By.id("idPassword")).sendKeys("12128212Qw.");
    driver.findElement(By.id("idPasswordVerify")).click();
    driver.findElement(By.id("idPasswordVerify")).sendKeys("121dg12Qw.");
    driver.findElement(By.xpath("//div[2]/input[2]")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\LoginPrecertificacionBloqueo\\Javier.cer");
    driver.findElement(By.id("iniciar")).click();
    Thread.sleep(3000);
    driver.findElement(By.cssSelector(".ui-dialog-buttonset > button")).click();
    Thread.sleep(2000);
 }
	
	@Test(priority=3)
	public void clavesQueNoCumplanParametros() throws InterruptedException {
	driver.get(variablesGlobales.HOME_PAGE);
	login.login(variablesGlobales.USER_LOGIN_PRE_9);
    driver.findElement(By.id("idShowPassword")).click();
    driver.findElement(By.id("idPasswordOld")).click();
    driver.findElement(By.id("idPasswordOld")).sendKeys("12121212Qw.");
    driver.findElement(By.id("idPassword")).click();
    driver.findElement(By.id("idPassword")).sendKeys("12121212qw");
    driver.findElement(By.id("idPasswordVerify")).click();
    driver.findElement(By.id("idPasswordVerify")).sendKeys("12121212qw");
    driver.findElement(By.xpath("//div[2]/input[2]")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\LoginPrecertificacionBloqueo\\Javier.cer");
    driver.findElement(By.id("iniciar")).click();
    Thread.sleep(3000);
    driver.findElement(By.cssSelector(".ui-dialog-buttonset > button")).click();
    Thread.sleep(2000);
 }
	
	@Test(priority=4)
	public void clavesActualIncorrecta() throws InterruptedException {
	driver.get(variablesGlobales.HOME_PAGE);
	login.login(variablesGlobales.USER_LOGIN_PRE_9);
    driver.findElement(By.id("idShowPassword")).click();
    driver.findElement(By.id("idPasswordOld")).click();
    driver.findElement(By.id("idPasswordOld")).sendKeys("14141414Qw.");
    driver.findElement(By.id("idPassword")).click();
    driver.findElement(By.id("idPassword")).sendKeys("12121212Qw.");
    driver.findElement(By.id("idPasswordVerify")).click();
    driver.findElement(By.id("idPasswordVerify")).sendKeys("12121212Qw.");
    driver.findElement(By.xpath("//div[2]/input[2]")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\LoginPrecertificacionBloqueo\\Javier.cer");
    driver.findElement(By.id("iniciar")).click();
    Thread.sleep(3000);
    driver.findElement(By.cssSelector(".ui-dialog-buttonset > button")).click();
    Thread.sleep(2000);
 }
	
	@Test(enabled=false)
	//@Test(priority=5)
	public void CertificadoYaRegistrado() throws InterruptedException {
	driver.get(variablesGlobales.HOME_PAGE);
	login.login(variablesGlobales.USER_LOGIN_PRE_9);
    driver.findElement(By.id("idShowPassword")).click();
    driver.findElement(By.id("idPasswordOld")).click();
    driver.findElement(By.id("idPasswordOld")).sendKeys("12121212Qw.");
    driver.findElement(By.id("idPassword")).click();
    driver.findElement(By.id("idPassword")).sendKeys("12121212Qw.");
    driver.findElement(By.id("idPasswordVerify")).click();
    driver.findElement(By.id("idPasswordVerify")).sendKeys("12121212Qw.");
    driver.findElement(By.xpath("//div[2]/input[2]")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\LoginPrecertificacionBloqueo\\Maribel.cer");
    driver.findElement(By.id("iniciar")).click();
    Thread.sleep(3000);
 }
	
	@Test(enabled=false)
	//@Test(priority=6)
	public void KeyEnLugarDeCertificado() throws InterruptedException {
	driver.get(variablesGlobales.HOME_PAGE);
	login.login(variablesGlobales.USER_LOGIN_PRE_9);
    driver.findElement(By.id("idShowPassword")).click();
    driver.findElement(By.id("idPasswordOld")).click();
    driver.findElement(By.id("idPasswordOld")).sendKeys("12121212Qw.");
    driver.findElement(By.id("idPassword")).click();
    driver.findElement(By.id("idPassword")).sendKeys("12121212Qw.");
    driver.findElement(By.id("idPasswordVerify")).click();
    driver.findElement(By.id("idPasswordVerify")).sendKeys("12121212Qw.");
    driver.findElement(By.xpath("//div[2]/input[2]")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\LoginPrecertificacionBloqueo\\Javier.key");
    driver.findElement(By.id("iniciar")).click();
    Thread.sleep(3000);
 }
	
	@AfterTest
	public void closeDriver() {
	driver.close();	
	}
}	