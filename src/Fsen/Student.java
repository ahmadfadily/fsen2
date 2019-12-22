package Fsen;

public class Student implements Observer{
    public String user;
    public String password;
    private MessageSystem messageSystem;


    public Student(String user, String password, MessageSystem messageSystem) {
        this.user = user;
        this.password = password;
        this.messageSystem = messageSystem;
    }

    private void registerForUpdates(boolean emailUpdates, boolean textMsgUpdates){
        if (emailUpdates||textMsgUpdates){
            if (emailUpdates){
                messageSystem.registerForEmail(this);
            }
            if (textMsgUpdates){
                messageSystem.registerForTextMsg(this);
            }
        }
    }

    @Override
    public void update(Message m) {
        if (m instanceof Email){
            System.out.println("Received an email update. ");
        }
        if (m instanceof TextMsg){
            System.out.println("Received a text message update. ");
        }
        System.out.println("New approved project. Name: "+m.getProjectName()+", URL: "+m.getProjectURL());
    }

}
