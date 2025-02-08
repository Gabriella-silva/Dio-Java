import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Bem vindo ao nosso banco! Deseja criar uma conta conosco? Para continuar pressione ENTER");
        String enter = scanner.next();
    }
}