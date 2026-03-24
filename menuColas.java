import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class menuColas {
    public  void MenuColas() {
        Scanner sc = new Scanner(System.in);
        Metodos m = new Metodos();
        Queue<Integer> cola = new LinkedList<>();
        boolean seguir = true;
        int opt = 0, numero = 0;
        while (seguir) {
            System.out.println("Bienvenido a la segunda unidad de nacho lee");
            System.out.println("donde mi mamá me mima es más dificil");
            System.out.println("Que desea realizar");
            System.out.println("1) llenarCola");
            System.out.println("2) mostrar Cola");
            System.out.println("3) Modificar Cola");
            System.out.println("4) eliminar");
            System.out.println("5) Salir");
            opt = m.ValidarEntero(sc);
            switch (opt) {
                case 1:
                    cola = m.llenarCola(cola);
                    break;
                case 2:
                    m.Mostrar(cola);
                    break;
                case 3:
                    numero = m.Pedirdato(1);
                    cola = m.ModificarCola(cola, numero);
                    break;
                case 4:
                    numero = m.Pedirdato(3);

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