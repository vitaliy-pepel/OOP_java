package Settings;

import Operations.AdditionOperation;
import Operations.DivisionOperation;
import Operations.MultiplicationOperation;

import java.util.HashMap;
import java.util.Map;

/**
 * Класс калькулятора ComplexCalculator
 * */

public class ComplexCalculator {
    private Map<String, iComplexOperation> operations;
    public ComplexCalculator() {
        operations = new HashMap<String, iComplexOperation>();
        operations.put("сложение", new AdditionOperation());
        operations.put("умножение", new MultiplicationOperation());
        operations.put("деление", new DivisionOperation());
    }

    public SimpleComplexNumber execute(String operation, iComplexNumber a, iComplexNumber b) {
        iComplexOperation op = operations.get(operation);
        if (op == null) {
            throw new IllegalArgumentException("Неизвестная операция: " + operation);
        }
        SimpleComplexNumber result = (SimpleComplexNumber) op.execute(a, b);
        System.out.println("Выполнить " + operation + " чисел " + a + " и " + b + ", результат: " + result);
        return result;
    }
}