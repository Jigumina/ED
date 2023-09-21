public class Pila<E> {
    private Nodo<E> cima;


    public Pila(){
        cima = null;
    }

    public void push(E dato){
        Nodo<E> nodo = new Nodo<>(dato);
        nodo.next = cima;
        cima = nodo;
    }
    public E pop () {
        if (!isEmpty()) {
            E dato = cima.datos;
            cima = cima.next;
            return dato;
        } else {
            return null;
        }
    }

    public E peek (){
        if (!isEmpty()){
            return cima.datos;
        }else {
            return null;
        }
}
    public boolean isEmpty(){
        return cima == null;
    }
    public void mostrar(){
        Nodo<E> cabeza = cima;
        System.out.print("Pila actual: ");
        while (cabeza !=null){
            System.out.print(cabeza.datos + ", ");
            cabeza = cabeza.next;
        }
        System.out.println();
    }
}
