package Fsen;

import acptTests.auxiliary.DBSuggestedProjectInfo;

public class Project {
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

}
