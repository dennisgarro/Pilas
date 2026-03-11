import java.util.Scanner;
import java.util.Stack;

public class menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos m = new Metodos();
        Stack<Integer> pila = new Stack<>();
        boolean seguir = true;
        int opt = 0;
        while (seguir) {
            System.out.println("Bienvenido a la segunda unidad de nacho lee");
            System.out.println("donde mi mamá me mima es más dificil");
            System.out.println("Que desea realizar");
            System.out.println("1) llenarPila");
            System.out.println("2) mostrar Pila");
            System.out.println("3) Modificar Pila");
            System.out.println("4) eliminar");
            System.out.println("5) Salir");
            opt = m.ValidarEntero(sc);
            switch (opt) {
                case 1:
                    pila = m.llenarPila();
                    break;
                case 2:
                    m.Mostrar(pila);
                    break;
                case 3:
                    System.out.println("Pagina en mantenimiento");
                    break;
                case 4:
                    System.out.println("Pagina en mantenimiento");
                    break;
                case 5:
                    System.out.println("Gracias por venir ");
                    seguir = false;
                    break;

                default:
                    System.out.println("home de 1 a 5 no joda");
                    break;
            }

        }
    }
}