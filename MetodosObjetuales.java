import java.util.Scanner;
import java.util.Stack;

public class MetodosObjetuales {
    Scanner sc = new Scanner(System.in);

    public Stack<ObjPunto7> LLenarPila() {
        Stack<ObjPunto7> p = new Stack<>();
        Metodos m = new Metodos();
        boolean pedir = true;
        int opt = 0;
        while (pedir) {
            ObjPunto7 o = new ObjPunto7();
            System.out.println("Ingrese el valor ");
            o.setDato(m.ValidarEntero(sc));
            p.push(o);
            System.out.println("desea continuar 1) si , 2) no");
            opt = m.ValidarEntero(sc);
            if (opt == 2) {
                pedir = false;
            }
        }
        return p;
    }

    public void MostrarPila(Stack<ObjPunto7> p) {
        for (ObjPunto7 o : p) {
            System.out.print(" - " + o.getDato());
        }
    }

    public Stack<ObjPunto7> Modificar(Stack<ObjPunto7> p, int numero) {
        for (ObjPunto7 o : p) {
            if (o.getDato() == numero) {
                o.setDato(255);
            }
        }
        return p;
    }

    public Stack<ObjPunto7> Eliminar2(Stack<ObjPunto7> p, int numero) {
        p.removeIf(o -> o.getDato() == numero);
        return p;
    }

    public Stack<ObjPunto7> Eliminar(Stack<ObjPunto7> p, int numero) {
        for (int i = p.size() - 1; i >= 0; i--) {
            if (p.get(i).getDato() == numero) {
                p.remove(i);
            }
        }
        return p;
    }

}
