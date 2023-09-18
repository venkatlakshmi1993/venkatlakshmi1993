package org.adactin;


import org.Sample.BaseClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class Sample1 extends BaseClass{
	//@Test
		public void Newsample()
	{
	    openDriver("chrome");
		max_Win();
		openUrl(" http://adactinhotelapp.com");
		WebElement username=locatingElement("xpath","(//input[@class='login_input'])[1]");
		passValue( username, "manee123");
		WebElement password= locatingElement("xpath","(//input[@class='login_input'])[2]");
		passValue(password, "P1FGC5");
		WebElement login =locatingElement("id", "login");
	    buttonclk(login);
	    WebElement location = locatingElement("xpath", "//select[@id='location']");
	    selByIndex(location, 3);
	    WebElement hotel = locatingElement("xpath", "(//select[@class='search_combobox'])[2]");
	    selByIndex(hotel, 2);
	    WebElement room = locatingElement("xpath","//select[@id='room_type']" );
	    selByIndex(room, 2);
	    WebElement member  = locatingElement("xpath","(//select[@class='search_combobox'])[4]" );
	    selByIndex(member, 1);
	    WebElement child  = locatingElement("xpath","(//select[@class='search_combobox'])[5]" );
	    selByIndex(child, 1);
	    WebElement  adult =locatingElement("xpath","(//select[@class='search_combobox'])[6]" );
	    selByIndex(adult, 1);
	    WebElement search = locatingElement("xpath",("(//input[@id=\"Submit\"])[1]"));
	    submit(search);
	

}
	
	@Test
	public void tc1() {
		openDriver("firefox");
		max_Win();
		openUrl("https://www.google.com/search?q=google&oq=goo&aqs=chrome.0.0i131i355i433i512j46i131i199i433i465i512j0i131i433i512j69i57j0i131i433i512l2j69i65l2.1545j0j7&sourceid=chrome&ie=UTF-8");

	}
}
