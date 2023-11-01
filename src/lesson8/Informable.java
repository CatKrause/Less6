package lesson8;

public interface Informable {
    default void info2() {
        System.out.println("default");
    }
}

