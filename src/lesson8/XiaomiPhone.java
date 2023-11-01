package lesson8;

public class XiaomiPhone extends Phone implements Callable, Informable{
    public XiaomiPhone(String number, String model, double weight) {
        super(number, model, weight);
    }

    @Override
    public void info() {
        System.out.printf("Номер: %s, Модель: %s, Вес: %.2f\n", getNumber(), getModel(), getWeight());
    }
}
