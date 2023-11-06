package lesson9;

public interface Callable<T> {
    void receiveCall(T name) throws NameException;


    void info();
}


