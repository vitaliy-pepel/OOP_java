package Operations;
import Settings.SimpleComplexNumber;
import Settings.iComplexNumber;
import Settings.iComplexOperation;

/**
 * Класс операция "деление" AdditionOperation имплементирующий интерфейс iComplexOperation
 * */

public class DivisionOperation implements iComplexOperation {
    public SimpleComplexNumber execute(iComplexNumber a, iComplexNumber b) {
        double denominator = b.getReal()*b.getReal() + b.getImaginary()*b.getImaginary();
        double real = (a.getReal()*b.getReal() + a.getImaginary()*b.getImaginary()) / denominator;
        double imaginary = (a.getImaginary()*b.getReal() - a.getReal()*b.getImaginary()) / denominator;
        return new SimpleComplexNumber(real, imaginary);
    }
}
