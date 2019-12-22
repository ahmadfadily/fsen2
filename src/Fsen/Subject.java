package Fsen;

public interface Subject {
    void registerForEmail(Observer o);
    void registerForTextMsg(Observer o);
    void notifyAll( message);

}
