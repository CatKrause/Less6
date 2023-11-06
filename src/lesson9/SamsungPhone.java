package lesson9;

public class SamsungPhone extends Phone<String> implements Callable<String>, Informable<String> {
    public SamsungPhone(String number, String model, double weight) {
        super(number, model, weight);
    }

    @Override
    public void receiveCall(String name) throws NameException {
        System.out.println("Звонит " + name);
        if (name.length() < 4) {
            throw new NameException("Недопустимое количество символов");
        }
    }

    @Override
    public void myException(int value) throws NameException {
    }


    @Override
    public void info() {
        System.out.printf("Номер: %s, Модель: %s, Вес: %.2f\n", getNumber(), getModel(), getWeight());
    }


}


