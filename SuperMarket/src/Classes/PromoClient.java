package Classes;

/**
 * Класс, описывающий акционного клиента
 */
public class PromoClient extends Actor{

    private String promoName; //Название акции
    private static int promoClientNumber; //Номер клиента в акции

    /**
     * Конструктор класса акционного клиента
     *
     * @param promoName Название акции
     */
    public PromoClient(String name, String promoName) {
        super(name);
        this.promoName = promoName;
        promoClientNumber++; //Инкремент номера клиента в акции

    }

    @Override
    public String getName() {
        return null;
    }

    /**
     * Метод для получения номера клиента в акции
     *
     * @return Номер клиента в акции
     */
    public static int getPromoClientNumber() {
        return promoClientNumber;
    }

    /**
     * Метод для изменения названия акции
     *
     * @param promoName Название акции
     */
    public void setPromoName(String promoName) {
        this.promoName = promoName;
    }

    /**
     * Метод для получения названия акции
     *
     * @return Название акции
     */
    public String getPromoName() {
        return promoName;
    }

    /**
     * Общие методы для всех клиентов
     */
    @Override
    public void setMakeOrder(boolean makeOrder) {

    }

    @Override
    public void setTakeOrder(boolean pickUpOrder) {

    }

    @Override
    public boolean isMakeOrder() {
        return false;
    }

    @Override
    public boolean isTakeOrder() {
        return false;
    }

    @Override
    public Actor getActor() {
        return null;
    }
}
