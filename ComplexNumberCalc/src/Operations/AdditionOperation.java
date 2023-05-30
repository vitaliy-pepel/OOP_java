package Operations;
import Settings.SimpleComplexNumber;
import Settings.iComplexNumber;
import Settings.iComplexOperation;

/**
 * Класс операция "сложение" AdditionOperation имплементирующий интерфейс iComplexOperation
 * */

public class AdditionOperation implements iComplexOperation {
    public SimpleComplexNumber execute(iComplexNumber a, iComplexNumber b) {
        double real = a.getReal() + b.getReal();
        double imaginary = a.getImaginary() + b.getImaginary();
        return new SimpleComplexNumber(real, imaginary);
    }
}
