package lesson9;

public class SamsungPhone extends Phone<String> implements Callable<String>, Informable<String>{
    public SamsungPhone(String number, String model, double weight) {
        super(number, model, weight);
    }

    @Override
    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    @Override
    public void info() {
        System.out.printf("Номер: %s, Модель: %s, Вес: %.2f\n", getNumber(), getModel(), getWeight());
    }


    }


