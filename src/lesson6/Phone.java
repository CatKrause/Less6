package lesson6;

public class Phone {
    private long number;
    private String model;
    private double weight;

    public Phone(long number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    public Phone(long number, String model) {
        this.number = number;
        this.model = model;
    }
    public Phone() {
    }


    public long getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }
    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }
}



