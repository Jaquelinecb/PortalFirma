package navPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addInvitado9 {
	
	public addInvitado9 (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="idInvitedSignerName")
	private WebElement nameInvitado9;
	
	@FindBy(id="idInvitedSignerEmail")
	private WebElement emailInvitado9;
	
	
	public void login(String user) {
		nameInvitado9.sendKeys(user);
		emailInvitado9.sendKeys(user);
		
		
		
		
	}
}
