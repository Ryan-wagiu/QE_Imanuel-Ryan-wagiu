package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class BooksPage extends PageObject {

    private By fieldSearch(){
        return By.id("searchBox");
    }
    private By rightBook(){
        return By.className("mr-2");
    }
    public void inputBook(String book) {
        $(fieldSearch()).type(book);
    }
    public void openUrl() {
        openAt("/");
    }
    public void rightBookDisplayed() {
        $(rightBook()).isDisplayed();
    }

    public void noneBookDisplayed() {
        $(rightBook()).isCurrentlyEnabled();
    }
}
