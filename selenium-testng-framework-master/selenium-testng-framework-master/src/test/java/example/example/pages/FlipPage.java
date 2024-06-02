package example.example.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * The Class represents GooglePage.
 *
 * @author Julia
 */
public class FlipPage extends BasePage {


	@FindBy(name = "q")
	private WebElement searchinput;

	@FindBy(xpath = "//select[@name='title']")
	private WebElement title;

	@FindBy(xpath = "//option[@value='Mr.']")
	private WebElement optMr;

	@FindBy(xpath = "//option[@value='Mrs.']")
	private WebElement optMrs;

	@FindBy(xpath = "//option[@value='Ms.']")
	private WebElement optMs;

	@FindBy(id = "firstName")
	private WebElement firstName;

	@FindBy(id = "middleName")
	private WebElement middleName;

	@FindBy(id = "lastName")
	private WebElement lastName;

	@FindBy(id = "email")
	private WebElement email;

	@FindBy(id = "phone")
	private WebElement phone;


	@FindBy(id = "dob")
	private WebElement dob;

	@FindBy(id = "genderToggle")
	private WebElement gender;

	@FindBy(id = "province")
	private WebElement province;

	@FindBy(id = "city")
	private WebElement city;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btnSubmit;

	@FindBy(id = "email")
	private WebElement emailInput;


	@FindBy(xpath = "//select[@id='province']//option")
	private List<WebElement> optProvince;

	@FindBy(xpath = "//select[@id='city']//option")
	private List<WebElement> optCity;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submit;

	@FindBy(xpath = "//p[@id='modalContent']")
	private WebElement dialogBody;


	public FlipPage(WebDriver driver) {
		super(driver);
	}

	public void searchText(String key) {
		searchinput.sendKeys(key + Keys.ENTER);
	}

	public FlipPage sendemail(String email) {
		emailInput.sendKeys();
		return this;
	}

	public FlipPage chooseTitle(String text){
		title.click();
		if (text.equals("Ms")){
			optMs.isSelected();
		}else if(text.equals("Mrs")){
			optMrs.isSelected();
		}else {
			optMr.isSelected();
		}
		return this;
	}


	public FlipPage submit(){
submit.click();
		return this;
	}

	public FlipPage fillfirstname(String firstname){
		firstName.sendKeys(firstname);
		return this;
	}

	public FlipPage midname(String midname){
		middleName.sendKeys(midname);
		return this;
	}

	public FlipPage lstname(String lstname){
		lastName.sendKeys(lstname);
		return this;
	}

	public FlipPage phonenum(String num){
		phone.sendKeys(num);
		return this;
	}

	public FlipPage dateofbirth(String date){
		dob.sendKeys(date);
		return this;
	}

	public FlipPage gender(){
		gender.click();
		return this;
	}

	public FlipPage chooseProvince(String provinceInput) {
		province.click();
		int province = optProvince.size();
		for (int i = 0; i < province; i++) {
			if (provinceInput.equals(optProvince.get(i).getText())) {
				optProvince.get(i).isSelected();
			}
		}
		return  this;
	}

		public FlipPage chooseCity(String cityName){
			city.click();
			int citySize = optCity.size();
			for (int i=0; i<citySize; i++){
				if (cityName.equals(optCity.get(i).getText())){
					optCity.get(i).isSelected();
				}
			}
			return this;
	}

	public String getdialogBody(){
		return dialogBody.getText();
	}



}
