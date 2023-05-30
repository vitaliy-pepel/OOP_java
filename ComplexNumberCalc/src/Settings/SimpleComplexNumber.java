package Settings;

/**
 * Класс описания комплексных чисел SimpleComplexNumber имплементирующий интерфейс iComplexNumber
 * */
public class SimpleComplexNumber implements iComplexNumber {
    private double real;
    private double imaginary;

    public SimpleComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() { return real; }
    public void setReal(double real) { this.real = real; }

    public double getImaginary() { return imaginary; }
    public void setImaginary(double imaginary) { this.imaginary = imaginary; }

    public String toString() {
        return real + " + " + imaginary + "i";
    }
}
