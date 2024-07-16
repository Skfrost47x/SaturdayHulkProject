package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbaySearchResultLocators {

	//Validate Shoes Items
	@FindBy(xpath="//span[2][contains(text(), 'Shoes')]")
	public WebElement txtShoes;
	
	//Validate Shoes Items
	@FindBy(xpath="//span[2][contains(text(), 'Shirts')]")
	public WebElement txtShirts;
	
	//Validate Shoes Items
	@FindBy(xpath="//span[2][contains(text(), 'Pants')]")
	public WebElement txtPants;
		
	//Checkbox Brand Adidas
	@FindBy(xpath="//input[@aria-label='adidas']")
	public WebElement cbxBrandAdidas;

	//Checkbox Brand Nike
	@FindBy(xpath="//input[@aria-label='Nike']")
	public WebElement cbxBrandNike;

	//Checkbox Brand Unbranded
	@FindBy(xpath="//input[@aria-label='Unbranded']")
	public WebElement cbxBrandUnbranded;
	
	//Checkbox Color Black
	@FindBy(xpath="//input[@aria-label='Black']")
	public WebElement cbxColorBlack;

	//Checkbox Color White
	@FindBy(xpath="//input[@aria-label='White']")
	public WebElement cbxColorWhite;
		
	//Shirt link
	@FindBy(xpath="//span[contains(text(), 'Big & Tall Cotton Tee. Sizes 4 XLT to 8XLT')]")
	public WebElement linkShirtItems;
	
	//Shoe link
	@FindBy(xpath="//span[contains(text(), 'Nike Air Jordan Retro 4 Oxidized Green White FQ8138-103 Men’s or GS Shoes NEW')]")
	public WebElement linkShoeItems;
	
}