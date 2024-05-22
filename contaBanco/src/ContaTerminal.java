import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner leia = new Scanner(System.in);
        System.out.println("Bem vindo ao Banco");
        System.out.println("Por favor, digite o número da sua conta:");
        int numero = leia.nextInt();
        leia.nextLine();
        System.out.println("Por favor, digite o número da agência:");
        String agencia = leia.nextLine();
        System.out.println("Por favor, digite seu nome completo:");
        String nome = leia.nextLine();
        System.out.println("Digite seu saldo atual:");
        double saldo = leia.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque.%n", nome, agencia, numero, saldo);
   leia.close();
    }
}
