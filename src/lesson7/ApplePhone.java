package lesson7;

public class ApplePhone extends Phone{
    private long iphoneNumber;

    public ApplePhone(long iphoneNumber, String model, double weight) {
        super(model, weight);
        this.iphoneNumber = iphoneNumber;
    }

    public long getIphoneNumber() {
        return iphoneNumber;
    }

    @Override
    public void info() {
        System.out.printf("Номер: %d, Модель: %s, Вес: %.2f\n", getIphoneNumber(), getModel(), getWeight());
    }
}
