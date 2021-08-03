package navPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class claveTemporalDesbloqueo {
	
	public claveTemporalDesbloqueo (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="idPasswordOld")
	private WebElement claveDesbloqueo;
	

	
	public void claveDesbloqueo(String keys) {
		claveDesbloqueo.sendKeys(keys);
	
	}
}
