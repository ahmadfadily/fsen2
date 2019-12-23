package Fsen.Website;

public class ElementLink extends WebpageDecorator {
    public static boolean BlockElementLink=false;
    public ElementLink(Webpage w){
        super(w);
    }
    @Override
    public void getDescription(String text) {
        if(BlockElementLink)
            System.out.println("you are blocked to use the Link feature");
        else
        System.out.println("link of file " + text + " is displayed");
    }
}
