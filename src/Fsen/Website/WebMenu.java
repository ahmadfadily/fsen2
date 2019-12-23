package Fsen.Website;

public class WebMenu extends WebpageDecorator {
    public WebMenu(Webpage w){
        super(w);
    }
    public void getDescription(String text) {
        System.out.print("the menu place you chose :" + text +" , ");
    }
}
