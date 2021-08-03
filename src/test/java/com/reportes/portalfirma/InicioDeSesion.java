package com.reportes.portalfirma;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import commonMethods.variablesGlobales;
import driverSetup.DriverSetup;

public class InicioDeSesion {
	WebDriver driver = DriverSetup.setupDriver();
	
	
	@BeforeTest
	public void starWebDriver() {
		driver.get(variablesGlobales.HOME_PAGE);
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	}
	
	@Test(priority=1)
	  public void IniciarSesionHP() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario1");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".toggle")).click();
	    driver.findElement(By.xpath("//span[contains(.,\'Salir\')]")).click();
	}
	
	@Test(priority=2)
	  public void sinIngresarUsuario() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".ui-dialog-buttonset > button")).click();
	}
	
	@Test(priority=3)
	  public void IngresarUsuarioIncorrecto() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario no registrado");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".ui-dialog-buttonset > button")).click();
	}
	
	@Test(priority=4)
	  public void IngresarUsuarioRevocado() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		//driver.findElement(By.id("loginForm_user_login")).sendKeys("alejandro@seguridata.com"); //Julieta - sql
		driver.findElement(By.id("loginForm_user_login")).sendKeys("Julieta");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".ui-dialog-buttonset > button")).click();
	}
	
	@Test(priority=5)
	public void IngresarUsuarioBloqueado() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("qapruebas859@gmail.com");//sql
		
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".ui-dialog-buttonset > button")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("btnUnlok")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("btnCancelar")).click();
		Thread.sleep(3000);
	}
		
	@Test(priority=6)
	  public void ingresarClaveIncorrecta() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario1");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("1212121e32Qw.");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".ui-dialog-buttonset > button")).click();
	}
	
	
	@Test(priority=7)
	  public void sinIngresarClave() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario1");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-dialog-buttonset > button")).click();
	}
	
	@AfterTest
	public void closeDriver() {
	driver.close();	
	
	}
	
}	