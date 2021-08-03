package navPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class firmaPerfil4 {
	
	public firmaPerfil4 (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className="tooltip")
	private WebElement iconoFirmar;
	
	@FindBy(id="idShowPassword")
	private WebElement mostrarClave;
	
	@FindBy(id="txtPass")
	private WebElement ingresarClavePrivada;
	
	@FindBy(className="action estilo")
	private WebElement firmarDocumento;
	
	@FindBy(className="ui-button-text")
	private WebElement cerrarVentana;
	
	
	public void firma4(String clavePrivada) {
		iconoFirmar.click();
		mostrarClave.click();
		ingresarClavePrivada.sendKeys(clavePrivada);
	
	}
	
}
