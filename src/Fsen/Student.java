package Fsen;

public class Student{
    public String user;
    public String password;


    public Student(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public void registerForEmail(Project p){
        new EmailObserver(p,user+"@bgu.post.ac.il");
    }

    public void registerForTextMsg(Project p, String phone){
        new TextMsgObserver(p,phone);
    }


}
