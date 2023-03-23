import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class HW_5 {
    @BeforeAll
    static void beforeAll() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void test() {

        // Откройте страницу  Github
        open("https://github.com/");
        // Выберите меню Solutions с помощью команды hover
        $(".d-lg-flex").$(byText("Solutions")).hover();
        // Нажать на Enterprise
        $(byText("Enterprise")).click();
        //Убедитесь что загрузилась нужная страница (например что заголовок - "Build like the best."
        $(".h1-mktg").shouldHave(text("Build like the best"));
    }
}
