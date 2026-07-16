import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Calculadora miCalc = new Calculadora();

        System.out.println("Ingrese un número:");
        int n1 = leer.nextInt();

        System.out.println("Ingrese otro número:");
        int n2 = leer.nextInt();

        miCalc.setA(n1);
        miCalc.setB(n2);

        miCalc.sumar();
        miCalc.sumar(n1, n2);
        int resultado = miCalc.resta(n1, n2);
        System.out.println("La resta es: " + resultado);

        System.out.println("La informacion obtenida por getA es: " + miCalc.getA());

        System.out.println("La informacion obtenida por getB es: " + miCalc.getB());

        System.out.println("primer print en jdk 25");
    }
}