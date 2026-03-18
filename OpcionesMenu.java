import java.util.Scanner;

public class OpcionesMenu {
    public int Menu(Scanner sc) {
        Metodos m = new Metodos();
        int opt = 0;
        System.out.println("Bienvenido a la segunda unidad de nacho lee");
        System.out.println("donde mi mamá me mima es más dificil");
        System.out.println("Que desea realizar");
        System.out.println("1) llenarPila");
        System.out.println("2) mostrar Pila");
        System.out.println("3) Modificar Pila");
        System.out.println("4) eliminar");
        System.out.println("5) Salir");
        opt = m.ValidarEntero(sc);
        return opt;
    }
}
