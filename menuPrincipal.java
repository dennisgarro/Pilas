import java.util.Scanner;

public class menuPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos m = new Metodos();
        menuColas mc = new menuColas();
        menu mp = new menu();
        System.out.println("Que tipo de estructuta quiere 1) Pilas 2) Colas");
        int opt = m.ValidarEntero(sc);
        opt = m.ValidarRango(1, 2, opt);
        switch (opt) {
            case 1:
                mp.MenuPilas();
                break;

            default:
                mc.MenuColas();
                break;
        }

    }
}
