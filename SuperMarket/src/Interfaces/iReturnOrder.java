package Interfaces;

/**
 * Реализация метода интерфейса iReturnOrder для проверки возможности возврата товара
 */
public interface iReturnOrder {

    /**
     * @return Результат проверки возможности возврата товара
     */
    public boolean checkReturn();

    /**
     * Реализация метода интерфейса iReturnOrder для обработки возврата товара
     */
    public void returnOrder();
}


