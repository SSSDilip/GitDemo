package SeleniumFramework;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractConvention.AbstrctConvention;

public class OrderPage extends AbstrctConvention{
	
	WebDriver driver;
	public OrderPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(css="tr td:nth-child(3)")
	private List<WebElement> productNames;
	
	public Boolean verifyOrderDisplay(String productName) {
		Boolean match= productNames.stream().anyMatch(cartProd->cartProd.getText().equalsIgnoreCase(productName));
		return match;
	}

}
