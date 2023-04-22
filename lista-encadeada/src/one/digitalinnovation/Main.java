package one.digitalinnovation;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada<String> listaLegal = new ListaEncadeada<String>();

        listaLegal.add("item um");
        listaLegal.add("item dois");
        listaLegal.add("item tres");
        listaLegal.add("item quatro");

        System.out.println(listaLegal.size());
        System.out.println(listaLegal.get(0) + " | " + listaLegal.get(1));
        System.out.println(listaLegal);

        listaLegal.remove(3);
        System.out.println(listaLegal.size());
        System.out.println(listaLegal);

        listaLegal.remove(99); // Expect error
        listaLegal.get(99);  // Expect error
    }
}
