class Cola<T> {
    private Nodo<T> inicio;
    private Nodo<T> ultimo;

    public Cola() {
        inicio = ultimo = null;
    }

    public void push(T dato) {
        Nodo<T> nodo = new Nodo<>(dato);
        if (isEmpty()) {
            inicio = ultimo = nodo;
        } else {
            ultimo.next = nodo;
            ultimo = nodo;
        }
    }

    public T pop() {
        if (!isEmpty()) {
            T item = inicio.datos;
            inicio = inicio.next;
            if (inicio == null) {
                ultimo = null;
            }
            return item;
        } else {
            return null;
        }
    }

    public T peek() {
        if (!isEmpty()) {
            return inicio.datos;
        } else {
            return null;
        }
    }

    public boolean isEmpty() {
        return inicio == null;
    }

    public void mostrar() {
        Nodo<T> mostrar = inicio;
        System.out.print("Cola actual: ");
        while (mostrar != null) {
            System.out.print(mostrar.datos + ",  ");
            mostrar = mostrar.next;
        }
        System.out.println();
    }
}
