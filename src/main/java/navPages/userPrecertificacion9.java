package navPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class userPrecertificacion9 {
	
	public userPrecertificacion9 (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="loginForm_user_login")
	private WebElement userLogin_Pre_9;
	@FindBy(id="btnLogin")
	private WebElement LoginBtn;
	
	public void login(String user) {
		userLogin_Pre_9.sendKeys(user);
		LoginBtn.click();
	}
}
