import java.util.Scanner;
import java.util.Stack;

public class MenuObjetual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        Metodos m = new Metodos();
        MetodosObjetuales mo = new MetodosObjetuales();
        Stack<ObjPunto7> p = new Stack<>();
        int choise = 0, numero = 0;
        while (continuar) {
            System.out.println("Bienvenido a la segunda unidad de nacho lee");
            System.out.println("donde mi mamá me mima es más dificil");
            System.out.println("Que desea realizar");
            System.out.println("1) llenarPila");
            System.out.println("2) mostrar Pila");
            System.out.println("3) Modificar Pila");
            System.out.println("4) eliminar");
            System.out.println("5) Salir");
            choise = m.ValidarEntero(sc);
            switch (choise) {
                case 1:
                    p = mo.LLenarPila();
                    break;
                case 2:
                    mo.MostrarPila(p);
                    break;
                case 3:
                    numero = m.Pedirdato(2);
                    p = mo.Modificar(p, choise);
                    break;
                case 4:
                    numero = m.Pedirdato(4);
                    p = mo.Eliminar(p, numero);
                    break;

                default:
                    continuar = false;
                    break;
            }
        }
    }
}
