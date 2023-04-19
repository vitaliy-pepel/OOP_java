import Products.Product;
import Products.BottleOfWater;
import Products.HotDrink;
import VendingMachines.VendingMachine;

public class App {
    public static void main(String[] args) throws Exception {

        Product item1 = new Product("Cola", 88.0);
        item1.setPrice(98.0);

        // Добавляем продукты
        VendingMachine itemMachin = new VendingMachine(300);
        itemMachin.addProduct(item1);
        itemMachin.addProduct(new Product("Чипсы", 60.0));
        itemMachin.addProduct(new Product("Масло", 50.0));
        itemMachin.addProduct(new Product("Хлеб", 40.0));
        itemMachin.addProduct(new Product("Снек", 20.0));
        itemMachin.addProduct(new BottleOfWater("Cola", 88.0, 500));
        itemMachin.addProduct(new BottleOfWater("Water", 188.0, 1500));

        // добавляем горячий напиток
        itemMachin.addProduct(new HotDrink("Капучина", 250.0, 80));
        itemMachin.addProduct(new HotDrink("Чай", 80.0, 90));
        itemMachin.addProduct(new HotDrink("Кокава", 150.0, 85));

        // напечатать все продукты
        for (Product prod : itemMachin.getProdAll()) {
            System.out.println(prod.toString());
        }

    }
}
