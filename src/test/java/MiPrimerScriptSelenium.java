import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MiPrimerScriptSelenium {

    public static WebDriver driver;


    public static void main(String[] args) {
        navegar("https://evening-bastion-49392.herokuapp.com/");
        verificarPaginaPrincipal();
        login("frank","sinatra");
        validarHomePage();
        validarMensajeBienvenida("You are now logged in as frank");

    }

    private static void navegar(String url) {
        driver = new ChromeDriver();
        driver.navigate().to(url);
    }

    private static void verificarPaginaPrincipal() {
        driver.findElement(By.cssSelector("[src='/images/sinatra.jpg']")).isDisplayed();
    }

    private static void login(String user, String password) {
        driver.findElement(By.cssSelector("[href='/login']")).click();
        driver.findElement(By.id("username")).sendKeys(user);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.cssSelector("[value='Log In']")).click();
    }

    private static void validarHomePage() {
    }

    private static void validarMensajeBienvenida(String s) {
    }


}
