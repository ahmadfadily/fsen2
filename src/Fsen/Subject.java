package Fsen;

import java.util.LinkedList;
import java.util.List;

public abstract class Subject {
    protected List<Observer> observerList;


    public void register(Observer o){
        if (observerList ==null){
            observerList = new LinkedList<>();
        }
        observerList.add(o);
    }
    public void unregister(Observer o){
        if (observerList !=null){
            observerList.remove(o);
        }
    }
    public void notifyAll(String projectName, String description, String contactInfo, String URL){
        for (Observer o: observerList) {
            o.update(projectName, description, contactInfo, URL);
        }
    }


}
