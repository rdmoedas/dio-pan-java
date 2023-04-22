package one.digitalinnovation;

public class Main {

    public static void main(String[] args) {

        Fila<String> minhaFila = new Fila<>();

        minhaFila.enqueue("primeiro");
        minhaFila.enqueue("segundo");
        minhaFila.enqueue("terceiro");
        minhaFila.enqueue("quarto"); 
        // minhaFila.enqueue(5); ERRO, já que a fila foi definida como STRING
        System.out.println(minhaFila);

        System.out.println(minhaFila.dequeue());
        System.out.println(minhaFila);

        minhaFila.enqueue("ultimo");
        System.out.println(minhaFila);

        System.out.println(minhaFila.first());
        System.out.println(minhaFila);

        System.out.println(minhaFila.last());
        System.out.println(minhaFila);
    }
    
}
