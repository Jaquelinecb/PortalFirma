package navPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addInvitado13 {
	
	public addInvitado13 (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="idInvitedSignerName")
	private WebElement nameInvitado13;
	
	@FindBy(id="idInvitedSignerEmail")
	private WebElement emailInvitado13;
	
	
	public void login(String user) {
		nameInvitado13.sendKeys(user);
		emailInvitado13.sendKeys(user);
		
		
		
		
	}
}
