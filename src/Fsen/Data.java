package Fsen;

import acptTests.auxiliary.DBRegisteredProjectInfo;

import java.util.Iterator;
import java.util.LinkedList;

public class Data {
    public static LinkedList<TechnicalAdviser> TechAdviser=new LinkedList<TechnicalAdviser>();
    public static LinkedList<Student> Student =new LinkedList<Student>();
    public static LinkedList<Project> projects= new LinkedList<Project>();
    public static LinkedList<RegisteredProject> RegisteredProjectInfo= new LinkedList<RegisteredProject>();

    public static boolean TechAdviserContains(String user, String password) {
            for(TechnicalAdviser i : TechAdviser){
                if (i.user == user) {
                    if (i.password != password)
                    return false;
                else
                    return true;
            }
        }
            return false;
    }

    public static boolean StudentContains(String user, String password) {
        Iterator<Student> it = Student.iterator();
        while (it.hasNext()) {
            Student Stud = it.next();
            if (Stud.user == user) {
                if (Stud.password != password)
                    return false;
                else
                    return true;
            }
        }
        return false;
    }

    public static boolean CheckProjectName(String name,String user,String org) {
        Iterator<Project> it = projects.iterator();
        while (it.hasNext()) {
            Project proj =it.next();
            if (proj.Suggested.projectName == name) {
                if(proj.Suggested.organization==org || proj.Suggested.firstName== user)
                    return false;
            }
        }
        return true;
    }
    public static boolean CheckTeamProject(String user, String password, DBRegisteredProjectInfo Registered){
        for (RegisteredProject i :RegisteredProjectInfo)
            if(i.Registered.equals(Registered))
                return false;
        if(Registered.studentList.size()<2)
            return false;
        if(Registered.academicAdviser==null || Registered.academicAdviser=="")
            return false;
        return true;
    }

}