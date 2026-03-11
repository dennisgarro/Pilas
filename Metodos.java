import java.util.Scanner;
import java.util.Stack;

public class Metodos {
    Scanner sc = new Scanner(System.in);

    public int ValidarEntero(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Por favor digite un numero");
            sc.nextLine();
        }
        return sc.nextInt();
    }

    public Double ValidarDecimal(Scanner sc) {
        while (!sc.hasNextDouble()) {
            System.out.println("Por favor digite un numero");
            sc.nextLine();
        }
        return sc.nextDouble();
    }

    public int ValidarRango(int n1, int n2, int numero) {
        Metodos m = new Metodos();
        while (numero < n1 || numero > n2) {
            System.out.println("Por favor ingrese un rango de :" + n1 + " hasta " + n2);
            numero = m.ValidarEntero(sc);
        }
        return numero;
    }

    public Stack<Integer> llenarPila() {
        Stack<Integer> p = new Stack<>();
        Metodos m = new Metodos();
        boolean bandera = true;
        int opt = 0;
        while (bandera) {
            System.out.println("Ingrese el numero");
            p.push(m.ValidarEntero(sc));
            System.out.println("Desea ingresar mas registros 1) si , 2) no");
            opt = m.ValidarEntero(sc);
            opt = m.ValidarRango(1, 2, opt);
            if (opt == 2) {
                bandera = false;
            }
        }
        return p;
    }

    public void Mostrar(Stack<Integer> p) {
        System.out.println(p);
    }
}
