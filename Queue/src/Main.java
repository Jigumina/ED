public class Main {
    public static void main(String[] args) {
        // Ejemplo de uso de Stack basado en lista enlazada
                Pila<Integer> pila = new Pila<>();
                pila.push(1);
                pila.push(2);
                pila.push(3);

                System.out.println("---Pila---");
                System.out.println("Pop: " + pila.pop());
                System.out.println("Peek: " + pila.peek());
                pila.mostrar();
                pila.push(5);
                pila.mostrar();
                pila.pop();
                pila.mostrar();


                // Ejemplo de uso de Queue basado en lista enlazada
                Cola<String> queue = new Cola<>();
                queue.push("A");
                queue.push("B");
                queue.push("C");

                System.out.println("\n----Queue-----");
                System.out.println("Pop: " + queue.pop());
                System.out.println("Peek: " + queue.peek());
                queue.mostrar();
            }
        }


