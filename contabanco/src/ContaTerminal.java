import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da Agência:");
        int numero = scanner.nextInt();

        System.out.println("Digite o número da Conta:");
        String agencia = scanner.next();
        
        System.out.println("Qual é o seu nome:");
        String nome = scanner.next();

        System.out.println("Qual valor gostaria de inserir:");
        Double saldo = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo R$ %.2f já está disponível.%n", nome, numero, agencia, saldo);

        scanner.close();
    }
}
