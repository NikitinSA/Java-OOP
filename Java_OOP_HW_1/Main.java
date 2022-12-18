package Java_OOP_HW_1;

public class Main {
    public static void main(String[] args) {
        String[] product = HotDrinkVendingMachine.menu();

        for (String string : product) {
            System.out.println(string);
        }

        HotDrinkWithTemperature product1 = new HotDrinkWithTemperature(product[0],
                Double.parseDouble(product[1]), Double.parseDouble(product[2]));

        HotDrinkVendingMachine product2 = new HotDrinkVendingMachine(product1);

        System.out.println(product1);
        System.out.println(product2);

        product2.getProduct("чай", 0.2, 85);
        System.out.println(product2);
    }
}