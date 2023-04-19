package VendingMachines;

import Products.Product;
import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    private int volume;
    private List<Product> products; // = new ArrayList<Product>(); можно объявить сразу
    private List<String> workLog; // = new ArrayList<String>();

    public VendingMachine(int volume) {
        this.volume = volume;
        products = new ArrayList<Product>(); // все продукты
        workLog = new ArrayList<String>();
    }

    // добавить продукт
    public void addProduct(Product prod) {
        products.add(prod);
    }

    // запись о продаже
    public void addSales(String line) {
        workLog.add(line);
    }

    // метод выдачи продукта
    public Product getProdByName(String name) { // принимает строку с названием продукта
        for (Product prod : products) { // перебераем все продукты (где ищем: что ищем)
            if (prod.getName().contains(name)) { // если нашёл true
                return prod; // верни продукт
            }
        }
        return null; // не нашёл
    }

    // выдаём все продукты
    public List<Product> getProdAll() {
        return products;
    }

}
