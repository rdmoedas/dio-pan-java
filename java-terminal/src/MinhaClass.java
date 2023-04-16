import java.util.Locale;
import java.util.Scanner;

public class MinhaClass {

    public static void main(String[] args) {
        System.out.println("Hello World, execulted by terminal!");

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome:");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome:");
        String sobrenome = scanner.next();

        System.out.println(nome.concat(" ").concat(sobrenome));
    }
    
}
