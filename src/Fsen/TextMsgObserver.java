package Fsen;

public class TextMsgObserver extends Observer {

    private String phoneNumber;

    public TextMsgObserver(Subject subject, String phoneNumber) {
        super(subject);
        this.phoneNumber = phoneNumber;
        subject.register(this);
    }

    @Override
    public void update(String projectName, String description, String contactInfo, String URL) {
        String message = String.format("Email for %s: New project opened called %s at URL %s"
                , phoneNumber, projectName,URL);
        System.out.println(message);
    }
}
