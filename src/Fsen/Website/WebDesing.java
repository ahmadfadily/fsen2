package Fsen.Website;

public class WebDesing extends WebpageDecorator{
    public static boolean BLockWebDesing=false;
    public WebDesing(Webpage w){
        super(w);
    }

    @Override
    public void getDescription(String text) {
        if(BLockWebDesing)
            System.out.println("you are blocked to use the Desing feature");
        else
            System.out.println("you chose desing number "+ text +" , ");
    }
}
