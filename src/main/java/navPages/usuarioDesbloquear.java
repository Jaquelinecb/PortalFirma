package navPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class usuarioDesbloquear {
	
	public usuarioDesbloquear (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="loginForm_user_login")
	private WebElement name_usuario_desbloquear;
	

	
	public void bloquearUsuario(String user) {
		name_usuario_desbloquear.sendKeys(user);
	
	}
}
