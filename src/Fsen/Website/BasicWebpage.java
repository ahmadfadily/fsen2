package Fsen.Website;

public class BasicWebpage implements Webpage {
    public Webpage w;
    public static boolean BlockElementBasic=false;
    public BasicWebpage(Webpage w){
        this.w=w;
    }
    @Override
    public void getDescription(String text) {
        if(BlockElementBasic)
            System.out.println("you are blocked to use the Basic feature");
        else
            System.out.print("Basic web page :" + text +" , ");
    }
}
