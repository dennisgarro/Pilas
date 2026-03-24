import java.util.Scanner;
import java.util.Stack;

public class menu {
    public  void MenuPilas() {
        Scanner sc = new Scanner(System.in);
        Metodos m = new Metodos();
        Stack<Integer> pila = new Stack<>();
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
                    pila = m.llenarPila(pila);
                    break;
                case 2:
                    m.Mostrar(pila);
                    break;
                case 3:
                    numero = m.Pedirdato(1);
                    pila = m.ModificarPila(pila, numero);
                    break;
                case 4:
                    int choise = 0;
                    numero = m.Pedirdato(4);
                    System.out
                            .println("que metodo desea implementar 1) el depilas, 2) el listas , 3) funcion anonima ");
                    choise = sc.nextInt();
                    switch (choise) {
                        case 1:
                            pila = m.Eliminar(pila, numero);
                            break;
                        case 2:
                            pila = m.Eliminar1(pila, numero);
                            break;

                        default:
                            pila = m.eliminar2(pila, numero);
                            break;
                    }

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