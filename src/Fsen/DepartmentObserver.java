package Fsen;

public class DepartmentObserver extends Observer {

    public DepartmentObserver(Subject subject) {
        super(subject);
    }

    @Override
    public void update(String projectName, String description, String contactInfo, String URL) {
        String message = String.format("New project added: Name: %s , Description: %s, Contact info: %s, URL: %s "
                ,projectName,description,contactInfo,URL);
        System.out.println(message);
    }
}
