package Fsen;
import acptTests.auxiliary.DBRegisteredProjectInfo;

public class RegisteredProject {
    public static String user;
    public static String password;
    public static DBRegisteredProjectInfo Registered;
    public RegisteredProject(String user, String password,DBRegisteredProjectInfo Registered){
        this.user=user;
        this.password=password;
        this.Registered=Registered;
    }
}
