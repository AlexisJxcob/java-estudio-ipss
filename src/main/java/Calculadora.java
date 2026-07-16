public class Calculadora{

    public Calculadora(int a, int b) { // constructor
        this.A = a;
        this.B = b;
    }

    int A, B;

    public void setA(int a){
        this.A = a; // guarda el valor del parametro "a" en el atributo this.A
    }

    public void setB(int b){
        this.B = b; // el constructor se encargar de guardar los datos del set
    }

    public int getA () {
        return this.A; // Devuelve el valor que tiene guardado el atributo A
    }

    public int getB () {
        return this.B;
    }

    public void sumar(int A, int B) {
        int suma = A + B;
        System.out.println("La suma es: " + suma);
    }
    public void sumar(){ // funciones distintas esta recibe parametros
        int suma = this.A + this.B;
        System.out.println("La suma es: " + suma);
    }
    public int resta(int A, int B) {
        int resto = A - B;
        return resto;
    }

    public float division(float A, float B) {
        if (B == 0) {
            System.out.println("Error no se puede imprimir por cero");
            return 0; // evitamos que el programa caiga
        }
        return A / B;
    }

    public int producto(int A, int B) {
        int pro = A * B;
        return pro;
    }
}