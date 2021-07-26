package test;

import org.testng.annotations.Test;

public class MainPageTest extends BasePageTest {

    @Test(description = "just creating new paste")
    public void createNewPaste(){
        mainPage.openPage()
        .writeTextToCodeWindow("Hello from WebDriver")
        .selectExpiration()
        .writeTextToNameWindow("helloweb")
        .tapCreateNewPaste();
    }
}
