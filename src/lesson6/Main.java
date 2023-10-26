package lesson6;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone(123456789, "Motorola", 155.7);
        Phone phone2 = new Phone(987654321, "Samsung");
        Phone phone3 = new Phone();

        System.out.println("Phone 1:");
        phone1.receiveCall("Вася");
        System.out.println("Number: " + phone1.getNumber());
        System.out.println("Model: " + phone1.getModel());
        System.out.println("Weight: " + phone1.getWeight());

        System.out.println("\nPhone 2:");
        phone2.receiveCall("Петя");
        System.out.println("Number: " + phone2.getNumber());
        System.out.println("Model: " + phone2.getModel());
        System.out.println("Weight: " + phone2.getWeight());

        System.out.println("\nPhone 3:");
        phone2.receiveCall("Илон Маск");
        System.out.println("Number: " + phone3.getNumber());
        System.out.println("Model: " + phone3.getModel());
        System.out.println("Weight: " + phone3.getWeight());
    }
}