
import java.util.Scanner;
import java.util.Stack;

public class menu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos m = new Metodos();
        Stack<Integer> pila = new Stack<>();
        Stack<obj> PilaO = new Stack<>();
        boolean seguir = true;
        int opt = 0, numero = 0;
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
                    // System.out.println("vamos a llenar la pila de datos primitivos");
                    // pila = m.llenarPila(pila);
                    System.out.println("Ahora vamos a llenar la pila Objetual");
                    PilaO = m.llenarPilaO(PilaO);
                    break;
                case 2:
                    // System.out.println("vamos a Mostrar la pila de datos primitivos");
                    // m.Mostrar(pila);
                    System.out.println("Ahora vamos Mostrar la pila Objetual");
                    m.MostrarO(PilaO);
                    break;
                case 3:
                    numero = m.Pedirdato(1);
                    PilaO = m.ModificarPilaObj(PilaO, numero);
                    // pila = m.ModificarPilaNuevoMetodo(pila, numero);
                    // pila = m.ModificarPila(pila, numero);
                    break;
                case 4:
                    numero = m.Pedirdato(3);
                    // pila = m.Eliminar(pila, numero);
                    // pila = m.Eliminar2(pila, numero);
                    // pila = m.Eliminar3(pila, numero);
                    // PilaO = m.EliminaObj(PilaO, numero);
                    PilaO = m.EliminaObjViejo(PilaO, numero);
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
