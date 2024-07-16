package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayCartLocators {
	
	//Shirt Size type
	@FindBy(xpath="//select[@selectboxlabel='Size Type']")
	public WebElement ddSizeType;
	
	//Shirt men size
	@FindBy(xpath="//select[@selectboxid='1001']")
	public WebElement ddMenSize;
		
	//Shirt Shade
	@FindBy(xpath="//select[@selectboxlabel='Shade']")
	public WebElement ddShade;
		
	//Shirt Quantity
	@FindBy(xpath="//input[@id='qtyTextBox']")
	public WebElement txtbxQty;
	
	//Shoe size
	@FindBy(xpath="//select[@selectboxlabel]")
	public WebElement ShoeSize;
		
	//Add to Cart
	@FindBy(xpath="//span[contains(text(), 'Add to cart')]")
	public WebElement btnAddCart;

}
