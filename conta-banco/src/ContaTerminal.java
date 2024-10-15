import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner novaConta = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = novaConta.next();

        System.out.println("Digite o número da conta: ");
        int numero = novaConta.nextInt();

        System.out.println("Digite a agência: ");
        String agencia = novaConta.next();

        System.out.println("Digite o saldo: ");
        double saldo = novaConta.nextDouble();


        System.out.println("Olá, " + nome + ", obrigado por criar uma conta no nosso banco! Sua agência é " + agencia + ", sua conta é " + numero + " e seu saldo de R$" + saldo + " já está disponível para saque. ");
    }
}