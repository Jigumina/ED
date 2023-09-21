public class Nodo <E> {
    E datos;
    Nodo<E> next;

    public Nodo(E datos) {
        this.datos = datos;
        this.next = null;

    }
}
