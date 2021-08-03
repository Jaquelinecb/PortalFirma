package navPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addInvitado14 {
	
	public addInvitado14 (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

	
	@FindBy(id="idInvitedSignerEmail")
	private WebElement emailInvitado14;

	
	public void login(String user) {
		
		
		emailInvitado14.sendKeys(user);
		
		
		
		
	}
}
