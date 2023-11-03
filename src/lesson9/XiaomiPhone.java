package lesson9;

public class XiaomiPhone extends Phone<Integer> implements Callable<String>, Informable<String> {
    public XiaomiPhone(Integer number, String model, double weight) {
        super(number, model, weight);
    }

    @Override
    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    @Override
    public void info() {
        System.out.printf("Номер: %d, Модель: %s, Вес: %.2f\n", getNumber(), getModel(), getWeight());

    }

    @Override
    public void info2(String data) {
        System.out.println("default " + data.toString());
    }
}