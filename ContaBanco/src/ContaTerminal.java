import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){

        /*Scanner terminal */
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Bem vindo ao nosso banco! Deseja criar uma conta conosco? Para continuar digite **SIM**");
        String enter = scanner.next();


        System.out.println("Porfavor digite o número da agência e pressione ENTER!");
        int numero = scanner.nextInt();

        System.out.println("Ótimo! Agora por favor insira sua agência e pressione ENTER!");
        String agencia = scanner.next();

        System.out.println("Insira seu nome e sobrenome:");
        String nomeCliente = scanner.next();

        System.out.println("Digite seu saldo:");
        Double saldo = scanner.nextDouble();

        /*Print */
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
        + agencia + "  e seu saldo " + saldo + " ja esta disponivel para saque" );



    }
}