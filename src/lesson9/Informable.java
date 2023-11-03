package lesson9;

public interface Informable<D> {
    default void info2(D data) {
        System.out.println("default " + data.toString());
    }
}

