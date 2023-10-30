
package lesson7;

public abstract class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String model, double weight) {
        this.model = model;
        this.weight = weight;
    }


    public Phone() {

    }
        public String getNumber() {
            return number;
        }

        public String getModel() {
            return model;
        }

        public double getWeight() {
            return weight;

        }
        public void receiveCall(String name){
            System.out.println("Звонит " + name);
        }

        public abstract void info();
    }




