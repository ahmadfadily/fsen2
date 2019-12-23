package Fsen.Website;

public abstract class WebpageDecorator implements Webpage {
    protected Webpage tempWebpage;

    public WebpageDecorator(Webpage newWebpage) {
        this.tempWebpage = newWebpage;
    }

    @Override
    public void getDescription(String test) {
        this.tempWebpage.getDescription(test);
    }
}
