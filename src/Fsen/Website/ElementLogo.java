package Fsen.Website;

public class ElementLogo extends WebpageDecorator {
    public static boolean BlockElementlogo=false;
    public ElementLogo(Webpage w){
        super(w);
    }
    @Override
    public void getDescription(String text) {
        if(BlockElementlogo)
            System.out.println("you are blocked to use the Logo feature");
        else
         System.out.println("logo of file " + text + " is displayed");
    }
}
