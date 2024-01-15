import java.util.Scanner;
public class Rectangulo implements Figura {
    private double base;
    private double altura;
    public Rectangulo() throws DimensionInvalidaException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la base del rectángulo: ");
        double inputBase = scanner.nextDouble();

        System.out.print("Ingrese la altura del rectángulo: ");
        double inputAltura = scanner.nextDouble();

        if (inputBase <= 0 || inputAltura <= 0) {
            throw new DimensionInvalidaException("La base y la altura deben ser mayores que cero");
        }

        this.base = inputBase;
        this.altura = inputAltura;
    }
    @Override
    public double calcularArea() {
        return base * altura;
    }
}
