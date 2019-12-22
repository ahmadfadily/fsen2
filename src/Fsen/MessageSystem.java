package Fsen;

import java.util.HashSet;
import java.util.Set;

public class MessageSystem implements Subject {
    private Set<Observer> observerForEmail;
    private Set<Observer> observerForTextMsg;


    public void projectAdded(String projectName, String description, String contactInfo, String URL) {
        //TODO print statement
    }

    @Override
    public void notifyAll(String projectName, String URL) {
        Email emailToSend = new Email(projectName, URL);
        TextMsg textToSend = new TextMsg(projectName, URL);
        for (Observer o: observerForEmail) {
            o.update(emailToSend);
        }
        for (Observer o: observerForTextMsg) {
            o.update(textToSend);
        }

    }


    @Override
    public void registerForEmail(Observer o) {
        if (observerForEmail ==null){
            observerForEmail = new HashSet<>();
        }
        observerForEmail.add(o);
    }

    @Override
    public void registerForTextMsg(Observer o) {
        if (observerForTextMsg ==null){
            observerForTextMsg = new HashSet<>();
        }
        observerForTextMsg.add(o);
    }
}

