package lesson9;

public class ApplePhone extends Phone {
    private long iphoneNumber;

    public ApplePhone(long iphoneNumber, String model, double weight) {
        super(model, weight);
        this.iphoneNumber = iphoneNumber;
    }

    public long getIphoneNumber() {
        return iphoneNumber;
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
        System.out.printf("Номер: %d, Модель: %s, Вес: %.2f\n", getIphoneNumber(), getModel(), getWeight());
    }
}
