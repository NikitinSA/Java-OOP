package Java_OOP_HW_1;

public class HotDrinkWithTemperature extends HotDrink {
    private double temperature;

    public HotDrinkWithTemperature(String name, double volume, double temperature) {
        super(name, volume);
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotDrinkTemperature{" +
                "name= " + name +
                ", volume= " + volume +
                ", temperature= " + temperature +
                '}';
    }
}

