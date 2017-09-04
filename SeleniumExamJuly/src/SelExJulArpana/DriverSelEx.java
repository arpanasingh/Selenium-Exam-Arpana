package SelExJulArpana;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverSelEx {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		String dt_path = "C:/Users/Arpana/Google Drive/Selenium Exam/TestSuitAmazon.xls";
		String[][] recData = ReUsableMethodsSelEx.readXlSheet(dt_path, "Sheet1");

		for (int i = 1; i < recData.length; i++) {

			String execute = recData[i][1];

			if (execute.equalsIgnoreCase("Y")) {

				try {

					String testCase = recData[i][2];

					for (int j = 3; j <= 6; j++) {
						System.out.println("j" + j);
						if (recData[0][j].equals("Firefox")) {

							/* Firefox execution */
							System.out.println("Executing on Firefox");
							System.setProperty("webdriver.gecko.driver", "C:/Users/Arpana/Selenium/geckodriver.exe");
							driver = new FirefoxDriver();

							ReUsableMethodsSelEx.startReport(testCase,
							"C:/Users/Arpana/Google Drive/Selenium Exam/Report/", "Firefox");

							/* Java Reflection */
							Method tc = AutomationScriptsSelEx.class.getMethod(testCase);
							tc.invoke(tc);

							ReUsableMethodsSelEx.bw.close();
							//driver.close();
						} else if (recData[0][j].equals("C")) {

							/* Chrome execution */
							System.out.println("Executing on Chrome");

							System.setProperty("webdriver.chrome.driver", "C:/Users/Arpana/Selenium/chromedriver.exe");
							driver = new ChromeDriver();

							ReUsableMethodsSelEx.startReport(testCase,
							"C:/Users/Arpana/Google Drive/Selenium Exam/Report/", "Chrome");

							/* Java Reflection */
							Method tc = AutomationScriptsSelEx.class.getMethod(testCase);
							tc.invoke(tc);

							ReUsableMethodsSelEx.bw.close();
							//driver.close();
						}

						/*else if (recData[0][j].equals("IE")) {

							System.out.println("Executing on IE");

							System.setProperty("webdriver.ie.driver", "C:/Users/Arpana/Selenium/IEDriverServer.exe");
							driver = new InternetExplorerDriver();

							ReUsableMethodsSelEx.startReport(testCase,
									"C:/Users/Arpana/Google Drive/Selenium Exam/Report", "IE");

							Method tc = AutomationScriptsSelEx.class.getMethod(testCase);
							tc.invoke(tc);

							ReUsableMethodsSelEx.bw.close();
						}
						*/
						/*else if (recData[0][j].equals("Edge")) {

							System.out.println("Executing on Edge");

							System.setProperty("webdriver.edge.driver", "C:/Users/Arpana/Selenium/MicrosoftWebDriver.exe");
							driver = new EdgeDriver();

							ReUsableMethodsSelEx.startReport(testCase,
									"C:/Users/Arpana/Google Drive/Selenium Exam/Report", "Edge");

							Method tc = AutomationScriptsSelEx.class.getMethod(testCase);
							tc.invoke(tc);

							ReUsableMethodsSelEx.bw.close();
							//driver.close();
						}*/
					}
					// ReUsableMethodsSelEx.bw.close();

				} catch (Exception e) {
					System.out.println(e);
				}

			}

		}

	}
}

