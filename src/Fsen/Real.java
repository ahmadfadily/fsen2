package Fsen;

import acptTests.auxiliary.DBRegisteredProjectInfo;
import acptTests.auxiliary.DBSuggestedProjectInfo;
//import acptTests.data.OrderInfo;
//import acptTests.data.ShowInfo;
import bridgeProject.BridgeProject;

public class Real implements BridgeProject {

    private MessageSystem messageSystem;

    public Real(MessageSystem messageSystem) {
        this.messageSystem = messageSystem;
    }

    @Override
    public void registerNewTechnicalAdviser(String user, String password) {
            Data.TechAdviser.add((new TechnicalAdviser(user, password)));
    }

    @Override
    public void addNewStudent(String user, String password) {
        Data.Student.add((new Student(user, password, messageSystem)));
    }

    @Override
    public int addNewProject(String user, String pass, DBSuggestedProjectInfo suggestedProject) {
        if(user==null || pass==null)
            return 0;
        if(!Data.TechAdviserContains(user,pass))
            return 0;

        if(        suggestedProject.description == null|| suggestedProject.description.equals("")
                || suggestedProject.email==null        || suggestedProject.email.equals("")
                || suggestedProject.firstName==null    || suggestedProject.firstName.equals("")
                || suggestedProject.lastName==null     || suggestedProject.lastName.equals("")
                || suggestedProject.phone==null        || suggestedProject.phone.equals("")
                || suggestedProject.projectName==null  || suggestedProject.projectName.equals("")
                || (suggestedProject.numberOfHours<200 || suggestedProject.numberOfHours>300))
            return 0;

        if(!Data.CheckProjectName(suggestedProject.projectName,suggestedProject.firstName,suggestedProject.organization))
            return 0;
        Data.projects.add((new Project(user,pass,suggestedProject,Data.projects.size())));

        messageSystem.projectAdded(suggestedProject.projectName,suggestedProject.description,suggestedProject.phone,
                "www.cs.bgu.ac.il/projects/"+suggestedProject.projectName);
        return Data.projects.size();
    }


    @Override
    public int registerToProject(String user, String pass, DBRegisteredProjectInfo registeredProject) {
        if(!Data.StudentContains(user,pass))
            return 0;
        if(registeredProject==null)
            return 0;
        if(!Data.CheckTeamProject(registeredProject))
            return 0;
        Data.RegisteredProjectInfo.add((new RegisteredProject(user,pass,registeredProject)));

        return Data.RegisteredProjectInfo.size();
    }
}
