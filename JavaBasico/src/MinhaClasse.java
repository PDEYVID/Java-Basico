public class MinhaClasse {
    public static void main(String[] args) {

        String primeiroNome = "PAULO";
        String segundoNome = "DEYVID";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
            System.err.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do Metodo " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
