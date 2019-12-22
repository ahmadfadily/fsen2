package Fsen;

public abstract class Observer {

    protected Subject subject;

    public Observer(Subject subject) {
        this.subject = subject;
    }

    public abstract void update(String projectName, String description, String contactInfo, String URL);

}
