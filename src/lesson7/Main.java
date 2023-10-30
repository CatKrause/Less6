package lesson7;

public class Main {
    public static void main(String[] args) {
        SamsungPhone samsung = new SamsungPhone("+123456789", "Samsung S-150", 155.7);
        samsung.receiveCall("Ли Бён Чхоль");
        samsung.info();
        System.out.println();

        XiaomiPhone xiaomi = new XiaomiPhone("+258965874", "Xiaomi pro super plus", 2.100);
        xiaomi.receiveCall("Лэй Цзюнь");
        xiaomi.info();
        System.out.println();

        ApplePhone apple = new ApplePhone(880035535, "Iphone 17", 0.01);
        apple.receiveCall("Стив Джобс");
        apple.info();
    }
}

