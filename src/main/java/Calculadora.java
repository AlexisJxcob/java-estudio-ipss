public class Calculadora{

    int A, B;

    public void setA(int a){
        this.A = a; // guarda el valor del parametro "a" en el atributo this.A
    }

    public void setB(int b){
        this.B = b;
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
    public void sumar(){
        int suma = this.A + this.B;
        System.out.println("La suma es: " + suma);
    }
    public int resta(int A, int B) {
        int resto = A - B;
        return resto;
    }
}