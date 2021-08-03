package navPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addInvitado8 {
	
	public addInvitado8 (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="idInvitedSignerName")
	private WebElement nameInvitado8;
	
	@FindBy(id="idInvitedSignerEmail")
	private WebElement emailInvitado8;
	
	
	@FindBy(id="inicio")
	private WebElement btnEnviar;
	
	public void login(String user) {
		nameInvitado8.sendKeys(user);
	}
	public void mail(String mail) {
		emailInvitado8.sendKeys(mail);
		//btnEnviar.sendKeys(mail);
		
	}
}
