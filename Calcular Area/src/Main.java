public class Main {
    public static void main(String[] args) {
        try {
            Figura[] figuras = new Figura[2];
            figuras[0] = new Circulo();
            figuras[1] = new Rectangulo();

            for (Figura figura : figuras) {
                System.out.println("Área: " + figura.calcularArea());
            }
        } catch (DimensionInvalidaException e) {
            System.err.println("Error al crear la figura: " + e.getMessage());
        }
    }
}
