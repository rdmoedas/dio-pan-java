public class MinhaClasse {
    
    public static void main (String [] args) {
        System.out.println( "Olá mundo!" );

        String primeiroNome = "Rodolfo";
        String segundoNome = "Santana";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.print(nomeCompleto);
    }


    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
