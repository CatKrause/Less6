
package lesson9;

public abstract class Phone<T> implements Callable<String>, Informable<String> {
    private T number;
    private String model;
    private double weight;

    public Phone(T number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String model, double weight) {
        this.model = model;
        this.weight = weight;
    }


    public Phone() {

    }
        public T getNumber() {
            return number;
        }

        public String getModel() {
            return model;
        }

        public double getWeight() {
            return weight;

        }

    public void receiveCall(String name) throws NameException {
        System.out.println("Звонит " + name);
        if (name.length() < 4) {
            throw new NameException("Недопустимое количество символов");
        }
    }

    public abstract void myException(int value) throws NameException;


        public abstract void info();
    }




