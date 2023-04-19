package Products;

public class HotDrink extends Product {
    private int temperature; // температура

    // Конструктор класса
    public HotDrink(String name, double price, int temperature) {
        super(name, price); // конструктор родительского класса
        this.temperature = temperature; // доп. поле температура
    }

    // Переопределяем метод toString()
    public String toString() {
        return "Product{" +
                "name='" + super.getName() + '\'' +
                ", cost=" + super.getPrice() +
                ", temp=" + temperature + "`c" +
                '}';
    }

}
