package Fsen;

public class EmailObserver extends Observer{
    private String emailAddress;

    public EmailObserver(Subject subject, String emailAddress) {
        super(subject);
        this.emailAddress = emailAddress;
    }

    @Override
    public void update(String projectName, String description, String contactInfo, String URL) {
        String message = String.format("Email for %s: New project opened called %s at URL %s"
                , emailAddress, projectName,URL);
        System.out.println(message);
    }


}
