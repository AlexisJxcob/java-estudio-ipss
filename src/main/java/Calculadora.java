public class Calculadora {

    // Atributos privados (Encapsulamiento real)
    private int A;
    private int B;

    // Constructor
    public Calculadora(int a, int b) {
        this.A = a;
        this.B = b;
    }

    // Setters y Getters
    public void setA(int a) {
        this.A = a;
    }

    public void setB(int b) {
        this.B = b;
    }

    public int getA() {
        return this.A;
    }

    public int getB() {
        return this.B;
    }

    // --- MÉTODOS DE OPERACIÓN OPTIMIZADOS ---

    // Sobrecarga 1: Suma usando atributos internos (vacío, solo imprime)
    public void sumar() {
        int suma = this.A + this.B;
        System.out.println("La suma (desde atributos internos) es: " + suma);
    }

    // Sobrecarga 2: Ahora SÍ retorna un entero para que coincida con tu menú
    public int sumar(int A, int B) {
        return A + B;
    }

    public int resta(int A, int B) {
        return A - B;
    }

    public int producto(int A, int B) {
        return A * B;
    }

    // División optimizada: maneja decimales y evita que el programa muera si dividen por cero
    public float division(float A, float B) {
        if (B == 0) {
            System.out.println("¡Error matemático: No se puede dividir por cero!");
            return 0.0f; // Retorna cero seguro
        }
        return A / B; // Retorna el valor decimal correcto (ej. 2.5)
    }
}