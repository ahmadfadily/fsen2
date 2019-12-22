package Fsen;

import acptTests.auxiliary.DBSuggestedProjectInfo;

public class Project extends Subject{
    public static String user;
    public static String password;
    public static DBSuggestedProjectInfo Suggested;
    public static int id;
    public Project(String user, String password,DBSuggestedProjectInfo Suggested, int id){
        this.user=user;
        this.password=password;
        this.Suggested=Suggested;
        this.id=id;
    }

    public void statusChange(){
        notifyAll(Suggested.projectName, Suggested.description, Suggested.email,
                "www.cs.bgu.ac.il/projects/"+Suggested.projectName);
    }


}
