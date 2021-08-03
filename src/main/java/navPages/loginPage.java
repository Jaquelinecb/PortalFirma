package navPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	
	public loginPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="loginForm_user_login")
	private WebElement userLogin_4;
	
	@FindBy(id="loginForm_user_password")
	private WebElement password_Login_4;
	
	
	@FindBy(id="btnLogin")
	private WebElement LoginBtn;
	

	public void login(String user) {
		userLogin_4.sendKeys(user);
		LoginBtn.click();
		
	}
	
	public void password(String password) {
		password_Login_4.sendKeys(password);
		LoginBtn.click();
	}
}
