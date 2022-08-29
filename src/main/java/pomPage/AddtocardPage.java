package pomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtocardPage {
	
	@FindBy(id="add")
	private WebElement addbtn;
	
	@FindBy(xpath="//button[text()='Add to Cart']")
	private WebElement addtocart;
	
	public void AddtocartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddbtn() {
		return addbtn;
	}
	
public void addtocartbutton() {
	addtocart.click();
}
}
