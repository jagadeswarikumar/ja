package url;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.utility.Excel;

public class saucebaseclass {
	public WebDriver driver;
	
	Excel obj= new Excel("C:\\Users\\jaga10\\eclipse-workspace\\java\\maven1\\TestData\\Test.xlsx");

	@BeforeMethod
	public void setup() {
	System.setProperty("webdriver.chrome.driver","C:\\Selenium_FIIT\\chromedriver_win32\\chromedriver.exe");//path
	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/");
	}
	@SuppressWarnings("null")
	@AfterMethod
	public void tearDown() {
	
	ChromiumDriver driver=null;
	driver.quit();
	}
	@DataProvider(name ="Credentials1")
	public Object[][] getExcelData() {
	//Totals rows count
	int rows=obj.getRowCount("Data");
	//Total Columns
	int column=obj.getColumnCount("Data");
	int actRows=rows-1;
	Object[][] data= new Object[actRows][column];
	for(int i=0;i<actRows;i++) {
	for(int j=0; j<column;j++) {
	data[i][j]=obj.getCellData("Data", j, i+2);
	}
	}
	return data;
	}
}

