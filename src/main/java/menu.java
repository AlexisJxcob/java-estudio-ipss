import java.util.Scanner;

public class menu {
    private Scanner Leer;
    private Calculadora miCalc;

    // Constructor: al crear el menú, le pasamos la calculadora que va a controlar
    public menu(Calculadora calc) {
        this.Leer = new Scanner(System.in);
        this.miCalc = calc;
    }

    // metodo principal que arranca el menu
    public void iniciar() {
        int opcion;
        do {
            mostrarOpciones();
            opcion = Leer.nextInt();
            procesarOpcion(opcion);
        } while (opcion != 6);
        Leer.close();
    }

    // Un método privado porque solo se usa dentro de esta clase para limpiar el código
    private void mostrarOpciones() {
        System.out.println("\n=== MENÚ CALCULADORA ===");
        System.out.println("1. Ingresar / Actualizar Números");
        System.out.println("2. Sumar");
        System.out.println("3. Restar");
        System.out.println("4. Multiplicar");
        System.out.println("5. Dividir");
        System.out.println("6. Salir");
        System.out.print("Seleccione una opción: ");
    }

    // Este método procesa la selección del usuario
    private void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                System.out.print("Ingrese el primer número: ");
                int n1 = Leer.nextInt();
                System.out.print("Ingrese el segundo número: ");
                int n2 = Leer.nextInt();

                miCalc.setA(n1);
                miCalc.setB(n2);
                System.out.println("¡Números guardados con éxito!");
                break;

            case 2:
                System.out.println("--- Suma ---");
                miCalc.sumar();
                int suma = miCalc.sumar(miCalc.getA(), miCalc.getB());
                System.out.println("La suma de: " + miCalc.getA() + " + " + miCalc.getB() + " es = " + suma);
                break;

            case 3:
                System.out.println("--- Resta ---");
                int resta = miCalc.resta(miCalc.getA(), miCalc.getB());
                System.out.println("La resta de: " + miCalc.getA() + " - " + miCalc.getB() + " es = " + resta);
                break;

            case 4:
                System.out.println("--- Multiplicación ---");
                int prod = miCalc.producto(miCalc.getA(), miCalc.getB());
                System.out.println("El producto de: " + miCalc.getA() + " * " + miCalc.getB() + " es = " + prod);
                break;

            case 5:
                System.out.println("--- División ---");
                float div = miCalc.division(miCalc.getA(), miCalc.getB());
                System.out.println("La división de: " + miCalc.getA() + " / " + miCalc.getB() + " es = " + div);
                break;

            case 6:
                System.out.println("Saliendo de la calculadora. ¡Adiós!");
                break;

            default:
                System.out.println("Opción no válida. Intente nuevamente.");
                break;
        }
    }
}