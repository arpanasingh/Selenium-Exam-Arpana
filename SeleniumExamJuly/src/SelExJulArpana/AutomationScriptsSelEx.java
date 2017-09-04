package SelExJulArpana;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AutomationScriptsSelEx extends ReUsableMethodsSelEx{
	//public static WebDriver driver;

	public static void searchiPhone6TC01() throws Exception {
		System.out.println("Search iPhone 6-1 is executing..");

		/*Launch URL*/
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);


		/*Search iPhone6*/

		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		enterText(searchBox, "iPhone 6", "SeachItem");

		WebElement searchButton = driver.findElement(By.xpath("//*[@id='nav-search']/form/div[2]/div/input"));
		clickButton(searchButton, "SearchButton");

		/*Select iPhone6*/

		WebElement appleiPhone6 = driver.findElement(By.xpath("//*[@id='result_0']/div/div/div/div[2]/div[2]/div[1]/a/h2"));
		clickButton(appleiPhone6, "AppleiPhone6");

		/*Add to Cart*/
		WebElement addToCart = driver.findElement(By.xpath("//*[@id='add-to-cart-button']"));
		clickButton(addToCart, "AddToCart");
		Thread.sleep(10000);
		WebElement addCoverage = driver.findElement(By.xpath("//*[@id='siAddCoverage-announce']"));
		clickButton(addCoverage, "AddCoverage");

		/*Verify item in cart*/
		WebElement cartCount = driver.findElement(By.xpath("//*[@id='nav-cart-count']"));
		String expectedCount = "2";
		String actualCount = cartCount.getText().trim();

		System.out.println(actualCount);
		if(expectedCount.equals(actualCount)){
			System.out.println("Pass");
			Update_Report("Pass", "add and verify item count in cart ", "Product has been added to the cart and '2' is displayed in the cart Button",driver);
		}else{
			System.out.println("Fail");
			Update_Report("Fail", "add and verify item count in cart", " count is not matched",driver);
		}


	}


	public static void checkMainTabTC02() throws Exception {
		System.out.println("Check Main Tab is executing..");

		/*Launch URL*/
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		/*check for department dropdown*/

		WebElement deptDropDn = driver.findElement(By.xpath("//*[@id='nav-link-shopall']/span[2]"));

		HoverOn(deptDropDn, "DeptDropDn");
		Thread.sleep(3000);

		WebElement deptDropDnMenu = driver.findElement(By.xpath("//*[@id='nav-flyout-shopAll']/div[2]"));
		HoverOn(deptDropDnMenu,"DeptDropDnMenu");

		/*Check for your amazon link*/
		WebElement yourAmazonLink = driver.findElement(By.xpath("//*[@id='nav-your-amazon']"));
		HoverOn(yourAmazonLink ,"YourAmazonLink ");
		Thread.sleep(3000);

		GetAttributeValue(yourAmazonLink,"href");

		/*Check for Today's Deal*/
		WebElement todaysDeal = driver.findElement(By.xpath("//*[@id='nav-xshop']/a[2]"));
		HoverOn(todaysDeal,"Today's Deal");
		Thread.sleep(3000);

		GetAttributeValue(todaysDeal,"href");

	}


	public static void validateDepartmentDropdownListTC03() throws Exception {
		System.out.println("Validate Department Dropdown is executing..");

		/*Launch URL*/
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		/*check for department dropdown and click on dropdown*/

		WebElement deptDropDn = driver.findElement(By.xpath("//*[@id='nav-link-shopall']/span[2]"));

		HoverOn(deptDropDn, "DeptDropDn");
		Thread.sleep(3000);
		WebElement deptDropDnMenu = driver.findElement(By.xpath("//*[@id='nav-flyout-shopAll']/div[2]"));
		HoverOn(deptDropDnMenu,"DeptDropDnMenu");
		clickButton(deptDropDnMenu,"DeptDropDnMenu");
		Thread.sleep(3000);

		/*check sub-elements*/

		/*Select oSelect = new Select(driver.findElement(By.id("nav-flyout-shopAll")));
		oSelect.selectByIndex(2);*/

		WebElement amazonVideo = driver.findElement(By.xpath("//*[@id='nav-flyout-shopAll']/div[2]/span[1]/span"));
		HoverOn(amazonVideo ,"Amazon Video ");

		WebElement amazonMusic = driver.findElement(By.xpath("//*[@id='nav-flyout-shopAll']/div[2]/span[2]/span"));
		HoverOn(amazonMusic ,"Amazon Music ");

		WebElement appStoreforAndroid = driver.findElement(By.xpath("//*[@id='nav-flyout-shopAll']/div[2]/span[3]/span"));
		HoverOn(appStoreforAndroid ,"Appstore for Android ");

		WebElement kindleEreaders  = driver.findElement(By.xpath("//*[@id='nav-flyout-shopAll']/div[2]/span[4]/span"));
		HoverOn(kindleEreaders  ,"Kindle E-readers & Books  ");

		WebElement fireTablets  = driver.findElement(By.xpath("//*[@id='nav-flyout-shopAll']/div[2]/span[5]/span"));
		HoverOn(fireTablets  ,"Fire Tablets  ");
		Thread.sleep(3000);

		WebElement fireTV  = driver.findElement(By.xpath("//*[@id='nav-flyout-shopAll']/div[2]/span[6]/span"));
		HoverOn(fireTV ,"FireTV ");

		WebElement echoAlexa   = driver.findElement(By.xpath("//*[@id='nav-flyout-shopAll']/div[2]/span[7]/span"));
		HoverOn(echoAlexa,"Echo & Alexa  ");

		WebElement amazonFresh   = driver.findElement(By.xpath("//*[@id='nav-flyout-shopAll']/div[2]/span[8]/span"));
		HoverOn(amazonFresh,"AmazonFresh NEW   ");

		WebElement booksMovies  = driver.findElement(By.xpath("//*[@id='nav-flyout-shopAll']/div[2]/span[9]/span"));
		HoverOn(booksMovies,"Books & Audible Movies ");

		WebElement musicGames  = driver.findElement(By.xpath("//*[@id='nav-flyout-shopAll']/div[2]/span[10]/span"));
		HoverOn(musicGames ,"Music & Games ");

		WebElement computersOffice  = driver.findElement(By.xpath("//*[@id='nav-flyout-shopAll']/div[2]/span[11]/span"));
		HoverOn(computersOffice,"Computers & Office ");

		WebElement gardenTool  = driver.findElement(By.xpath("//*[@id='nav-flyout-shopAll']/div[2]/span[12]/span"));
		HoverOn(gardenTool,"Home Garden and Tools ");

		WebElement foodGrocery  = driver.findElement(By.xpath("//*[@id='nav-flyout-shopAll']/div[2]/span[13]/span"));
		HoverOn(foodGrocery,"Food & Grocery ");

		WebElement beautyHealth  = driver.findElement(By.xpath("//*[@id='nav-flyout-shopAll']/div[2]/span[14]/span"));
		HoverOn(beautyHealth,"Beauty & Health");

		WebElement kidsBaby  = driver.findElement(By.xpath("//*[@id='nav-flyout-shopAll']/div[2]/span[15]/span"));
		HoverOn(kidsBaby ,"Kids & Baby ");

		WebElement ShoeJewel  = driver.findElement(By.xpath("//*[@id='nav-flyout-shopAll']/div[2]/span[16]/span"));
		HoverOn(ShoeJewel,"Shoes & Jewelry Handmade Sports & Outdoors Automotive & Industrial  ");

		WebElement handMade  = driver.findElement(By.xpath("//*[@id='nav-flyout-shopAll']/div[2]/span[17]/span"));
		HoverOn(handMade,"Handmade");

		/*	WebElement sports = driver.findElement(By.xpath("//*[@id='nav-flyout-shopAll']/div[2]/span[18]/span"));
		HoverOn(sports,"Sports and Outdoors");

		WebElement auto  = driver.findElement(By.xpath("//*[@id='nav-flyout-shopAll']/div[2]/span[19]/span"));
		HoverOn(auto,"Automtotive and Industrial ");

		WebElement creditPay  = driver.findElement(By.xpath("//*[@id='nav-flyout-shopAll']/div[2]/span[20]/span"));
		HoverOn(creditPay,"Home Services");

		WebElement credit = driver.findElement(By.xpath("//*[@id='nav-flyout-shopAll']/div[2]/span[21]/span"));
		HoverOn(credit," Credit & Payment Products ");*/


	}

	public static void validateYourAcctDrpdnListTC04() throws Exception {
		System.out.println("Validate Acccount List Dropdown is executing..");

		/*Launch URL*/
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		/*check for Accnt List*/

		WebElement signinAccntList = driver.findElement(By.xpath("//*[@id='nav-link-accountList']"));
		HoverOn(signinAccntList, "Hello Sign in Account & Lists");
		Thread.sleep(6000);

		WebElement signinAccntListMenu = driver.findElement(By.xpath("//*[@id='nav-flyout-accountList']"));
		HoverOn(signinAccntListMenu, "Hello Sign in Account & Lists Menu");
		clickButton(signinAccntListMenu,"Hello Sign in Account & Lists Menu");
		Thread.sleep(3000);

		/*check sub-elements*/

		WebElement createList = driver.findElement(By.xpath("//*[@id='nav-al-your-account']/a[1]/span"));
		HoverOn(createList ,"Create a list ");

		WebElement findListRegistry = driver.findElement(By.xpath("//*[@id='nav-al-wishlist']/a[2]/span"));
		HoverOn(findListRegistry ,"Find a List or Registry");

		WebElement findGift = driver.findElement(By.xpath("//*[@id='nav-al-wishlist']/a[3]/span"));
		HoverOn(findGift ,"Find a Gift");

		WebElement saveItems = driver.findElement(By.xpath("//*[@id='nav-al-wishlist']/a[4]/span"));
		HoverOn(saveItems ,"Save Items from the Web");

		WebElement wedReg = driver.findElement(By.xpath("//*[@id='nav-al-wishlist']/a[5]/span"));
		HoverOn(wedReg ,"Wedding Registry");

		WebElement yrAccnt= driver.findElement(By.xpath("//*[@id='nav-al-your-account']/a[1]/span"));
		HoverOn(yrAccnt ,"Your Account");

		WebElement yrList= driver.findElement(By.xpath("//*[@id='nav-al-your-account']/a[3]/span"));
		HoverOn(yrList ,"Your Lists");

		WebElement yrRecc= driver.findElement(By.xpath("//*[@id='nav-al-your-account']/a[4]/span"));
		HoverOn(yrRecc ,"Your Recommendations");

		WebElement yrSub= driver.findElement(By.xpath("//*[@id='nav-al-your-account']/a[5]/span"));
		HoverOn(yrSub ,"Your Subscribe & Save Items");


	}

	public static void clickAllMenuDrpdnfrmSearchTC05() throws Exception {
		System.out.println("All Search Drop down Menu Vakidation is Executing..");

		/*Launch URL*/
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		/*check for All search Drop down*/

		WebElement allSearchDropDown = driver.findElement(By.xpath("//*[@id='searchDropdownBox']"));
		//HoverOn(allSearchDropDown, "All Search Drop down Search Menu");
		Thread.sleep(3000);
		clickButton(allSearchDropDown,"All Search Drop down Search Menu");
		Thread.sleep(6000);


		/*check sub-elements*/

		String xPathSelectOptions = "//select[@id='searchDropdownBox']/option";
		CheckSubElement(xPathSelectOptions);

		/*Verify Clothing Shoes and Jewelry*/
		/*check single sub element*/
		List<WebElement> options = driver.findElements(By.xpath(xPathSelectOptions));

		for(int i=0;i<options.size();i++)
		{
			String str=options.get(i).getAttribute("value");
			if(str.equals("search-alias=fashion")){
				System.out.println(options.get(i).getText()+" is available");
				Update_Report("Pass", options.get(i).getText(), " is available", driver);
			} 
			if(str.equals("search-alias=fashion-womens")){
				System.out.println(options.get(i).getText()+" is available");
				Update_Report("Pass", options.get(i).getText(), " is available", driver);
			} 

			if(str.equals("search-alias=fashion-mens")){
				System.out.println(options.get(i).getText()+" is available");
				Update_Report("Pass", options.get(i).getText(), " is available", driver);
			} 

			if(str.equals("search-alias=fashion-girls")){
				System.out.println(options.get(i).getText()+" is available");
				Update_Report("Pass", options.get(i).getText(), " is available", driver);
			} 
			if(str.equals("search-alias=fashion-boys")){
				System.out.println(options.get(i).getText()+" is available");
				Update_Report("Pass", options.get(i).getText(), " is available", driver);
			} 
			if(str.equals("search-alias=fashion-baby")){
				System.out.println(options.get(i).getText()+" is available");
				Update_Report("Pass", options.get(i).getText(), " is available", driver);
			} 
		}

	}

	public static void emptyCartValidation1TC06() throws Exception {
		System.out.println("empty Cart Validation is executing..");

		/*Launch URL*/
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		/*Search iPhone6*/

		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		enterText(searchBox, "iPhone 6s", "SeachItem");

		WebElement searchButton = driver.findElement(By.xpath("//*[@id='nav-search']/form/div[2]/div/input"));
		clickButton(searchButton, "SearchButton");

		/*Select iPhone6*/

		WebElement appleiPhone6s = driver.findElement(By.xpath("//*[@id='result_4']/div/div/div/div[2]/div[1]/div[1]/a/h2"));
		clickButton(appleiPhone6s, "AppleiPhone6s 64GB");

		/*Add to Cart*/
		WebElement addToCart = driver.findElement(By.xpath("//*[@id='add-to-cart-button-ubb']"));
		clickButton(addToCart, "AddToCart");
		Thread.sleep(200);
		//WebElement addCoverage = driver.findElement(By.xpath("//*[@id='siAddCoverage-announce']"));

		/*Verify item in car*/
		WebElement cartDisplaynow = driver.findElement(By.xpath("//*[@id='hlb-view-cart-announce']"));
		clickButton(cartDisplaynow, "Display cart items after adding item");
		Thread.sleep(1000);

		WebElement deleteItem = driver.findElement(By.xpath("//*[@id='activeCartViewForm']/div[2]/div/div[4]/div/div[1]/div/div/div[2]/div/span[1]/span/input"));
		clickButton(deleteItem, "Delete item from Cart");
		Thread.sleep(1000);
		
		WebElement cartDisplay = driver.findElement(By.xpath("//*[@id='nav-cart']"));
		clickButton(cartDisplay, "Display cart items");
		Thread.sleep(1000);

		/*Display empty cart message*/
		String cartMsg= driver.findElement(By.xpath("//*[@id='sc-active-cart']/div/h1")).getText();
		System.out.println("Displaying cart message");
		System.out.println(cartMsg);
		String expectedMsg = "Your Shopping Cart is empty.";
		String actualMsg=cartMsg.trim();

		VerifyResultString(expectedMsg, actualMsg);
	}

	public static void verifyHelpContentTC07() throws Exception {
		System.out.println("Verify help content is executing..");

		/*Launch URL*/
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		/*check for help*/

		WebElement helpBt = driver.findElement(By.xpath(".//*[@id='nav-xshop']/a[5]"));
		clickButton(helpBt, "Help Page");
		Thread.sleep(3000);

		/*verify heading message*/
		String helpMsg= driver.findElement(By.xpath("html/body/div[2]/div[1]/h1")).getText();
		System.out.println("Displaying help message");
		System.out.println(helpMsg);
		String expectedHelpMsg = "Hello. What can we help you with?";
		String actualHelpMsg=helpMsg.trim();
		System.out.println(actualHelpMsg);

		if(expectedHelpMsg.equals(actualHelpMsg)){
			System.out.println("Pass");
			Update_Report("Pass", "heading message ", "heading message is matched.",driver);
		}else{
			System.out.println("Fail");
			Update_Report("Fail", "heading Message", "  is not matched",driver);
		}
		/*Verify subMenu*/
		WebElement YrOrders = driver.findElement(By.xpath("html/body/div[2]/div[3]/div/div[1]/div[1]/div[1]/div/div[2]/a"));
		HoverOn(YrOrders,"Your Orders SubMenu");

		WebElement retRef = driver.findElement(By.xpath("html/body/div[2]/div[3]/div/div[1]/div[1]/div[2]/div/div[2]/a"));
		HoverOn(retRef,"Returns & Refunds ");

		WebElement deviceSupp = driver.findElement(By.xpath("html/body/div[2]/div[3]/div/div[1]/div[1]/div[3]/div/div[2]/a"));
		HoverOn(deviceSupp,"Device Support ");

		WebElement mngPrime = driver.findElement(By.xpath("html/body/div[2]/div[3]/div/div[1]/div[2]/div[1]/div/div[2]/a"));
		HoverOn(mngPrime,"Manage Prime  ");

		WebElement payGift = driver.findElement(By.xpath("html/body/div[2]/div[3]/div/div[1]/div[2]/div[2]/div/div[2]/a"));
		HoverOn(payGift,"Payments & Gift Cards ");

		WebElement accntStng = driver.findElement(By.xpath("html/body/div[2]/div[3]/div/div[1]/div[2]/div[3]/div/div[2]/a"));
		HoverOn(accntStng,"Account Settings ");

		/*Verify find more sol message*/
		String moreSoltMsg= driver.findElement(By.xpath("html/body/div[2]/div[3]/div/div[2]/p")).getText();
		System.out.println("Displaying find more solution message");
		System.out.println(moreSoltMsg);
		String expectedMsg = "Find more solutions";
		String actualMsg=moreSoltMsg.trim();

		VerifyResultString(expectedMsg, actualMsg);

	}	

	public static void addQuantityCartTC08() throws Exception {
		System.out.println("Add items quantity in cart is executing..");

		/*Launch URL*/
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		/*Search Head First Java in Books*/

		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		enterText(searchBox, "Head First Java in Books", "SeachItem");

		WebElement searchButton = driver.findElement(By.xpath("//*[@id='nav-search']/form/div[2]/div/input"));
		clickButton(searchButton, "SearchButton");

		/*Select Head First Java in Books*/

		WebElement javaBook = driver.findElement(By.xpath("//*[@id='result_0']/div/div/div/div[2]/div[1]/div[1]/a/h2"));
		clickButton(javaBook, "Head First Java in Books Selection");

		/*fix quantity*/
		WebElement qtyLink= driver.findElement(By.xpath("//*[@id='a-autoid-1-announce']"));
		clickButton(qtyLink, "Qty Button");

		WebElement qty5= driver.findElement(By.xpath("//*[@id='quantity_4']"));
		clickButton(qty5, "Qty 5");

		/*Add to Cart*/
		WebElement addToCartbt = driver.findElement(By.xpath("//*[@id='add-to-cart-button']"));
		clickButton(addToCartbt, "AddToCart");
		Thread.sleep(200);

	}

	public static void updateQnatityCartTC09() throws Exception {
		System.out.println("Update items quantity in cart is executing..");

		/*Launch URL*/
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		/*Search Head First Java in Books*/

		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		enterText(searchBox, "Head First Java in Books", "SeachItem");

		WebElement searchButton = driver.findElement(By.xpath("//*[@id='nav-search']/form/div[2]/div/input"));
		clickButton(searchButton, "SearchButton");

		/*Select Head First Java in Books*/

		WebElement javaBook = driver.findElement(By.xpath("//*[@id='result_0']/div/div/div/div[2]/div[1]/div[1]/a/h2"));
		clickButton(javaBook, "Head First Java in Books Selection");

		/*fix quantity*/
		WebElement qtyLink= driver.findElement(By.xpath("//*[@id='a-autoid-1-announce']"));
		clickButton(qtyLink, "Qty Button");

		WebElement qty5= driver.findElement(By.xpath("//*[@id='quantity_4']"));
		clickButton(qty5, "Qty 5");

		/*Add to Cart*/
		WebElement addToCartbt = driver.findElement(By.xpath("//*[@id='add-to-cart-button']"));
		clickButton(addToCartbt, "AddToCart");
		Thread.sleep(200);

		/*Update Qty Code starts here*/
		WebElement showCart = driver.findElement(By.xpath("//*[@id='nav-cart']"));
		clickButton(showCart, "Display items in Cart");
		Thread.sleep(200);

		WebElement qtyLink2= driver.findElement(By.xpath("//*[@id='a-autoid-2-announce']"));
		clickButton(qtyLink2, "Qty Button2");

		WebElement qty4= driver.findElement(By.xpath("//*[@id='dropdown1_3']"));
		clickButton(qty4, "Qty 4");

		WebElement saveLater= driver.findElement(By.xpath("//*[@id='activeCartViewForm']/div[2]/div/div[4]/div/div[1]/div/div/div[2]/div/span[2]/span/input"));
		clickButton(saveLater, "Save for later");
	}

	public static void verifyDrpdnAftrSearchTC10() throws Exception {
		System.out.println("Verify Drop Down option after iphone is Typed in Search is executing..");

		/*Launch URL*/
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		/*Search iPhone6*/

		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		enterText(searchBox, "iPhone", "SeachItem");
		Thread.sleep(200);

		WebElement suggTitle = driver.findElement(By.xpath("//*[@id='suggestion-title']"));
		HoverOn(suggTitle, "Suggestion Titles");
		Thread.sleep(200);

		/*Select choices*/
		WebElement choice1= driver.findElement(By.xpath("//*[@id='issDiv0']"));
		clickButton(choice1, "Choice1");

	}

}










