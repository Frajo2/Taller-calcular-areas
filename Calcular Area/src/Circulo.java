// Circulo.java
import java.util.Scanner;

public class Circulo implements Figura {
    private double radio;

    public Circulo() throws DimensionInvalidaException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el radio del círculo: ");
        double inputRadio = scanner.nextDouble();

        if (inputRadio <= 0) {
            throw new DimensionInvalidaException("El radio debe ser mayor que cero");
        }

        this.radio = inputRadio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
}
