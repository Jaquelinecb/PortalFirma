package navPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AgregarEliminarUsuario2 {
	
	public AgregarEliminarUsuario2 (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="idInvitedSignerEmail")
	private WebElement signerEmailInvitado2;
	//@FindBy(id="btnLogin")
	//private WebElement LoginBtn;
	
	public void login(String user) {
		signerEmailInvitado2.sendKeys(user);
		//LoginBtn.click();
	}
}
