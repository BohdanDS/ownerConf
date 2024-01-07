package owner.tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import owner.config.ConfigReader;
import owner.config.ProjectConfiguration;
import owner.config.web.WebConfig;



public class TestBase {

    private static final WebConfig webConfig = ConfigReader.Instance.read();

    @BeforeAll
    static void beforeAll() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        ProjectConfiguration projectConfiguration = new ProjectConfiguration(webConfig);
        projectConfiguration.webConfig();
    }


//    static void beforeFillForm(){
//        Configuration.baseUrl= System.getProperty("baseUrl", "https://demoqa.com/");
//        Configuration.browser = System.getProperty("browser", "chrome");
////        Configuration.browserVersion = System.getProperty("browserVersion", "100.0");
//        Configuration.browserSize =System.getProperty("browserSize","1920x1080");
////        Configuration.remote = System.getProperty("selenoid", "https://user1:1234@selenoid.autotests.cloud/wd/hub");
//        Configuration.pageLoadStrategy = "eager";
//        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
//
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability("selenoid:options", Map.<String, Object>of(
//                "enableVNC", true,
//                "enableVideo", true
//        ));
//        Configuration.browserCapabilities = capabilities;
//    }
}
