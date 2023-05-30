import Settings.ComplexCalculator;
import Settings.SimpleComplexNumber;
import Settings.iComplexNumber;

import java.util.logging.*;

/**
 * Класс Main результирующий работу программы, с примером выполнения арифметических операция над комплексными числами
 *  с логированием
 * */

public class Main {
    public static void main(String[] args) {

        //Логер уровня INFO
        Logger log = Logger.getLogger(ComplexCalculator.class.getName());
        log.setLevel(Level.INFO);
        ConsoleHandler ch = new ConsoleHandler();
        log.addHandler(ch);
        SimpleFormatter sf = new SimpleFormatter();
        ch.setFormatter(sf);

        //Пример работы программы
        ComplexCalculator calc = new ComplexCalculator();
        iComplexNumber a = new SimpleComplexNumber(-4, 2);
        iComplexNumber b = new SimpleComplexNumber(1, -3);
        SimpleComplexNumber result1 = calc.execute("сложение", a, b);
        SimpleComplexNumber result2 = calc.execute("умножение", a, b);
        SimpleComplexNumber result3 = calc.execute("деление", a, b);


        log.info("Программа отработала успешно");

    }
}