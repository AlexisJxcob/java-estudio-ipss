import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        Calculadora miCalc = new Calculadora(0, 0); // se usa el operador new para instanciar (crear) un objeto real en la memoria de la computadora llamado miCalc.
        menu menuApp = new menu(miCalc);

        menuApp.iniciar();

    }
}