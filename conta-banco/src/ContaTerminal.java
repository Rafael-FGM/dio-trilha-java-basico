
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente; 
        float saldo;
        
        System.out.println("Por favor, digite o nome do cliente: ");
        nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o número da conta: ");
        numero = sc.nextInt();

        System.out.println("Por favor, digite o número da agência: ");
        agencia = sc.next();                

        System.out.println("Por favor, digite o valor do saldo: ");
        saldo = sc.nextFloat();

        System.out.println("Olá, " + nomeCliente + "! Obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo: R$" + saldo + " já está disponível para saque.");
        
    }
}
