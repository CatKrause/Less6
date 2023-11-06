package lesson9;

public class Main {
    public static void main(String[] args) {

        Callable<String> samsung = new SamsungPhone("+123456789", "Samsung S-150", 155.7);
        try {
            samsung.receiveCall("Ва");
        } catch (NameException e) {
            System.out.println("Ошибка: " + e.getMessage());
            samsung.info();
            System.out.println();

            Callable<String> callable = new XiaomiPhone(258965, "Xiaomi pro super plus", 2.100);
            try {
                callable.receiveCall("Владимир");
            } catch (NameException t) {
                System.out.println("Ошибка: " + t.getMessage());
                callable.info();
                System.out.println();

                ApplePhone apple = new ApplePhone(880035535, "Iphone 17", 0.01);
                try {
                    apple.receiveCall("Стив Джобс");
                } catch (NameException a) {
                    System.out.println("Ошибка: " + a.getMessage());
                }
                apple.info();
                apple.info2(35);
            }
        }
    }
}

