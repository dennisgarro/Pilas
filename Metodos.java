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

    public Stack<Integer> llenarPila(Stack<Integer> p) {
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

    public int Pedirdato(int opt) {
        Metodos m = new Metodos();
        switch (opt) {
            case 1:
                System.out.println("Ingrese El numero a Modificar");
                opt = m.ValidarEntero(sc);
                break;
            case 2:
                System.out.println("Ingrese El nuevo numero Modificado");
                opt = m.ValidarEntero(sc);
                break;
            case 3:
                System.out.println("Eliminar todos repetidos 1, eliminar solo el primero 2");
                opt = m.ValidarEntero(sc);
                break;

            default:
                System.out.println("Ingrese el numero a eliminar");
                opt = m.ValidarEntero(sc);
                break;
        }
        return opt;

    }

    public Stack<Integer> ModificarPila(Stack<Integer> p, int numero) {
        Stack<Integer> Auxp = new Stack<>();
        Metodos m = new Metodos();
        int n = p.size();
        for (int i = 0; i < n; i++) {
            if (p.peek().equals(numero)) {
                p.pop();
                Auxp.push(m.Pedirdato(2));
            } else {
                Auxp.push(p.pop());
            }
        }
        for (int i = 0; i < n; i++) {
            p.push(Auxp.pop());
        }
        return p;
    }

    public Stack<Integer> Eliminar(Stack<Integer> p, int numero) {
        Stack<Integer> Auxp = new Stack<>();
        Metodos m = new Metodos();
        int opt = m.Pedirdato(3);
        boolean encontrado = true;
        if (opt == 1) {
            while (!p.isEmpty()) {
                if (p.peek().equals(numero)) {
                    p.pop();
                } else {
                    Auxp.push(p.pop());
                }
            }
        } else {

            while (!p.isEmpty()) {
                if (p.peek().equals(numero) && encontrado) {
                    p.pop();
                    encontrado = false;
                } else {
                    Auxp.push(p.pop());
                }

            }

        }

        while (!Auxp.isEmpty()) {
            p.push(Auxp.pop());
        }

        return p;
    }

    public Stack<Integer> Eliminar1(Stack<Integer> p, int numero) {
        for (int i = 0; i < p.size(); i++) {
            if (p.get(i).equals(numero)) {
                p.remove(i);
            }
        }
        return p;
    }

    public Stack<Integer> eliminar2(Stack<Integer> p, int numero) {
        p.removeIf(x -> x.equals(numero));
        return p;
    }
}