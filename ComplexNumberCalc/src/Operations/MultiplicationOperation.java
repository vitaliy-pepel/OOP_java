package Operations;
import Settings.SimpleComplexNumber;
import Settings.iComplexNumber;
import Settings.iComplexOperation;

/**
 * Класс операция "умножение" AdditionOperation имплементирующий интерфейс iComplexOperation
 * */

public class MultiplicationOperation implements iComplexOperation {
    public SimpleComplexNumber execute(iComplexNumber a, iComplexNumber b) {
        double real = a.getReal()*b.getReal() - a.getImaginary()*b.getImaginary();
        double imaginary = a.getImaginary()*b.getReal() + a.getReal()*b.getImaginary();
        return new SimpleComplexNumber(real, imaginary);
    }
}
