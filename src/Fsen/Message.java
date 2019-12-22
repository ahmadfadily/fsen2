package Fsen;

public class Message{
    private String projectName;
    private String projectURL;

    public Message(String projectName, String projectURL) {
        this.projectName = projectName;
        this.projectURL = projectURL;
    }

    public String getProjectName() {
        return projectName;
    }

    public String getProjectURL() {
        return projectURL;
    }
}
