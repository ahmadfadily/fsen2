package Fsen.Website;

public class ElementMusic extends WebpageDecorator {
    public static boolean BlockElementMusic=false;
    public ElementMusic(Webpage w){
        super(w);
    }
    @Override
    public void getDescription(String text) {
        if(BlockElementMusic)
           System.out.println("you are blocked to use the Music feature");
        else
            System.out.println("music of file " + text + " is played, ");
    }
}
